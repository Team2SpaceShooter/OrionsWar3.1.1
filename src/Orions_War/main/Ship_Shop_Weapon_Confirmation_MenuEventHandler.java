package Orions_War.main;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class Ship_Shop_Weapon_Confirmation_MenuEventHandler
{
    
	public static void handleEvent(int eventId)
	{
		// Changes focus to Main Ship Shop Menu
		if(eventId == 1)
		{
			Main.Ship_Shop_Weapon_Confirmation.setVisible(false);
			Main.Ship_Shop_Weapon_Confirmation.setEnabled(false);
			Main.Ship_Shop_Weapon_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Weapon_Confirmation);
			if(Main.ShipShopWeaponsMenu.selectionOvalX == 340)
			{
				Main.Player1.Ship.Ship_Weapon.update_purhcased_Weapons(0);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0);
				Main.Player1.Ship.update_parts();
				Main.Player1.set_current_ship_image();
			}
			else if(Main.ShipShopWeaponsMenu.selectionOvalX == 540)
			{
				Main.Player1.Ship.Ship_Weapon.update_purhcased_Weapons(1);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1);
				Main.Player1.Ship.update_parts();
				Main.Player1.set_current_ship_image();
			}
			else if(Main.ShipShopWeaponsMenu.selectionOvalX == 740)
			{
				Main.Player1.Ship.Ship_Weapon.update_purhcased_Weapons(2);
				Main.Player1.credits -= Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2);
				Main.Player1.Ship.update_parts();
				Main.Player1.set_current_ship_image();
			}
			
			
			
			Main.mainFrame.add(Main.ShipShopWeaponsMenu);
			Main.ShipShopWeaponsMenu.setVisible(true);
			Main.ShipShopWeaponsMenu.setEnabled(true);
			Main.ShipShopWeaponsMenu.setFocusable(true);
			Main.ShipShopWeaponsMenu.requestFocusInWindow();
		}
		else if(eventId == 2)
		{
			Main.Ship_Shop_Weapon_Confirmation.setVisible(false);
			Main.Ship_Shop_Weapon_Confirmation.setEnabled(false);
			Main.Ship_Shop_Weapon_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Weapon_Confirmation);
			
			Main.mainFrame.add(Main.ShipShopWeaponsMenu);
			Main.ShipShopWeaponsMenu.setVisible(true);
			Main.ShipShopWeaponsMenu.setEnabled(true);
			Main.ShipShopWeaponsMenu.setFocusable(true);
			Main.ShipShopWeaponsMenu.requestFocusInWindow();
		}
		else if(eventId == 3)
		{
			Main.Ship_Shop_Weapon_Confirmation.setVisible(false);
			Main.Ship_Shop_Weapon_Confirmation.setEnabled(false);
			Main.Ship_Shop_Weapon_Confirmation.setFocusable(false);
			Main.mainFrame.remove(Main.Ship_Shop_Weapon_Confirmation);
			if(Main.ShipShopWeaponsMenu.selectionOvalX == 340)
			{
				Main.Player1.Ship.Ship_Weapon.update_equipped_Weapon(0);
				Main.Player1.Ship.update_parts();
				Main.Player1.set_current_ship_image();
			}
			else if(Main.ShipShopWeaponsMenu.selectionOvalX == 540)
			{
				Main.Player1.Ship.Ship_Weapon.update_equipped_Weapon(1);
				Main.Player1.Ship.update_parts();
				Main.Player1.set_current_ship_image();
			}
			else if(Main.ShipShopWeaponsMenu.selectionOvalX == 740)
			{
				Main.Player1.Ship.Ship_Weapon.update_equipped_Weapon(2);
				Main.Player1.Ship.update_parts();
				Main.Player1.set_current_ship_image();
			}

			Main.mainFrame.add(Main.ShipShopWeaponsMenu);
			Main.ShipShopWeaponsMenu.setVisible(true);
			Main.ShipShopWeaponsMenu.setEnabled(true);
			Main.ShipShopWeaponsMenu.setFocusable(true);
			Main.ShipShopWeaponsMenu.requestFocusInWindow();
		}
	}
}