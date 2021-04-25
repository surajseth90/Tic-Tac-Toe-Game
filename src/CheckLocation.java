
public class CheckLocation {
	public static boolean checkLocation(int positionInput,char board[],char userInput) {
		for(int i =1 ;i<board.length ;i++) {
			if(i==positionInput)
			{
				if(board[i]== '\u0000' ) {
					board [positionInput] = userInput;
					return true;
				}
				else
					System.out.println("location " + i +" is not available ");
					return false;
			}
		}
		
		return checkLocation(positionInput, board ,userInput);
	}

}
