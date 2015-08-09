package icfp2015;

public class Unit {
	public Hexagon[] u;
	
	/**
	 * Unit is a set of hexagons that make a playable piece
	 * @param input
	 * 		array of hexagons to constitute the unit
	 */
	public Unit(Hexagon[] input){
		u = input;
	}
	
	/**
	 * Will return the pivot position (row, col) of the a given unit
	 * @return
	 * 		int[] of size 2 where [0] = row , [1] = col
	 */
	public int[] getPivot(){
		if(u == null || u.length == 0){
			System.out.println("Unit is null or does not exist");
		}
		for(int i = 0; i < u.length ; i++){
			if(u[i].isPivot == true){
				int[] temp = new int[2];
				temp[0] = u[i].y; //row
				temp[1] = u[i].x; //col
				return temp;
			}
		}
		System.out.println("Pivot not assigned in the unit!");
		return null;
	}
}

