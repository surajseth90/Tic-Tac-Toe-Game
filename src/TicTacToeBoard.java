import java.util.Scanner;

public class TicTacToeBoard {
	
	public static void ticTacToeBoard(int positionInput,char userInput){
		char board [] = new char [10];
		CheckLocation.checkLocation(positionInput, board ,userInput);
		ShowBoard.showBoard(board);	
	}

	public static char userInput (Scanner scanner){
		System.out.println("Enter a Letter between 'X' or '0'");
		char userInput = scanner.next().toUpperCase().charAt(0);
		return userInput;
	}
	
	public static int userMove(Scanner scanner) {
		System.out.println("Enter the index between 1-9 to select the location for move :");
		int positionInput = scanner.nextInt();
		return positionInput;
	}

}
