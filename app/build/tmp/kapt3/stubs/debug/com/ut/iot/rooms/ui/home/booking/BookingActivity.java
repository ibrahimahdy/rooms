package com.ut.iot.rooms.ui.home.booking;

import java.lang.System;

/**
 * Created by Ibrahim on 07/12/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/ut/iot/rooms/ui/home/booking/BookingActivity;", "Lcom/ut/iot/rooms/ui/BaseActivity;", "()V", "bookingViewModel", "Lcom/ut/iot/rooms/ui/home/booking/BookingViewModel;", "getBookingViewModel", "()Lcom/ut/iot/rooms/ui/home/booking/BookingViewModel;", "setBookingViewModel", "(Lcom/ut/iot/rooms/ui/home/booking/BookingViewModel;)V", "endDate", "", "formatter", "Ljava/text/DecimalFormat;", "hotelDetailViewModel", "Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailViewModel;", "getHotelDetailViewModel", "()Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailViewModel;", "setHotelDetailViewModel", "(Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailViewModel;)V", "roomItemAdapter", "Lcom/ut/iot/rooms/adapter/RoomItemAdapter;", "rooms", "", "Lcom/ut/iot/rooms/data/model/Room;", "selectedRoom", "startDate", "getEndDateAsCalendar", "Ljava/util/Calendar;", "getStartDateAsCalendar", "handleResourceLoading", "", "resourceLoading", "Lcom/ut/iot/rooms/data/model/ResourceLoading;", "listenToBookingFormState", "listenToBookingResponse", "listenToHotelDetailResponse", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "showCheckInDatePicker", "showCheckOutDatePicker", "app_debug"})
public final class BookingActivity extends com.ut.iot.rooms.ui.BaseActivity {
    private final java.text.DecimalFormat formatter = null;
    private java.lang.String startDate;
    private java.lang.String endDate;
    private com.ut.iot.rooms.data.model.Room selectedRoom;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.ui.home.booking.BookingViewModel bookingViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.ui.home.hotel.detail.HotelDetailViewModel hotelDetailViewModel;
    private final java.util.List<com.ut.iot.rooms.data.model.Room> rooms = null;
    private com.ut.iot.rooms.adapter.RoomItemAdapter roomItemAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.ui.home.booking.BookingViewModel getBookingViewModel() {
        return null;
    }
    
    public final void setBookingViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.ui.home.booking.BookingViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.ui.home.hotel.detail.HotelDetailViewModel getHotelDetailViewModel() {
        return null;
    }
    
    public final void setHotelDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.ui.home.hotel.detail.HotelDetailViewModel p0) {
    }
    
    @java.lang.Override()
    public void handleResourceLoading(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.ResourceLoading resourceLoading) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void listenToBookingFormState() {
    }
    
    private final void listenToHotelDetailResponse() {
    }
    
    private final void listenToBookingResponse() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showCheckInDatePicker() {
    }
    
    private final void showCheckOutDatePicker() {
    }
    
    private final java.util.Calendar getStartDateAsCalendar() {
        return null;
    }
    
    private final java.util.Calendar getEndDateAsCalendar() {
        return null;
    }
    
    public BookingActivity() {
        super();
    }
}