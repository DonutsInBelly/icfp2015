package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import jsonHandler.Unit;
import jsonHandler.initGame;

public class jsonTest 
{
	public static void main (String[] args) throws FileNotFoundException
	{
		String jsonString;
		File json;
		//Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Enter File Path: /home/carlin/Workspace/icfp2015/src/problems/problem_0.json");
			jsonString = "/home/carlin/Workspace/icfp2015/src/problems/problem_0.json";
			json = new File(jsonString);
		} while(!json.exists());
		
		initGame game = new initGame(json);
		System.out.println("Game ID: " + game.ID);
		System.out.println("Game Width: " + game.width);
		System.out.println("Game Height: " + game.height);
		System.out.println("Game sourceLength: " + game.sourceLength);
		
		for(int unitIter = 0; unitIter <= game.incoming.length-1; unitIter++)
		{
			Unit currentUnit = game.incoming[unitIter];
			int memberLength = game.incoming[unitIter].getMemberLength();
			System.out.println("Unit Pivot: (" + currentUnit.getPivotX() + "," + currentUnit.getPivotY() + ")");
			for(int memberIter = 0; memberIter <= memberLength-1; memberIter++)
			{
				System.out.println("Member " + memberIter + ": (" + currentUnit.getMemberX(memberIter) + "," + currentUnit.getMemberY(memberIter) + ")");
			}
		}
		for(int fillIter = 0; fillIter <= game.filled.length-1; fillIter++)
		{
			int x = game.filled[fillIter].x;
			int y = game.filled[fillIter].y;
			System.out.println("Filled Cell: (" + x + "," + y + ")");
		}
		System.out.println("sourceSeed: [ ");
		for(int seedIter = 0; seedIter <= game.sourceSeeds.length-1; seedIter++)
		{
			System.out.print(game.sourceSeeds[seedIter] + ", ");
		}
		System.out.print("]");
		//scan.close();
	}
	
}
