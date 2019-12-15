package com.ut.iot.rooms.di.modules.sub;

import com.ut.iot.rooms.ui.auth.signin.SignInFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AuthFragmentModule_ProvidesSignInFragment.SignInFragmentSubcomponent.class)
public abstract class AuthFragmentModule_ProvidesSignInFragment {
  private AuthFragmentModule_ProvidesSignInFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SignInFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignInFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SignInFragmentSubcomponent extends AndroidInjector<SignInFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignInFragment> {}
  }
}
