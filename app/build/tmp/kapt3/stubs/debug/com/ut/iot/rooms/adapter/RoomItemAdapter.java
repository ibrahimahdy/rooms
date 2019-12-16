package com.ut.iot.rooms.adapter;

import java.lang.System;

/**
 * Created by Saeed on 07/12/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/ut/iot/rooms/adapter/RoomItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ut/iot/rooms/adapter/viewholder/RoomItemViewHolder;", "items", "", "Lcom/ut/iot/rooms/data/model/Room;", "roomItemClicked", "Lcom/ut/iot/rooms/ui/home/booking/RoomItemClicked;", "(Ljava/util/List;Lcom/ut/iot/rooms/ui/home/booking/RoomItemClicked;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class RoomItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ut.iot.rooms.adapter.viewholder.RoomItemViewHolder> {
    private final java.util.List<com.ut.iot.rooms.data.model.Room> items = null;
    private final com.ut.iot.rooms.ui.home.booking.RoomItemClicked roomItemClicked = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ut.iot.rooms.adapter.viewholder.RoomItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.adapter.viewholder.RoomItemViewHolder holder, int position) {
    }
    
    public RoomItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ut.iot.rooms.data.model.Room> items, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.ui.home.booking.RoomItemClicked roomItemClicked) {
        super();
    }
}