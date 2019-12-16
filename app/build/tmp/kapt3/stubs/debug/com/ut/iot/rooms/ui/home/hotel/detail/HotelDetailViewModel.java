package com.ut.iot.rooms.ui.home.hotel.detail;

import java.lang.System;

/**
 * Created by Ibrahim on 02/12/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "hotelRepo", "Lcom/ut/iot/rooms/repo/hotel/HotelRepo;", "(Lcom/ut/iot/rooms/repo/hotel/HotelRepo;)V", "hotelRequest", "Landroidx/lifecycle/MutableLiveData;", "", "hotelResponse", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "Lcom/ut/iot/rooms/data/model/Hotel;", "getHotelResponse", "()Landroidx/lifecycle/LiveData;", "getHotel", "", "hotelId", "app_debug"})
public final class HotelDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> hotelRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<com.ut.iot.rooms.data.model.Hotel>> hotelResponse = null;
    private final com.ut.iot.rooms.repo.hotel.HotelRepo hotelRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<com.ut.iot.rooms.data.model.Hotel>> getHotelResponse() {
        return null;
    }
    
    public final void getHotel(int hotelId) {
    }
    
    @javax.inject.Inject()
    public HotelDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.repo.hotel.HotelRepo hotelRepo) {
        super();
    }
}