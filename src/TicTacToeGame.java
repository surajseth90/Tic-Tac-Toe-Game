import java.util.Scanner;

public class TicTacToeGame {
	
	public static void ticTacToeBoard(){
		char board [] = new char [10];
		for(int i =1 ;i<board.length ;i++) {
			board [i] = ' ';
		}
		showBoard(board);	
	}

	public static char input (Scanner scanner){
		System.out.println("Enter a Letter between 'X' or '0'");
		char userInput = scanner.next().toUpperCase().charAt(0);
		return userInput;
	}
	
	public static void showBoard(char board []) {
		System.out.println(" " + board[1] + " | " + board[2] +" | " +board[3] + " ");
		System.out.println(" " + board[4] + " | " + board[5] +" | " +board[6] + " ");
		System.out.println(" " + board[7] + " | " + board[8] +" | " +board[9] + " ");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char userInput= input(scanner); 
		ticTacToeBoard();
		
	
	}
}