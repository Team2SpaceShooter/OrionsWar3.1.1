package Orions_War.main;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game_Screen_KeyAdapter extends KeyAdapter
{
	private Game_Screen Game_Screen;
	
	public Game_Screen_KeyAdapter(Game_Screen Game_Screen)
	{
		this.Game_Screen = Game_Screen;
	}
	
	public void keyTyped(KeyEvent e){
		// This overrides the keyTyped method which enables keyPressed() to handle 
		// all of the movement
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			Game_Screen.upPress = true;
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			Game_Screen.downPress = true;
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			Game_Screen.leftPress = true;
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			Game_Screen.rightPress = true;
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("space");
			Game_Screen.spacePress = true;
			break;

		}// end switch
		
		Game_Screen.keyAction();
		
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key released: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			Game_Screen.upPress = false;
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			Game_Screen.downPress = false;
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			Game_Screen.leftPress = false;
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			Game_Screen.rightPress = false;
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("space");
			Game_Screen.spacePress = false;
			break;
			

		}
	}
	
	
}