package com.ut.iot.rooms.repo.hotel;

import java.lang.System;

/**
 * Created by Saeed on 30/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\r0\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/ut/iot/rooms/repo/hotel/HotelRepo;", "", "hotelDao", "Lcom/ut/iot/rooms/db/dao/HotelDao;", "hotelService", "Lcom/ut/iot/rooms/api/service/HotelService;", "(Lcom/ut/iot/rooms/db/dao/HotelDao;Lcom/ut/iot/rooms/api/service/HotelService;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getHotel", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "Lcom/ut/iot/rooms/data/model/Hotel;", "hotelId", "", "getHotels", "", "refresh", "", "app_debug"})
public final class HotelRepo {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.ut.iot.rooms.db.dao.HotelDao hotelDao = null;
    private final com.ut.iot.rooms.api.service.HotelService hotelService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.util.List<com.ut.iot.rooms.data.model.Hotel>>> getHotels(boolean refresh) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<com.ut.iot.rooms.data.model.Hotel>> getHotel(int hotelId) {
        return null;
    }
    
    @javax.inject.Inject()
    public HotelRepo(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.db.dao.HotelDao hotelDao, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.service.HotelService hotelService) {
        super();
    }
}