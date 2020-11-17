package com.mf.dagger.di.component;

import com.mf.dagger.di.module.ActivityModule;
import com.mf.dagger.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);

}
