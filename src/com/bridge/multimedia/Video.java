package com.bridge.multimedia;

public class Video implements Playable{
    @Override
    public String play() {
        return "Se ven cosas";
    }

    @Override
    public String stop() {
        return "No se ve nada";
    }
}
