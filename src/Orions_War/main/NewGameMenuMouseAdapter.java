package Orions_War.main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewGameMenuMouseAdapter extends MouseAdapter
{
	private NewGameMenu newGameMenu;
	
	public NewGameMenuMouseAdapter(NewGameMenu newGameMenu)
	{
		this.newGameMenu = newGameMenu;
	}
	
	public void mousePressed(MouseEvent e)
	{
		System.out.println("mouse pressed");
		newGameMenu.requestFocusInWindow();
	}
}
