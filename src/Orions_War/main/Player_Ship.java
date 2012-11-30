package Orions_War.main;

import java.awt.Graphics;


public class Player_Ship extends Space_Objects
{
	public static double ShipRadius = 20;
	final static double maxShipSpeed = 5;
	public static double current_yVel, current_xVel, current_acceleration,current_max_speed;
	public static int current_health, current_damage;
	
	
	public static Engine_Upgrades Ship_Engine = new Engine_Upgrades();
	public static Thruster_Upgrades Ship_Thrusters = new Thruster_Upgrades();
	public static Hull_Upgrades Ship_Hull = new Hull_Upgrades();
	public static Weapon_Upgrades Ship_Weapon = new Weapon_Upgrades();
	
	Player_Ship(double xPos, double yPos, double xVel, double yVel,int health,int damage,double acceleration,double max_speed)
	{
		super(xPos, yPos, xVel, yVel, ShipRadius);
		current_yVel = yVel;
		current_xVel = xVel;
		current_acceleration = acceleration;
		current_max_speed = max_speed;
		current_health = health;
		current_damage = damage;
		Ship_Engine.initialize_stats();
		Ship_Thrusters.initialize_stats();
		Ship_Hull.initialize_stats();
		Ship_Weapon.initialize_stats();
	
	}
	
	public void setRadius()
	{
		ShipRadius =  20;
	}
	/*
	public double getAngle()
	{
		return angle;
	}
	

	public void rotateLeft()
	{
		angle += shipTurningRate;
	}
	
	public void rotateRight()
	{
		angle -= shipTurningRate;
	}
	*/
	
	
	public static void accelerateY()
	{
		// Also add thruster boost to x or y velocity
		
		current_yVel += 0.1;
		
		if(current_yVel >5)
		{
			current_yVel = 5;
		}
	}
	
	public static void accelerateX()
	{
		current_xVel += 0.1;
		
		if(current_xVel > 5)
		{
			current_xVel = 5;
		}
	}
	
	public static void deaccelerateX()
	{
		current_xVel -= 0.1;
		
		if(current_xVel < -5)
		{
			current_xVel = -5;
		}
	}
	
	public static void deacceleateY()
	{
		current_yVel -= 0.1;
		
		if(current_yVel < -5)
		{
			current_yVel = -5;
		}
	}
	
	
	public void update_parts()
	{
		current_yVel = 25;
		current_xVel = 25;
		current_acceleration = 1.0;
		current_health = 100;
		current_damage = 50;
		current_max_speed = 25;
		current_yVel = Ship_Engine.update_Engine();
		current_xVel = Ship_Engine.update_Engine();
		if(Main.Player1.Ship.Ship_Engine.getCurrentEngine() != -1)
		current_max_speed = Ship_Engine.update_Engine();
		current_acceleration += Ship_Thrusters.update_Thruster();
		current_health += Ship_Hull.update_Hull();
		current_damage += Ship_Weapon.update_Weapon();
		if(current_damage > 100)
		{
			current_damage -= 50;
		}
	
	}
	
	/*public Shot fire()
	{
		return new Shot();
	}
	*/

	


}
