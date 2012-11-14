package Orions_War.main;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HowToPlayScreenKeyAdapter extends KeyAdapter
{
	private HowToPlayScreen howToPlayScreen;
	
	public HowToPlayScreenKeyAdapter(HowToPlayScreen howToPlayScreen)
	{
		this.howToPlayScreen = howToPlayScreen;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			howToPlayScreen.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			howToPlayScreen.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(howToPlayScreen.getSelection());
			HowToPlayScreenEventHandler.handleEvent(howToPlayScreen.getSelection());
			break;
		}
	}
	
	
}