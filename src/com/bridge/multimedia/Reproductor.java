package com.bridge.multimedia;

public class Reproductor {
     public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        Audio song = new Audio();
         System.out.println(player.reproduciendo(song));
         System.out.println(player.reproduciendo(song));
         System.out.println(player.parando(song));
         System.out.println(player.parando(song));
    }
}
