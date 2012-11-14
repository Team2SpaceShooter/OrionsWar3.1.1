package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShipShopThrustersKeyAdapter extends KeyAdapter
{
    private ShipShopThrustersMenu ShipShopThrustersMenu;
	
	public ShipShopThrustersKeyAdapter(ShipShopThrustersMenu ShipShopThrustersMenu)
	{
		this.ShipShopThrustersMenu = ShipShopThrustersMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			ShipShopThrustersMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			ShipShopThrustersMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			ShipShopThrustersMenu.moveSelectionOvalLeft();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			ShipShopThrustersMenu.moveSelectionOvalRight();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(ShipShopThrustersMenu.getSelection());
			ShipShopThrustersMenuEventHandler.handleEvent(ShipShopThrustersMenu.getSelection());
			break;
		}
	}
	
}
