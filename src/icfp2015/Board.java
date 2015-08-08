package icfp2015;

public class Board {
	
	//Board Dimensional Constraints
	int width; //number of columns
	int hieght; //number of rows
	
	public Hexagon[][] B;
	
	public Board(int width , int height){
		this.B = new Hexagon[height][width];
	}
	
	/*
	 *  Method Summary
	 *  1) AddUnit
	 *  2) CheckBottomRow
	 */
	
}
