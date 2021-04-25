import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlay {
	public static char computerInput() {
		int random = (int)(Math.random() *10)/5;
		char computerInput;
		if(random ==1) 
			computerInput = 'x';
		else
			computerInput = '0';
		
		return computerInput;
	}
	public static int computerPositionInput() {  
		int computerPosition = ThreadLocalRandom.current() .nextInt(1,10);
		return computerPosition;
	}
}