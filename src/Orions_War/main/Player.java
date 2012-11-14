package Orions_War.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player 
{
	
	public static String playerName = "Default";
	
	public static int progress = 1;
	
	/*Integration of the credits and experience variable. 
	 * Yielding result is now current_credits and max_credits.
	 * This is for simplifying the high score tracker, we will just follow
	 * tracking the credits.
	 */
	public static int credits = 350000;
	public static int score = 0;
	public static int shipHealth = 100;
	public static int shipDamage = 50;
	public static double acceleration = 1;
	public static double maxSpeed = 25;
	
	public static Player_Ship Ship = new Player_Ship(500,790,25,25,shipHealth,shipDamage,acceleration,maxSpeed);
	
	
	public void saveGame()
	{
		System.out.println("in savegame...");
		System.out.println(System.getProperty("user.dir"));
		
		
		File saveManifest = null;
		File saveCurrent = null;
		File updatedManifest = null;
		
		saveCurrent = new File(System.getProperty("user.dir")+"/src/Orions_War/saves", playerName+".txt");
		
		
		try 
		{
			saveCurrent.createNewFile();
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try 
		{
			saveManifest = new File(this.getClass().getResource("/Orions_War/saves/spacegame manifest.txt").toURI());
		} 
		catch (URISyntaxException e) 
		{
			System.out.println("printing stack trace");
			e.printStackTrace();
		}
		if(saveManifest == null) System.out.println("file null");
		
		
		Scanner manifestReader = null;
		PrintWriter manifestWriter = null;
		PrintWriter saveWriter = null;
		
		try 
		{
			manifestReader = new Scanner(saveManifest);
			saveWriter = new PrintWriter(saveCurrent);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int numSaves = manifestReader.nextInt();
		ArrayList<String> saveNames = new ArrayList<String>();
		
		for(int i = 0; i < numSaves; i++)
		{
			saveNames.add(manifestReader.next());
		}
		saveNames.add(playerName);
		numSaves++;
		
		saveManifest.delete();
		
		updatedManifest = new File(System.getProperty("user.dir")+"/src/Orions_War/saves", "spacegame manifest.txt");
		
		
		try 
		{
			manifestWriter = new PrintWriter(updatedManifest);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		manifestWriter.println(numSaves);
		for(int i = 0; i < numSaves; i++)
		{
			manifestWriter.print(saveNames.get(i));
			if((numSaves - i) > 1) manifestWriter.println();
		}
		
		saveWriter.println(playerName);
		saveWriter.println(progress);
		saveWriter.println(credits);
		saveWriter.println(shipHealth);
		saveWriter.println(shipDamage);
		saveWriter.println(acceleration);
		saveWriter.println(maxSpeed);
		
		manifestReader.close();
		manifestWriter.close();
		saveWriter.close();

		
	}
	
	public void Update_Player_Name(String name)
	{
		playerName = name;
	}
	
	public static void loadSave(File saveFile)
	{
		Scanner saveReader = null;
		try
		{
			saveReader = new Scanner(saveFile);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(playerName);

		playerName = saveReader.nextLine();
		//System.out.println(playerName);
		
		progress = saveReader.nextInt();
		//System.out.println(progress);
		
		credits = saveReader.nextInt();
		//System.out.println(credits);
		
		shipHealth = saveReader.nextInt();
		//System.out.println(shipHealth);
		
		shipDamage = saveReader.nextInt();
		//System.out.println(shipDamage);
		
		acceleration = saveReader.nextInt();
		//System.out.println(acceleration);
		
		maxSpeed = saveReader.nextInt();
		//System.out.println(maxSpeed);
		
		saveReader.close();
	}
	
	public static void printPlayer()
	{
		System.out.println();
		System.out.println("Currently loaded player:"+playerName);
		System.out.println("Progress value: "+progress);
		System.out.println("Credit value: "+credits);
		System.out.println("Ship health: "+shipHealth);
		System.out.println("Ship damage: "+shipDamage);
		System.out.println("Ship acceleration: "+acceleration);
		System.out.println("Ship max speed: "+maxSpeed);
	}
	
}
