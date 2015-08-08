package icfp2015;

public class Hexagon 
{
	public boolean isPivot;
	public boolean isFull;
	public int x;
	public int y;
	
	/**
	 * Hexagon(x,y,full)
	 * -Contain x,y coordinates for board; x and y are ints
	 * -isFull is a boolean: True for Full, False for empty
	 * -isPivot is a boolean: True for Being a Pivot, False for Not Pivot
	 * @param x
	 * @param y
	 * @param isFull
	 * @param isPivot
	 */
	public Hexagon(int x, int y, boolean isFull, boolean isPivot)
	{
		this.x = x;
		this.y = y;
		this.isFull = isFull;
		this.isPivot = isPivot;
	}
}
