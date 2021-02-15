package com.example.api.songs.dao;

import java.util.Optional;

import com.example.api.songs.entity.PlayList;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayListRepository extends JpaRepository<PlayList, Long> {

    Optional<PlayList> findById(Long Id);
    
}
