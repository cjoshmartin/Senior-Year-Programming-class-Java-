//Project 7-1  
import java.util.Scanner;
import java.util.Random;
 
public class Project71 {
	public static void main(String args[])
	 {
	String Guess = "";
	int num;
	Scanner reader = new Scanner(System.in);
	 Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(101);
		
			
		System.out.println(" I'm think about a number between 1 and 100." ); 
		 num = reader.nextInt();
		
	 Guess += " " + num;
	 while (randomInt != num)
	{
		 if (num > randomInt)
			 System.out.println("Sorry guess lower");
		 else if (num < randomInt)
			 System.out.println("Sorry guess higher");
		  
			 num = reader.nextInt();
			Guess += " " + num;
		
	}
	
	 System.out.println(" Correct the answer is :: " + randomInt );
	 System.out.println(" Your guess was :: " + Guess );
	 
}
}
