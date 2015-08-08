package icfp2015;

public class Controller {
	
	public Controller(){
		
	}
	
	public static Board translate(String dir , Unit U, Board B){
		String[] choices = {"S" , "E" , "SE" , "SW" , "W"};
		int[] choicemap = {0 , 1 , 2 , 3, 4};
		int choice = -1;
		
		for(int i = 0; i < choices.length ; i++){
			if(dir.equals(choices[i])){
				choice = i;
				break;
			}
		}
		
		switch(choice){
			case 0: //Move South
				int deep_index = 0;
				int shallow_index = 0;
				int moves = 0;
				int how_deep = 0;
				for(int i = 0; i < U.u.length ; i++){
					if(U.u[i].y < shallow_index){
						U.u[i].y = i;
					}
					if(U.u[i].y > deep_index){
						U.u[i].y = i;
					}
				}
				boolean failed = false;
				for(int i = deep_index ; i >= shallow_index ; i--){
					if(B.B[U.u[i].x][U.u[i].y - 2].isFull == true){
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
			case 1:
				
				return B;
			case 2:
				
				return B;
			case 3:
				
				return B;
			
			case 4:
				
				return B;
			
			default: System.out.println("Not a valid choice");
		}
		return B;
	}
}
