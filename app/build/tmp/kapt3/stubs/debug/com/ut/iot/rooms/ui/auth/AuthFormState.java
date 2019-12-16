package com.ut.iot.rooms.ui.auth;

import java.lang.System;

/**
 * Created by Ibrahim on 2019-10-17.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJT\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/ut/iot/rooms/ui/auth/AuthFormState;", "", "usernameError", "", "passwordError", "nameError", "isDataValid", "", "phoneNumberError", "serviceAreaError", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "()Z", "setDataValid", "(Z)V", "getNameError", "()Ljava/lang/Integer;", "setNameError", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPasswordError", "setPasswordError", "getPhoneNumberError", "setPhoneNumberError", "getServiceAreaError", "setServiceAreaError", "getUsernameError", "setUsernameError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/ut/iot/rooms/ui/auth/AuthFormState;", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class AuthFormState {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer usernameError;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer passwordError;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer nameError;
    private boolean isDataValid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer phoneNumberError;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer serviceAreaError;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUsernameError() {
        return null;
    }
    
    public final void setUsernameError(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPasswordError() {
        return null;
    }
    
    public final void setPasswordError(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNameError() {
        return null;
    }
    
    public final void setNameError(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean isDataValid() {
        return false;
    }
    
    public final void setDataValid(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPhoneNumberError() {
        return null;
    }
    
    public final void setPhoneNumberError(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getServiceAreaError() {
        return null;
    }
    
    public final void setServiceAreaError(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public AuthFormState(@org.jetbrains.annotations.Nullable()
    java.lang.Integer usernameError, @org.jetbrains.annotations.Nullable()
    java.lang.Integer passwordError, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nameError, boolean isDataValid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer phoneNumberError, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serviceAreaError) {
        super();
    }
    
    public AuthFormState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    /**
     * Created by Ibrahim on 2019-10-17.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.ui.auth.AuthFormState copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer usernameError, @org.jetbrains.annotations.Nullable()
    java.lang.Integer passwordError, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nameError, boolean isDataValid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer phoneNumberError, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serviceAreaError) {
        return null;
    }
    
    /**
     * Created by Ibrahim on 2019-10-17.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Ibrahim on 2019-10-17.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Ibrahim on 2019-10-17.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}