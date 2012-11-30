package Orions_War.main;

import java.io.IOException;

public class Save_Confirmation_PopUp_MenuEventHandler
{
    public static int menu_choice;
	
	
	public static void handleEvent(int eventId) throws IOException
	{
		// Changes focus to Main Ship Shop Menu
		if(eventId == 1)
		{
			Main.Save_Confirmation_PopUp.setVisible(false);
			Main.Save_Confirmation_PopUp.setEnabled(false);
			Main.Save_Confirmation_PopUp.setFocusable(false);
			Main.mainFrame.remove(Main.Save_Confirmation_PopUp);
			Main.Player1.saveGame();
			if(menu_choice == 0)
			{
			Main.mainFrame.add(Main.ShipShopHullsMenu);
			Main.ShipShopHullsMenu.setVisible(true);
			Main.ShipShopHullsMenu.setEnabled(true);
			Main.ShipShopHullsMenu.setFocusable(true);
			Main.ShipShopHullsMenu.requestFocusInWindow();
			}
			else if(menu_choice == 1)
			{
				Main.mainFrame.add(Main.ShipShopEnginesMenu);
				Main.ShipShopEnginesMenu.setVisible(true);
				Main.ShipShopEnginesMenu.setEnabled(true);
				Main.ShipShopEnginesMenu.setFocusable(true);
				Main.ShipShopEnginesMenu.requestFocusInWindow();
			}
			else if(menu_choice == 2)
			{
				Main.mainFrame.add(Main.ShipShopThrustersMenu);
				Main.ShipShopThrustersMenu.setVisible(true);
				Main.ShipShopThrustersMenu.setEnabled(true);
				Main.ShipShopThrustersMenu.setFocusable(true);
				Main.ShipShopThrustersMenu.requestFocusInWindow();
			}
			else if(menu_choice == 3)
			{
				Main.mainFrame.add(Main.ShipShopWeaponsMenu);
				Main.ShipShopWeaponsMenu.setVisible(true);
				Main.ShipShopWeaponsMenu.setEnabled(true);
				Main.ShipShopWeaponsMenu.setFocusable(true);
				Main.ShipShopWeaponsMenu.requestFocusInWindow();
			}
			else if(menu_choice == 4)
			{
				Main.mainFrame.add(Main.ShipShopMenu);
				Main.ShipShopMenu.setVisible(true);
				Main.ShipShopMenu.setEnabled(true);
				Main.ShipShopMenu.setFocusable(true);
				Main.ShipShopMenu.requestFocusInWindow();
			}
	    }
	}
}