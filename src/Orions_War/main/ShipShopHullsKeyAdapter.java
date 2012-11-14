package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShipShopHullsKeyAdapter extends KeyAdapter
{
    private ShipShopHullsMenu ShipShopHullsMenu;
	
	public ShipShopHullsKeyAdapter(ShipShopHullsMenu ShipShopHullsMenu)
	{
		this.ShipShopHullsMenu = ShipShopHullsMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			ShipShopHullsMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			ShipShopHullsMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			ShipShopHullsMenu.moveSelectionOvalLeft();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			ShipShopHullsMenu.moveSelectionOvalRight();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(ShipShopHullsMenu.getSelection());
			ShipShopHullsMenuEventHandler.handleEvent(ShipShopHullsMenu.getSelection());
			break;
		}
	}
	
}
