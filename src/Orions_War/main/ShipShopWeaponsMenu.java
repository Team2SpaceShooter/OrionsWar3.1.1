package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.JPanel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;


@SuppressWarnings("serial")
public class ShipShopWeaponsMenu extends JPanel
{


	private static Dimension windowSize = new Dimension(1000,804);
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 12;
	private static int selectionOvalHeight = 12;
	public static int selectionOvalX = 210;
	public static int selectionOvalY = 3;
	private Image img;
	
	
	
	public ShipShopWeaponsMenu()
	{
		System.out.println("Ship Shop Engines menu created");
		
		
        ImageIcon icon = new ImageIcon("images/Ship_Shop/Ship_ShopMenu_Weapons.png");
		
		img = icon.getImage();
		/*this.setSize(windowSize);
		this.setOpaque(true);
		this.setVisible(true);
		this.setFocusable(true);
		*/
		this.addKeyListener(new ShipShopWeaponsKeyAdapter(this));
		
		//added so that manual position of JComponents would be feasible
		//this.setLayout(null);

	}
	public void paintComponent(Graphics g)
    {
		BufferedImage spriteSheet = null,Weapon1,Weapon2,Weapon3;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	try {
			spriteSheet = loader.loadImage("images/Ship_Shop/Weapon_Sprite_Sheet.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// the following two lines are needed because calling the paint overrides the background color
		g.drawRect(0, 0, 1000, 800);
		
		g.drawImage(img, 0, 0,1000,800, this);
		g.setColor(Color.white);
		g.setFont(new Font("Serif",Font.PLAIN,36));
		g.drawString("$"+ Main.Player1.credits,250, 575);
		g.drawString(""+ Main.Player1.score, 10, 275);
		g.setFont(new Font("Serif",Font.PLAIN,60));
		g.drawString(""+ Main.Player1.progress, 100, 385);
		g.setFont(new Font("Serif",Font.PLAIN,20));
		g.drawString(""+ Main.Player1.Ship.current_damage,865,640);
		g.setFont(new Font("Courier",Font.PLAIN,20));
		g.drawString("Level 1 Upgrade",275,300);
		g.drawString("Level 2 Upgrade",475,300);
		g.drawString("Level 3 Upgrade",675,300);
		g.setFont(new Font("Courier",Font.PLAIN,35));
		g.drawString("Select your Weapon Upgrade", 300, 250);
		Weapon1 = spriteSheet.getSubimage(2, 0, 7, 21);
        g.drawImage(Weapon1,343, 310, 21, 63,this);
        Weapon2 = spriteSheet.getSubimage(30, 1, 7, 21);
        g.drawImage(Weapon2, 545, 310, 21, 63,this);
        Weapon3 = spriteSheet.getSubimage(16, 1, 7, 21);       
        g.drawImage(Weapon3, 742, 310, 21, 63,this);
        g.setColor(Color.white);
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
	
        if(selectionOvalX == 340)
        {
        	g.setColor(Color.white);
    		g.setFont(new Font("Serif",Font.PLAIN,36));
        	g.drawString("$"+Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0),250,650);
        	g.setFont(new Font("Serif",Font.PLAIN,20));
        	g.drawString(""+(Main.Player1.Ship.Ship_Weapon.Power.get(0)), 865, 685);
        	
        	if(Main.Player1.Ship.Ship_Weapon.check_purchased_Weapons(0) == 1)
        	{
        		g.setFont(new Font("Serif",Font.PLAIN,24));	
    		    g.drawString("Upgrade Purchased",200,710);
    		    if(Main.Player1.Ship.Ship_Weapon.getCurrentWeapon() == 0)
    		    {
    		    	g.drawString("Upgrade Equipped",200,750);
    		    }
    		    else 
    		    	g.drawString("Upgrade Unequipped",200, 750);
        	}
    		else
    		{

        	if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0) < Main.Player1.credits)
        	{
        		g.setColor(Color.green);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$" + (Main.Player1.credits - Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0)),250,725);
        	}
        	else if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0) > Main.Player1.credits)
        	{
        		g.setColor(Color.red);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$" + (Main.Player1.credits - Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0)),250,725);
        	}
        	else if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0) == Main.Player1.credits)
        	{
        		g.setColor(Color.white);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$0",250,725);
        	}
    		}
        	
        	if((Main.Player1.Ship.Ship_Weapon.Power.get(0)) > Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.green);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("+ " +((Main.Player1.Ship.Ship_Weapon.Power.get(0)) - Main.Player1.Ship.current_damage), 850, 730);
        	}
        	else if((Main.Player1.Ship.Ship_Weapon.Power.get(0))  < Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.red);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("- " + -1 *((Main.Player1.Ship.Ship_Weapon.Power.get(0)) - Main.Player1.Ship.current_damage), 850, 730);
        	}
        	else if((Main.Player1.Ship.Ship_Weapon.Power.get(0)) == Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.white);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("0", 865, 730);
        	}
        }
        else if(selectionOvalX == 540)
        {
        	g.setColor(Color.white);
    		g.setFont(new Font("Serif",Font.PLAIN,36));
        	g.drawString("$"+Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1),250,650);
        	g.setFont(new Font("Serif",Font.PLAIN,20));
        	g.drawString(""+(Main.Player1.Ship.Ship_Weapon.Power.get(1)), 865, 685);
        	
        	if(Main.Player1.Ship.Ship_Weapon.check_purchased_Weapons(1) == 1)
        	{
        		g.setFont(new Font("Serif",Font.PLAIN,24));	
    		    g.drawString("Upgrade Purchased",200,710);
    		    if(Main.Player1.Ship.Ship_Weapon.getCurrentWeapon() == 1)
    		    {
    		    	g.drawString("Upgrade Equipped",200,750);
    		    }
    		    else 
    		    	g.drawString("Upgrade Unequipped",200, 750);
        	}
    		else
    		{
        	
        	if((Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1)) < Main.Player1.credits)
        	{
        		g.setColor(Color.green);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$" + (Main.Player1.credits - Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1)),250,725);
        	}
        	else if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1) > Main.Player1.credits)
        	{
        		g.setColor(Color.red);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$" + (Main.Player1.credits - Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1)),250,725);
        	}
        	else if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1) == Main.Player1.credits)
        	{
        		g.setColor(Color.white);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$0",250,725);
        	}
    		
    		}
        	if((Main.Player1.Ship.Ship_Weapon.Power.get(1)) > Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.green);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("+ " +((Main.Player1.Ship.Ship_Weapon.Power.get(1)) - Main.Player1.Ship.current_damage), 850, 730);
        	}
        	else if((Main.Player1.Ship.Ship_Weapon.Power.get(1)) < Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.red);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("- " + -1 *((Main.Player1.Ship.Ship_Weapon.Power.get(1)) - Main.Player1.Ship.current_damage), 850, 730);
        	}
        	else if((Main.Player1.Ship.Ship_Weapon.Power.get(1)) == Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.white);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("0", 865, 730);
        	}
        }
        else if(selectionOvalX == 740)
        {
        	g.setColor(Color.white);
    		g.setFont(new Font("Serif",Font.PLAIN,36));
        	g.drawString("$"+Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2),250,650);
        	g.setFont(new Font("Serif",Font.PLAIN,20));
        	g.drawString(""+(Main.Player1.Ship.Ship_Weapon.Power.get(2)), 865, 685);
        	
        	if(Main.Player1.Ship.Ship_Weapon.check_purchased_Weapons(2) == 1)
        	{
        		g.setFont(new Font("Serif",Font.PLAIN,24));	
    		    g.drawString("Upgrade Purchased",200,710);
    		    if(Main.Player1.Ship.Ship_Weapon.getCurrentWeapon() == 2)
    		    {
    		    	g.drawString("Upgrade Equipped",200,750);
    		    }
    		    else 
    		    	g.drawString("Upgrade Unequipped",200, 750);
        	}
    		else
    		{
    		 if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2) < Main.Player1.credits)
        	{
        		g.setColor(Color.green);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$" + (Main.Player1.credits - Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2)),250,725);
        	}
        	else if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2) > Main.Player1.credits)
        	{
        		g.setColor(Color.red);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$" + (Main.Player1.credits - Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2)),250,725);
        	}
        	else if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2) == Main.Player1.credits)
        	{
        		g.setColor(Color.white);
        		g.setFont(new Font("Serif",Font.PLAIN,36));
        		g.drawString("$0",250,725);
        	}
    	
    		}
    		
        	if((Main.Player1.Ship.Ship_Weapon.Power.get(2)) > Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.green);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("+ " + ((Main.Player1.Ship.Ship_Weapon.Power.get(2)) - Main.Player1.Ship.current_damage), 850, 730);
        	}
        	else if((Main.Player1.Ship.Ship_Weapon.Power.get(2)) < Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.red);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("- " + -1 *((Main.Player1.Ship.Ship_Weapon.Power.get(2)) - Main.Player1.Ship.current_damage), 850, 730);
        	}
        	else if((Main.Player1.Ship.Ship_Weapon.Power.get(2)) == Main.Player1.Ship.current_damage)
        	{
        		g.setColor(Color.white);
        		g.setFont(new Font("Serif",Font.PLAIN,20));
        		g.drawString("0", 865, 730);
        	}
        }
    }
	

	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 3 || selectionOvalY > 147 )
		{
			selectionOvalY = 147;
			selectionOvalX = 210;
			selectionOvalWidth = 12;
			selectionOvalHeight = 12;
			repaint();
			return;
		}
		else 
     	selectionOvalY -= 24;
	    repaint();
     		
     	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY >= 147 && selectionOvalX > 210)
		{
			selectionOvalY = 3;
			selectionOvalX = 210;
			selectionOvalWidth = 12;
			selectionOvalHeight = 12;
			repaint();
			return;
		}
		else if(selectionOvalY >= 147)
		{
			selectionOvalY = 3;
			repaint();
			return;
		}
		
		else
			selectionOvalY +=24;
		repaint();
			
	}
	public void moveSelectionOvalRight()
	{
		if(selectionOvalX == 210 && selectionOvalY <= 141)
		{
			selectionOvalX = 340;
			selectionOvalY = 400;
			selectionOvalWidth = 20;
			selectionOvalHeight = 20;
			repaint();
			return;
		}
		else if(selectionOvalX == 740)
		{
			selectionOvalX = 210;
			selectionOvalY = 3;
			selectionOvalWidth = 12;
			selectionOvalHeight = 12;
			repaint();
			return;
		}
		else
			selectionOvalX +=200;
		repaint();
			
	}
	public void moveSelectionOvalLeft()
	{
		if(selectionOvalX == 210 && selectionOvalY <= 141)
		{
			selectionOvalX = 740;
			selectionOvalY = 400;
			selectionOvalWidth = 20;
			selectionOvalHeight = 20;
			repaint();
			return;
		}
		else if(selectionOvalX == 340)
		{
			selectionOvalX = 210;
			selectionOvalY = 3;
			selectionOvalWidth = 12;
			selectionOvalHeight = 12;
			repaint();
			return;
		}
		else
	    {
		  selectionOvalX -=200;
	    }
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
		else if(selectionOvalX == 340)
		{
			if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(0) <= Main.Player1.credits || Main.Player1.Ship.Ship_Weapon.check_purchased_Weapons(0) == 1)
			return 9;
			}
		else if(selectionOvalX == 540)
			{
			if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(1) <= Main.Player1.credits || Main.Player1.Ship.Ship_Weapon.check_purchased_Weapons(1) == 1)
			return 10;
			}
		else if(selectionOvalX == 740)
			{
			if(Main.Player1.Ship.Ship_Weapon.Weapon_Cost.get(2) <= Main.Player1.credits || Main.Player1.Ship.Ship_Weapon.check_purchased_Weapons(2) == 1)
			return 11;
			}
		return 0;
	}
}