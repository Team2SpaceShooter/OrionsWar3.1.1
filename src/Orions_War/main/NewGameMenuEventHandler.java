package Orions_War.main;



public class NewGameMenuEventHandler 
{
	// TODO: update this
	// event 1: play game
	// event 2: view highScores
	// event 3: options
	// event 4: exit application

	public static void handleEvent(int eventId)
	{
		// return to main menu
		if(eventId == 1)
		{
			System.out.println("Exit new game menu selected");
			Main.newGameMenu.setVisible(false);
			Main.newGameMenu.setEnabled(false);
			Main.newGameMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.newGameMenu);
			Main.mainFrame.add(Main.mainMenu);
			
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();

		}
		
		// TODO: this currently returns to main menu as placeholder
		// start a new game
		else if(eventId == 2)
		{
			
			if(Main.newGameMenu.checkDuplicateSave(Main.newGameMenu.getNewName()))
			{
				return;
			}
			else if(!Main.newGameMenu.checkDuplicateSave(Main.newGameMenu.getNewName()))
			{
				System.out.println("going into how to play screen");
				Main.newGameMenu.setVisible(false);
				Main.newGameMenu.setEnabled(false);
				Main.newGameMenu.setFocusable(false);
				
				Main.mainFrame.remove(Main.newGameMenu);
				Main.mainFrame.add(Main.HowToPlayScreen);
				
				Main.Player1.Update_Player_Name(Main.newGameMenu.getNewName());
				Main.Player1.saveGame();
				
				Main.HowToPlayScreen.setVisible(true);
				Main.HowToPlayScreen.setEnabled(true);
				Main.HowToPlayScreen.setFocusable(true);
				Main.HowToPlayScreen.requestFocusInWindow();
			}
			
			
		}
		
		else if(eventId == 3)
		{
		}
		
		else if(eventId == 4)
		{
		}
		else if(eventId == 5)
		{

		}
		
		
		
	}
	
	
}
	
	

	