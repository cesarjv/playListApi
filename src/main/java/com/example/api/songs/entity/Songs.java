package com.example.api.songs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "SONGS")
public class Songs{

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    //@JsonView(View.Create.class)
    @Column(name = "title")
    private String title;

    //@JsonView(View.Create.class)
    @Column(name = "artist")
    private String artist;

    //@JsonView(View.Create.class)
    @Column(name = "album")
    private String album;

    //@JsonView(View.Create.class)
    @Column(name = "year")
    private int year;

    /* 

    Fetch: Esta propiedad se utiliza para determinar cómo debe ser cargada la entidad.
    LAZY (perezoso): Indica que la relación solo se cargará cuando la propiedad sea leída por primera vez */
    //@JsonView(View.Get.class)
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAY_LIST_ID")
    private PlayList playList;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public PlayList getPlayList() {
        return this.playList;
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }



    
}
