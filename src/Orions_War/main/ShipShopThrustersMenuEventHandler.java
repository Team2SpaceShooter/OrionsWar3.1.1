package Orions_War.main;

import java.io.FileNotFoundException;



public class ShipShopThrustersMenuEventHandler
{

	public static void handleEvent(int eventId) throws FileNotFoundException
	{
		// Do nothing because same screen is being selected
		if(eventId == 1)
		{
			System.out.println("Exit Ship Shop Thrusters to Main Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopMenu);
		   
			Main.ShipShopMenu.setVisible(true);
			Main.ShipShopMenu.setEnabled(true);
			Main.ShipShopMenu.setFocusable(true);
			Main.ShipShopMenu.requestFocusInWindow();
		}
		
		// Do nothing because same screen selected
		else if(eventId == 2)
		{
			System.out.println("Exit Ship Shop Thrusters to Thrusters Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
		   
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		
		else if(eventId == 3)
		{
			System.out.println("Exit Ship Shop Thrusters to Hulls Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopHullsMenu);
		   
			Main.ShipShopHullsMenu.setVisible(true);
			Main.ShipShopHullsMenu.setEnabled(true);
			Main.ShipShopHullsMenu.setFocusable(true);
			Main.ShipShopHullsMenu.requestFocusInWindow();
		}
		
		else if(eventId == 4)
		{
			
		}
		else if(eventId == 5)
		{
			System.out.println("Exit Ship Shop Thrusters to Weapons Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopWeaponsMenu);
		   
			Main.ShipShopWeaponsMenu.setVisible(true);
			Main.ShipShopWeaponsMenu.setEnabled(true);
			Main.ShipShopWeaponsMenu.setFocusable(true);
			Main.ShipShopWeaponsMenu.requestFocusInWindow();
		}
		else if(eventId == 6)
		{
			Save_Confirmation_PopUp_MenuEventHandler.menu_choice = 2;
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.Save_Confirmation_PopUp);
			Main.Save_Confirmation_PopUp.setVisible(true);
			Main.Save_Confirmation_PopUp.setEnabled(true);
			Main.Save_Confirmation_PopUp.setFocusable(true);
			Main.Save_Confirmation_PopUp.requestFocusInWindow();	
		}
		else if(eventId == 7)
		{
			System.out.println("Exit Ship Shop Thrusters to Next Level selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.Game_Screen);
		   
			Main.Game_Screen.setVisible(true);
			Main.Game_Screen.setEnabled(true);
			Main.Game_Screen.setFocusable(true);
			Main.Game_Screen.requestFocusInWindow();
			Main.Game_Screen.play();
		}
		else if(eventId == 8)
		{
			System.out.println("Exit Ship Shop Thrusters to Main Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		else if(eventId == 9 || eventId == 10 || eventId == 11)
		{
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			Main.mainFrame.add(Main.Ship_Shop_Thruster_Confirmation);
			Main.Ship_Shop_Thruster_Confirmation.setLocation(265,200);
			
			Main.Ship_Shop_Thruster_Confirmation.setVisible(true);
			Main.Ship_Shop_Thruster_Confirmation.setEnabled(true);
			Main.Ship_Shop_Thruster_Confirmation.setFocusable(true);
			Main.Ship_Shop_Thruster_Confirmation.requestFocusInWindow();
			
			
		}	
		
	}
}
