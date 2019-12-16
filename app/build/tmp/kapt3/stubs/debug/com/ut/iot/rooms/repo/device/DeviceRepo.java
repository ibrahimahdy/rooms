package com.ut.iot.rooms.repo.device;

import java.lang.System;

/**
 * Created by Saeed on 2019-10-18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ut/iot/rooms/repo/device/DeviceRepo;", "", "stateManager", "Lcom/ut/iot/rooms/state/StateManager;", "deviceService", "Lcom/ut/iot/rooms/api/service/DeviceService;", "(Lcom/ut/iot/rooms/state/StateManager;Lcom/ut/iot/rooms/api/service/DeviceService;)V", "isDeviceRegistered", "", "registerDevice", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "", "deviceRequest", "Lcom/ut/iot/rooms/api/model/device/DeviceRequest;", "updateFcmToken", "updateFCMToken", "Lcom/ut/iot/rooms/api/model/device/UpdateFCMToken;", "app_debug"})
public final class DeviceRepo {
    private final com.ut.iot.rooms.state.StateManager stateManager = null;
    private final com.ut.iot.rooms.api.service.DeviceService deviceService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.lang.Integer>> registerDevice(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.model.device.DeviceRequest deviceRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<java.lang.Integer>> updateFcmToken(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.model.device.UpdateFCMToken updateFCMToken) {
        return null;
    }
    
    public final boolean isDeviceRegistered() {
        return false;
    }
    
    @javax.inject.Inject()
    public DeviceRepo(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.state.StateManager stateManager, @org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.api.service.DeviceService deviceService) {
        super();
    }
}