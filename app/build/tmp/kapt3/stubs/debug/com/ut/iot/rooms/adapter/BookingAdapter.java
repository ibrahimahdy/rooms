package com.ut.iot.rooms.adapter;

import java.lang.System;

/**
 * Created by Saeed on 28/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/ut/iot/rooms/adapter/BookingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ut/iot/rooms/adapter/viewholder/BookingViewHolder;", "bookings", "", "Lcom/ut/iot/rooms/data/model/Booking;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class BookingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ut.iot.rooms.adapter.viewholder.BookingViewHolder> {
    private final java.util.List<com.ut.iot.rooms.data.model.Booking> bookings = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ut.iot.rooms.adapter.viewholder.BookingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.adapter.viewholder.BookingViewHolder holder, int position) {
    }
    
    public BookingAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ut.iot.rooms.data.model.Booking> bookings) {
        super();
    }
}