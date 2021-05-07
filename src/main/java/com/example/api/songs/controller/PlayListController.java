package com.example.api.songs.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.example.api.songs.entity.PlayList;
import com.example.api.songs.entity.Song;
import com.example.api.songs.model.PlayListDTO;
import com.example.api.songs.service.PlayListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

         Song songs=new Song();
         songs.setTitle(playListDTO.getSongs().get(x).getTitle());
         songs.setArtist(playListDTO.getSongs().get(x).getArtist());
         songs.setAlbum(playListDTO.getSongs().get(x).getAlbum());
         songs.setYear(playListDTO.getSongs().get(x).getYear());
         playList.addSong(songs);

      }
        return playListService.savePlayList(playList);
     }
   @PutMapping("/{id}")
   public PlayList updatePlayList(@PathVariable(value = "id") Long id,@RequestBody Song song){

      PlayList playList = playListService.getById(id).get();
      song.setPlayList(playList);
      playList.getSongs().add(song);
      playListService.savePlayList(playList);
      return playList;
   }  

}
