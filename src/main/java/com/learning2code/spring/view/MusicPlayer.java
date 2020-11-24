package com.learning2code.spring.view;

import com.learning2code.spring.model.Music;
import lombok.Getter;
import lombok.Setter;

/**
 * Created on 11/24/2020
 * Author Cechina Denis
 */
@Setter
@Getter
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(Music music, String name, int volume) {
        this.music = music;
        this.name = name;
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }
}
