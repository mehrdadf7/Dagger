package com.mf.dagger.di.module;

import android.app.Activity;

import com.mf.dagger.data.local.DatabaseService;
import com.mf.dagger.data.remote.NetworkService;
import com.mf.dagger.ui.MainViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

//    @Provides
//    MainViewModel provideMainViewModel() {
//        return new MainViewModel(
//                new DatabaseService(activity.getApplication(), "abc", 1),
//                new NetworkService(activity.getApplication(), "xyz")
//        );
//    }

    @Provides
    MainViewModel provideMainViewModel(DatabaseService databaseService,
                                       NetworkService networkService) {
        return new MainViewModel(databaseService, networkService);
    }

}
