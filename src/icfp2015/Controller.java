package icfp2015;

public class Controller {
	
	public Controller(){
		
	}
	
	public static Board translate(String dir , Unit U, Board B){
		String[] choices = {"S" , "E" , "W" , "SW" , "SE"};
		int[] choicemap = {0 , 1 , 2 , 3, 4};
		int choice = -1;
		
		for(int i = 0; i < choices.length ; i++){
			if(dir.equals(choices[i])){
				choice = i;
				break;
			}
		}
		int deep_index = 0;
		int shallow_index = 0;
		int moves = 0;
		int how_deep = 0;
		
		switch(choice){
			case 0: //Move South
				deep_index = 0;
				shallow_index = 0;
				moves = 0;
				how_deep = 0;
				for(int i = 0; i < U.u.length ; i++){
					if(U.u[i].y < shallow_index){
						shallow_index = U.u[i].y;
					}
					if(U.u[i].y > deep_index){
						deep_index = U.u[i].y;
					}
				}
				boolean failed = false;
				for(int i = deep_index ; i >= shallow_index ; i--){
					if(B.B[U.u[i].x][U.u[i].y + 2].isFull == true){
						failed = true;
					}
					U.u[i].y = U.u[i].y + 2;
				}
				if(failed == true){
					for(int i = deep_index ; i >= shallow_index ; i--){
						U.u[i].y = U.u[i].y - 2;
					}
					for(int i = 0 ; i < U.u.length ; i++){
						B.B[U.u[i].x][U.u[i].y].isFull = true;
					}
				}
				return B;
			case 1: //East
				deep_index = 0;
				shallow_index = 0;
				moves = 0;
				how_deep = 0;
				for(int i = 0; i < U.u.length ; i++){
					if(U.u[i].y < shallow_index){
						shallow_index = U.u[i].y;
					}
					if(U.u[i].y > deep_index){
						deep_index = U.u[i].y;
					}
				}
				failed = false;
				for(int i = deep_index ; i >= shallow_index ; i--){
					if(B.B[U.u[i].x + 1][U.u[i].y].isFull == true || ((U.u[i].x + 1) > (B.width - 1)) ){
						failed = true;
					}
					U.u[i].x = U.u[i].x + 1;
				}
				if(failed == true){
					for(int i = deep_index ; i >= shallow_index ; i--){
						U.u[i].x = U.u[i].x - 1;
					}
					for(int i = 0 ; i < U.u.length ; i++){
						B.B[U.u[i].x][U.u[i].y].isFull = true;
					}
				}
				return B;
			case 2:
				deep_index = 0;
				shallow_index = 0;
				moves = 0;
				how_deep = 0;
				for(int i = 0; i < U.u.length ; i++){
					if(U.u[i].y < shallow_index){
						shallow_index = U.u[i].y;
					}
					if(U.u[i].y > deep_index){
						deep_index = U.u[i].y;
					}
				}
				failed = false;
				for(int i = deep_index ; i >= shallow_index ; i--){
					if(B.B[U.u[i].x - 1][U.u[i].y].isFull == true || ((U.u[i].x - 1) < (0)) ){
						failed = true;
					}
					U.u[i].x = U.u[i].x - 1;
				}
				if(failed == true){
					for(int i = deep_index ; i >= shallow_index ; i--){
						U.u[i].x = U.u[i].x + 1;
					}
					for(int i = 0 ; i < U.u.length ; i++){
						B.B[U.u[i].x][U.u[i].y].isFull = true;
					}
				}
				return B;
			case 3: // SouthWest
				deep_index = 0;
				shallow_index = 0;
				moves = 0;
				how_deep = 0;
				for(int i = 0; i < U.u.length ; i++){
					if(U.u[i].y < shallow_index){
						shallow_index = U.u[i].y;
					}
					if(U.u[i].y > deep_index){
						deep_index = U.u[i].y;
					}
				}
				failed = false;
				for(int i = deep_index ; i >= shallow_index ; i--){
					if(B.B[U.u[i].x - 1][U.u[i].y + 1].isFull == true || ((U.u[i].x - 1) < 0) || ((U.u[i].y + 1) > (B.hieght - 1))){
						failed = true;
					}
					U.u[i].y = U.u[i].y + 1;
					U.u[i].x = U.u[i].x - 1;
				}
				if(failed == true){
					for(int i = deep_index ; i >= shallow_index ; i--){
						U.u[i].x = U.u[i].x + 1;
						U.u[i].y = U.u[i].y - 1;
					}
					for(int i = 0 ; i < U.u.length ; i++){
						B.B[U.u[i].x][U.u[i].y].isFull = true;
					}
				}
				return B;
			
			case 4:
				
				return B;
			
			default: System.out.println("Not a valid choice");
		}
		return B;
	}
}
