package com.ut.iot.rooms.di.modules;

import com.ut.iot.rooms.ui.home.hotel.detail.HotelDetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_ProvidesHotelDetailActivity.HotelDetailActivitySubcomponent.class
)
public abstract class ActivityBindingModule_ProvidesHotelDetailActivity {
  private ActivityBindingModule_ProvidesHotelDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HotelDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HotelDetailActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HotelDetailActivitySubcomponent extends AndroidInjector<HotelDetailActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HotelDetailActivity> {}
  }
}
