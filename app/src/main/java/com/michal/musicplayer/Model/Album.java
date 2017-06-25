package com.michal.musicplayer.Model;

import java.util.ArrayList;

/**
 * Created by michal on 25.06.17.
 */

public class Album {
    private String title;
    private String artist;
    private String coverCd;
    private ArrayList<Track> tracks;


    public Album(String title, String artist, String coverCd) {
        this.title = title;
        this.artist = artist;
        this.coverCd = coverCd;
        tracks = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCoverCd() {
        return coverCd;
    }

    public void setCoverCd(String coverCd) {
        this.coverCd = coverCd;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
}
