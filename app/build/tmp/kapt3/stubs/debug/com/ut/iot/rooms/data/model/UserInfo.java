package com.ut.iot.rooms.data.model;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/ut/iot/rooms/data/model/UserInfo;", "", "()V", "bookings", "", "Lcom/ut/iot/rooms/data/model/Booking;", "getBookings", "()Ljava/util/Set;", "setBookings", "(Ljava/util/Set;)V", "user", "Lcom/ut/iot/rooms/data/model/User;", "getUser", "()Lcom/ut/iot/rooms/data/model/User;", "setUser", "(Lcom/ut/iot/rooms/data/model/User;)V", "app_debug"})
public final class UserInfo {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.ut.iot.rooms.data.model.User user;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "id", entityColumn = "user_id")
    private java.util.Set<com.ut.iot.rooms.data.model.Booking> bookings;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ut.iot.rooms.data.model.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.ut.iot.rooms.data.model.Booking> getBookings() {
        return null;
    }
    
    public final void setBookings(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.ut.iot.rooms.data.model.Booking> p0) {
    }
    
    public UserInfo() {
        super();
    }
}