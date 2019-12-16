package com.ut.iot.rooms.ui.home.hotel.detail;

import java.lang.System;

/**
 * Created by Ibrahim on 02/12/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailActivity;", "Lcom/ut/iot/rooms/ui/BaseActivity;", "()V", "hotelDetailItemAdapter", "Lcom/ut/iot/rooms/adapter/HotelDetailItemAdapter;", "hotelDetailViewModel", "Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailViewModel;", "getHotelDetailViewModel", "()Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailViewModel;", "setHotelDetailViewModel", "(Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailViewModel;)V", "hotelItems", "", "Lcom/ut/iot/rooms/data/model/HotelDetail;", "handleResourceLoading", "", "resourceLoading", "Lcom/ut/iot/rooms/data/model/ResourceLoading;", "init", "hotel", "Lcom/ut/iot/rooms/data/model/Hotel;", "initImage", "image", "Lcom/ut/iot/rooms/data/model/Image;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class HotelDetailActivity extends com.ut.iot.rooms.ui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.ui.home.hotel.detail.HotelDetailViewModel hotelDetailViewModel;
    private final java.util.List<com.ut.iot.rooms.data.model.HotelDetail> hotelItems = null;
    private com.ut.iot.rooms.adapter.HotelDetailItemAdapter hotelDetailItemAdapter;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void init(com.ut.iot.rooms.data.model.Hotel hotel) {
    }
    
    private final void initImage(com.ut.iot.rooms.data.model.Image image) {
    }
    
    public HotelDetailActivity() {
        super();
    }
}