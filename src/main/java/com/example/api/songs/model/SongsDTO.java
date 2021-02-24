package com.example.api.songs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SongsDTO {

    @JsonProperty("title")
    private String title;
    @JsonProperty("artist")
    private String artist;
    @JsonProperty("album")
    private String album;
    @JsonProperty("year")
    private int year;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


        
}
    

