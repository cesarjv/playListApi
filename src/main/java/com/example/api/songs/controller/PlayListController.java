package com.example.api.songs.controller;

import java.util.ArrayList;

import java.util.Optional;

import com.example.api.songs.entity.PlayList;
import com.example.api.songs.entity.Songs;
import com.example.api.songs.model.PlayListDTO;
import com.example.api.songs.service.PlayListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playlist")
public class PlayListController {

   @Autowired
   private PlayListService playListService;

   // Get playlist by id with songs belongs that playlist

   @GetMapping("/{id}")
   public Optional<PlayList> getPlayListByID(@PathVariable(value = "id") Long id) {

      Optional<PlayList> playList = playListService.getById(id);
      return playList;
   }

   @PostMapping("/create")
   public PlayList createPlayList(@RequestBody PlayListDTO playListDTO) {

      PlayList playList = new PlayList();

      playList.setName(playListDTO.getName());
      playList.setDescription(playListDTO.getDescription());

      playList.setSongs(new ArrayList<>());

      for (int x=0; x<playListDTO.getSongs().size(); x++) {

         Songs song=new Songs();
         song.setTitle(playListDTO.getSongs().get(x).getTitle());
         song.setArtist(playListDTO.getSongs().get(x).getArtist());
         song.setAlbum(playListDTO.getSongs().get(x).getAlbum());
         song.setYear(playListDTO.getSongs().get(x).getYear());
         playList.addSong(song);

      }
        return playListService.savePlayList(playList);
     }

}
