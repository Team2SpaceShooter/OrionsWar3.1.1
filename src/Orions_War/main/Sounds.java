package Orions_War.main;

public class Sounds {
	
	public static Sound buy;
	public static Sound move;
	public static Sound select;
	public static Sound shotSound;
	public static Sound Explosion1;
	public static Sound Explosion2;
	public static Sound Wilhelm;
	public static Sound Background;
	
	public Sounds()
	{
	    buy = new Sound("sounds/chaChing.wav");
	    move = new Sound("sounds/menuMoveSound.wav");
	    select = new Sound("sounds/menuSelectSound.wav");
	    shotSound = new Sound("sounds/Photon shot.wav");
	    Explosion1 = new Sound("sounds/Explosion1.wav");
	    Explosion2 = new Sound("sounds/Explosion2.wav");
	    Wilhelm = new Sound("sounds/WilhelmScream.wav");
	    Background = new Sound("sounds/spaceMission1.wav");
	    System.out.println("Loading Sounds");
	}

}