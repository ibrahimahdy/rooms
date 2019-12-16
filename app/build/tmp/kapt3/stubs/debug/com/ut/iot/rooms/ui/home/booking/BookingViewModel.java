package com.ut.iot.rooms.ui.home.booking;

import java.lang.System;

/**
 * Created by Ibrahim on 08/12/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007J\'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/ut/iot/rooms/ui/home/booking/BookingViewModel;", "Landroidx/lifecycle/ViewModel;", "bookingRepo", "Lcom/ut/iot/rooms/repo/booking/BookingRepo;", "(Lcom/ut/iot/rooms/repo/booking/BookingRepo;)V", "addBookingRequest", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ut/iot/rooms/data/model/AddBookingRequest;", "addBookingResponse", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "", "getAddBookingResponse", "()Landroidx/lifecycle/LiveData;", "bookingFormStateLiveData", "Lcom/ut/iot/rooms/ui/home/booking/BookingFormState;", "bookingFormStateLiveData_", "getBookingFormStateLiveData_", "()Landroidx/lifecycle/MutableLiveData;", "dateFormat", "Ljava/text/SimpleDateFormat;", "addBooking", "", "formStateChanged", "startDate", "", "endDate", "roomId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "app_debug"})
public final class BookingViewModel extends androidx.lifecycle.ViewModel {
    private final java.text.SimpleDateFormat dateFormat = null;
    private final androidx.lifecycle.MutableLiveData<com.ut.iot.rooms.ui.home.booking.BookingFormState> bookingFormStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ut.iot.rooms.ui.home.booking.BookingFormState> bookingFormStateLiveData_ = null;
    private final androidx.lifecycle.MutableLiveData<com.ut.iot.rooms.data.model.AddBookingRequest> addBookingRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.lang.Boolean>> addBookingResponse = null;
    private final com.ut.iot.rooms.repo.booking.BookingRepo bookingRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ut.iot.rooms.ui.home.booking.BookingFormState> getBookingFormStateLiveData_() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.lang.Boolean>> getAddBookingResponse() {
        return null;
    }
    
    public final void formStateChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer roomId) {
    }
    
    public final void addBooking(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.data.model.AddBookingRequest addBooking) {
    }
    
    @javax.inject.Inject()
    public BookingViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.repo.booking.BookingRepo bookingRepo) {
        super();
    }
}