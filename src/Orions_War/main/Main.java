package Orions_War.main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color; 
import java.awt.Graphics;
import javax.imageio.ImageIO;
import java.awt.Image;
import javax.swing.ImageIcon;


import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                createAndShowGUI(); 
            }
        });
    }
    
    public static JFrame mainFrame;
    public static MainMenu mainMenu;
    public static LevelSelectorMenu levelSelectorMenu;
    public static HighScoreMenu highScoreMenu;
    public static NewGameMenu newGameMenu;
    public static ShipShopMenu ShipShopMenu;
    public static LoadGameMenu loadGameMenu;
    public static ShipShopEnginesMenu ShipShopEnginesMenu;
    public static ShipShopThrustersMenu ShipShopThrustersMenu;
    public static ShipShopWeaponsMenu ShipShopWeaponsMenu;
    public static ShipShopHullsMenu ShipShopHullsMenu;
    public static HowToPlayScreen HowToPlayScreen;
    public static Player Player1;
    public static Ship_Shop_Engine_Confirmation Ship_Shop_Engine_Confirmation;
    public static Ship_Shop_Thruster_Confirmation Ship_Shop_Thruster_Confirmation;
    public static Ship_Shop_Hull_Confirmation Ship_Shop_Hull_Confirmation;
    public static Ship_Shop_Weapon_Confirmation Ship_Shop_Weapon_Confirmation;
    public static Game_Screen Game_Screen;
    public static Save_Confirmation_PopUp Save_Confirmation_PopUp;
    private static void createAndShowGUI() 
    {
    	System.out.println("creating GUI");
    	
    	mainFrame = new JFrame();
    	mainFrame.setSize(new Dimension(1012,825));
    	mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/spacebackgrouBIG.png"));
    	mainFrame.setResizable(false);
    	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Orion's War");
    	mainMenu = new MainMenu();
    	newGameMenu = new NewGameMenu();
    	levelSelectorMenu = new LevelSelectorMenu();
    	highScoreMenu = new HighScoreMenu();
    	ShipShopMenu = new ShipShopMenu();
    	loadGameMenu = new LoadGameMenu();
    	ShipShopEnginesMenu = new ShipShopEnginesMenu();
    	ShipShopThrustersMenu = new ShipShopThrustersMenu();
    	ShipShopWeaponsMenu = new ShipShopWeaponsMenu();
    	ShipShopHullsMenu = new ShipShopHullsMenu();
    	HowToPlayScreen = new HowToPlayScreen();
    	Ship_Shop_Engine_Confirmation = new Ship_Shop_Engine_Confirmation();
    	Ship_Shop_Thruster_Confirmation = new Ship_Shop_Thruster_Confirmation();
    	Ship_Shop_Hull_Confirmation = new Ship_Shop_Hull_Confirmation();
    	Ship_Shop_Weapon_Confirmation = new Ship_Shop_Weapon_Confirmation();
    	Game_Screen = new Game_Screen();
    	Save_Confirmation_PopUp = new Save_Confirmation_PopUp();
    	//TODO: this should only get called when the highscore menu is called specifically remembering to close file and whatnot
    	//((HighScoreMenu) highScoreMenu).loadScores();
    	
    	mainFrame.setVisible(true);
    	
    	//TODO: why the hell is this here?
    	levelSelectorMenu.setVisible(false);

    	System.out.println("mainMenu has focus? " + mainMenu.isFocusOwner());
    	System.out.println("levelSelectorMenu has focus? " + levelSelectorMenu.isFocusOwner());
    	System.out.println("mainFrame has focus? " + mainFrame.isFocusOwner());

    	mainFrame.add(mainMenu);	
    }
    
    
}