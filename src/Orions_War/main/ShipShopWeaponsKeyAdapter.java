package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

public class ShipShopWeaponsKeyAdapter extends KeyAdapter
{
    private ShipShopWeaponsMenu ShipShopWeaponsMenu;
	
	public ShipShopWeaponsKeyAdapter(ShipShopWeaponsMenu ShipShopWeaponsMenu)
	{
		this.ShipShopWeaponsMenu = ShipShopWeaponsMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			ShipShopWeaponsMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			ShipShopWeaponsMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			ShipShopWeaponsMenu.moveSelectionOvalLeft();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			ShipShopWeaponsMenu.moveSelectionOvalRight();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(ShipShopWeaponsMenu.getSelection());
			try {
				ShipShopWeaponsMenuEventHandler.handleEvent(ShipShopWeaponsMenu.getSelection());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
	}
	
}

