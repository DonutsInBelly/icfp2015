package jsonHandler;

public class Unit
{
	public Cell[] members;
	public Cell pivot;
	
	public int getMemberX(int index)
	{
		return this.members[index].x;
	}
	public int getMemberY(int index)
	{
		return this.members[index].y;
	}
	public int getPivotX()
	{
		return this.pivot.x;
	}
	public int getPivotY()
	{
		return this.pivot.y;
	}
	public int getMemberLength()
	{
		return this.members.length;
	}
}
class Cell
{
	public int x;
	public int y;
}