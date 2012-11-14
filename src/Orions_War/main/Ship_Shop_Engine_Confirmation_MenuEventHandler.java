package Orions_War.main;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class Ship_Shop_Engine_Confirmation_MenuEventHandler
{
    
	public static void handleEvent(int eventId)
	{
		// Changes focus to Main Ship Shop Menu
		if(eventId == 1)
		{
			Main.Ship_Shop_Engine_Confirmation.setVisible(false);
			Main.Ship_Shop_Engine_Confirmation.setEnabled(false);
			Main.Ship_Shop_Engine_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Engine_Confirmation);
			if(Main.ShipShopEnginesMenu.selectionOvalX == 340)
			{
				Main.Player1.Ship.Ship_Engine.update_purhcased_Engines(0);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Engine.Engine_Cost.get(0);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopEnginesMenu.selectionOvalX == 540)
			{
				Main.Player1.Ship.Ship_Engine.update_purhcased_Engines(1);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Engine.Engine_Cost.get(1);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopEnginesMenu.selectionOvalX == 740)
			{
				Main.Player1.Ship.Ship_Engine.update_purhcased_Engines(2);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Engine.Engine_Cost.get(2);
				Main.Player1.Ship.update_parts();
			}
			
			
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		else if(eventId == 2)
		{
			Main.Ship_Shop_Engine_Confirmation.setVisible(false);
			Main.Ship_Shop_Engine_Confirmation.setEnabled(false);
			Main.Ship_Shop_Engine_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Engine_Confirmation);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		else if(eventId == 3)
		{
			Main.Ship_Shop_Engine_Confirmation.setVisible(false);
			Main.Ship_Shop_Engine_Confirmation.setEnabled(false);
			Main.Ship_Shop_Engine_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Engine_Confirmation);
			if(Main.ShipShopEnginesMenu.selectionOvalX == 340)
			{
				Main.Player1.Ship.Ship_Engine.update_equipped_engine(0);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopEnginesMenu.selectionOvalX == 540)
			{
				Main.Player1.Ship.Ship_Engine.update_equipped_engine(1);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopEnginesMenu.selectionOvalX == 740)
			{
				Main.Player1.Ship.Ship_Engine.update_equipped_engine(2);
				Main.Player1.Ship.update_parts();
			}

			Main.mainFrame.add(Main.ShipShopEnginesMenu);
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
	}
}