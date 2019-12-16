package com.ut.iot.rooms.ui.auth.signin;

import java.lang.System;

/**
 * Created by Saeed on 2019-10-17.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/ut/iot/rooms/ui/auth/signin/SignInViewModel;", "Lcom/ut/iot/rooms/ui/auth/AuthViewModel;", "authRepo", "Lcom/ut/iot/rooms/repo/auth/AuthRepo;", "(Lcom/ut/iot/rooms/repo/auth/AuthRepo;)V", "loginDataChanged", "", "username", "", "password", "app_debug"})
public final class SignInViewModel extends com.ut.iot.rooms.ui.auth.AuthViewModel {
    
    public final void loginDataChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @javax.inject.Inject()
    public SignInViewModel(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.repo.auth.AuthRepo authRepo) {
        super(null);
    }
}