package com.ut.iot.rooms.di.modules;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/ut/iot/rooms/di/modules/ActivityBindingModule;", "", "()V", "providesAuthActivity", "Lcom/ut/iot/rooms/ui/auth/AuthActivity;", "providesBookingActivity", "Lcom/ut/iot/rooms/ui/home/booking/BookingActivity;", "providesHomeActivity", "Lcom/ut/iot/rooms/ui/home/HomeActivity;", "providesHotelDetailActivity", "Lcom/ut/iot/rooms/ui/home/hotel/detail/HotelDetailActivity;", "providesSettingsActivity", "Lcom/ut/iot/rooms/ui/settings/SettingsActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ut.iot.rooms.di.modules.sub.AuthFragmentModule.class})
    public abstract com.ut.iot.rooms.ui.auth.AuthActivity providesAuthActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ut.iot.rooms.di.modules.sub.HomeFragmentModule.class})
    public abstract com.ut.iot.rooms.ui.home.HomeActivity providesHomeActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.ut.iot.rooms.ui.home.hotel.detail.HotelDetailActivity providesHotelDetailActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.ut.iot.rooms.ui.home.booking.BookingActivity providesBookingActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.ut.iot.rooms.ui.settings.SettingsActivity providesSettingsActivity();
    
    public ActivityBindingModule() {
        super();
    }
}