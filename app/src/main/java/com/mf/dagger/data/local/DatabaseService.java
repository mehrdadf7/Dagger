package com.mf.dagger.data.local;

import android.content.Context;

import javax.inject.Singleton;

public class DatabaseService {

    private Context context;
    private String databaseName;
    private int version;

    public DatabaseService(
            Context context,
            String databaseName,
            int version
    ) {
        this.context = context;
        this.databaseName = databaseName;
        this.version = version;
    }

    public String dummyString() {
        return  "DATABASE_DUMMY_DATA";
    }

}
