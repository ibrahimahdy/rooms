package com.ut.iot.rooms.di.modules.sub;

import java.lang.System;

/**
 * Created by Saeed on 28/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/ut/iot/rooms/di/modules/sub/HomeFragmentModule;", "", "()V", "providesHomeFragment", "Lcom/ut/iot/rooms/ui/home/home/HomeFragment;", "providesHotelFragment", "Lcom/ut/iot/rooms/ui/home/hotel/HotelFragment;", "app_debug"})
@dagger.Module()
public abstract class HomeFragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.ut.iot.rooms.ui.home.home.HomeFragment providesHomeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.ut.iot.rooms.ui.home.hotel.HotelFragment providesHotelFragment();
    
    public HomeFragmentModule() {
        super();
    }
}