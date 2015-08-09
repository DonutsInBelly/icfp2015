package icfp2015;

public class Controller {
	
	public Controller(){
		
	}
	
	public static Unit translate(String dir , Unit U, Board B){
		String[] choices = { "E" , "W" , "SW" , "SE"};
		
		
		int deep_index = 0;
		int shallow_index = 0;
		int moves = 0;
		int how_deep = 0;
		boolean badmotion = false;
		
		
		if(dir.equals("E")){
			System.out.println("Moving East!");
			for(int i = 0; i < U.u.length ; i++){
				U.u[i].x++;
			}
			for(int i = 0; i < B.B.length ; i++){
				for(int j = 0; j < B.B[i].length; j++){
					for(int k = 0 ; k < U.u.length ; k++){
						if(B.B[i][j].isFull == true && B.B[i][j].x == U.u[k].x && B.B[i][j].y == U.u[k].y){
							badmotion = true;
							break;
						}
					}
					if(badmotion == true){
						break;
					}
				}
				if(badmotion == true){
					break;
				}
			}
			if(badmotion == true){
				for(int i = 0; i < U.u.length ; i++){
					U.u[i].x--;
				}
			}
			for(int i = 0; i < U.u.length ; i++ ){
				
				System.out.println( "id = " + i + " : " + "Row , Column : " + U.u[i].x  + " , " + U.u[i].y);
			}
			return U;
		}
		
		if(dir.equals("W")){
			System.out.println("Moving West!");
			for(int i = 0; i < U.u.length ; i++){
				U.u[i].x--;
			}
			for(int i = 0; i < B.B.length ; i++){
				for(int j = 0; j < B.B[i].length; j++){
					for(int k = 0 ; k < U.u.length ; k++){
						if(B.B[i][j].isFull == true && B.B[i][j].x == U.u[k].x && B.B[i][j].y == U.u[k].y){
							badmotion = true;
							break;
						}
					}
					if(badmotion == true){
						break;
					}
				}
				if(badmotion == true){
					break;
				}
			}
			if(badmotion == true){
				for(int i = 0; i < U.u.length ; i++){
					U.u[i].x++;
				}
			}
			for(int i = 0; i < U.u.length ; i++ ){
				
				System.out.println( "id = " + i + " : " + "Row , Column : " + U.u[i].x  + " , " + U.u[i].y);
			}
			return U;
		}
		
		if(dir.equals("SW")){
			System.out.println("Moving South West!");
			for(int i = 0; i < U.u.length ; i++){
				U.u[i].x--;
				U.u[i].y++;
			}
			for(int i = 0; i < B.B.length ; i++){
				for(int j = 0; j < B.B[i].length; j++){
					for(int k = 0 ; k < U.u.length ; k++){
						if(B.B[i][j].isFull == true && B.B[i][j].x == U.u[k].x && B.B[i][j].y == U.u[k].y){
							badmotion = true;
							break;
						}
					}
					if(badmotion == true){
						break;
					}
				}
				if(badmotion == true){
					break;
				}
			}
			if(badmotion == true){
				for(int i = 0; i < U.u.length ; i++){
					U.u[i].x++;
					U.u[i].y--;
				}
			}
			for(int i = 0; i < U.u.length ; i++ ){
				
				System.out.println( "id = " + i + " : " + "Row , Column : " + U.u[i].x  + " , " + U.u[i].y);
			}
			return U;
		}
		
		if(dir.equals("SE")){
			System.out.println("Moving South East!");
			for(int i = 0; i < U.u.length ; i++){
				U.u[i].x++;
				U.u[i].y++;
			}
			for(int i = 0; i < B.B.length ; i++){
				for(int j = 0; j < B.B[i].length; j++){
					for(int k = 0 ; k < U.u.length ; k++){
						if(B.B[i][j].isFull == true && B.B[i][j].x == U.u[k].x && B.B[i][j].y == U.u[k].y){
							badmotion = true;
							break;
						}
					}
					if(badmotion == true){
						break;
					}
				}
				if(badmotion == true){
					break;
				}
			}
			if(badmotion == true){
				for(int i = 0; i < U.u.length ; i++){
					U.u[i].x--;
					U.u[i].y--;
				}
			}
			for(int i = 0; i < U.u.length ; i++ ){
				
				System.out.println( "id = " + i + " : " + "Row , Column : " + U.u[i].x  + " , " + U.u[i].y);
			}
			return U;
		}


		return U;
	}
}
