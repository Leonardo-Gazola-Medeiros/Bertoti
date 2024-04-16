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
            System.out.println("Media is already playing.");
        }
    }

    public void stopMedia() {
        if (isPlaying) {
            System.out.println("Stopping media.");
            isPlaying = false;
        } else {
            System.out.println("No media is playing.");
        }
    }
}
