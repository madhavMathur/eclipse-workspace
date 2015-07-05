package metronome;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Sound {
    public void playSoundTick() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
    	AudioInputStream audioIn = AudioSystem.getAudioInputStream(Sound.class.getResource("Tick.wav"));
    	Clip clip = AudioSystem.getClip();
    	clip.open(audioIn);
    	clip.start();
    }
    
    public void playSoundOne() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
    	AudioInputStream audioIn = AudioSystem.getAudioInputStream(Sound.class.getResource("TickOne.wav"));
    	Clip clip = AudioSystem.getClip();
    	clip.open(audioIn);
    	clip.start();
    }
}