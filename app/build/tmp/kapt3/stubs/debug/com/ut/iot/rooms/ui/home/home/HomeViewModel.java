package com.ut.iot.rooms.ui.home.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/ut/iot/rooms/ui/home/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "bookingRepo", "Lcom/ut/iot/rooms/repo/booking/BookingRepo;", "(Lcom/ut/iot/rooms/repo/booking/BookingRepo;)V", "getBookingRepo", "()Lcom/ut/iot/rooms/repo/booking/BookingRepo;", "bookingRequest", "Landroidx/lifecycle/MutableLiveData;", "", "bookingResponse", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "", "Lcom/ut/iot/rooms/data/model/Booking;", "getBookingResponse", "()Landroidx/lifecycle/LiveData;", "getBookings", "", "refresh", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> bookingRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.util.List<com.ut.iot.rooms.data.model.Booking>>> bookingResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ut.iot.rooms.repo.booking.BookingRepo bookingRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.util.List<com.ut.iot.rooms.data.model.Booking>>> getBookingResponse() {
        return null;
    }
    
    public final void getBookings(boolean refresh) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.repo.booking.BookingRepo getBookingRepo() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.repo.booking.BookingRepo bookingRepo) {
        super();
    }
}