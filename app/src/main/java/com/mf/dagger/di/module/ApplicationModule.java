package com.mf.dagger.di.module;

import com.mf.dagger.MyApplication;
import com.mf.dagger.data.local.DatabaseService;
import com.mf.dagger.data.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    NetworkService provideNetworkService() {
        return new NetworkService(application, "abc");
    }

    @Singleton
    @Provides
    DatabaseService provideDatabaseService() {
        return new DatabaseService(application, "xyz", 1);
    }

}
