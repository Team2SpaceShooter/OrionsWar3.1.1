package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.io.IOException;



@SuppressWarnings("serial")
public class ShipShopMenu extends JPanel 
{
	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	
	
	private static Dimension windowSize = new Dimension(1000,804);
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 12;
	private static int selectionOvalHeight = 12;
	private static int selectionOvalX = 210;
	private static int selectionOvalY = 3;
	private Image img;

	
	public ShipShopMenu()
	{
		System.out.println("Ship Shop menu created");
		
		this.setBackground(backgroundColor);
        ImageIcon icon = new ImageIcon("images/Ship_Shop/Ship_ShopMenu_Main.png");
		
		img = icon.getImage();
		this.setSize(windowSize);
		this.setOpaque(true);
		this.setVisible(true);
		this.setFocusable(true);
		this.addKeyListener(new ShipShopMenuKeyAdapter(this));
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);

	}
	
	public void paintComponent(Graphics g)
    {
		
		//the following two lines are needed because calling the paint overrides the background color
		g.setColor(backgroundColor);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(img, 0, 0, 1000,800, this);
		g.setColor(textColor);
		g.setFont(new Font("Serif",Font.PLAIN,36));
		g.drawString("$"+ Main.Player1.credits,250, 575);
		g.drawString(""+ Main.Player1.score, 10, 300);
		g.setFont(new Font("Serif",Font.PLAIN,60));
		g.drawString(""+ Main.Player1.progress, 100, 415);
		g.setFont(new Font("Serif",Font.PLAIN,20));
		g.drawString(""+ Main.Player1.Ship.current_max_speed,900,425);
		g.drawString(""+ Main.Player1.Ship.current_health,900,447);
		g.drawString(""+ Main.Player1.Ship.current_acceleration,900,470);
		g.drawString(""+ Main.Player1.Ship.current_damage,900,494);
		
		drawcurrentship(g);
		
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
	
	
    }
    public void drawcurrentship(Graphics g)
    {   BufferedImage spriteSheet = null,hull,weapon,thruster1,thruster2,engine;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	ImageIcon icon = new ImageIcon("images/Ship_Shop/basic_ship.png");
    	Image cur_Ship = icon.getImage();
    	g.drawImage(cur_Ship, 813, 565, 55,55,this);
    	try {
			spriteSheet = loader.loadImage("images/Ship_Shop/shipshopparts.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	  if(Main.Player1.Ship.Ship_Hull.getCurrentHull() == 0)	
    	  {
    	   hull = spriteSheet.getSubimage(121, 0, 15, 35);
           g.drawImage(hull, 825, 550, 30, 70,this);
    	  }
    	  else if(Main.Player1.Ship.Ship_Hull.getCurrentHull() == 1)
    	  {
    		  hull = spriteSheet.getSubimage(142, 0, 15, 35);
              g.drawImage(hull, 825, 550, 30, 70,this);
    	  }
    	  else if(Main.Player1.Ship.Ship_Hull.getCurrentHull() == 2)
    	  {
    		  hull = spriteSheet.getSubimage(158, 0, 15, 35);
              g.drawImage(hull, 825, 550, 30, 70,this);
    	  }
    	 
  
    	  if(Main.Player1.Ship.Ship_Thrusters.getCurrentThruster() == 0)	
    	  {
    	     thruster1 = spriteSheet.getSubimage(0, 39, 39, 29);
           g.drawImage(thruster1, 802, 560, 78, 58,this);
    	  }
    	  else if(Main.Player1.Ship.Ship_Thrusters.getCurrentThruster() == 1)
    	  {
    		  thruster1 = spriteSheet.getSubimage(41, 38, 35, 31);
              g.drawImage(thruster1, 802, 560, 70, 62,this);
    	  }
    	  else if(Main.Player1.Ship.Ship_Thrusters.getCurrentThruster() == 2)
    	  { 
    		  thruster1 = spriteSheet.getSubimage(76, 39, 14, 29);
              g.drawImage(thruster1, 809, 569, 28, 58,this);
    		  thruster2 = spriteSheet.getSubimage(94, 40, 14, 29);
              g.drawImage(thruster2, 845, 570, 28, 58,this);
    	  }
    	  
  
    	  if(Main.Player1.Ship.Ship_Engine.getCurrentEngine() == 0)	
    	  {
    	     engine = spriteSheet.getSubimage(80, 4, 19, 30);
             g.drawImage(engine, 829, 580, 19, 30,this);
    	  }
    	  else if(Main.Player1.Ship.Ship_Engine.getCurrentEngine() == 1)
    	  {
    		  engine = spriteSheet.getSubimage(46, 5, 25, 29);
              g.drawImage(engine, 826, 584, 25, 29,this);
    	  }
    	  else if(Main.Player1.Ship.Ship_Engine.getCurrentEngine() == 2)
    	  { 
    		  engine = spriteSheet.getSubimage(2, 5, 26, 30);
              g.drawImage(engine, 827, 585, 26, 30,this);
    	  }
    }
   

	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 3)
		{
			selectionOvalY = 171;
			repaint();
			return;
		}
		else 
     	selectionOvalY -= 24;
	    repaint();
     		
     	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 171)
		{
			selectionOvalY = 3;
			repaint();
			return;
		}
		else
			selectionOvalY +=24;
		repaint();
			
	}
	public int getSelection()
	{
		if(selectionOvalY == 3) 
			return 1;
		else if(selectionOvalY == 27)
            return 2;
		else if(selectionOvalY == 51) 
			return 3;
		else if(selectionOvalY == 75) 
			return 4;
		else if(selectionOvalY == 99) 
			return 5;
		else if(selectionOvalY == 123) 
			return 6;
		else if(selectionOvalY == 147) 
			return 7;
		else if(selectionOvalY == 171) 
			return 8;
		else
		return 0;
	}
}
