package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LevelSelectorMenu extends JPanel 
{
	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	private static String title = "Level Select";

	//private static String playGame = "Play game";
	//private static String highScores = "View high scores";
	//private static String options = "Options";
	//private static String exit = "Exit";
	
	private String levelOne = "Level 1";
	private String levelTwo = "Level 2";
	private String levelThree = "Level 3";
	private String levelFour = "Level 4";
	private String exit = "Exit";
	
	private static Dimension windowSize = new Dimension(1000,804);
	
	
	//TODO: this needs to come from somewhere else. A text file with meta-data, perhaps? For now, this is only a placeholder
	public int numLevels = 5;
	
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 3;
	private static int selectionOvalHeight = 3;
	private static int selectionOvalX = 40;
	private static int selectionOvalY = 94;
	
	public LevelSelectorMenu()
	{
		System.out.println("level selector menu created");
		
		this.setBackground(backgroundColor);
		this.setSize(windowSize);
		this.setOpaque(true);
		
		//NOTE: for focusing, these must not be set in the constructor. Undesirable focus behavior results from doing so
		//this.setVisible(true); // needed to focus
		//this.setFocusable(true); // needed to focus
		//this.setEnabled(true); // needed to focus
		this.addKeyListener(new LevelSelectorMenuKeyAdapter(this));
		//System.out.println("requesting focus: " + this.requestFocus());
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);


	}
	
	public void paintComponent(Graphics g)
    {

		// the following two lines are needed because calling the paint overrides the background color
		
		g.setColor(backgroundColor);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(textColor);
		
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
		
		g.drawString(title, 50, 50);
		
		//IMPORTANT: PLACEHOLDERS!!
		g.drawString(levelOne, 50, 100);
		g.drawString(levelTwo, 50, 120);
		g.drawString(levelThree, 50,  140);
		g.drawString(levelFour, 50, 160);
		g.drawString(exit, 50, 180);
		
		
		
		// IMPORTANT: keep note of these x and y positions, they correspond to the selection areas for getSelection
		//g.drawString(playGame, 50, 100);
		//g.drawString(highScores, 50, 120);
		//g.drawString(options, 50, 140);
		//g.drawString(exit, 50, 160);
    }
	
	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 94)
		{
			selectionOvalY = 174;
			repaint();
			return;
		}
		else selectionOvalY -= 20;
		repaint();
	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 174)
		{
			selectionOvalY = 94;
			repaint();
			return;
		}
		else selectionOvalY += 20;
		repaint();
	}
	public int getSelection()
	{
		if(selectionOvalY == 94) return 1;
		else if(selectionOvalY == 114) return 2;
		else if(selectionOvalY == 134) return 3;
		else if(selectionOvalY == 154) return 4;
		else if(selectionOvalY == 174) return 5;
		return 0;
	}
}
