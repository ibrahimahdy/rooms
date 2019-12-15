// Generated by Dagger (https://dagger.dev).
package com.ut.iot.rooms.di.modules;

import com.ut.iot.rooms.db.RoomsDB;
import com.ut.iot.rooms.db.dao.RoomDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_RoomDaoProviderFactory implements Factory<RoomDao> {
  private final PersistenceModule module;

  private final Provider<RoomsDB> dbProvider;

  public PersistenceModule_RoomDaoProviderFactory(PersistenceModule module,
      Provider<RoomsDB> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public RoomDao get() {
    return roomDaoProvider(module, dbProvider.get());
  }

  public static PersistenceModule_RoomDaoProviderFactory create(PersistenceModule module,
                                                                Provider<RoomsDB> dbProvider) {
    return new PersistenceModule_RoomDaoProviderFactory(module, dbProvider);
  }

  public static RoomDao roomDaoProvider(PersistenceModule instance, RoomsDB db) {
    return Preconditions.checkNotNull(instance.roomDaoProvider(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
