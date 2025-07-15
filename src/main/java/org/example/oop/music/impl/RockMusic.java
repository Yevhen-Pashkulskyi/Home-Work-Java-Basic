package org.example.oop.music.impl;

import org.example.oop.music.MusicStyles;

public class RockMusic implements MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("RockMusic playing");
    }
}
