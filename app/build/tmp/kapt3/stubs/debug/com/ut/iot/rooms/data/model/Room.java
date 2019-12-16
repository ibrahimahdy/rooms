package com.ut.iot.rooms.data.model;

import java.lang.System;

@androidx.room.ForeignKey(entity = com.ut.iot.rooms.data.model.RoomType.class, parentColumns = {"id"}, childColumns = {"type_id"}, onDelete = androidx.room.ForeignKey.CASCADE)
@androidx.room.Entity(tableName = "rooms")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tBW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0003J\t\u00103\u001a\u00020\u0010H\u00c6\u0003Jn\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015\u00a8\u0006:"}, d2 = {"Lcom/ut/iot/rooms/data/model/Room;", "", "id", "", "name", "", "created_at", "updated_at", "type_id", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "type", "Lcom/ut/iot/rooms/data/model/RoomType;", "images", "", "Lcom/ut/iot/rooms/data/model/RoomImage;", "selected", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ut/iot/rooms/data/model/RoomType;Ljava/util/List;Z)V", "getCreated_at", "()Ljava/lang/String;", "setCreated_at", "(Ljava/lang/String;)V", "getId", "()I", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getName", "getSelected", "()Z", "setSelected", "(Z)V", "getType", "()Lcom/ut/iot/rooms/data/model/RoomType;", "setType", "(Lcom/ut/iot/rooms/data/model/RoomType;)V", "getType_id", "()Ljava/lang/Integer;", "setType_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUpdated_at", "setUpdated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ut/iot/rooms/data/model/RoomType;Ljava/util/List;Z)Lcom/ut/iot/rooms/data/model/Room;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Room {
    @androidx.room.PrimaryKey()
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String created_at;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String updated_at;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer type_id;
    @org.jetbrains.annotations.Nullable()
    private com.ut.iot.rooms.data.model.RoomType type;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.ut.iot.rooms.data.model.RoomImage> images;
    @androidx.room.Ignore()
    private boolean selected;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    public final void setCreated_at(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    public final void setUpdated_at(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getType_id() {
        return null;
    }
    
    public final void setType_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ut.iot.rooms.data.model.RoomType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.RoomType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ut.iot.rooms.data.model.RoomImage> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ut.iot.rooms.data.model.RoomImage> p0) {
    }
    
    public final boolean getSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public Room(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type_id, @org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.RoomType type, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ut.iot.rooms.data.model.RoomImage> images, boolean selected) {
        super();
    }
    
    public Room(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type_id) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ut.iot.rooms.data.model.RoomType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ut.iot.rooms.data.model.RoomImage> component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.data.model.Room copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type_id, @org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.RoomType type, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ut.iot.rooms.data.model.RoomImage> images, boolean selected) {
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