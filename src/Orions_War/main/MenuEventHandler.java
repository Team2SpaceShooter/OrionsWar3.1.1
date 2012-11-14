package Orions_War.main;



public class MenuEventHandler 
{
	
	// event 1: play game
	// event 2: view highScores
	// event 3: options
	// event 4: view ship shop
	// event 5: exit application

	public static void handleEvent(int eventId)
	{
		
		if(eventId == 1)
		{
			//TODO: referring to Main is not ideal
			//System.out.println("mainMenu has focus? " + Main.mainMenu.isFocusOwner());
			//Main.mainMenu.transferFocus();
			//Main.mainMenu.setFocusable(false);
			//Main.levelSelectorMenu.requestFocusInWindow();
			//System.out.println("mainMenu has focus? " + Main.mainMenu.isFocusOwner());
			
			
			Main.mainMenu.setVisible(false);
			Main.mainMenu.setFocusable(false);
			Main.mainMenu.setEnabled(false);
			
			Main.mainFrame.remove(Main.mainMenu);
			Main.mainFrame.add(Main.newGameMenu);
			
			
			Main.newGameMenu.setFocusable(true);
			Main.newGameMenu.setVisible(true);
			Main.newGameMenu.setEnabled(true);
			Main.newGameMenu.requestFocusInWindow();
			
			/*
			//NOTE: these must be called here. Calling them in the constructor causes undesirable behavior relating to the focus system
			Main.levelSelectorMenu.setFocusable(true);
			Main.levelSelectorMenu.setVisible(true);
			Main.levelSelectorMenu.setEnabled(true);
			Main.levelSelectorMenu.requestFocusInWindow();
			*/

			
		}
		
		else if(eventId == 2)
		{
           
			Main.mainMenu.setVisible(false);
			Main.mainMenu.setFocusable(false);
			Main.mainMenu.setEnabled(false);

			Main.mainFrame.remove(Main.mainMenu);
			Main.mainFrame.add(Main.loadGameMenu);
			
			Main.loadGameMenu.setFocusable(true);
			Main.loadGameMenu.setVisible(true);
			Main.loadGameMenu.setEnabled(true);
			Main.loadGameMenu.requestFocusInWindow();
		
		}
		
		else if(eventId == 3)
		{
			
			//TODO: implement reading of text file highscore database
			Main.mainMenu.setVisible(false);
			Main.mainMenu.setFocusable(false);
			Main.mainMenu.setEnabled(false);
			
			Main.mainFrame.remove(Main.mainMenu);
			Main.mainFrame.add(Main.highScoreMenu);
			
			Main.highScoreMenu.setFocusable(true);
			Main.highScoreMenu.setVisible(true);
			Main.highScoreMenu.setEnabled(true);
			Main.highScoreMenu.requestFocusInWindow();
			
			Main.highScoreMenu.loadScores();
			
		}
		else if(eventId == 4)
		{
			Main.mainMenu.setVisible(false);
			Main.mainMenu.setFocusable(false);
			Main.mainMenu.setEnabled(false);
			
			Main.mainFrame.remove(Main.mainMenu);
			Main.mainFrame.add(Main.ShipShopMenu);
			
			Main.ShipShopMenu.setFocusable(true);
			Main.ShipShopMenu.setVisible(true);
			Main.ShipShopMenu.setEnabled(true);
			Main.ShipShopMenu.requestFocusInWindow();
		
		}
		else if(eventId == 5)
		{
			Main.mainFrame.dispose();
		}
		
		
		
	}
	
	
}
	