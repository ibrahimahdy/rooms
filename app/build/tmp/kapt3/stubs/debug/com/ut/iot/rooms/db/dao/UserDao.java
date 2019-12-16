package com.ut.iot.rooms.db.dao;

import java.lang.System;

/**
 * Created by Saeed on 27/11/2019.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/ut/iot/rooms/db/dao/UserDao;", "Lcom/ut/iot/rooms/db/dao/BaseDao;", "Lcom/ut/iot/rooms/data/model/User;", "deleteAll", "", "getLoggedInUser", "Landroidx/lifecycle/LiveData;", "Lcom/ut/iot/rooms/data/model/UserInfo;", "app_debug"})
public abstract interface UserDao extends com.ut.iot.rooms.db.dao.BaseDao<com.ut.iot.rooms.data.model.User> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user LIMIT 1")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<com.ut.iot.rooms.data.model.UserInfo> getLoggedInUser();
    
    @androidx.room.Query(value = "DELETE FROM user")
    public abstract void deleteAll();
}