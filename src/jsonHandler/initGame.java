package jsonHandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;

class Cell
{
	int x;
	int y;
}

class Unit
{
	Cell[] members;
	Cell pivot;
}

public class initGame 
{
	public int ID;
	public Unit[] incoming;
	public int width;
	public int height;
	public Cell[] filled;
	public int sourceLength;
	public int[] sourceSeeds;
	
/**
 * initGame
 * @param jsonFILE
 * @throws FileNotFoundException
 * 
 * Creates a giant object called initGame from JSON file
 * and creates an object readable by Java to generate the game
 */
	public initGame(File jsonFILE) throws FileNotFoundException
	{
		/*
		 * This tries to decipher the json file
		 * Takes the JSON File, turns it into a String,
		 * then turns it into a JSONObject called json
		 */
		BufferedReader br = new BufferedReader(new FileReader(jsonFILE));
		StringBuilder sb = new StringBuilder();
		String line = "";
		try 
		{
			while((line = br.readLine()) != null)
			{
				sb.append(line);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JSONObject json = new JSONObject(sb.toString());
		
		
		
	}
}
