package Orions_War.main;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class ShipShopEnginesMenuEventHandler
{
    
	public static void handleEvent(int eventId)
	{
		// Changes focus to Main Ship Shop Menu
		if(eventId == 1)
		{
			System.out.println("Exit Ship Shop Engines menu to Main Ship Shop Menu selected");
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.ShipShopMenu);
		   
			Main.ShipShopMenu.setVisible(true);
			Main.ShipShopMenu.setEnabled(true);
			Main.ShipShopMenu.setFocusable(true);
			Main.ShipShopMenu.requestFocusInWindow();
		}
		
		// Do nothing because same screen selected
		else if(eventId == 2)
		{
		
		}
		
		else if(eventId == 3)
		{
			System.out.println("Exit Ship Shop Engines menu to Hulls Ship Shop Menu selected");
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.ShipShopHullsMenu);
		   
			Main.ShipShopHullsMenu.setVisible(true);
			Main.ShipShopHullsMenu.setEnabled(true);
			Main.ShipShopHullsMenu.setFocusable(true);
			Main.ShipShopHullsMenu.requestFocusInWindow();
		}
		
		else if(eventId == 4)
		{
			System.out.println("Exit Ship Shop Engines menu to Thrusters Ship Shop Menu selected");
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.ShipShopThrustersMenu);
		   
			Main.ShipShopThrustersMenu.setVisible(true);
			Main.ShipShopThrustersMenu.setEnabled(true);
			Main.ShipShopThrustersMenu.setFocusable(true);
			Main.ShipShopThrustersMenu.requestFocusInWindow();
		}
		else if(eventId == 5)
		{
			System.out.println("Exit Ship Shop Engines menu to Weapons Ship Shop Menu selected");
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.ShipShopWeaponsMenu);
		   
			Main.ShipShopWeaponsMenu.setVisible(true);
			Main.ShipShopWeaponsMenu.setEnabled(true);
			Main.ShipShopWeaponsMenu.setFocusable(true);
			Main.ShipShopWeaponsMenu.requestFocusInWindow();
		}
		else if(eventId == 6)
		{
			Save_Confirmation_PopUp_MenuEventHandler.menu_choice = 1;
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.Save_Confirmation_PopUp);
			Main.Save_Confirmation_PopUp.setVisible(true);
			Main.Save_Confirmation_PopUp.setEnabled(true);
			Main.Save_Confirmation_PopUp.setFocusable(true);
			Main.Save_Confirmation_PopUp.requestFocusInWindow();
		}
		else if(eventId == 7)
		{
			System.out.println("Exit Ship Shop Engines menu to Next Level selected");
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.Game_Screen);
		   
			Main.Game_Screen.setVisible(true);
			Main.Game_Screen.setEnabled(true);
			Main.Game_Screen.setFocusable(true);
			Main.Game_Screen.requestFocusInWindow();
		}
		else if(eventId == 8)
		{
			System.out.println("Exit Ship Shop Engines menu to Main Menu selected");
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		else if(eventId == 9 || eventId == 10 || eventId == 11)
		{
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			Main.mainFrame.add(Main.Ship_Shop_Engine_Confirmation);
			Main.Ship_Shop_Engine_Confirmation.setLocation(265,200);
			
			Main.Ship_Shop_Engine_Confirmation.setVisible(true);
			Main.Ship_Shop_Engine_Confirmation.setEnabled(true);
			Main.Ship_Shop_Engine_Confirmation.setFocusable(true);
			Main.Ship_Shop_Engine_Confirmation.requestFocusInWindow();
			
			
		}	
		
		
	}
}
