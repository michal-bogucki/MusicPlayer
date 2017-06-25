package com.michal.musicplayer;

import android.app.Application;

import com.michal.musicplayer.Dagger.Component.AplicationComponent;
import com.michal.musicplayer.Dagger.Component.DaggerAplicationComponent;
import com.michal.musicplayer.Dagger.Component.DaggerPresenterComponent;
import com.michal.musicplayer.Dagger.Component.PresenterComponent;
import com.michal.musicplayer.Dagger.Module.AplicationModule;
import com.michal.musicplayer.Dagger.Module.PresenterModule;

/**
 * Created by michal on 24.06.17.
 */

public class App extends Application {
    private PresenterComponent mPresenterComponent;
    private AplicationComponent mAplicationComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        mAplicationComponent = DaggerAplicationComponent.builder()
                .aplicationModule(new AplicationModule(this))
                .build();
        mPresenterComponent = DaggerPresenterComponent.builder()
                .presenterModule(new PresenterModule(this))
                .build();
    }

    public PresenterComponent getPresenterComponent() {

        return mPresenterComponent;
    }

    public AplicationComponent getAppComponent() {
        return mAplicationComponent;
    }
}
