package com.ut.iot.rooms.di.modules;

import java.lang.System;

/**
 * Created by Saeed on 2019-10-18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/ut/iot/rooms/di/modules/PersistenceModule;", "", "()V", "bookingDaoProvider", "Lcom/ut/iot/rooms/db/dao/BookingDao;", "db", "Lcom/ut/iot/rooms/db/RoomsDB;", "databaseProvider", "rooms", "Lcom/ut/iot/rooms/Rooms;", "hotelDaoProvider", "Lcom/ut/iot/rooms/db/dao/HotelDao;", "providesStateManager", "Lcom/ut/iot/rooms/state/StateManager;", "roomDaoProvider", "Lcom/ut/iot/rooms/db/dao/RoomDao;", "roomImageDaoProvider", "Lcom/ut/iot/rooms/db/dao/ImageDao;", "roomTypeDaoProvider", "Lcom/ut/iot/rooms/db/dao/RoomTypeDao;", "userDaoProvider", "Lcom/ut/iot/rooms/db/dao/UserDao;", "app_debug"})
@dagger.Module()
public final class PersistenceModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.state.StateManager providesStateManager(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.Rooms rooms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.db.RoomsDB databaseProvider(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.Rooms rooms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.db.dao.UserDao userDaoProvider(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.RoomsDB db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.db.dao.BookingDao bookingDaoProvider(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.RoomsDB db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.db.dao.RoomDao roomDaoProvider(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.RoomsDB db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.db.dao.RoomTypeDao roomTypeDaoProvider(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.RoomsDB db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.db.dao.ImageDao roomImageDaoProvider(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.RoomsDB db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.db.dao.HotelDao hotelDaoProvider(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.RoomsDB db) {
        return null;
    }
    
    public PersistenceModule() {
        super();
    }
}