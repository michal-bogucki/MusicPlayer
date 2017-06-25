package com.michal.musicplayer.Dagger.Component;

import com.michal.musicplayer.Dagger.Module.PresenterModule;
import com.michal.musicplayer.View.MainActivityView;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by michal on 24.06.17.
 */
@Singleton
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    void inject(MainActivityView mainActivity);
}
