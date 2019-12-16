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
import com.ut.iot.rooms.data.model.RoomImage;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImageDao_Impl implements ImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RoomImage> __insertionAdapterOfRoomImage;

  private final EntityDeletionOrUpdateAdapter<RoomImage> __updateAdapterOfRoomImage;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoomImage = new EntityInsertionAdapter<RoomImage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `room_images` (`id`,`src`,`room_id`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomImage value) {
        stmt.bindLong(1, value.getId());
        if (value.getSrc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSrc());
        }
        stmt.bindLong(3, value.getRoom_id());
      }
    };
    this.__updateAdapterOfRoomImage = new EntityDeletionOrUpdateAdapter<RoomImage>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `room_images` SET `id` = ?,`src` = ?,`room_id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomImage value) {
        stmt.bindLong(1, value.getId());
        if (value.getSrc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSrc());
        }
        stmt.bindLong(3, value.getRoom_id());
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM room_images";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final RoomImage[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRoomImage.insert(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final RoomImage[] data, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRoomImage.handleMultiple(data);
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
  public LiveData<RoomImage> selectRoomImage(final int id) {
    final String _sql = "SELECT * FROM room_images WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"room_images"}, false, new Callable<RoomImage>() {
      @Override
      public RoomImage call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSrc = CursorUtil.getColumnIndexOrThrow(_cursor, "src");
          final int _cursorIndexOfRoomId = CursorUtil.getColumnIndexOrThrow(_cursor, "room_id");
          final RoomImage _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpSrc;
            _tmpSrc = _cursor.getString(_cursorIndexOfSrc);
            final int _tmpRoom_id;
            _tmpRoom_id = _cursor.getInt(_cursorIndexOfRoomId);
            _result = new RoomImage(_tmpId,_tmpSrc,_tmpRoom_id);
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
