package com.example.api.songs.controller;

import java.util.Optional;

import com.example.api.songs.entity.PlayList;
import com.example.api.songs.service.PlayListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("list")
public class PlayListController {

    @Autowired
    private PlayListService playListService;

    @GetMapping("/{id}")
    public Optional<PlayList> getPlayListByID(@PathVariable(value = "id") Long id) {
        System.out.println(id);
        Optional<PlayList> playList = playListService.getById(id);
        return playList;
     }

}
