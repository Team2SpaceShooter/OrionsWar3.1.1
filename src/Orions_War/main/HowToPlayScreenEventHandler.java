package Orions_War.main;



public class HowToPlayScreenEventHandler 
{


	public static void handleEvent(int eventId)
	{
		
		if(eventId == 1)
		{
			Main.HowToPlayScreen.setVisible(false);
			Main.HowToPlayScreen.setEnabled(false);
			Main.HowToPlayScreen.setFocusable(false);
			
			
			Main.mainFrame.remove(Main.HowToPlayScreen);
			Main.mainFrame.add(Main.mainMenu);
			
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		
		else if(eventId == 2)
		{
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
	