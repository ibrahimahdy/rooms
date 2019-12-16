package com.ut.iot.rooms.di.modules;

import java.lang.System;

/**
 * Created by Saeed on 2019-06-14.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/ut/iot/rooms/di/modules/RoomsNetworkModule;", "", "()V", "providesAuthService", "Lcom/ut/iot/rooms/api/service/AuthService;", "retrofit", "Lretrofit2/Retrofit;", "providesAuthService$app_debug", "providesBookingService", "Lcom/ut/iot/rooms/api/service/BookingService;", "providesBookingService$app_debug", "providesDeviceService", "Lcom/ut/iot/rooms/api/service/DeviceService;", "providesDeviceService$app_debug", "providesHotelService", "Lcom/ut/iot/rooms/api/service/HotelService;", "providesHotelService$app_debug", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "stateManager", "Lcom/ut/iot/rooms/state/StateManager;", "providesOkHttpClient$app_debug", "providesRetrofitInterfaceForEcoRewardsAPI", "okHttpClient", "providesRetrofitInterfaceForEcoRewardsAPI$app_debug", "app_debug"})
@dagger.Module()
public final class RoomsNetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesOkHttpClient$app_debug(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.state.StateManager stateManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofitInterfaceForEcoRewardsAPI$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.api.service.DeviceService providesDeviceService$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.api.service.AuthService providesAuthService$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.api.service.BookingService providesBookingService$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ut.iot.rooms.api.service.HotelService providesHotelService$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public RoomsNetworkModule() {
        super();
    }
}