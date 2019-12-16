package com.ut.iot.rooms.api.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/ut/iot/rooms/api/service/AuthService;", "", "login", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/api/ApiResponse;", "Lcom/ut/iot/rooms/api/model/auth/AuthResponse;", "authRequest", "Lcom/ut/iot/rooms/api/model/auth/AuthRequest;", "logout", "Lcom/ut/iot/rooms/api/model/BaseResponse;", "register", "app_debug"})
public abstract interface AuthService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/login")
    public abstract androidx.lifecycle.LiveData<com.ut.iot.rooms.api.ApiResponse<com.ut.iot.rooms.api.model.auth.AuthResponse>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ut.iot.rooms.api.model.auth.AuthRequest authRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/register")
    public abstract androidx.lifecycle.LiveData<com.ut.iot.rooms.api.ApiResponse<com.ut.iot.rooms.api.model.auth.AuthResponse>> register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ut.iot.rooms.api.model.auth.AuthRequest authRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/logout")
    public abstract androidx.lifecycle.LiveData<com.ut.iot.rooms.api.ApiResponse<com.ut.iot.rooms.api.model.BaseResponse>> logout();
}