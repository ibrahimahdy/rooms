package com.ut.iot.rooms.ui.settings;

import java.lang.System;

/**
 * Created by Saeed on 12/12/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006."}, d2 = {"Lcom/ut/iot/rooms/ui/settings/SettingsActivity;", "Lcom/ut/iot/rooms/ui/BaseActivity;", "()V", "bookingDao", "Lcom/ut/iot/rooms/db/dao/BookingDao;", "getBookingDao", "()Lcom/ut/iot/rooms/db/dao/BookingDao;", "setBookingDao", "(Lcom/ut/iot/rooms/db/dao/BookingDao;)V", "hotelDao", "Lcom/ut/iot/rooms/db/dao/HotelDao;", "getHotelDao", "()Lcom/ut/iot/rooms/db/dao/HotelDao;", "setHotelDao", "(Lcom/ut/iot/rooms/db/dao/HotelDao;)V", "imageDao", "Lcom/ut/iot/rooms/db/dao/ImageDao;", "getImageDao", "()Lcom/ut/iot/rooms/db/dao/ImageDao;", "setImageDao", "(Lcom/ut/iot/rooms/db/dao/ImageDao;)V", "roomDao", "Lcom/ut/iot/rooms/db/dao/RoomDao;", "getRoomDao", "()Lcom/ut/iot/rooms/db/dao/RoomDao;", "setRoomDao", "(Lcom/ut/iot/rooms/db/dao/RoomDao;)V", "roomTypeDao", "Lcom/ut/iot/rooms/db/dao/RoomTypeDao;", "getRoomTypeDao", "()Lcom/ut/iot/rooms/db/dao/RoomTypeDao;", "setRoomTypeDao", "(Lcom/ut/iot/rooms/db/dao/RoomTypeDao;)V", "userDao", "Lcom/ut/iot/rooms/db/dao/UserDao;", "getUserDao", "()Lcom/ut/iot/rooms/db/dao/UserDao;", "setUserDao", "(Lcom/ut/iot/rooms/db/dao/UserDao;)V", "handleResourceLoading", "", "resourceLoading", "Lcom/ut/iot/rooms/data/model/ResourceLoading;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SettingsActivity extends com.ut.iot.rooms.ui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.db.dao.BookingDao bookingDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.db.dao.HotelDao hotelDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.db.dao.ImageDao imageDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.db.dao.RoomDao roomDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.db.dao.RoomTypeDao roomTypeDao;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.db.dao.UserDao userDao;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.db.dao.BookingDao getBookingDao() {
        return null;
    }
    
    public final void setBookingDao(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.BookingDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.db.dao.HotelDao getHotelDao() {
        return null;
    }
    
    public final void setHotelDao(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.HotelDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.db.dao.ImageDao getImageDao() {
        return null;
    }
    
    public final void setImageDao(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.ImageDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.db.dao.RoomDao getRoomDao() {
        return null;
    }
    
    public final void setRoomDao(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.RoomDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.db.dao.RoomTypeDao getRoomTypeDao() {
        return null;
    }
    
    public final void setRoomTypeDao(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.RoomTypeDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.db.dao.UserDao getUserDao() {
        return null;
    }
    
    public final void setUserDao(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.UserDao p0) {
    }
    
    @java.lang.Override()
    public void handleResourceLoading(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.ResourceLoading resourceLoading) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public SettingsActivity() {
        super();
    }
}