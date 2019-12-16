package com.ut.iot.rooms.di.modules;

import com.ut.iot.rooms.ui.home.booking.BookingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_ProvidesBookingActivity.BookingActivitySubcomponent.class
)
public abstract class ActivityBindingModule_ProvidesBookingActivity {
  private ActivityBindingModule_ProvidesBookingActivity() {}

  @Binds
  @IntoMap
  @ClassKey(BookingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BookingActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface BookingActivitySubcomponent extends AndroidInjector<BookingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BookingActivity> {}
  }
}
