package com.example.api.songs.service;

import java.util.Optional;

import com.example.api.songs.dao.SongRepository;
import com.example.api.songs.entity.Song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;

    @Override
    public Optional<Song> getSongById(Long id) {
        Optional<Song> song=songRepository.findById(id);
        return song;
    }

    @Override
    public Song saveSong(Song song) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteSongById(Long id) {
        songRepository.deleteById(id);
    }

    @Override
    public void deleteSongByTitle(String title) {
        songRepository.deleteByTitle(title);
        
    }

    
}
