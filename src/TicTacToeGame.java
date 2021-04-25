import java.util.Scanner;

public class TicTacToeGame {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char userInput= TicTacToeBoard.userInput(scanner);
		int positionInput = TicTacToeBoard.userMove(scanner);
		TicTacToeBoard.ticTacToeBoard(positionInput, userInput);
		
	
	}
}