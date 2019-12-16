package com.ut.iot.rooms.ui.home.hotel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/ut/iot/rooms/ui/home/hotel/HotelViewModel;", "Landroidx/lifecycle/ViewModel;", "hotelRepo", "Lcom/ut/iot/rooms/repo/hotel/HotelRepo;", "(Lcom/ut/iot/rooms/repo/hotel/HotelRepo;)V", "hotelRequest", "Landroidx/lifecycle/MutableLiveData;", "", "hotelResponse", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "", "Lcom/ut/iot/rooms/data/model/Hotel;", "getHotelResponse", "()Landroidx/lifecycle/LiveData;", "getHotels", "", "refresh", "app_debug"})
public final class HotelViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hotelRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.util.List<com.ut.iot.rooms.data.model.Hotel>>> hotelResponse = null;
    private final com.ut.iot.rooms.repo.hotel.HotelRepo hotelRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.util.List<com.ut.iot.rooms.data.model.Hotel>>> getHotelResponse() {
        return null;
    }
    
    public final void getHotels(boolean refresh) {
    }
    
    @javax.inject.Inject()
    public HotelViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.repo.hotel.HotelRepo hotelRepo) {
        super();
    }
}