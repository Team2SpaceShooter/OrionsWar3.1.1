package Orions_War.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Asteroids extends Enemy_Space_Objects
{

	public BufferedImage sprite = null;
	volatile public static ArrayList<Asteroids> asteroids = new ArrayList<Asteroids>();
	public static Random generator = new Random();
	public static  int xPos = generator.nextInt(940);
	public static int set = 0;
	public int type;
	public int gradius;
	public static int health;
	Asteroids(int type,double xPos, double yPos, double xVel, double yVel, double radius) 
	{
		super(xPos, yPos, xVel, yVel, radius);
	    this.type = type;
	    createAsteroid(type);
	}
	
	public static void add(Asteroids ast)
	{
		asteroids.add(ast);
	}
	public static void moveAll()
	{
		for(int i=0; i < asteroids.size(); i++)
			asteroids.get(i).move();
	}
	public static void drawAll(Graphics g)
	{
		for(int i=0; i < asteroids.size(); i++)
		{
		
			g.drawImage(asteroids.get(i).sprite,(int) asteroids.get(i).xPosition, (int) asteroids.get(i).yPosition, asteroids.get(i).sprite.getWidth(),asteroids.get(i).sprite.getHeight(),Main.Game_Screen);
		}
	}
	public static void handleOffScreen()
	{
		for(int i=0; i < asteroids.size(); i++)
		{
			if(asteroids.get(i).xPosition > 1050 || asteroids.get(i).xPosition < -50)
			{
				asteroids.remove(i);
			
			}
		}
	}
	
	public void createAsteroid(int type)
	{
		BufferedImageLoader loader = new BufferedImageLoader();
		
		if(type == 0)
		{
			try 
			{
				sprite = loader.loadImage("images/asteroidSmall01.png");
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			radius = 10;
			gradius = 30;
		    health = 50;
		}
		else if(type == 1)
		{
			
			try 
			{
				sprite = loader.loadImage("images/asteroid01.png");
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			radius = 25;
			gradius = 45;
			health = 150;
		}
		else if(type == 2)
		{
			
			try 
			{
				sprite = loader.loadImage("images/asteroidBig01.png");
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			radius = 50;
			gradius = 70;
			health = 500;
		}
	}

	public boolean overlapping(Player_Ship rhs) 
	{
		if(java.lang.Math.sqrt(( xPosition - rhs.xPosition) * (xPosition -  rhs.xPosition) +   (yPosition - rhs.yPosition) * (yPosition - rhs.yPosition)) <= radius + rhs.radius)
		{
		return true;
		}
		return false;
	}

	public boolean gravitate(Player_Ship rhs) 
	{
		if(java.lang.Math.sqrt(( xPosition - rhs.xPosition) * (xPosition -  rhs.xPosition) +   (yPosition - rhs.yPosition) * (yPosition - rhs.yPosition)) <= gradius + rhs.radius)
		{
		return true;
		}
		return false;
	}	
	
}
