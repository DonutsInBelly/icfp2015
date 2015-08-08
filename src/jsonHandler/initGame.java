package jsonHandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.*;

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
		
		/*
		 * These lines get values from the JSONObject and put them into
		 * the initGame object
		 */
		this.ID = json.getInt("id");
		this.width = json.getInt("width");
		this.height = json.getInt("height");
		this.sourceLength = json.getInt("sourceLength");
		JSONArray jsonUnitArray = json.getJSONArray("units");
		for(int memberIter = 0; memberIter < jsonUnitArray.length()-1; memberIter++)
		{
			/*
			this.incoming[iter].members[iter].x = jsonUnitArray.getJSONObject(iter).getInt("x");
			this.incoming[iter].members[iter].y = jsonUnitArray.getJSONObject(iter).getInt("y");
			this.incoming[iter].pivot.x = jsonUnitArray.getJSONObject(iter).getInt("x");
			this.incoming[iter].pivot.y = jsonUnitArray.getJSONObject(iter).getInt("y");
			*/
			JSONObject jsonUnit = jsonUnitArray.getJSONObject(memberIter);
			JSONArray jsonMemberArray = jsonUnit.getJSONArray("members");
			JSONObject jsonPivot = jsonUnitArray.getJSONObject(memberIter);
			for(int cellIter = 0; cellIter < jsonMemberArray.length()-1; cellIter++)
			{
				this.incoming[memberIter].members[cellIter].x = jsonMemberArray.getJSONObject(cellIter).getInt("x");
				this.incoming[memberIter].members[cellIter].y = jsonMemberArray.getJSONObject(cellIter).getInt("y");
			}
			this.incoming[memberIter].pivot.x = jsonPivot.getInt("x");
			this.incoming[memberIter].pivot.y = jsonPivot.getInt("y");
		}
		JSONArray jsonFilledArray = json.getJSONArray("filled");
		for(int fillIter = 0; fillIter < jsonFilledArray.length()-1; fillIter++)
		{
			JSONObject jsonFilledCell = jsonFilledArray.getJSONObject(fillIter);
			this.filled[fillIter].x = jsonFilledCell.getInt("x");
			this.filled[fillIter].y = jsonFilledCell.getInt("y");
		}
	}
}
