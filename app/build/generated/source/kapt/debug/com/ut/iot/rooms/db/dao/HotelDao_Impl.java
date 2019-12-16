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
import com.ut.iot.rooms.data.model.Country;
import com.ut.iot.rooms.data.model.Hotel;
import com.ut.iot.rooms.data.model.Image;
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
public final class HotelDao_Impl implements HotelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Hotel> __insertionAdapterOfHotel;

  private final RoomsDBConverter __roomsDBConverter = new RoomsDBConverter();

  private final EntityDeletionOrUpdateAdapter<Hotel> __updateAdapterOfHotel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HotelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHotel = new EntityInsertionAdapter<Hotel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `hotels` (`id`,`name`,`email`,`address`,`city`,`state`,`country`,`zip_code`,`phone`,`images`,`rooms`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Hotel value) {
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
        if (value.getAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress());
        }
        if (value.getCity() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCity());
        }
        if (value.getState() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getState());
        }
        final String _tmp;
        _tmp = __roomsDBConverter.fromCountry(value.getCountry());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
        if (value.getZip_code() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getZip_code());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPhone());
        }
        final String _tmp_1;
        _tmp_1 = __roomsDBConverter.fromImages(value.getImages());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __roomsDBConverter.fromRooms(value.getRooms());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
      }
    };
    this.__updateAdapterOfHotel = new EntityDeletionOrUpdateAdapter<Hotel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `hotels` SET `id` = ?,`name` = ?,`email` = ?,`address` = ?,`city` = ?,`state` = ?,`country` = ?,`zip_code` = ?,`phone` = ?,`images` = ?,`rooms` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Hotel value) {
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
        if (value.getAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress());
        }
        if (value.getCity() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCity());
        }
        if (value.getState() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getState());
        }
        final String _tmp;
        _tmp = __roomsDBConverter.fromCountry(value.getCountry());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
        if (value.getZip_code() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getZip_code());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPhone());
        }
        final String _tmp_1;
        _tmp_1 = __roomsDBConverter.fromImages(value.getImages());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __roomsDBConverter.fromRooms(value.getRooms());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
        stmt.bindLong(12, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM hotels";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final Hotel[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHotel.insert(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Hotel[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfHotel.handleMultiple(data);
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
  public LiveData<Hotel> getHotel(final int hotelId) {
    final String _sql = "SELECT * FROM hotels WHERE id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, hotelId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"hotels"}, false, new Callable<Hotel>() {
      @Override
      public Hotel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfZipCode = CursorUtil.getColumnIndexOrThrow(_cursor, "zip_code");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
          final int _cursorIndexOfRooms = CursorUtil.getColumnIndexOrThrow(_cursor, "rooms");
          final Hotel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpCity;
            _tmpCity = _cursor.getString(_cursorIndexOfCity);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final Country _tmpCountry;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfCountry);
            _tmpCountry = __roomsDBConverter.toCountry(_tmp);
            final String _tmpZip_code;
            _tmpZip_code = _cursor.getString(_cursorIndexOfZipCode);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final List<Image> _tmpImages;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfImages);
            _tmpImages = __roomsDBConverter.toImages(_tmp_1);
            final List<Room> _tmpRooms;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfRooms);
            _tmpRooms = __roomsDBConverter.toRooms(_tmp_2);
            _result = new Hotel(_tmpId,_tmpName,_tmpEmail,_tmpAddress,_tmpCity,_tmpState,_tmpCountry,_tmpZip_code,_tmpPhone,_tmpImages,_tmpRooms);
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
  public LiveData<List<Hotel>> getHotels() {
    final String _sql = "SELECT * FROM hotels";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"hotels"}, false, new Callable<List<Hotel>>() {
      @Override
      public List<Hotel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfZipCode = CursorUtil.getColumnIndexOrThrow(_cursor, "zip_code");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
          final int _cursorIndexOfRooms = CursorUtil.getColumnIndexOrThrow(_cursor, "rooms");
          final List<Hotel> _result = new ArrayList<Hotel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Hotel _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpCity;
            _tmpCity = _cursor.getString(_cursorIndexOfCity);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final Country _tmpCountry;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfCountry);
            _tmpCountry = __roomsDBConverter.toCountry(_tmp);
            final String _tmpZip_code;
            _tmpZip_code = _cursor.getString(_cursorIndexOfZipCode);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final List<Image> _tmpImages;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfImages);
            _tmpImages = __roomsDBConverter.toImages(_tmp_1);
            final List<Room> _tmpRooms;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfRooms);
            _tmpRooms = __roomsDBConverter.toRooms(_tmp_2);
            _item = new Hotel(_tmpId,_tmpName,_tmpEmail,_tmpAddress,_tmpCity,_tmpState,_tmpCountry,_tmpZip_code,_tmpPhone,_tmpImages,_tmpRooms);
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
