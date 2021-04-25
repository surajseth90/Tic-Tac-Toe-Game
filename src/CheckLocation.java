
public class CheckLocation {
	public static boolean checkLocation(int positionInput,char board[]) {
		boolean check =true;
		for(int i =1 ;i<board.length ;i++) {
			if(i==positionInput)
			{
				if(board[i]== '\u0000' ) {
					check =true;
				}
				else {
					System.out.println("location " + i +" is not available ");
					check= false;
				}
			}
		}
		return check;
	}

}
