package com.michal.musicplayer.Dagger.Module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by michal on 24.06.17.
 */
@Module
public class AplicationModule {
    private Application mApplication;
    public AplicationModule(Application mApplication){
        this.mApplication = mApplication;

    }
    @Provides
    @Singleton
    Application providesApplication(){

        return mApplication;
    }
}
