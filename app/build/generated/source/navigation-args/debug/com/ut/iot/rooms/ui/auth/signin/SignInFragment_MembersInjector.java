// Generated by Dagger (https://dagger.dev).
package com.ut.iot.rooms.ui.auth.signin;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class SignInFragment_MembersInjector implements MembersInjector<SignInFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SignInViewModel> signInViewModelProvider;

  public SignInFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SignInViewModel> signInViewModelProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.signInViewModelProvider = signInViewModelProvider;
  }

  public static MembersInjector<SignInFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SignInViewModel> signInViewModelProvider) {
    return new SignInFragment_MembersInjector(androidInjectorProvider, signInViewModelProvider);}

  @Override
  public void injectMembers(SignInFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSignInViewModel(instance, signInViewModelProvider.get());
  }

  public static void injectSignInViewModel(SignInFragment instance,
      SignInViewModel signInViewModel) {
    instance.signInViewModel = signInViewModel;
  }
}