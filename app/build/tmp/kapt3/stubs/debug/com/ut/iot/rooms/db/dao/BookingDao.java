package com.ut.iot.rooms.db.dao;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\'J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\bH\'\u00a8\u0006\f"}, d2 = {"Lcom/ut/iot/rooms/db/dao/BookingDao;", "Lcom/ut/iot/rooms/db/dao/BaseDao;", "Lcom/ut/iot/rooms/data/model/Booking;", "deleteAll", "", "getBooking", "Landroidx/lifecycle/LiveData;", "bookingId", "", "getUserBookings", "", "userId", "app_debug"})
public abstract interface BookingDao extends com.ut.iot.rooms.db.dao.BaseDao<com.ut.iot.rooms.data.model.Booking> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM bookings WHERE id= :bookingId")
    public abstract androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Booking> getBooking(int bookingId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM bookings WHERE user_id= :userId ORDER BY id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ut.iot.rooms.data.model.Booking>> getUserBookings(int userId);
    
    @androidx.room.Query(value = "DELETE FROM bookings")
    public abstract void deleteAll();
}