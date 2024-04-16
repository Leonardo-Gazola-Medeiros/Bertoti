package com.example.manager;

public class MediaPlayerManager {
    private static MediaPlayerManager instance;
    private boolean isPlaying;

    private MediaPlayerManager() {
        this.isPlaying = false;
    }

    public static MediaPlayerManager getInstance() {
        if (instance == null) {
            instance = new MediaPlayerManager();
        }
        return instance;
    }

    public void playMedia(String media) {
        if (!isPlaying) {
            System.out.println("Playing: " + media);
            isPlaying = true;
        } else {
            System.out.println("Video Já Está Tocando.");
        }
    }

    public void stopMedia() {
        if (isPlaying) {
            System.out.println("Parando Video.");
            isPlaying = false;
        } else {
            System.out.println("Nenhum Vídeo Tocando.");
        }
    }
}
