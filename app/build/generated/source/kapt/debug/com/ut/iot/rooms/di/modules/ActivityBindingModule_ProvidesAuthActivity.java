package com.ut.iot.rooms.di.modules;

import com.ut.iot.rooms.di.modules.sub.AuthFragmentModule;
import com.ut.iot.rooms.ui.auth.AuthActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_ProvidesAuthActivity.AuthActivitySubcomponent.class)
public abstract class ActivityBindingModule_ProvidesAuthActivity {
  private ActivityBindingModule_ProvidesAuthActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AuthActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AuthActivitySubcomponent.Factory builder);

  @Subcomponent(modules = AuthFragmentModule.class)
  public interface AuthActivitySubcomponent extends AndroidInjector<AuthActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AuthActivity> {}
  }
}
