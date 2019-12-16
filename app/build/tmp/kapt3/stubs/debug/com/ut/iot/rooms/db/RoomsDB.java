package com.ut.iot.rooms.db;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@androidx.room.TypeConverters(value = {com.ut.iot.rooms.db.typeconverter.RoomsDBConverter.class})
@androidx.room.Database(version = 6, entities = {com.ut.iot.rooms.data.model.User.class, com.ut.iot.rooms.data.model.Booking.class, com.ut.iot.rooms.data.model.Room.class, com.ut.iot.rooms.data.model.RoomType.class, com.ut.iot.rooms.data.model.RoomImage.class, com.ut.iot.rooms.data.model.Hotel.class})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/ut/iot/rooms/db/RoomsDB;", "Landroidx/room/RoomDatabase;", "()V", "bookingDao", "Lcom/ut/iot/rooms/db/dao/BookingDao;", "hotelDao", "Lcom/ut/iot/rooms/db/dao/HotelDao;", "imageDao", "Lcom/ut/iot/rooms/db/dao/ImageDao;", "roomDao", "Lcom/ut/iot/rooms/db/dao/RoomDao;", "roomTypeDao", "Lcom/ut/iot/rooms/db/dao/RoomTypeDao;", "userDao", "Lcom/ut/iot/rooms/db/dao/UserDao;", "app_debug"})
public abstract class RoomsDB extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ut.iot.rooms.db.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ut.iot.rooms.db.dao.BookingDao bookingDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ut.iot.rooms.db.dao.RoomDao roomDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ut.iot.rooms.db.dao.RoomTypeDao roomTypeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ut.iot.rooms.db.dao.ImageDao imageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ut.iot.rooms.db.dao.HotelDao hotelDao();
    
    public RoomsDB() {
        super();
    }
}