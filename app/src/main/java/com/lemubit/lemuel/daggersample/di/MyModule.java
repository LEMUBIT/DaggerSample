package com.lemubit.lemuel.daggersample.di;

import com.lemubit.lemuel.daggersample.Calculation;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    @Singleton
    public Calculation getCalc(@Named("operation") String operation) {
        return new Calculation(operation);
    }

    @Provides
    @Named("operation")
    String provideOperationString() {
        return "Addition";
    }

}
