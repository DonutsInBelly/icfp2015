package icfp2015;
import java.io.*;

import jsonHandler.*;
/**
 * @author Carlin Au
 * @author Harsh Shah
 *
 *icpf competition
 */
public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		//Read the JSON file
		File json = new File(args[1]);
		initGame gameInitState = new initGame(json);
		//generate the board
		int[] xArray = new int[gameInitState.filled.length];
		int[] yArray = new int[gameInitState.filled.length];
		for(int coorIter = 0; coorIter < gameInitState.filled.length; coorIter++)
		{
			xArray[coorIter] = gameInitState.filled[coorIter].x;
			yArray[coorIter] = gameInitState.filled[coorIter].y;
		}
		Board theBoard = new Board(gameInitState.width, gameInitState.height, xArray, yArray);
			//Queue up future pieces
		
			//Read in the first piece
		
		//While moves still available keep playing
			//Create game over flag
		
			//Get new piece
			
			//attempt to place peice
		
			//check if game is over
		//When no moves left game done
		
		//Calculate the score
		
		
	}
}
