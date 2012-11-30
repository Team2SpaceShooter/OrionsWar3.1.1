package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

public class ShipShopMenuKeyAdapter extends KeyAdapter
{
	private ShipShopMenu ShipShopMenu;
	
	public ShipShopMenuKeyAdapter(ShipShopMenu ShipShopMenu)
	{
		this.ShipShopMenu = ShipShopMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			ShipShopMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			ShipShopMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(ShipShopMenu.getSelection());
			try {
				ShipShopMenuEventHandler.handleEvent(ShipShopMenu.getSelection());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
	}
	
	
}