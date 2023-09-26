package edu.alisson.iphone;

import edu.alisson.iphone.aplicativos.AppleMusic;
import edu.alisson.iphone.aplicativos.Safari;
import edu.alisson.iphone.aplicativos.Telefone;

public class iPhone {
    public static void main(String[] args) {
        AppleMusic applemusic = new AppleMusic();

        applemusic.volumeUp();
        applemusic.volumeUp();
        applemusic.volumeDown();
    }
}