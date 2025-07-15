package org.example.oop.music.impl;

import org.example.oop.music.MusicStyles;

public class ClassicMusic implements MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("ClassicMusic playing");
    }
}
