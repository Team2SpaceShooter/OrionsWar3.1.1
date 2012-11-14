package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;
import java.awt.Font;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.io.IOException;


@SuppressWarnings("serial")
public class Game_Screen extends JPanel 
{
	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	

	
	private static Dimension windowSize = new Dimension(1000,804);
	private static Image img1;
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 3;
	private static int selectionOvalHeight = 3;
	public static int Ship_Pos_X = 400,Ship_Pos_Y = 700;
	
	// These are the bool fields that correspond to in game key presses
	public boolean upPress, downPress, leftPress, rightPress, spacePress;
	
	public Game_Screen()
	{
		System.out.println("Game Screen created");
        ImageIcon icon = new ImageIcon("images/spacefield.png");
		
		img1 = icon.getImage();
		
		this.setBackground(backgroundColor);
		this.setSize(windowSize);
		this.setOpaque(true);
		
		//NOTE: for focusing, these must not be set in the constructor. Undesirable focus behavior results from doing so
		//this.setVisible(true); // needed to focus
		//this.setFocusable(true); // needed to focus
		//this.setEnabled(true); // needed to focus
		this.addKeyListener(new Game_Screen_KeyAdapter(this));
		//this.addMouseListener(new NewGameMenuMouseAdapter(this));
		//System.out.println("requesting focus: " + this.requestFocus());
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);

	}
	
	public void paintComponent(Graphics g)
    {

		// the following two lines are needed because calling the paint overrides the background color

		g.drawImage(img1, 0, 0, 1000,800, this);
		drawcurrentship(g);



    }
	 public void drawcurrentship(Graphics g)
	    {   BufferedImage spriteSheet = null,hull,weapon,thruster1,thruster2,engine;
	    	BufferedImageLoader loader = new BufferedImageLoader();
	    	ImageIcon icon = new ImageIcon("images/Ship_Shop/basic_ship.png");
	    	Image cur_Ship = icon.getImage();
	    	g.drawImage(cur_Ship,  Ship_Pos_X,Ship_Pos_Y, 55,55,this);
	    	try {
				spriteSheet = loader.loadImage("images/Ship_Shop/shipshopparts.png");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	    	  if(Main.Player1.Ship.Ship_Hull.getCurrentHull() == 0)	
	    	  {
	    	   hull = spriteSheet.getSubimage(121, 0, 15, 35);
	           g.drawImage(hull,Ship_Pos_X+12,Ship_Pos_Y-15, 30, 70,this);
	    	  }
	    	  else if(Main.Player1.Ship.Ship_Hull.getCurrentHull() == 1)
	    	  {
	    		  hull = spriteSheet.getSubimage(142, 0, 15, 35);
	              g.drawImage(hull,Ship_Pos_X + 12,Ship_Pos_Y - 15, 30, 70,this);
	    	  }
	    	  else if(Main.Player1.Ship.Ship_Hull.getCurrentHull() == 2)
	    	  {
	    		  hull = spriteSheet.getSubimage(158, 0, 15, 35);
	              g.drawImage(hull,Ship_Pos_X + 12,Ship_Pos_Y - 15, 30, 70,this);
	    	  }
	    	 
	  
	    	  if(Main.Player1.Ship.Ship_Thrusters.getCurrentThruster() == 0)	
	    	  {
	    	     thruster1 = spriteSheet.getSubimage(0, 39, 39, 29);
	           g.drawImage(thruster1,Ship_Pos_X - 12,Ship_Pos_Y - 5, 78, 58,this);
	    	  }
	    	  else if(Main.Player1.Ship.Ship_Thrusters.getCurrentThruster() == 1)
	    	  {
	    		  thruster1 = spriteSheet.getSubimage(41, 38, 35, 31);
	              g.drawImage(thruster1,Ship_Pos_X - 11,Ship_Pos_Y - 5, 70, 62,this);
	    	  }
	    	  else if(Main.Player1.Ship.Ship_Thrusters.getCurrentThruster() == 2)
	    	  { 
	    		  thruster1 = spriteSheet.getSubimage(76, 39, 14, 29);
	              g.drawImage(thruster1,Ship_Pos_X - 2,Ship_Pos_Y + 3, 28, 58,this);
	    		  thruster2 = spriteSheet.getSubimage(94, 40, 14, 29);
	              g.drawImage(thruster2,Ship_Pos_X + 31,Ship_Pos_Y + 4, 28, 58,this);
	    	  }
	    	  
	  
	    	  if(Main.Player1.Ship.Ship_Engine.getCurrentEngine() == 0)	
	    	  {
	    	     engine = spriteSheet.getSubimage(80, 4, 19, 30);
	             g.drawImage(engine,  Ship_Pos_X + 16,Ship_Pos_Y + 15, 19, 30,this);
	    	  }
	    	  else if(Main.Player1.Ship.Ship_Engine.getCurrentEngine() == 1)
	    	  {
	    		  engine = spriteSheet.getSubimage(46, 5, 25, 29);
	              g.drawImage(engine,Ship_Pos_X + 13,Ship_Pos_Y + 19, 25, 29,this);
	    	  }
	    	  else if(Main.Player1.Ship.Ship_Engine.getCurrentEngine() == 2)
	    	  { 
	    		  engine = spriteSheet.getSubimage(2, 5, 26, 30);
	              g.drawImage(engine,Ship_Pos_X + 14,Ship_Pos_Y + 20, 26, 30,this);
	    	  }
	    }
	
	public void keyAction(){
		// This method is called from Game_Screen_KeyAdapter.java every time keyEvent() is called
		if (upPress) moveShipUp();
		if (downPress) moveShipDown();
		if (leftPress) moveShipLeft();
		if (rightPress) moveShipRight();
	}
	
	public void moveShipUp()
	{
		if(Ship_Pos_Y == 0)
		{
			Ship_Pos_Y = 0;
			repaint();
			return;
		}
		else Ship_Pos_Y -= 10;
		repaint();
	}
	public void moveShipDown()
	{
		if(Ship_Pos_Y == 730)
		{
			Ship_Pos_Y = 730;
			repaint();
			return;
		}
		else Ship_Pos_Y += 10;
		repaint();
	}
	public void moveShipLeft()
	{
		if(Ship_Pos_X == 0)
		{
			Ship_Pos_X = 0;
			repaint();
			return;
		}
		else Ship_Pos_X -= 10;
		repaint();
	}
	public void moveShipRight()
	{
		if(Ship_Pos_X == 940)
		{
			Ship_Pos_X = 940;
			repaint();
			return;
		}
		else Ship_Pos_X += 10;
		repaint();
	}
}
