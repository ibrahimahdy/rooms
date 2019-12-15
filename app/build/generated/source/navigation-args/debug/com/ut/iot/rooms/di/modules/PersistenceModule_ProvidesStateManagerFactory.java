// Generated by Dagger (https://dagger.dev).
package com.ut.iot.rooms.di.modules;

import com.ut.iot.rooms.Rooms;
import com.ut.iot.rooms.state.StateManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PersistenceModule_ProvidesStateManagerFactory implements Factory<StateManager> {
  private final PersistenceModule module;

  private final Provider<Rooms> roomsProvider;

  public PersistenceModule_ProvidesStateManagerFactory(PersistenceModule module,
      Provider<Rooms> roomsProvider) {
    this.module = module;
    this.roomsProvider = roomsProvider;
  }

  @Override
  public StateManager get() {
    return providesStateManager(module, roomsProvider.get());
  }

  public static PersistenceModule_ProvidesStateManagerFactory create(PersistenceModule module,
                                                                     Provider<Rooms> roomsProvider) {
    return new PersistenceModule_ProvidesStateManagerFactory(module, roomsProvider);
  }

  public static StateManager providesStateManager(PersistenceModule instance, Rooms rooms) {
    return Preconditions.checkNotNull(instance.providesStateManager(rooms), "Cannot return null from a non-@Nullable @Provides method");
  }
}
