package com.lemubit.lemuel.daggersample;

import android.app.Application;

import com.lemubit.lemuel.daggersample.di.AppComponent;
import com.lemubit.lemuel.daggersample.di.DaggerAppComponent;

public class App extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
