package Orions_War.main;

import javax.sound.sampled.*;
import java.io.*;



public class Sound{
	
	public AudioInputStream audio;//The sound file
	public Clip clip;//The sound player
	
	
	Sound(String filename) 
	{
		try
		{
			 audio = AudioSystem.getAudioInputStream(new File(filename)); // Get the Sound file
			 clip = AudioSystem.getClip();//Make the object that plays the sound
             clip.open(audio);
		}
		
		catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
    }
    catch(IOException ioe) {
            System.out.println(ioe);
    }
    catch(LineUnavailableException lua) {
            System.out.println(lua);
    }   
}

	//This method plays the sound
	public void play()
	{
		if(clip.isRunning())
			clip.stop();//if the clip is playing, stop it before you start again
		clip.setMicrosecondPosition(0);//Make sure the sound starts at the beginning
		clip.start();//play the clip	
	}
	
	public void startLoop()
	{
		clip.loop(1000);
	}
	
	public void endLoop()
	{
		clip.stop();
		clip.setMicrosecondPosition(0);
	}
}