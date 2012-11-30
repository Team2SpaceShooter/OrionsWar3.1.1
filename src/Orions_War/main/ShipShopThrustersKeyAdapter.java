package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

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
			Sounds.move.play();
			ShipShopThrustersMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			Sounds.move.play();
			ShipShopThrustersMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			Sounds.move.play();
			ShipShopThrustersMenu.moveSelectionOvalLeft();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			Sounds.move.play();
			ShipShopThrustersMenu.moveSelectionOvalRight();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(ShipShopThrustersMenu.getSelection());
			Sounds.select.play();
			try {
				ShipShopThrustersMenuEventHandler.handleEvent(ShipShopThrustersMenu.getSelection());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
	}
	
}
