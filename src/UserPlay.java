import java.util.Scanner;

public class UserPlay {
	public static char userInput (Scanner scanner){
		System.out.println("Enter a Letter between 'X' or '0'");
		char userInput = scanner.next().charAt(0);
		return userInput;
	}
	
	public static int userMove(Scanner scanner) {
		System.out.println("Enter the index between 1-9 to select the location for move :");
		int positionInput = scanner.nextInt();
		return positionInput;
	}

}
