
package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LevelSelectorMenuKeyAdapter extends KeyAdapter
{
	private LevelSelectorMenu levelSelectorMenu;
	
	public LevelSelectorMenuKeyAdapter(LevelSelectorMenu levelSelectorMenu)
	{
		this.levelSelectorMenu = levelSelectorMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			levelSelectorMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			levelSelectorMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(levelSelectorMenu.getSelection());
			Sounds.select.play();
			LevelSelectorMenuEventHandler.handleEvent(levelSelectorMenu.getSelection());
			break;
		}
	}
	
	
}