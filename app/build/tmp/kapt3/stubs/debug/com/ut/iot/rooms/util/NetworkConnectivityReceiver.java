package com.ut.iot.rooms.util;

import java.lang.System;

/**
 * Created on 27/04/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/ut/iot/rooms/util/NetworkConnectivityReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "hasInternet", "", "context", "Landroid/content/Context;", "onReceive", "", "intent", "Landroid/content/Intent;", "app_debug"})
public final class NetworkConnectivityReceiver extends android.content.BroadcastReceiver {
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final boolean hasInternet(android.content.Context context) {
        return false;
    }
    
    public NetworkConnectivityReceiver() {
        super();
    }
}