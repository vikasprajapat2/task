import java.util.Random;
import java.util.Scanner;


public class Guessinggame
{

	public static void main(String[] args) 
	{
		System.out.println("--------------------------");
		System.out.println(".....Guessing a number....");
		System.out.println("--------------------------");
		System.out.println();
		Random rand = new Random();
		int random_number = rand.nextInt(99)+1;
		Scanner mykeyboard = new Scanner(System.in);
		System.out.println("Guess the number " + "between 1-100"  + " You have a only 5 Attempts");
		int guess;
		int  numberoftrials = 1;
		boolean win = false;
		
		while (win == false) 
		{
			guess= mykeyboard.nextInt();
			
			if (numberoftrials < 5)
			{
				
			
				if (guess == random_number)
				{
					System.out.println();
					System.out.println("Congratulation! You guessing the number  "+ random_number);
					System.out.println("It only took you " + numberoftrials + " guesses to get it right!");
					mykeyboard.close();
					win = true;
				}
				else if (guess < random_number) 
				{
					System.out.println("The number is less than");
					System.out.println();
					System.out.println("Gusse again!");
					
				}
				else if (guess > random_number)
				{
					System.out.println("The number is greter than");
					System.out.println();
					System.out.println("Gusse again: ");
					
				}
			}	
				else if (numberoftrials == 5)
				{
					
					if (guess != random_number)
					{
						System.out.println();
						System.out.println("Sorry your attempts are over. The correct number is : " + random_number + " better luck next time ");
						mykeyboard.close();
						break;
					}
						
				}
				numberoftrials = numberoftrials  + 1;
				
			
				
		}
			

	}

}

