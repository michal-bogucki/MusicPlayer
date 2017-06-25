package com.michal.musicplayer.Model;

/**
 * Created by michal on 25.06.17.
 */

public class Track {

    private String title;
    private String album;
    private String artist;
    private String date;

    public Track() {
    }

    public Track(String title, String album, String artist,String date) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.date = date;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
