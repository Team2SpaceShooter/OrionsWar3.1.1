package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Weapon_Upgrades 
{
   public static ArrayList<Integer> Weapon_Cost = new ArrayList<Integer>();
   public static ArrayList<Integer> Power = new ArrayList<Integer>();
   public static int current_Weapon[] = new int[3];
   public static int purchased_Weapon[] = new int[3];
   
   public void initialize_stats()
   {
	   Weapon_Cost.add(10000);
	   Weapon_Cost.add(15000);
	   Weapon_Cost.add(20000);
	   Power.add(100);
	   Power.add(150);
	   Power.add(200);
	   current_Weapon[0] = 0;
	   current_Weapon[1] = 0;
	   current_Weapon[2] = 0;
	   purchased_Weapon[0] = 0;
	   purchased_Weapon[1] = 0;
	   purchased_Weapon[2] = 0;
   }
   
   public int getCurrentWeapon()
   {
	   for(int x = 0; x < 3; x++)
	   {
		   if(current_Weapon[x] == 1)
		   {
			   return x;
		   }
	   
	   }
	   return -1; 
   }
   
   public void update_purhcased_Weapons(int n)
   {
	   purchased_Weapon[n] = 1;
	   update_equipped_weapon(n);
   }
   
   public void update_equipped_weapon(int n)
   {
	  
	  for(int x = 0;x < 3; x++)
	  {
		current_Weapon[x] = 0; 
	  } 
	  current_Weapon[n] = 1;
   }
   
   public int update_Weapon()
   {
	   if(getCurrentWeapon() != -1)
	   return Power.get(getCurrentWeapon());
	   else
	   return 0;
   }

public void update_equipped_Weapon(int n)
   {
	  
	  for(int x = 0;x < 3; x++)
	  {
		current_Weapon[x] = 0; 
	  }
	   current_Weapon[n] = 1;
	  
   }

public int check_purchased_Weapons(int n)
{
	  if(purchased_Weapon[n] == 1)
		{
		  return 1;
		}
	  else
		  return 0;
}
}
   
   
