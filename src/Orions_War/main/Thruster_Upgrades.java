package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Thruster_Upgrades 
{
   public static ArrayList<Integer> Thruster_Cost = new ArrayList<Integer>();
   public static ArrayList<Double> Acceleration = new ArrayList<Double>();
   public static int current_Thruster[] = new int[3];
   public static int purchased_Thruster[] = new int[3];
   
   public void initialize_stats()
   {
	   Thruster_Cost.add(10000);
	   Thruster_Cost.add(15000);
	   Thruster_Cost.add(20000);
	   Acceleration.add(.1);
	   Acceleration.add(.2);
	   Acceleration.add(.3);
	   current_Thruster[0] = 0;
	   current_Thruster[1] = 0;
	   current_Thruster[2] = 0;
	   purchased_Thruster[0] = 0;
	   purchased_Thruster[1] = 0;
	   purchased_Thruster[2] = 0;
   }
   
   public int getCurrentThruster()
   {
	   for(int x = 0; x < 3; x++)
	   {
		   if(current_Thruster[x] == 1)
		   {
			   return x;
		   }
	   
	   }
	   return -1; 
   }
   
   public void update_purhcased_Thrusters(int n)
   {
	   purchased_Thruster[n] = 1;
	   update_equipped_thruster(n);
   }
   
   public void update_equipped_thruster(int n)
   {
	  
	  for(int x = 0;x < 3; x++)
	  {
		current_Thruster[x] = 0; 
	  } 
	  current_Thruster[n] = 1;
   }
   public double update_Thruster()
   {
	   if(getCurrentThruster() != -1)
	   return Acceleration.get(getCurrentThruster());
	   else
	   return 0.0;
   }

   public int check_purchased_Thrusters(int n)
   {
	  if(purchased_Thruster[n] == 1)
		{
		  return 1;
		}
	  else
		  return 0;
   }
   public void update_equipped_Thruster(int n)
   {
	  
	  for(int x = 0;x < 3; x++)
	  {
		current_Thruster[x] = 0; 
	  }
	   current_Thruster[n] = 1;
	  
   }

   
   }
   
   
