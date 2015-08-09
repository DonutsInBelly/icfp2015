package icfp2015;

import jsonHandler.*;

public class GameState 
{
	public boolean isOver;
	public int ID;
	public int boardWidth;
	public int boardHeight;
	public int sourceLength;
	public Unit[] incoming;
	public Cell[] filled;
	public Board theBoard;
}
