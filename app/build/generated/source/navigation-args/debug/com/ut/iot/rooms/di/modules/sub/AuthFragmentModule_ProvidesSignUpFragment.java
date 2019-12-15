package com.ut.iot.rooms.di.modules.sub;

import com.ut.iot.rooms.ui.auth.signup.SignUpFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AuthFragmentModule_ProvidesSignUpFragment.SignUpFragmentSubcomponent.class)
public abstract class AuthFragmentModule_ProvidesSignUpFragment {
  private AuthFragmentModule_ProvidesSignUpFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SignUpFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignUpFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SignUpFragmentSubcomponent extends AndroidInjector<SignUpFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignUpFragment> {}
  }
}
