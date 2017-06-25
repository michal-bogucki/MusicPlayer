package com.michal.musicplayer.Dagger.Component;

import com.michal.musicplayer.Dagger.Module.AplicationModule;
import com.michal.musicplayer.Presenter.MainActivityPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by michal on 24.06.17.
 */
@Singleton
@Component(modules = AplicationModule.class)
public interface AplicationComponent {
    void inject(MainActivityPresenter mainActivityPresenter);
}
