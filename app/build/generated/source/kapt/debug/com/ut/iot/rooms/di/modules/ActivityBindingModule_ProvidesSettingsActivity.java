package com.ut.iot.rooms.di.modules;

import com.ut.iot.rooms.ui.settings.SettingsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_ProvidesSettingsActivity.SettingsActivitySubcomponent.class
)
public abstract class ActivityBindingModule_ProvidesSettingsActivity {
  private ActivityBindingModule_ProvidesSettingsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SettingsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SettingsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SettingsActivitySubcomponent extends AndroidInjector<SettingsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsActivity> {}
  }
}
