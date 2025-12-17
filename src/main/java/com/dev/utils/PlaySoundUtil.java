package com.dev.utils;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

/**
 * @author Matheus Sobral
 * Simples ferramenta para reproduzir sons
 */

public class PlaySoundUtil {

    public static void playSound(String soundPath) {
        try {
            URL url = PlaySoundUtil.class.getResource(soundPath);
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            // Força a JVM a esperar o som terminar
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
