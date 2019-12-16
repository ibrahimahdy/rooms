package com.ut.iot.rooms.ui.home.booking;

import java.lang.System;

/**
 * Created by Ibrahim on 08/12/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003JV\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001\u00a2\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\bH\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011\u00a8\u00061"}, d2 = {"Lcom/ut/iot/rooms/ui/home/booking/BookingFormState;", "", "startDate", "", "endDate", "startDateFormatted", "endDateFormatted", "roomId", "", "numberOfDays", "", "isValid", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JZ)V", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "getEndDateFormatted", "setEndDateFormatted", "()Z", "setValid", "(Z)V", "getNumberOfDays", "()J", "setNumberOfDays", "(J)V", "getRoomId", "()Ljava/lang/Integer;", "setRoomId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStartDate", "setStartDate", "getStartDateFormatted", "setStartDateFormatted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JZ)Lcom/ut/iot/rooms/ui/home/booking/BookingFormState;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class BookingFormState {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String startDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String endDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String startDateFormatted;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String endDateFormatted;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer roomId;
    private long numberOfDays;
    private boolean isValid;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartDate() {
        return null;
    }
    
    public final void setStartDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndDate() {
        return null;
    }
    
    public final void setEndDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartDateFormatted() {
        return null;
    }
    
    public final void setStartDateFormatted(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndDateFormatted() {
        return null;
    }
    
    public final void setEndDateFormatted(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRoomId() {
        return null;
    }
    
    public final void setRoomId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final long getNumberOfDays() {
        return 0L;
    }
    
    public final void setNumberOfDays(long p0) {
    }
    
    public final boolean isValid() {
        return false;
    }
    
    public final void setValid(boolean p0) {
    }
    
    public BookingFormState(@org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    java.lang.String startDateFormatted, @org.jetbrains.annotations.NotNull()
    java.lang.String endDateFormatted, @org.jetbrains.annotations.Nullable()
    java.lang.Integer roomId, long numberOfDays, boolean isValid) {
        super();
    }
    
    public BookingFormState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final boolean component7() {
        return false;
    }
    
    /**
     * Created by Ibrahim on 08/12/2019.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.ui.home.booking.BookingFormState copy(@org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    java.lang.String startDateFormatted, @org.jetbrains.annotations.NotNull()
    java.lang.String endDateFormatted, @org.jetbrains.annotations.Nullable()
    java.lang.Integer roomId, long numberOfDays, boolean isValid) {
        return null;
    }
    
    /**
     * Created by Ibrahim on 08/12/2019.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Ibrahim on 08/12/2019.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Ibrahim on 08/12/2019.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}