package org.example.oop.music.app;

import org.example.oop.music.MusicStyles;
import org.example.oop.music.impl.ClassicMusic;
import org.example.oop.music.impl.PopMusic;
import org.example.oop.music.impl.RockMusic;

public class App {
    public static void main(String[] args) {
        PopMusic serduchka = new PopMusic();
        RockMusic linkinPark = new RockMusic();
        ClassicMusic beethoven = new ClassicMusic();

        MusicStyles[] music = {serduchka, linkinPark, beethoven};
        for (MusicStyles musicStyle : music) {
            musicStyle.playMusic();
        }
    }
}
