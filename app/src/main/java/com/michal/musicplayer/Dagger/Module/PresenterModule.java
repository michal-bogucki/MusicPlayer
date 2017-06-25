package com.michal.musicplayer.Dagger.Module;

import com.michal.musicplayer.App;
import com.michal.musicplayer.Presenter.MainActivityPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by michal on 24.06.17.
 */
@Module
public class PresenterModule {
    App mApp;
    public PresenterModule(App mApp){
        this.mApp = mApp;
    }

    @Provides
    @Singleton
    MainActivityPresenter mainActivityPresenter(){
        return new MainActivityPresenter(mApp.getAppComponent());
    }

}
