import java.util.Scanner;

public class TicTacToeBoard {
	static char board [] = new char [10];
	static int win =1;
	static int tie =2;
	static int changeTurn =3;

	public static void ticTacToeBoard(int positionInput,char userInput){
		if(CheckLocation.checkLocation(positionInput, board)==true)
		board [positionInput] = userInput;
		ShowBoard.showBoard(board);	
		TicTacToeBoard.checkWin();
		
	}
	
	public static boolean checkArrayIsFull() {
		boolean checkArray = true;
		for(int i =0; i<board.length;i++) {
			if(board[i]== '\u0000') 
				checkArray = false;
			else
				checkArray =true;
		}
		return checkArray;
	}
	
	public static void checkWin() {
		if((board[1] == 'x' && board[2] == 'x' && board[3] == 'x') || 
			(board[4] == 'x' && board[5] == 'x' && board[6] == 'x') ||
			(board[7] == 'x' && board[8] == 'x' && board[9] == 'x') ||
			(board[1] == 'x' && board[4] == 'x' && board[7] == 'x') || 
			(board[2] == 'x' && board[5] == 'x' && board[8] == 'x') ||
			(board[3] == 'x' && board[6] == 'x' && board[9] == 'x') || 
			(board[1] == 'x' && board[5] == 'x' && board[9] == 'x') ||
			(board[3] == 'x' && board[5] == 'x' && board[7] == 'x') ||
			(board[1] == '0' && board[2] == '0' && board[3] == '0') || 
			(board[4] == '0' && board[5] == '0' && board[6] == '0') ||
			(board[7] == '0' && board[8] == '0' && board[9] == '0') ||
			(board[1] == '0' && board[4] == '0' && board[7] == '0') || 
			(board[2] == '0' && board[5] == '0' && board[8] == '0') ||
			(board[3] == '0' && board[6] == '0' && board[9] == '0') || 
			(board[1] == '0' && board[5] == '0' && board[9] == '0') ||
			(board[3] == '0' && board[5] == '0' && board[7] == '0')) {
			System.out.println(" You Won ");
			
		}
		else if(TicTacToeBoard.checkArrayIsFull()==true) {
			System.out.println(" It's tie : Game Over ");	
		}
		else
			System.out.println("/n Turn change");
			}
}
