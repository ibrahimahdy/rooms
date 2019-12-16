package com.ut.iot.rooms.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.ut.iot.rooms.db.dao.BookingDao;
import com.ut.iot.rooms.db.dao.BookingDao_Impl;
import com.ut.iot.rooms.db.dao.HotelDao;
import com.ut.iot.rooms.db.dao.HotelDao_Impl;
import com.ut.iot.rooms.db.dao.ImageDao;
import com.ut.iot.rooms.db.dao.ImageDao_Impl;
import com.ut.iot.rooms.db.dao.RoomDao;
import com.ut.iot.rooms.db.dao.RoomDao_Impl;
import com.ut.iot.rooms.db.dao.RoomTypeDao;
import com.ut.iot.rooms.db.dao.RoomTypeDao_Impl;
import com.ut.iot.rooms.db.dao.UserDao;
import com.ut.iot.rooms.db.dao.UserDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RoomsDB_Impl extends RoomsDB {
  private volatile UserDao _userDao;

  private volatile BookingDao _bookingDao;

  private volatile RoomDao _roomDao;

  private volatile RoomTypeDao _roomTypeDao;

  private volatile ImageDao _imageDao;

  private volatile HotelDao _hotelDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(6) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `email` TEXT NOT NULL, `token` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `bookings` (`id` INTEGER NOT NULL, `total_nights` INTEGER NOT NULL, `total_price` TEXT NOT NULL, `currency` TEXT NOT NULL, `hotel` TEXT NOT NULL, `start_date` TEXT NOT NULL, `end_date` TEXT NOT NULL, `room_id` INTEGER NOT NULL, `user_id` INTEGER NOT NULL, `room` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `rooms` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `created_at` TEXT, `updated_at` TEXT, `type_id` INTEGER, `type` TEXT, `images` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `room_types` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `price` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `room_images` (`id` INTEGER NOT NULL, `src` TEXT NOT NULL, `room_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `hotels` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `email` TEXT NOT NULL, `address` TEXT NOT NULL, `city` TEXT NOT NULL, `state` TEXT NOT NULL, `country` TEXT NOT NULL, `zip_code` TEXT NOT NULL, `phone` TEXT NOT NULL, `images` TEXT NOT NULL, `rooms` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd435d6633263e2c7b59f748f36eeca56')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `bookings`");
        _db.execSQL("DROP TABLE IF EXISTS `rooms`");
        _db.execSQL("DROP TABLE IF EXISTS `room_types`");
        _db.execSQL("DROP TABLE IF EXISTS `room_images`");
        _db.execSQL("DROP TABLE IF EXISTS `hotels`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(4);
        _columnsUser.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("token", new TableInfo.Column("token", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "User(com.ut.iot.rooms.data.model.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsBookings = new HashMap<String, TableInfo.Column>(10);
        _columnsBookings.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("total_nights", new TableInfo.Column("total_nights", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("total_price", new TableInfo.Column("total_price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("hotel", new TableInfo.Column("hotel", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("start_date", new TableInfo.Column("start_date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("end_date", new TableInfo.Column("end_date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("room_id", new TableInfo.Column("room_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBookings.put("room", new TableInfo.Column("room", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBookings = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBookings = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBookings = new TableInfo("bookings", _columnsBookings, _foreignKeysBookings, _indicesBookings);
        final TableInfo _existingBookings = TableInfo.read(_db, "bookings");
        if (! _infoBookings.equals(_existingBookings)) {
          return new RoomOpenHelper.ValidationResult(false, "bookings(com.ut.iot.rooms.data.model.Booking).\n"
                  + " Expected:\n" + _infoBookings + "\n"
                  + " Found:\n" + _existingBookings);
        }
        final HashMap<String, TableInfo.Column> _columnsRooms = new HashMap<String, TableInfo.Column>(7);
        _columnsRooms.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRooms.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRooms.put("created_at", new TableInfo.Column("created_at", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRooms.put("updated_at", new TableInfo.Column("updated_at", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRooms.put("type_id", new TableInfo.Column("type_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRooms.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRooms.put("images", new TableInfo.Column("images", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRooms = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRooms = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRooms = new TableInfo("rooms", _columnsRooms, _foreignKeysRooms, _indicesRooms);
        final TableInfo _existingRooms = TableInfo.read(_db, "rooms");
        if (! _infoRooms.equals(_existingRooms)) {
          return new RoomOpenHelper.ValidationResult(false, "rooms(com.ut.iot.rooms.data.model.Room).\n"
                  + " Expected:\n" + _infoRooms + "\n"
                  + " Found:\n" + _existingRooms);
        }
        final HashMap<String, TableInfo.Column> _columnsRoomTypes = new HashMap<String, TableInfo.Column>(3);
        _columnsRoomTypes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomTypes.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomTypes.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomTypes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoomTypes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoomTypes = new TableInfo("room_types", _columnsRoomTypes, _foreignKeysRoomTypes, _indicesRoomTypes);
        final TableInfo _existingRoomTypes = TableInfo.read(_db, "room_types");
        if (! _infoRoomTypes.equals(_existingRoomTypes)) {
          return new RoomOpenHelper.ValidationResult(false, "room_types(com.ut.iot.rooms.data.model.RoomType).\n"
                  + " Expected:\n" + _infoRoomTypes + "\n"
                  + " Found:\n" + _existingRoomTypes);
        }
        final HashMap<String, TableInfo.Column> _columnsRoomImages = new HashMap<String, TableInfo.Column>(3);
        _columnsRoomImages.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomImages.put("src", new TableInfo.Column("src", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomImages.put("room_id", new TableInfo.Column("room_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomImages = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoomImages = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoomImages = new TableInfo("room_images", _columnsRoomImages, _foreignKeysRoomImages, _indicesRoomImages);
        final TableInfo _existingRoomImages = TableInfo.read(_db, "room_images");
        if (! _infoRoomImages.equals(_existingRoomImages)) {
          return new RoomOpenHelper.ValidationResult(false, "room_images(com.ut.iot.rooms.data.model.RoomImage).\n"
                  + " Expected:\n" + _infoRoomImages + "\n"
                  + " Found:\n" + _existingRoomImages);
        }
        final HashMap<String, TableInfo.Column> _columnsHotels = new HashMap<String, TableInfo.Column>(11);
        _columnsHotels.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("city", new TableInfo.Column("city", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("zip_code", new TableInfo.Column("zip_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("images", new TableInfo.Column("images", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHotels.put("rooms", new TableInfo.Column("rooms", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHotels = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHotels = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHotels = new TableInfo("hotels", _columnsHotels, _foreignKeysHotels, _indicesHotels);
        final TableInfo _existingHotels = TableInfo.read(_db, "hotels");
        if (! _infoHotels.equals(_existingHotels)) {
          return new RoomOpenHelper.ValidationResult(false, "hotels(com.ut.iot.rooms.data.model.Hotel).\n"
                  + " Expected:\n" + _infoHotels + "\n"
                  + " Found:\n" + _existingHotels);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d435d6633263e2c7b59f748f36eeca56", "edd966ffd991288776a4506cb962731e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "User","bookings","rooms","room_types","room_images","hotels");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `bookings`");
      _db.execSQL("DELETE FROM `rooms`");
      _db.execSQL("DELETE FROM `room_types`");
      _db.execSQL("DELETE FROM `room_images`");
      _db.execSQL("DELETE FROM `hotels`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public BookingDao bookingDao() {
    if (_bookingDao != null) {
      return _bookingDao;
    } else {
      synchronized(this) {
        if(_bookingDao == null) {
          _bookingDao = new BookingDao_Impl(this);
        }
        return _bookingDao;
      }
    }
  }

  @Override
  public RoomDao roomDao() {
    if (_roomDao != null) {
      return _roomDao;
    } else {
      synchronized(this) {
        if(_roomDao == null) {
          _roomDao = new RoomDao_Impl(this);
        }
        return _roomDao;
      }
    }
  }

  @Override
  public RoomTypeDao roomTypeDao() {
    if (_roomTypeDao != null) {
      return _roomTypeDao;
    } else {
      synchronized(this) {
        if(_roomTypeDao == null) {
          _roomTypeDao = new RoomTypeDao_Impl(this);
        }
        return _roomTypeDao;
      }
    }
  }

  @Override
  public ImageDao imageDao() {
    if (_imageDao != null) {
      return _imageDao;
    } else {
      synchronized(this) {
        if(_imageDao == null) {
          _imageDao = new ImageDao_Impl(this);
        }
        return _imageDao;
      }
    }
  }

  @Override
  public HotelDao hotelDao() {
    if (_hotelDao != null) {
      return _hotelDao;
    } else {
      synchronized(this) {
        if(_hotelDao == null) {
          _hotelDao = new HotelDao_Impl(this);
        }
        return _hotelDao;
      }
    }
  }
}
