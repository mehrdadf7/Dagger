package com.mf.dagger.ui;

import com.mf.dagger.data.local.DatabaseService;
import com.mf.dagger.data.remote.NetworkService;

import javax.inject.Inject;

public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    @Inject
    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.dummyString() + " : " + networkService.getDummyData();
    }

}
