package icfp2015;

/*
 * Hexagon(x,y,full)
 * -Contain x,y coordinates for board; x and y are doubles
 * -full is a boolean: true for Full, False for empty
 */
public class Hexagon 
{
	public boolean pivot;
	public boolean full;
	public int x;
	public int y;
	
	public Hexagon(double x, double y, Boolean full)
	{
		x = this.x;
		y = this.y;
		full = this.full;
		pivot = false;
	}
}
