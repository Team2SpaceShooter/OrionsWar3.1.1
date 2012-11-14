package Orions_War.main;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class Ship_Shop_Thruster_Confirmation_MenuEventHandler
{
    
	public static void handleEvent(int eventId)
	{
		// Changes focus to Main Ship Shop Menu
		if(eventId == 1)
		{
			Main.Ship_Shop_Thruster_Confirmation.setVisible(false);
			Main.Ship_Shop_Thruster_Confirmation.setEnabled(false);
			Main.Ship_Shop_Thruster_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Thruster_Confirmation);
			if(Main.ShipShopThrustersMenu.selectionOvalX == 340)
			{
				Main.Player1.Ship.Ship_Thrusters.update_purhcased_Thrusters(0);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Thrusters.Thruster_Cost.get(0);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopThrustersMenu.selectionOvalX == 540)
			{
				Main.Player1.Ship.Ship_Thrusters.update_purhcased_Thrusters(1);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Thrusters.Thruster_Cost.get(1);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopThrustersMenu.selectionOvalX == 740)
			{
				Main.Player1.Ship.Ship_Thrusters.update_purhcased_Thrusters(2);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Thrusters.Thruster_Cost.get(2);
				Main.Player1.Ship.update_parts();
			}
			
			
			
			Main.mainFrame.add(Main.ShipShopThrustersMenu);
			Main.ShipShopThrustersMenu.setVisible(true);
			Main.ShipShopThrustersMenu.setEnabled(true);
			Main.ShipShopThrustersMenu.setFocusable(true);
			Main.ShipShopThrustersMenu.requestFocusInWindow();
		}
		else if(eventId == 2)
		{
			Main.Ship_Shop_Thruster_Confirmation.setVisible(false);
			Main.Ship_Shop_Thruster_Confirmation.setEnabled(false);
			Main.Ship_Shop_Thruster_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Thruster_Confirmation);
			
			Main.mainFrame.add(Main.ShipShopThrustersMenu);
			Main.ShipShopThrustersMenu.setVisible(true);
			Main.ShipShopThrustersMenu.setEnabled(true);
			Main.ShipShopThrustersMenu.setFocusable(true);
			Main.ShipShopThrustersMenu.requestFocusInWindow();
		}
		else if(eventId == 3)
		{
			Main.Ship_Shop_Thruster_Confirmation.setVisible(false);
			Main.Ship_Shop_Thruster_Confirmation.setEnabled(false);
			Main.Ship_Shop_Thruster_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Thruster_Confirmation);
			if(Main.ShipShopThrustersMenu.selectionOvalX == 340)
			{
				Main.Player1.Ship.Ship_Thrusters.update_equipped_Thruster(0);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopThrustersMenu.selectionOvalX == 540)
			{
				Main.Player1.Ship.Ship_Thrusters.update_equipped_Thruster(1);
				Main.Player1.Ship.update_parts();
			}
			else if(Main.ShipShopThrustersMenu.selectionOvalX == 740)
			{
				Main.Player1.Ship.Ship_Thrusters.update_equipped_Thruster(2);
				Main.Player1.Ship.update_parts();
			}

			Main.mainFrame.add(Main.ShipShopThrustersMenu);
			Main.ShipShopThrustersMenu.setVisible(true);
			Main.ShipShopThrustersMenu.setEnabled(true);
			Main.ShipShopThrustersMenu.setFocusable(true);
			Main.ShipShopThrustersMenu.requestFocusInWindow();
		}
	}
}