package com.example.api.songs.model;

import java.util.ArrayList;
import java.util.List;


public class PlayListDTO {

    private String name;

    private String description;

    private List<SongDTO> songs = new ArrayList<>(); 

    public List<SongDTO> getSongs() {
        return this.songs;
    }

    public void setSong(List<SongDTO> songs) {
        this.songs = songs;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    
}
