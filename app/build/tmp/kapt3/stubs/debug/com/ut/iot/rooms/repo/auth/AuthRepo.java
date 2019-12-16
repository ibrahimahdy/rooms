package com.ut.iot.rooms.repo.auth;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u0018R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/ut/iot/rooms/repo/auth/AuthRepo;", "", "userDao", "Lcom/ut/iot/rooms/db/dao/UserDao;", "bookingDao", "Lcom/ut/iot/rooms/db/dao/BookingDao;", "roomDao", "Lcom/ut/iot/rooms/db/dao/RoomDao;", "roomTypeDao", "Lcom/ut/iot/rooms/db/dao/RoomTypeDao;", "imageDao", "Lcom/ut/iot/rooms/db/dao/ImageDao;", "hotelDao", "Lcom/ut/iot/rooms/db/dao/HotelDao;", "authService", "Lcom/ut/iot/rooms/api/service/AuthService;", "stateManager", "Lcom/ut/iot/rooms/state/StateManager;", "(Lcom/ut/iot/rooms/db/dao/UserDao;Lcom/ut/iot/rooms/db/dao/BookingDao;Lcom/ut/iot/rooms/db/dao/RoomDao;Lcom/ut/iot/rooms/db/dao/RoomTypeDao;Lcom/ut/iot/rooms/db/dao/ImageDao;Lcom/ut/iot/rooms/db/dao/HotelDao;Lcom/ut/iot/rooms/api/service/AuthService;Lcom/ut/iot/rooms/state/StateManager;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "auth", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "Lcom/ut/iot/rooms/data/model/UserInfo;", "authRequest", "Lcom/ut/iot/rooms/api/model/auth/AuthRequest;", "isLogin", "", "logout", "app_debug"})
public final class AuthRepo {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.ut.iot.rooms.db.dao.UserDao userDao = null;
    private final com.ut.iot.rooms.db.dao.BookingDao bookingDao = null;
    private final com.ut.iot.rooms.db.dao.RoomDao roomDao = null;
    private final com.ut.iot.rooms.db.dao.RoomTypeDao roomTypeDao = null;
    private final com.ut.iot.rooms.db.dao.ImageDao imageDao = null;
    private final com.ut.iot.rooms.db.dao.HotelDao hotelDao = null;
    private final com.ut.iot.rooms.api.service.AuthService authService = null;
    private final com.ut.iot.rooms.state.StateManager stateManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<com.ut.iot.rooms.data.model.UserInfo>> auth(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.model.auth.AuthRequest authRequest, boolean isLogin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.lang.Boolean>> logout() {
        return null;
    }
    
    @javax.inject.Inject()
    public AuthRepo(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.BookingDao bookingDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.RoomDao roomDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.RoomTypeDao roomTypeDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.ImageDao imageDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.HotelDao hotelDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.service.AuthService authService, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.state.StateManager stateManager) {
        super();
    }
}