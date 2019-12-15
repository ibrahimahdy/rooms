package com.ut.iot.rooms.di.modules;

import com.ut.iot.rooms.di.modules.sub.HomeFragmentModule;
import com.ut.iot.rooms.ui.home.HomeActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_ProvidesHomeActivity.HomeActivitySubcomponent.class)
public abstract class ActivityBindingModule_ProvidesHomeActivity {
  private ActivityBindingModule_ProvidesHomeActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HomeActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Factory builder);

  @Subcomponent(modules = HomeFragmentModule.class)
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeActivity> {}
  }
}
