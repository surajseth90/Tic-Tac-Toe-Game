public class TicTacToeGame {
	
	public static char [] ticTacToeBoard()
	{
		char board [] = new char [10];
		for(int i =1 ;i<board.length ;i++) {
			board [i] = ' ';
		}
		return board;	
	}

	public static void main(String[] args) {
		ticTacToeBoard();
	
	}
}