package com.ut.iot.rooms.ui.home.hotel;

import java.lang.System;

/**
 * Created by Ibrahim on 30/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ut/iot/rooms/ui/home/hotel/HotelItemClickListener;", "", "onItemClicked", "", "hotel", "Lcom/ut/iot/rooms/data/model/Hotel;", "app_debug"})
public abstract interface HotelItemClickListener {
    
    public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.data.model.Hotel hotel);
}