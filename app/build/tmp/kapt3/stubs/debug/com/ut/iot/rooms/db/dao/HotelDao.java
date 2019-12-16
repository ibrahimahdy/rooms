package com.ut.iot.rooms.db.dao;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\'J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/ut/iot/rooms/db/dao/HotelDao;", "Lcom/ut/iot/rooms/db/dao/BaseDao;", "Lcom/ut/iot/rooms/data/model/Hotel;", "deleteAll", "", "getHotel", "Landroidx/lifecycle/LiveData;", "hotelId", "", "getHotels", "", "app_debug"})
public abstract interface HotelDao extends com.ut.iot.rooms.db.dao.BaseDao<com.ut.iot.rooms.data.model.Hotel> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM hotels WHERE id= :hotelId")
    public abstract androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Hotel> getHotel(int hotelId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM hotels")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ut.iot.rooms.data.model.Hotel>> getHotels();
    
    @androidx.room.Query(value = "DELETE FROM hotels")
    public abstract void deleteAll();
}