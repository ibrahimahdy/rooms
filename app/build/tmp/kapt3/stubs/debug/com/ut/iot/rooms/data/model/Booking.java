package com.ut.iot.rooms.data.model;

import java.lang.System;

@androidx.room.ForeignKey(entity = com.ut.iot.rooms.data.model.Room.class, parentColumns = {"id"}, childColumns = {"room_id"}, onDelete = androidx.room.ForeignKey.CASCADE)
@androidx.room.Entity(tableName = "bookings")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003Jo\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\t\u00101\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u001c\u00a8\u00062"}, d2 = {"Lcom/ut/iot/rooms/data/model/Booking;", "", "id", "", "total_nights", "total_price", "", "currency", "hotel", "start_date", "end_date", "room_id", "user_id", "room", "Lcom/ut/iot/rooms/data/model/Room;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/ut/iot/rooms/data/model/Room;)V", "getCurrency", "()Ljava/lang/String;", "getEnd_date", "getHotel", "getId", "()I", "getRoom", "()Lcom/ut/iot/rooms/data/model/Room;", "setRoom", "(Lcom/ut/iot/rooms/data/model/Room;)V", "getRoom_id", "setRoom_id", "(I)V", "getStart_date", "getTotal_nights", "getTotal_price", "getUser_id", "setUser_id", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Booking {
    @androidx.room.PrimaryKey()
    private final int id = 0;
    private final int total_nights = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String total_price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hotel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String start_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String end_date = null;
    private int room_id;
    private int user_id;
    @org.jetbrains.annotations.Nullable()
    private com.ut.iot.rooms.data.model.Room room;
    
    public final int getId() {
        return 0;
    }
    
    public final int getTotal_nights() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotal_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHotel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStart_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_date() {
        return null;
    }
    
    public final int getRoom_id() {
        return 0;
    }
    
    public final void setRoom_id(int p0) {
    }
    
    public final int getUser_id() {
        return 0;
    }
    
    public final void setUser_id(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ut.iot.rooms.data.model.Room getRoom() {
        return null;
    }
    
    public final void setRoom(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.Room p0) {
    }
    
    public Booking(int id, int total_nights, @org.jetbrains.annotations.NotNull()
    java.lang.String total_price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String hotel, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, int room_id, int user_id, @org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.Room room) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ut.iot.rooms.data.model.Room component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.data.model.Booking copy(int id, int total_nights, @org.jetbrains.annotations.NotNull()
    java.lang.String total_price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String hotel, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, int room_id, int user_id, @org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.Room room) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}