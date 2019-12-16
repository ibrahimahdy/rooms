package com.ut.iot.rooms.ui.auth.signin;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/ut/iot/rooms/ui/auth/signin/SignInFragment;", "Lcom/ut/iot/rooms/ui/auth/AuthBaseFragment;", "()V", "authSuccess", "", "signInViewModel", "Lcom/ut/iot/rooms/ui/auth/signin/SignInViewModel;", "getSignInViewModel", "()Lcom/ut/iot/rooms/ui/auth/signin/SignInViewModel;", "setSignInViewModel", "(Lcom/ut/iot/rooms/ui/auth/signin/SignInViewModel;)V", "auth", "", "authRequest", "Lcom/ut/iot/rooms/api/model/auth/AuthRequest;", "loginWithEmailAndPassword", "emailAddress", "", "password", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
public final class SignInFragment extends com.ut.iot.rooms.ui.auth.AuthBaseFragment {
    private boolean authSuccess;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.ui.auth.signin.SignInViewModel signInViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.ui.auth.signin.SignInViewModel getSignInViewModel() {
        return null;
    }
    
    public final void setSignInViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.ui.auth.signin.SignInViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void auth(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.model.auth.AuthRequest authRequest) {
    }
    
    private final void loginWithEmailAndPassword(java.lang.String emailAddress, java.lang.String password) {
    }
    
    public SignInFragment() {
        super();
    }
}