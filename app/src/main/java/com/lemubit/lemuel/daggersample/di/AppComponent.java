package com.lemubit.lemuel.daggersample.di;

import com.lemubit.lemuel.daggersample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyModule.class})
public interface AppComponent {
    void injectItNow(MainActivity mainActivity);
}
