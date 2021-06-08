package com.example.api.songs.dao;



import com.example.api.songs.entity.Song;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    
    @Transactional
    Long deleteByTitle(String title);
    
}
