package com.ut.iot.rooms.adapter;

import java.lang.System;

/**
 * Created by Saeed on 30/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/ut/iot/rooms/adapter/HotelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ut/iot/rooms/adapter/viewholder/HotelViewHolder;", "items", "", "Lcom/ut/iot/rooms/data/model/Hotel;", "onHotelItemClickListener", "Lcom/ut/iot/rooms/ui/home/hotel/HotelItemClickListener;", "(Ljava/util/List;Lcom/ut/iot/rooms/ui/home/hotel/HotelItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class HotelAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ut.iot.rooms.adapter.viewholder.HotelViewHolder> {
    private final java.util.List<com.ut.iot.rooms.data.model.Hotel> items = null;
    private final com.ut.iot.rooms.ui.home.hotel.HotelItemClickListener onHotelItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ut.iot.rooms.adapter.viewholder.HotelViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.adapter.viewholder.HotelViewHolder holder, int position) {
    }
    
    public HotelAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ut.iot.rooms.data.model.Hotel> items, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.ui.home.hotel.HotelItemClickListener onHotelItemClickListener) {
        super();
    }
}