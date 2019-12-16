package com.ut.iot.rooms.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J\b\u0010!\u001a\u00020\u001eH\u0004J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\u0012\u0010\'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u001eH\u0014J0\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e01H\u0002J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020-J\b\u00104\u001a\u00020\u001eH\u0004J\u000e\u00105\u001a\u00020\u001e2\u0006\u00103\u001a\u00020-J\b\u00106\u001a\u00020\u001eH\u0004J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006;"}, d2 = {"Lcom/ut/iot/rooms/ui/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "banner", "Lcom/ut/iot/rooms/util/BannerNotification;", "broadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "deviceRepo", "Lcom/ut/iot/rooms/repo/device/DeviceRepo;", "getDeviceRepo", "()Lcom/ut/iot/rooms/repo/device/DeviceRepo;", "setDeviceRepo", "(Lcom/ut/iot/rooms/repo/device/DeviceRepo;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposables", "(Lio/reactivex/disposables/CompositeDisposable;)V", "isInternetAvailable", "", "networkConnectivityReceiver", "Lcom/ut/iot/rooms/util/NetworkConnectivityReceiver;", "stateManager", "Lcom/ut/iot/rooms/state/StateManager;", "getStateManager", "()Lcom/ut/iot/rooms/state/StateManager;", "setStateManager", "(Lcom/ut/iot/rooms/state/StateManager;)V", "handleResourceLoading", "", "resourceLoading", "Lcom/ut/iot/rooms/data/model/ResourceLoading;", "hideLoader", "listenForApiMessage", "Lio/reactivex/disposables/Disposable;", "listenForDeviceRegistration", "listenForNewFCMToken", "listenForResourceLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showBanner", "type", "", "title", "content", "rightAction", "Lkotlin/Function0;", "showError", "message", "showLoader", "showSuccess", "toAuthActivity", "updateFCMToken", "token", "Lcom/ut/iot/rooms/api/model/device/UpdateFCMToken;", "updateFCMTokenOnServer", "app_debug"})
public abstract class BaseActivity extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.state.StateManager stateManager;
    private androidx.localbroadcastmanager.content.LocalBroadcastManager broadcastManager;
    private com.ut.iot.rooms.util.BannerNotification banner;
    private com.ut.iot.rooms.util.NetworkConnectivityReceiver networkConnectivityReceiver;
    @org.jetbrains.annotations.NotNull()
    protected io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ut.iot.rooms.repo.device.DeviceRepo deviceRepo;
    private boolean isInternetAvailable;
    private java.util.HashMap _$_findViewCache;
    
    protected final void showLoader() {
    }
    
    protected final void hideLoader() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.state.StateManager getStateManager() {
        return null;
    }
    
    public final void setStateManager(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.state.StateManager p0) {
    }
    
    public abstract void handleResourceLoading(@org.jetbrains.annotations.Nullable()
    com.ut.iot.rooms.data.model.ResourceLoading resourceLoading);
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    protected final void setDisposables(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ut.iot.rooms.repo.device.DeviceRepo getDeviceRepo() {
        return null;
    }
    
    public final void setDeviceRepo(@org.jetbrains.annotations.NotNull()
    com.ut.iot.rooms.repo.device.DeviceRepo p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateFCMToken(com.ut.iot.rooms.api.model.device.UpdateFCMToken token) {
    }
    
    private final void updateFCMTokenOnServer() {
    }
    
    private final io.reactivex.disposables.Disposable listenForApiMessage() {
        return null;
    }
    
    protected final void toAuthActivity() {
    }
    
    private final io.reactivex.disposables.Disposable listenForResourceLoading() {
        return null;
    }
    
    private final io.reactivex.disposables.Disposable listenForDeviceRegistration() {
        return null;
    }
    
    private final io.reactivex.disposables.Disposable listenForNewFCMToken() {
        return null;
    }
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void showBanner(java.lang.String type, java.lang.String title, java.lang.String content, kotlin.jvm.functions.Function0<kotlin.Unit> rightAction) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BaseActivity() {
        super();
    }
}