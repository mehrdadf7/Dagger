package com.mf.dagger;

import android.app.Application;
import android.util.Log;

import com.mf.dagger.data.local.DatabaseService;
import com.mf.dagger.data.remote.NetworkService;
import com.mf.dagger.di.component.DaggerApplicationComponent;
import com.mf.dagger.di.module.ApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";

    @Inject
    NetworkService networkService;

    @Inject
    DatabaseService databaseService;

    @Inject
    NetworkService networkService2;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build()
                .inject(this);

        Log.e(TAG, "onCreate: " + networkService.toString());

    }

}
