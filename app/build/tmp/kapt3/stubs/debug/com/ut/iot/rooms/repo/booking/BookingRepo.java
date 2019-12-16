package com.ut.iot.rooms.repo.booking;

import java.lang.System;

/**
 * Created by Saeed on 28/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u0018J \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00150\u00142\u0006\u0010\u001c\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/ut/iot/rooms/repo/booking/BookingRepo;", "", "bookingDao", "Lcom/ut/iot/rooms/db/dao/BookingDao;", "roomDao", "Lcom/ut/iot/rooms/db/dao/RoomDao;", "roomTypeDao", "Lcom/ut/iot/rooms/db/dao/RoomTypeDao;", "imageDao", "Lcom/ut/iot/rooms/db/dao/ImageDao;", "stateManager", "Lcom/ut/iot/rooms/state/StateManager;", "bookingService", "Lcom/ut/iot/rooms/api/service/BookingService;", "(Lcom/ut/iot/rooms/db/dao/BookingDao;Lcom/ut/iot/rooms/db/dao/RoomDao;Lcom/ut/iot/rooms/db/dao/RoomTypeDao;Lcom/ut/iot/rooms/db/dao/ImageDao;Lcom/ut/iot/rooms/state/StateManager;Lcom/ut/iot/rooms/api/service/BookingService;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "addBooking", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "", "addBookingRequest", "Lcom/ut/iot/rooms/data/model/AddBookingRequest;", "getBookings", "", "Lcom/ut/iot/rooms/data/model/Booking;", "refresh", "app_debug"})
public final class BookingRepo {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.ut.iot.rooms.db.dao.BookingDao bookingDao = null;
    private final com.ut.iot.rooms.db.dao.RoomDao roomDao = null;
    private final com.ut.iot.rooms.db.dao.RoomTypeDao roomTypeDao = null;
    private final com.ut.iot.rooms.db.dao.ImageDao imageDao = null;
    private final com.ut.iot.rooms.state.StateManager stateManager = null;
    private final com.ut.iot.rooms.api.service.BookingService bookingService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.util.List<com.ut.iot.rooms.data.model.Booking>>> getBookings(boolean refresh) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.lang.Boolean>> addBooking(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.data.model.AddBookingRequest addBookingRequest) {
        return null;
    }
    
    @javax.inject.Inject()
    public BookingRepo(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.BookingDao bookingDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.RoomDao roomDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.RoomTypeDao roomTypeDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.ImageDao imageDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.state.StateManager stateManager, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.service.BookingService bookingService) {
        super();
    }
}