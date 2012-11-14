package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ship_Shop_Thruster_Confirmation_KeyAdapter extends KeyAdapter
{
    private Ship_Shop_Thruster_Confirmation Ship_Shop_Thruster_Confirmation;
	
	public Ship_Shop_Thruster_Confirmation_KeyAdapter(Ship_Shop_Thruster_Confirmation Ship_Shop_Thruster_Confirmation)
	{
		this.Ship_Shop_Thruster_Confirmation = Ship_Shop_Thruster_Confirmation;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			Ship_Shop_Thruster_Confirmation.moveSelectionOvalLeft();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			Ship_Shop_Thruster_Confirmation.moveSelectionOvalRight();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(Ship_Shop_Thruster_Confirmation.getSelection());
			Ship_Shop_Thruster_Confirmation_MenuEventHandler.handleEvent(Ship_Shop_Thruster_Confirmation.getSelection());
			break;
		}
	}
	
}
