import java.util.Scanner;

public class TicTacToeBoard {
	static char board [] = new char [10];
	static int win =1;
	static int tie =2;
	static int changeTurn =3;
	

	public static void ticTacToeBoard(int positionInput,char Input , int play){
		Scanner scanner = new Scanner(System.in);
		if(CheckLocation.checkLocation(positionInput, board)==true)
		board [positionInput] = Input;
		ShowBoard.showBoard(board);	
		TicTacToeBoard.checkWin(play);
		
		while(TicTacToeBoard.checkArrayIsFull(10)==false) {
			
			if(play%2 ==1) {
				int positionOfInput = UserPlay.userMove(scanner);
				char userInput= UserPlay.userInput(scanner);
				if(CheckLocation.checkLocation(positionOfInput, board)==true)
				board [positionOfInput] = userInput;
				ShowBoard.showBoard(board);	
				play++;
				TicTacToeBoard.checkWin(play);		
			}
			
			else {
				char computerInput = ComputerPlay.computerInput();
				int positionOfInput ;
				do{ 
					positionOfInput =ComputerPlay.computerPositionInput();
					if(CheckLocation.checkLocation(positionOfInput, board)==true)
					board [positionOfInput] = computerInput;
					
				}
				while(CheckLocation.checkLocation(positionOfInput, board)==true);
					ShowBoard.showBoard(board);
					play++;
					TicTacToeBoard.checkWin(play);
			}	
		}
	}
		
	public static void checkWin(int play) {
		Scanner scanner = new Scanner(System.in);
			if((board[1]=='x' && board[2] == 'x' && board[3] == 'x') || 
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
				if(play%2 ==0) {
					System.out.println(" You Won ");
					System.out.println("Would you like to play again : ");
					String playAgain = scanner.nextLine();
					if(playAgain.equalsIgnoreCase("Yes")) {
						for(int i =0; i<board.length;i++) {
							board[i]= '\u0000';
						}
						TicTacToeGame.main(null);
					}
					else
						System.exit(0);	
				}
				else {
					System.out.println(" Computer Won ");
					System.out.println("Would you like to play again : ");
					String playAgain = scanner.nextLine();
					if(playAgain.equalsIgnoreCase("Yes")) {
						for(int i =0; i<board.length;i++) {
							board[i]= '\u0000';
						}
						TicTacToeGame.main(null);
					}
					else
						System.exit(0);	
				}
				
		}
		else if(TicTacToeBoard.checkArrayIsFull(10)==true) {
			System.out.println(" The board is End ");	
			System.out.println("Would you like to play again : ");
			String playAgain = scanner.nextLine();
			if(playAgain.equalsIgnoreCase("Yes")) {
				for(int i =0; i<board.length;i++) {
					board[i]= '\u0000';
				}
				TicTacToeGame.main(null);
			}
			else
				System.exit(0);	
			}
		else
			System.out.println(" Turn change");
			}
	
	public static boolean checkArrayIsFull(int n) {
		int check =1;
		for(int i =0; i<board.length;i++) {
			if(board[i]!= '\u0000') 
				check++;
		}
		if(check==n)
			return true;
		return false;
				
	}
}
