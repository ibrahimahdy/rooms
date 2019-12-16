package com.ut.iot.rooms.db.typeconverter;

import java.lang.System;

/**
 * Created by Saeed on 2019-06-21.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fH\u0007J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0016\u0010\u001a\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0007J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\""}, d2 = {"Lcom/ut/iot/rooms/db/typeconverter/RoomsDBConverter;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "setMoshi", "(Lcom/squareup/moshi/Moshi;)V", "fromCountry", "", "country", "Lcom/ut/iot/rooms/data/model/Country;", "fromImages", "images", "", "Lcom/ut/iot/rooms/data/model/Image;", "fromRoom", "room", "Lcom/ut/iot/rooms/data/model/Room;", "fromRoomImages", "roomImages", "Lcom/ut/iot/rooms/data/model/RoomImage;", "fromRoomType", "roomType", "Lcom/ut/iot/rooms/data/model/RoomType;", "fromRooms", "rooms", "toCountry", "toImages", "toRoom", "toRoomImages", "toRoomType", "toRooms", "app_debug"})
public final class RoomsDBConverter {
    @org.jetbrains.annotations.NotNull()
    private com.squareup.moshi.Moshi moshi;
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    public final void setMoshi(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCountry(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.Country country) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.ut.iot.rooms.data.model.Country toCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String country) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromRoomType(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.RoomType roomType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.ut.iot.rooms.data.model.RoomType toRoomType(@org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromRoom(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.Room room) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.ut.iot.rooms.data.model.Room toRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String room) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromRooms(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ut.iot.rooms.data.model.Room> rooms) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.ut.iot.rooms.data.model.Room> toRooms(@org.jetbrains.annotations.NotNull()
    java.lang.String rooms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromRoomImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ut.iot.rooms.data.model.RoomImage> roomImages) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.ut.iot.rooms.data.model.RoomImage> toRoomImages(@org.jetbrains.annotations.NotNull()
    java.lang.String roomImages) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ut.iot.rooms.data.model.Image> images) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.ut.iot.rooms.data.model.Image> toImages(@org.jetbrains.annotations.NotNull()
    java.lang.String images) {
        return null;
    }
    
    public RoomsDBConverter() {
        super();
    }
}