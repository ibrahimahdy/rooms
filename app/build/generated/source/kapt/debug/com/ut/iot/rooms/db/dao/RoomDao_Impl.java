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
import com.ut.iot.rooms.data.model.Room;
import com.ut.iot.rooms.data.model.RoomImage;
import com.ut.iot.rooms.data.model.RoomType;
import com.ut.iot.rooms.db.typeconverter.RoomsDBConverter;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RoomDao_Impl implements RoomDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Room> __insertionAdapterOfRoom;

  private final RoomsDBConverter __roomsDBConverter = new RoomsDBConverter();

  private final EntityDeletionOrUpdateAdapter<Room> __updateAdapterOfRoom;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RoomDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoom = new EntityInsertionAdapter<Room>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `rooms` (`id`,`name`,`created_at`,`updated_at`,`type_id`,`type`,`images`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Room value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCreated_at() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCreated_at());
        }
        if (value.getUpdated_at() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUpdated_at());
        }
        if (value.getType_id() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getType_id());
        }
        final String _tmp;
        _tmp = __roomsDBConverter.fromRoomType(value.getType());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __roomsDBConverter.fromRoomImages(value.getImages());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
      }
    };
    this.__updateAdapterOfRoom = new EntityDeletionOrUpdateAdapter<Room>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `rooms` SET `id` = ?,`name` = ?,`created_at` = ?,`updated_at` = ?,`type_id` = ?,`type` = ?,`images` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Room value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCreated_at() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCreated_at());
        }
        if (value.getUpdated_at() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUpdated_at());
        }
        if (value.getType_id() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getType_id());
        }
        final String _tmp;
        _tmp = __roomsDBConverter.fromRoomType(value.getType());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __roomsDBConverter.fromRoomImages(value.getImages());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM rooms";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final Room[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRoom.insert(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Room[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRoom.handleMultiple(data);
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
  public LiveData<Room> selectRoom(final int id) {
    final String _sql = "SELECT * FROM rooms WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"rooms"}, false, new Callable<Room>() {
      @Override
      public Room call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "type_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfImages = CursorUtil.getColumnIndexOrThrow(_cursor, "images");
          final Room _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            final Integer _tmpType_id;
            if (_cursor.isNull(_cursorIndexOfTypeId)) {
              _tmpType_id = null;
            } else {
              _tmpType_id = _cursor.getInt(_cursorIndexOfTypeId);
            }
            _result = new Room(_tmpId,_tmpName,_tmpCreated_at,_tmpUpdated_at,_tmpType_id);
            final RoomType _tmpType;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfType);
            _tmpType = __roomsDBConverter.toRoomType(_tmp);
            _result.setType(_tmpType);
            final List<RoomImage> _tmpImages;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfImages);
            _tmpImages = __roomsDBConverter.toRoomImages(_tmp_1);
            _result.setImages(_tmpImages);
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
}
