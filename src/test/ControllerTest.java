package test;

import icfp2015.*;

public class ControllerTest {
	public static void main(String[] args){
		//Generate Board Initial Board
		int testHeight = 10;
		int testWidth = 10;
		int index = 0;
		int[] test_xVals = {8,7};
		int[] test_yVals = {8,7};
		System.out.println("TEST: generate new Board");
		Board testBoard = new Board(testWidth, testHeight, index, test_yVals, test_xVals);
		
		//Generate New Unit
		Hexagon one = new Hexagon(1, 0, false , true);
		Hexagon two = new Hexagon(3, 0, false , false);
		Hexagon[] test_hex_array = {one, two};
		Unit testUnit = new Unit(test_hex_array); 
		System.out.println("Generated New Unit.");
		
		//Place New Unit in Board
		System.out.println("TEST: Add Centered Unit");
		
		Unit cUnit = testBoard.centerUnit(testUnit);
		Unit NU = Controller.translate("SE", cUnit, testBoard);
		
		
//		for(int i = 0; i < cUnit.u.length ; i++ ){
//			System.out.println( "Row , Column : " + cUnit.u[i].x  + " , " + cUnit.u[i].y);
//		}
		
//		boolean testplacement = testBoard.isGameOver(testUnit);
//		if(testplacement == false){
//			System.out.println("Unit Successfully added!");
//		}else{
//			System.out.println("FAILED: piece unable to be added!");
//		}
		return;
	}
}
