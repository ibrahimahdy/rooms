package com.ut.iot.rooms.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ut.iot.rooms.data.model.Booking;
import com.ut.iot.rooms.data.model.Room;
import com.ut.iot.rooms.db.typeconverter.RoomsDBConverter;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookingDao_Impl implements BookingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Booking> __insertionAdapterOfBooking;

  private final RoomsDBConverter __roomsDBConverter = new RoomsDBConverter();

  private final EntityDeletionOrUpdateAdapter<Booking> __updateAdapterOfBooking;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public BookingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBooking = new EntityInsertionAdapter<Booking>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `bookings` (`id`,`total_nights`,`total_price`,`currency`,`hotel`,`start_date`,`end_date`,`room_id`,`user_id`,`room`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Booking value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getTotal_nights());
        if (value.getTotal_price() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTotal_price());
        }
        if (value.getCurrency() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCurrency());
        }
        if (value.getHotel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHotel());
        }
        if (value.getStart_date() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStart_date());
        }
        if (value.getEnd_date() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEnd_date());
        }
        stmt.bindLong(8, value.getRoom_id());
        stmt.bindLong(9, value.getUser_id());
        final String _tmp;
        _tmp = __roomsDBConverter.fromRoom(value.getRoom());
        if (_tmp == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp);
        }
      }
    };
    this.__updateAdapterOfBooking = new EntityDeletionOrUpdateAdapter<Booking>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `bookings` SET `id` = ?,`total_nights` = ?,`total_price` = ?,`currency` = ?,`hotel` = ?,`start_date` = ?,`end_date` = ?,`room_id` = ?,`user_id` = ?,`room` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Booking value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getTotal_nights());
        if (value.getTotal_price() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTotal_price());
        }
        if (value.getCurrency() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCurrency());
        }
        if (value.getHotel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHotel());
        }
        if (value.getStart_date() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStart_date());
        }
        if (value.getEnd_date() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEnd_date());
        }
        stmt.bindLong(8, value.getRoom_id());
        stmt.bindLong(9, value.getUser_id());
        final String _tmp;
        _tmp = __roomsDBConverter.fromRoom(value.getRoom());
        if (_tmp == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp);
        }
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM bookings";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final Booking[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBooking.insert(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Booking[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfBooking.handleMultiple(data);
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
  public LiveData<Booking> getBooking(final int bookingId) {
    final String _sql = "SELECT * FROM bookings WHERE id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, bookingId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"bookings"}, false, new Callable<Booking>() {
      @Override
      public Booking call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTotalNights = CursorUtil.getColumnIndexOrThrow(_cursor, "total_nights");
          final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "total_price");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfHotel = CursorUtil.getColumnIndexOrThrow(_cursor, "hotel");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date");
          final int _cursorIndexOfRoomId = CursorUtil.getColumnIndexOrThrow(_cursor, "room_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfRoom = CursorUtil.getColumnIndexOrThrow(_cursor, "room");
          final Booking _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpTotal_nights;
            _tmpTotal_nights = _cursor.getInt(_cursorIndexOfTotalNights);
            final String _tmpTotal_price;
            _tmpTotal_price = _cursor.getString(_cursorIndexOfTotalPrice);
            final String _tmpCurrency;
            _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            final String _tmpHotel;
            _tmpHotel = _cursor.getString(_cursorIndexOfHotel);
            final String _tmpStart_date;
            _tmpStart_date = _cursor.getString(_cursorIndexOfStartDate);
            final String _tmpEnd_date;
            _tmpEnd_date = _cursor.getString(_cursorIndexOfEndDate);
            final int _tmpRoom_id;
            _tmpRoom_id = _cursor.getInt(_cursorIndexOfRoomId);
            final int _tmpUser_id;
            _tmpUser_id = _cursor.getInt(_cursorIndexOfUserId);
            final Room _tmpRoom;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfRoom);
            _tmpRoom = __roomsDBConverter.toRoom(_tmp);
            _result = new Booking(_tmpId,_tmpTotal_nights,_tmpTotal_price,_tmpCurrency,_tmpHotel,_tmpStart_date,_tmpEnd_date,_tmpRoom_id,_tmpUser_id,_tmpRoom);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Booking>> getUserBookings(final int userId) {
    final String _sql = "SELECT * FROM bookings WHERE user_id= ? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"bookings"}, false, new Callable<List<Booking>>() {
      @Override
      public List<Booking> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTotalNights = CursorUtil.getColumnIndexOrThrow(_cursor, "total_nights");
          final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "total_price");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfHotel = CursorUtil.getColumnIndexOrThrow(_cursor, "hotel");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "start_date");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "end_date");
          final int _cursorIndexOfRoomId = CursorUtil.getColumnIndexOrThrow(_cursor, "room_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfRoom = CursorUtil.getColumnIndexOrThrow(_cursor, "room");
          final List<Booking> _result = new ArrayList<Booking>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Booking _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpTotal_nights;
            _tmpTotal_nights = _cursor.getInt(_cursorIndexOfTotalNights);
            final String _tmpTotal_price;
            _tmpTotal_price = _cursor.getString(_cursorIndexOfTotalPrice);
            final String _tmpCurrency;
            _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            final String _tmpHotel;
            _tmpHotel = _cursor.getString(_cursorIndexOfHotel);
            final String _tmpStart_date;
            _tmpStart_date = _cursor.getString(_cursorIndexOfStartDate);
            final String _tmpEnd_date;
            _tmpEnd_date = _cursor.getString(_cursorIndexOfEndDate);
            final int _tmpRoom_id;
            _tmpRoom_id = _cursor.getInt(_cursorIndexOfRoomId);
            final int _tmpUser_id;
            _tmpUser_id = _cursor.getInt(_cursorIndexOfUserId);
            final Room _tmpRoom;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfRoom);
            _tmpRoom = __roomsDBConverter.toRoom(_tmp);
            _item = new Booking(_tmpId,_tmpTotal_nights,_tmpTotal_price,_tmpCurrency,_tmpHotel,_tmpStart_date,_tmpEnd_date,_tmpRoom_id,_tmpUser_id,_tmpRoom);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
