import java.util.Scanner;

public class TicTacToeGame {
	
	public static char [] ticTacToeBoard(){
		char board [] = new char [10];
		for(int i =1 ;i<board.length ;i++) {
			board [i] = ' ';
		}
		return board;	
	}

	public static char input (Scanner scanner){
		System.out.println("Enter a Letter between 'X' or '0'");
		char userInput = scanner.next().toUpperCase().charAt(0);
		return userInput;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char userInput= input(scanner); 
		ticTacToeBoard();
	
	}
}