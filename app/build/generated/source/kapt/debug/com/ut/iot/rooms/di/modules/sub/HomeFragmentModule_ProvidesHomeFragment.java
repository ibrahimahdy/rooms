package com.ut.iot.rooms.di.modules.sub;

import com.ut.iot.rooms.ui.home.home.HomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = HomeFragmentModule_ProvidesHomeFragment.HomeFragmentSubcomponent.class)
public abstract class HomeFragmentModule_ProvidesHomeFragment {
  private HomeFragmentModule_ProvidesHomeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HomeFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeFragment> {}
  }
}
