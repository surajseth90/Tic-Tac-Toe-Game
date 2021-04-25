
public class Toss {
	private static final int Heads = 0;//for User
	private static final int Tails = 1;//for computer
	
	public static int checkFirstPlay ()
	{
		int random = (int)(Math.random() *10)/5;
		if(random == Heads) 
			System.out.println("User won the toss and will play First");
		else
			System.out.println("Computer won the toss and will play First");
		
		return random;
	}

}
