package com.mf.dagger.data.remote;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

public class NetworkService {

    private Context context;
    private String apiKey;

    @Inject
    public NetworkService(
            Context context,
            String apiKey
    ) {
        this.context = context;
        this.apiKey = apiKey;
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}
