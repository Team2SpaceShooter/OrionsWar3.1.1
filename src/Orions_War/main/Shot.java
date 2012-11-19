package Orions_War.main;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Shot extends Space_Objects
{
	final static double ShotRadius = 3;
	private int age;
	public static BufferedImage spriteSheet = null,weapon;
	public static BufferedImageLoader loader = new BufferedImageLoader();
	
	public Shot(double xPos, double yPos, double xVel, double yVel)
	{
		super(xPos, yPos, xVel, yVel, ShotRadius);
		age = 0;
		set_the_shots_image();

	}
	
	public void move()
	{
		super.move();
		age++;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void set_the_shots_image()
	{
		try {
			spriteSheet = loader.loadImage("images/Ship_Shop/Weapon_Sprite_Sheet.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(Main.Player1.Ship.Ship_Weapon.getCurrentWeapon() == 0)
		{
		  weapon = spriteSheet.getSubimage(2, 0, 7, 21);
		}
		else if(Main.Player1.Ship.Ship_Weapon.getCurrentWeapon() == 1)
		{
		  weapon = spriteSheet.getSubimage(30, 1, 7, 21);
		}
		else if(Main.Player1.Ship.Ship_Weapon.getCurrentWeapon() == 2)
		{
		  weapon = spriteSheet.getSubimage(16, 1, 7, 21);
		}
		
	}
}
