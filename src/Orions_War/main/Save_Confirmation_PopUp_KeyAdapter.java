package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Save_Confirmation_PopUp_KeyAdapter extends KeyAdapter
{
    private Save_Confirmation_PopUp Save_Confirmation_PopUp;
	
	public Save_Confirmation_PopUp_KeyAdapter(Save_Confirmation_PopUp Save_Confirmation_PopUp)
	{
		this.Save_Confirmation_PopUp = Save_Confirmation_PopUp;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(Save_Confirmation_PopUp.getSelection());
			try {
				Save_Confirmation_PopUp_MenuEventHandler.handleEvent(Save_Confirmation_PopUp.getSelection());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
	}
	
}