package com.michal.musicplayer.Presenter;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import com.michal.musicplayer.Dagger.Component.AplicationComponent;
import com.michal.musicplayer.Model.Track;
import com.michal.musicplayer.View.MainActivityView;

import java.util.ArrayList;

/**
 * Created by michal on 24.06.17.
 */

public class MainActivityPresenter implements I_MainActivityPresenter {
    final Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
    final String selection = MediaStore.Audio.Media.IS_MUSIC + "!=0";
    final String sortOrder = MediaStore.Audio.Media.TITLE + " ASC";





    private MainActivityView mMainActivityView;

    public MainActivityPresenter(AplicationComponent aplicationComponent) {
        aplicationComponent.inject(this);
    }

    public void setMainActivityView(MainActivityView mMainActivityView) {
        this.mMainActivityView = mMainActivityView;
    }

    @Override
    public void getAllTracks() {
        ArrayList<Track> songs = new ArrayList<>();
        ContentResolver contentResolver = mMainActivityView.getContentResolver();
        Cursor cursor = contentResolver.query(uri, null, selection, null, sortOrder);

        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {

                String data = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA));
                String title = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
                String album = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM));
                String artist = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));



                songs.add(new Track(title,album,artist,data));

            }
        }
        cursor.close();
        mMainActivityView.showAllTracks(songs);

    }


}
