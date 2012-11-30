package Orions_War.main;

import java.awt.Graphics;
import java.util.ArrayList;

public class enemies 
{	
	volatile public static ArrayList<NPC_Ships> enemies;
	
	public static int set = 0;
	public enemies()
	{
		enemies = new ArrayList<NPC_Ships>();	
	}
	
	public static void add(NPC_Ships NPC)
	{
		enemies.add(NPC);
	}
	
	public static void moveAll()
	{
		for(int i=0; i < enemies.size(); i++)
			enemies.get(i).move();
	}
	
	public static void spawnenemies1()
	{
		
		Runnable r1 = new Runnable()
		{
			public void run(){
			for(int i=0; i < 4; i++)
			{
			    add(new NPC_Ships(0, -5, 200, 6, -1, 30));
				add(new NPC_Ships(1, -30, 250, 6, -1, 30));	
				add(new NPC_Ships(2, 15, 300, 6, -1, 30));
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			}
		};
		
		Thread r = new Thread(r1);
		r.run();
		
	}
	
	public static void spawnenemies2()
	{
		Runnable r2 = new Runnable()
		{
			public void run(){
			for(int i=0; i < 10; i++)
			{
				add(new NPC_Ships(1, -5, 100, 5, 0, 5));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		};
		
		Thread r = new Thread(r2);
		//r.run();
	}
	
	public static void spawnenemies3()
	{
		Runnable r2 = new Runnable()
		{
			public void run(){
			for(int i=0; i < 10; i++)
			{
				add(new NPC_Ships(2, -5, 400, 5, -1, 5));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		};
		
		Thread r = new Thread(r2);
		//r.run();
	}
	
	public static void drawAll(Graphics g)
	{
		for(int i=0; i < enemies.size(); i++)
		{
		
			g.drawImage(enemies.get(i).enemy_ship,(int) enemies.get(i).xPosition, (int) enemies.get(i).yPosition, enemies.get(i).enemy_ship.getWidth(),enemies.get(i).enemy_ship.getHeight(),Main.Game_Screen);
		}
	}
	
	public static void handleOffScreen()
	{
		for(int i=0; i < enemies.size(); i++)
		{
			if(enemies.get(i).xPosition > 1050 || enemies.get(i).xPosition < -50)
			{
				enemies.remove(i);
			
			}
		}
		for(int x = 0; x < Main.Game_Screen.Enemy_Shots.size(); x++)
		{
			if(Main.Game_Screen.Enemy_Shots.get(x).getYPosition()>800)
			{
				Main.Game_Screen.Enemy_Shots.remove(x);
			}
		}
		for(int y = 0; y < Main.Game_Screen.Enemy_Shots2.size(); y++)
		{
			if(Main.Game_Screen.Enemy_Shots2.get(y).getYPosition()>800)
			{
				Main.Game_Screen.Enemy_Shots2.remove(y);
			}
		}
		
	}
}
