import java.util.Scanner;

public class TicTacToeBoard {
	
	public static void ticTacToeBoard(int positionInput,char userInput){
		char board [] = new char [10];
		if(CheckLocation.checkLocation(positionInput, board)==true)
		board [positionInput] = userInput;
		ShowBoard.showBoard(board);	
	}

	
	

}
