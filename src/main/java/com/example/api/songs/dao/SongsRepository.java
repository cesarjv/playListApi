package com.example.api.songs.dao;

import com.example.api.songs.entity.Songs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends JpaRepository<Songs, Long> {
    
}
