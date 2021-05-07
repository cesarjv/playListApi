package com.example.api.songs.service;

import java.util.Optional;

import com.example.api.songs.entity.PlayList;


public interface PlayListService {

    public Optional<PlayList> getById(Long Id);
    public PlayList savePlayList(PlayList playList);
    
}
