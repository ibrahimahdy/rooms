// Generated by Dagger (https://dagger.dev).
package com.ut.iot.rooms.ui.auth;

import com.ut.iot.rooms.repo.device.DeviceRepo;
import com.ut.iot.rooms.state.StateManager;
import com.ut.iot.rooms.ui.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

public final class AuthActivity_MembersInjector implements MembersInjector<AuthActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<StateManager> stateManagerProvider;

  private final Provider<DeviceRepo> deviceRepoProvider;

  public AuthActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<StateManager> stateManagerProvider, Provider<DeviceRepo> deviceRepoProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.stateManagerProvider = stateManagerProvider;
    this.deviceRepoProvider = deviceRepoProvider;
  }

  public static MembersInjector<AuthActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<StateManager> stateManagerProvider, Provider<DeviceRepo> deviceRepoProvider) {
    return new AuthActivity_MembersInjector(androidInjectorProvider, stateManagerProvider, deviceRepoProvider);}

  @Override
  public void injectMembers(AuthActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    BaseActivity_MembersInjector.injectStateManager(instance, stateManagerProvider.get());
    BaseActivity_MembersInjector.injectDeviceRepo(instance, deviceRepoProvider.get());
  }
}