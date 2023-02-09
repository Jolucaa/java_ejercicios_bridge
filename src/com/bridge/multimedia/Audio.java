package com.bridge.multimedia;

public class Audio implements Playable{
    @Override
    public String play() {
        return "\u266A \u2665";
    }

    @Override
    public String stop() {
        return "No se oye nada";
    }
}
