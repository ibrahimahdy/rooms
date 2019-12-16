package com.ut.iot.rooms.db.dao;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ut.iot.rooms.data.model.Booking;
import com.ut.iot.rooms.data.model.Room;
import com.ut.iot.rooms.data.model.User;
import com.ut.iot.rooms.data.model.UserInfo;
import com.ut.iot.rooms.db.typeconverter.RoomsDBConverter;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.HashSet;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter<User> __updateAdapterOfUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final RoomsDBConverter __roomsDBConverter = new RoomsDBConverter();

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User` (`id`,`name`,`email`,`token`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getToken() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getToken());
        }
      }
    };
    this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `User` SET `id` = ?,`name` = ?,`email` = ?,`token` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getToken() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getToken());
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final User[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUser.insert(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final User[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUser.handleMultiple(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<UserInfo> getLoggedInUser() {
    final String _sql = "SELECT * FROM user LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"bookings","user"}, true, new Callable<UserInfo>() {
      @Override
      public UserInfo call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
            final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
            final LongSparseArray<HashSet<Booking>> _collectionBookings = new LongSparseArray<HashSet<Booking>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
                HashSet<Booking> _tmpBookingsCollection = _collectionBookings.get(_tmpKey);
                if (_tmpBookingsCollection == null) {
                  _tmpBookingsCollection = new HashSet<Booking>();
                  _collectionBookings.put(_tmpKey, _tmpBookingsCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipbookingsAscomUtIotRoomsDataModelBooking(_collectionBookings);
            final UserInfo _result;
            if(_cursor.moveToFirst()) {
              final User _tmpUser;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfToken))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpEmail;
                _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
                final String _tmpToken;
                _tmpToken = _cursor.getString(_cursorIndexOfToken);
                _tmpUser = new User(_tmpId,_tmpName,_tmpToken,_tmpEmail);
              }  else  {
                _tmpUser = null;
              }
              HashSet<Booking> _tmpBookingsCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
                _tmpBookingsCollection_1 = _collectionBookings.get(_tmpKey_1);
              }
              if (_tmpBookingsCollection_1 == null) {
                _tmpBookingsCollection_1 = new HashSet<Booking>();
              }
              _result = new UserInfo();
              _result.setUser(_tmpUser);
              _result.setBookings(_tmpBookingsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipbookingsAscomUtIotRoomsDataModelBooking(
      final LongSparseArray<HashSet<Booking>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<HashSet<Booking>> _tmpInnerMap = new LongSparseArray<HashSet<Booking>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipbookingsAscomUtIotRoomsDataModelBooking(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<HashSet<Booking>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipbookingsAscomUtIotRoomsDataModelBooking(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`total_nights`,`total_price`,`currency`,`hotel`,`start_date`,`end_date`,`room_id`,`user_id`,`room` FROM `bookings` WHERE `user_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "user_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfTotalNights = CursorUtil.getColumnIndex(_cursor, "total_nights");
      final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndex(_cursor, "total_price");
      final int _cursorIndexOfCurrency = CursorUtil.getColumnIndex(_cursor, "currency");
      final int _cursorIndexOfHotel = CursorUtil.getColumnIndex(_cursor, "hotel");
      final int _cursorIndexOfStartDate = CursorUtil.getColumnIndex(_cursor, "start_date");
      final int _cursorIndexOfEndDate = CursorUtil.getColumnIndex(_cursor, "end_date");
      final int _cursorIndexOfRoomId = CursorUtil.getColumnIndex(_cursor, "room_id");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndex(_cursor, "user_id");
      final int _cursorIndexOfRoom = CursorUtil.getColumnIndex(_cursor, "room");
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final long _tmpKey = _cursor.getLong(_itemKeyIndex);
          HashSet<Booking> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final Booking _item_1;
            final int _tmpId;
            if (_cursorIndexOfId == -1) {
              _tmpId = 0;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final int _tmpTotal_nights;
            if (_cursorIndexOfTotalNights == -1) {
              _tmpTotal_nights = 0;
            } else {
              _tmpTotal_nights = _cursor.getInt(_cursorIndexOfTotalNights);
            }
            final String _tmpTotal_price;
            if (_cursorIndexOfTotalPrice == -1) {
              _tmpTotal_price = null;
            } else {
              _tmpTotal_price = _cursor.getString(_cursorIndexOfTotalPrice);
            }
            final String _tmpCurrency;
            if (_cursorIndexOfCurrency == -1) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final String _tmpHotel;
            if (_cursorIndexOfHotel == -1) {
              _tmpHotel = null;
            } else {
              _tmpHotel = _cursor.getString(_cursorIndexOfHotel);
            }
            final String _tmpStart_date;
            if (_cursorIndexOfStartDate == -1) {
              _tmpStart_date = null;
            } else {
              _tmpStart_date = _cursor.getString(_cursorIndexOfStartDate);
            }
            final String _tmpEnd_date;
            if (_cursorIndexOfEndDate == -1) {
              _tmpEnd_date = null;
            } else {
              _tmpEnd_date = _cursor.getString(_cursorIndexOfEndDate);
            }
            final int _tmpRoom_id;
            if (_cursorIndexOfRoomId == -1) {
              _tmpRoom_id = 0;
            } else {
              _tmpRoom_id = _cursor.getInt(_cursorIndexOfRoomId);
            }
            final int _tmpUser_id;
            if (_cursorIndexOfUserId == -1) {
              _tmpUser_id = 0;
            } else {
              _tmpUser_id = _cursor.getInt(_cursorIndexOfUserId);
            }
            final Room _tmpRoom;
            if (_cursorIndexOfRoom == -1) {
              _tmpRoom = null;
            } else {
              final String _tmp;
              _tmp = _cursor.getString(_cursorIndexOfRoom);
              _tmpRoom = __roomsDBConverter.toRoom(_tmp);
            }
            _item_1 = new Booking(_tmpId,_tmpTotal_nights,_tmpTotal_price,_tmpCurrency,_tmpHotel,_tmpStart_date,_tmpEnd_date,_tmpRoom_id,_tmpUser_id,_tmpRoom);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
