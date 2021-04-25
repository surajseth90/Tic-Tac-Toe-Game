import java.util.Scanner;

public class TicTacToeGame {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			if(Toss.checkFirstPlay()==0) {
				int positionInput = UserPlay.userMove(scanner);
				char userInput= UserPlay.userInput(scanner);
				TicTacToeBoard.ticTacToeBoard(positionInput, userInput);	
		}
			else {
				char computerInput = ComputerPlay.computerInput();
				int positionInput =ComputerPlay.computerPositionInput();
				TicTacToeBoard.ticTacToeBoard(positionInput, computerInput);
			
		}
		
	
	}
}