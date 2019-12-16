package com.ut.iot.rooms.repo;

import java.lang.System;

/**
 * Created by Saeed on 2019-10-18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\tH%J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\tJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH%J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H%J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0003J\u0017\u0010\u0017\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ut/iot/rooms/repo/NetworkBoundRepo;", "R", "RQ", "", "()V", "data", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/ut/iot/rooms/data/model/Resource;", "fetchDataFromApi", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/api/ApiResponse;", "fetchDataFromNetwork", "", "dataFromDB", "getLiveData", "loadFromLocalStorage", "onFetchFailed", "message", "", "saveToLocalStorage", "(Ljava/lang/Object;)V", "setData", "newData", "shouldFetchData", "", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundRepo<R extends java.lang.Object, RQ extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.ut.iot.rooms.data.model.Resource<R>> data = null;
    
    private final void fetchDataFromNetwork(androidx.lifecycle.LiveData<R> dataFromDB) {
    }
    
    @androidx.annotation.MainThread()
    private final void setData(com.ut.iot.rooms.data.model.Resource<? extends R> newData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.Resource<R>> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    protected abstract androidx.lifecycle.LiveData<R> loadFromLocalStorage();
    
    @androidx.annotation.WorkerThread()
    protected abstract void saveToLocalStorage(RQ data);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetchData(@org.jetbrains.annotations.Nullable()
    R data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<com.ut.iot.rooms.api.ApiResponse<RQ>> fetchDataFromApi();
    
    @androidx.annotation.MainThread()
    protected abstract void onFetchFailed(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public NetworkBoundRepo() {
        super();
    }
}