package Orions_War.main;

import java.awt.Graphics;


public class Player_Ship extends Space_Objects
{
	final static double ShipRadius = 5;
	final static double maxShipSpeed = 5;
	final static double shipTurningRate = java.lang.Math.PI/32;
	private double angle;
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
		angle = 0;
	}
	
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

	public void accelerate()
	{
		
		xVelocity += 0.1 * java.lang.Math.sin(angle);
		yVelocity += 0.1 * java.lang.Math.cos(angle);
		
		if(java.lang.Math.sqrt(xVelocity * xVelocity + yVelocity * yVelocity) > 10)
		{
		
			xVelocity = 10* java.lang.Math.sin(angle);
			yVelocity = 10* java.lang.Math.cos(angle);
		}
	}
	public void update_parts()
	{
		current_yVel = 25;
		current_xVel = 25;
		current_acceleration = 1.0;
		current_max_speed = 25;
		current_health = 100;
		current_damage = 50;
		current_yVel = Ship_Engine.update_Engine();
		current_xVel = Ship_Engine.update_Engine();
		current_max_speed = Ship_Engine.update_Engine();
		current_acceleration += Ship_Thrusters.update_Thruster();
		current_health += Ship_Hull.update_Hull();
		current_damage = Ship_Weapon.update_Weapon();
		
	}
	

	


}
