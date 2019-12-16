package com.ut.iot.rooms.di.modules.sub;

import com.ut.iot.rooms.ui.home.hotel.HotelFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = HomeFragmentModule_ProvidesHotelFragment.HotelFragmentSubcomponent.class)
public abstract class HomeFragmentModule_ProvidesHotelFragment {
  private HomeFragmentModule_ProvidesHotelFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HotelFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HotelFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HotelFragmentSubcomponent extends AndroidInjector<HotelFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HotelFragment> {}
  }
}
