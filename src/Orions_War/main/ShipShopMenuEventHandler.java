package Orions_War.main;



public class ShipShopMenuEventHandler 
{
	// TODO: update this
	// event 1: play game
	// event 2: view highScores
	// event 3: options
	// event 4: Visit Ship Shop
	// event 5: exit application
	public static void handleEvent(int eventId)
	{
		// Do nothing because same screen is being selected
		if(eventId == 1)
		{
			
		}
		
		// Do nothing because same screen selected
		else if(eventId == 2)
		{
			System.out.println("Exit Ship Shop Main menu to Engines Ship Shop Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
		   
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		
		else if(eventId == 3)
		{
			System.out.println("Exit Ship Shop Main menu to Hulls Ship Shop Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.ShipShopHullsMenu);
		   
			Main.ShipShopHullsMenu.setVisible(true);
			Main.ShipShopHullsMenu.setEnabled(true);
			Main.ShipShopHullsMenu.setFocusable(true);
			Main.ShipShopHullsMenu.requestFocusInWindow();
		}
		
		else if(eventId == 4)
		{
		System.out.println("Exit Ship Shop Main menu to Thrusters Ship Shop Menu selected");
		Main.ShipShopMenu.setVisible(false);
		Main.ShipShopMenu.setEnabled(false);
		Main.ShipShopMenu.setFocusable(false);
		
		Main.mainFrame.remove(Main.ShipShopMenu);
		
		Main.mainFrame.add(Main.ShipShopThrustersMenu);
	   
		Main.ShipShopThrustersMenu.setVisible(true);
		Main.ShipShopThrustersMenu.setEnabled(true);
		Main.ShipShopThrustersMenu.setFocusable(true);
		Main.ShipShopThrustersMenu.requestFocusInWindow();
			
		}
		else if(eventId == 5)
		{
			System.out.println("Exit Ship Shop Main menu to Weapons Ship Shop Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.ShipShopWeaponsMenu);
		   
			Main.ShipShopWeaponsMenu.setVisible(true);
			Main.ShipShopWeaponsMenu.setEnabled(true);
			Main.ShipShopWeaponsMenu.setFocusable(true);
			Main.ShipShopWeaponsMenu.requestFocusInWindow();
		}
		else if(eventId == 6)
		{
			Save_Confirmation_PopUp_MenuEventHandler.menu_choice = 4;
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.Save_Confirmation_PopUp);
			Main.Save_Confirmation_PopUp.setVisible(true);
			Main.Save_Confirmation_PopUp.setEnabled(true);
			Main.Save_Confirmation_PopUp.setFocusable(true);
			Main.Save_Confirmation_PopUp.requestFocusInWindow();
		}
		else if(eventId == 7)
		{
			System.out.println("Exit Ship Shop Main menu to Next Level selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			Main.mainFrame.add(Main.Game_Screen);
		   
			Main.Game_Screen.setVisible(true);
			Main.Game_Screen.setEnabled(true);
			Main.Game_Screen.setFocusable(true);
			Main.Game_Screen.requestFocusInWindow();
		}
		else if(eventId == 8)
		{
			System.out.println("Exit Ship Shop Main menu to Main Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		
	}
	
	
}
	