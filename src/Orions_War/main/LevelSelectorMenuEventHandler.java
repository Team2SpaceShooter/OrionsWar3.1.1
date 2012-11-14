package Orions_War.main;



public class LevelSelectorMenuEventHandler 
{
	
	// event 1: play game
	// event 2: view highScores
	// event 3: options
	// event 4: exit application

	public static void handleEvent(int eventId)
	{
		
		if(eventId == 1)
		{
			System.out.println("Level one selected");
			
		}
		
		else if(eventId == 2)
		{
			System.out.println("Level two selected");
		}
		
		else if(eventId == 3)
		{
			System.out.println("Level three selected");
		}
		
		else if(eventId == 4)
		{
			System.out.println("Level four selected");
		}
		else if(eventId == 5)
		{
			System.out.println("Exit level selector menu selected");
			Main.levelSelectorMenu.setVisible(false);
			Main.levelSelectorMenu.setEnabled(false);
			Main.levelSelectorMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.levelSelectorMenu);
			Main.mainFrame.add(Main.mainMenu);
			
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
		}
		
		
		
	}
	
	
}
	