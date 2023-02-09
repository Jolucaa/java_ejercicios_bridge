package com.bridge.multimedia;

public class MediaPlayer {

    public String reproduciendo(Playable playable){
        return playable.play();
    }

    public String parando(Playable playable){
        return playable.stop();
    }
}
