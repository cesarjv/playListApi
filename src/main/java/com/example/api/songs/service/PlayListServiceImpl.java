package com.example.api.songs.service;

import java.util.Optional;

import com.example.api.songs.dao.PlayListRepository;
import com.example.api.songs.entity.PlayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayListServiceImpl implements PlayListService {

    @Autowired
    private PlayListRepository playListRepository;

    public  Optional<PlayList> getById(Long Id) {
         Optional<PlayList> playList= playListRepository.findById(Id);

        return playList;
    }

    @Override
    public PlayList savePlayList(PlayList playList) {
        return playListRepository.save(playList);

    }

    


    
}
