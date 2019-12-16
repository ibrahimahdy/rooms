package com.ut.iot.rooms.ui.auth;

import java.lang.System;

/**
 * Created by Ibrahim on 2019-10-19.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/ut/iot/rooms/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepo", "Lcom/ut/iot/rooms/repo/auth/AuthRepo;", "(Lcom/ut/iot/rooms/repo/auth/AuthRepo;)V", "_authForm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ut/iot/rooms/ui/auth/AuthFormState;", "get_authForm", "()Landroidx/lifecycle/MutableLiveData;", "authFormState", "Landroidx/lifecycle/LiveData;", "getAuthFormState", "()Landroidx/lifecycle/LiveData;", "authRequest", "Lcom/ut/iot/rooms/api/model/auth/AuthRequest;", "authResult", "Lcom/ut/iot/rooms/data/model/Resource;", "Lcom/ut/iot/rooms/data/model/UserInfo;", "getAuthResult", "isEmailValid", "", "username", "", "isPasswordValid", "password", "makeAuthRequest", "", "app_debug"})
public class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ut.iot.rooms.ui.auth.AuthFormState> _authForm = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ut.iot.rooms.ui.auth.AuthFormState> authFormState = null;
    private final androidx.lifecycle.MutableLiveData<com.ut.iot.rooms.api.model.auth.AuthRequest> authRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<com.ut.iot.rooms.data.model.UserInfo>> authResult = null;
    private final com.ut.iot.rooms.repo.auth.AuthRepo authRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ut.iot.rooms.ui.auth.AuthFormState> get_authForm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.ui.auth.AuthFormState> getAuthFormState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<com.ut.iot.rooms.data.model.UserInfo>> getAuthResult() {
        return null;
    }
    
    public final void makeAuthRequest(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.model.auth.AuthRequest authRequest) {
    }
    
    protected final boolean isEmailValid(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return false;
    }
    
    protected final boolean isPasswordValid(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.repo.auth.AuthRepo authRepo) {
        super();
    }
}