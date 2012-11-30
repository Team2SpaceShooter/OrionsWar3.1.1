package Orions_War.main;

import java.io.FileNotFoundException;



public class LoadGameMenuEventHandler 
{


	public static void handleEvent(int eventId) throws FileNotFoundException
	{
		if(eventId == 1)
		{
			System.out.println("Exit load game menu selected");
			Main.loadGameMenu.setVisible(false);
			Main.loadGameMenu.setEnabled(false);
			Main.loadGameMenu.setFocusable(false);
			
			
			Main.mainFrame.remove(Main.loadGameMenu);
			Main.mainFrame.add(Main.mainMenu);
			
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
		}
		

		else if(eventId == 2)
		{
			System.out.println("loading save file");
			if(Main.Player1.progress > 1)
			{
			  Main.loadGameMenu.setVisible(false);
			  Main.loadGameMenu.setEnabled(false);
			  Main.loadGameMenu.setFocusable(false);
			  Main.mainFrame.remove(Main.loadGameMenu);
			  
			  Main.mainFrame.add(Main.ShipShopMenu);
			  Main.ShipShopMenu.setVisible(true);
			  Main.ShipShopMenu.setEnabled(true);
			  Main.ShipShopMenu.setFocusable(true);
			  Main.ShipShopMenu.requestFocusInWindow();
			}
			else
			{
				Main.loadGameMenu.setVisible(false);
				Main.loadGameMenu.setEnabled(false);
				Main.loadGameMenu.setFocusable(false);
				Main.mainFrame.remove(Main.loadGameMenu);
				Main.mainFrame.add(Main.Game_Screen);
			 	Main.Game_Screen.setVisible(true);
				Main.Game_Screen.setEnabled(true);
				Main.Game_Screen.setFocusable(true);
				
			
				Main.Game_Screen.requestFocusInWindow();
				
				Main.Game_Screen.play();
			}
		}
		
		
		
		
		
	}
	
	
}
	