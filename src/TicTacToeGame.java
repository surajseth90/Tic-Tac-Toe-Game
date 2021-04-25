import java.util.Scanner;

public class TicTacToeGame {
	
	public static void ticTacToeBoard(int positionInput,char userInput){
		char board [] = new char [10];
		for(int i =1 ;i<board.length ;i++) {
			if(i==positionInput)
			board [i] = userInput;
		}
		showBoard(board);	
	}

	public static char userInput (Scanner scanner){
		System.out.println("Enter a Letter between 'X' or '0'");
		char userInput = scanner.next().toUpperCase().charAt(0);
		return userInput;
	}
	
	public static void showBoard(char board []) {
		System.out.println(" " + board[1] + " | " + board[2] +" | " +board[3] + " ");
		System.out.println(" " + board[4] + " | " + board[5] +" | " +board[6] + " ");
		System.out.println(" " + board[7] + " | " + board[8] +" | " +board[9] + " ");
	}
	
	public static int userMove(Scanner scanner) {
		System.out.println("Enter the index between 1-9 to select the location for move :");
		int positionInput = scanner.nextInt();
		return positionInput;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char userInput= userInput(scanner);
		int positionInput = userMove(scanner);
		ticTacToeBoard(positionInput,userInput);
		
	
	}
}