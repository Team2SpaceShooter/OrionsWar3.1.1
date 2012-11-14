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
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			Game_Screen.moveShipUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			Game_Screen.moveShipDown();
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("left");
			Game_Screen.moveShipLeft();
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("right");
			Game_Screen.moveShipRight();
			break;

		}
	}
	
	
}