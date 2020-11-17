package com.mf.dagger.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.mf.dagger.R;
import com.mf.dagger.di.component.DaggerActivityComponent;
import com.mf.dagger.di.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent
                .builder()
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);

        Log.e(TAG, "onCreate: " + viewModel.getSomeData());

    }


}