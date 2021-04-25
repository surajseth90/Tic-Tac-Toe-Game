import java.util.Scanner;

public class TicTacToeGame {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			if(Toss.checkFirstPlay()==0) {
				int positionInput = UserPlay.userMove(scanner);
				char userInput= UserPlay.userInput(scanner);
				int userPlay =0;
				TicTacToeBoard.ticTacToeBoard(positionInput, userInput , userPlay);	
			}
			else {
				char computerInput = ComputerPlay.computerInput();
				int positionInput =ComputerPlay.computerPositionInput();
				int ComputerPlay =1;
				TicTacToeBoard.ticTacToeBoard(positionInput, computerInput,ComputerPlay);	
			}
	}
}