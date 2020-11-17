package com.mf.dagger.di.component;

import com.mf.dagger.MyApplication;
import com.mf.dagger.data.local.DatabaseService;
import com.mf.dagger.data.remote.NetworkService;
import com.mf.dagger.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);

}
