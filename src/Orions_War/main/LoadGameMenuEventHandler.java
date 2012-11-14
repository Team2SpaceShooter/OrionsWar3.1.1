package Orions_War.main;



public class LoadGameMenuEventHandler 
{


	public static void handleEvent(int eventId)
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
	