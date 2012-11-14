package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;






@SuppressWarnings("serial")
public class HowToPlayScreen extends JPanel 
{
	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	private static String title = "How to play";
	private static String instructions = "Placeholder";
	private static String proceed = "Continue";

	
	private static Dimension windowSize = new Dimension(1000,804);
	private static Image img1;
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 3;
	private static int selectionOvalHeight = 3;
	private static int selectionOvalX = 40;
	private static int selectionOvalY = 124;
	
	public HowToPlayScreen()
	{
		System.out.println("new game menu created");
        ImageIcon icon = new ImageIcon("images/spacefieldposs.png");
		
		img1 = icon.getImage();
		
		this.setBackground(backgroundColor);
		this.setSize(windowSize);
		this.setOpaque(true);
		
		//NOTE: for focusing, these must not be set in the constructor. Undesirable focus behavior results from doing so
		//this.setVisible(true); // needed to focus
		//this.setFocusable(true); // needed to focus
		//this.setEnabled(true); // needed to focus
		this.addKeyListener(new HowToPlayScreenKeyAdapter(this));
		//this.addMouseListener(new NewGameMenuMouseAdapter(this));
		//System.out.println("requesting focus: " + this.requestFocus());
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);

	}
	
	public void paintComponent(Graphics g)
    {

		// the following two lines are needed because calling the paint overrides the background color
		g.drawImage(img1, 0, 0, 1000,800, this);
		
		g.setColor(textColor);
		
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
		
		g.drawString(title, 50, 50);
		
		g.drawString(proceed, 50, 130);
		g.drawString(instructions, 50, 150);

    }
	
	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 124)
		{
			selectionOvalY = 124;
			repaint();
			return;
		}
		else selectionOvalY -= 20;
		repaint();
	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 124)
		{
			selectionOvalY = 124;
			repaint();
			return;
		}
		else selectionOvalY += 20;
		repaint();
	}
	public int getSelection()
	{
		if(selectionOvalY == 124) return 1;
		//else if(selectionOvalY == 144) return 2;
		//else if(selectionOvalY == 134) return 3;
		//else if(selectionOvalY == 154) return 4;
		//else if(selectionOvalY == 174) return 5;
		return 0;
	}
	
}
