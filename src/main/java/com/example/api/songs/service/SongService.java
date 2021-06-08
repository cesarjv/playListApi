package com.example.api.songs.service;

import java.util.Optional;

import com.example.api.songs.entity.Song;

public interface SongService {

    public Optional<Song> getSongById(Long id);
    public Song saveSong(Song song);
    public void deleteSongById (Long id);
    public void deleteSongByTitle(String title);
    
}
