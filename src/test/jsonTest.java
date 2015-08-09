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
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter File Path: ");
		jsonString = scan.next();
		json = new File(jsonString);
		initGame game = new initGame(json);
		System.out.println("Game ID: " + game.ID);
		System.out.println("Game Width: " + game.width);
		System.out.println("Game Height: " + game.height);
		System.out.println("Game sourceLength: " + game.sourceLength);
		
		for(int unitIter = 0; unitIter < game.incoming.length-1; unitIter++)
		{
			Unit currentUnit = game.incoming[unitIter];
			int memberLength = game.incoming[unitIter].getMemberLength();
			System.out.println("Unit Pivot: (" + currentUnit.getPivotX() + "," + currentUnit.getPivotY() + ")");
			for(int memberIter = 0; memberIter < memberLength-1; memberIter++)
			{
				System.out.println("Member " + memberIter + ": (" + currentUnit.getMemberX(memberIter) + "," + currentUnit.getMemberY(memberIter) + ")");
			}
		}
	}
	
}
