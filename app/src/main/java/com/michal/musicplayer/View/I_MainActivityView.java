package com.michal.musicplayer.View;

import com.michal.musicplayer.Model.Track;

import java.util.ArrayList;

/**
 * Created by michal on 24.06.17.
 */

public interface I_MainActivityView {
    void getAllTracks();
    void showAllTracks(ArrayList<Track> songs);

}
