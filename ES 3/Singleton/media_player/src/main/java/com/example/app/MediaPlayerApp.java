package com.example.app;

import com.example.manager.MediaPlayerManager;

public class MediaPlayerApp {
    public static void main(String[] args) {
        MediaPlayerManager player1 = MediaPlayerManager.getInstance();
        MediaPlayerManager player2 = MediaPlayerManager.getInstance();

        System.out.println("player1 == player2: " + (player1 == player2));

        player1.playMedia("song.mp3");
        player2.playMedia("movie.mp4");
        player1.stopMedia();
        player2.stopMedia();
    }
}
