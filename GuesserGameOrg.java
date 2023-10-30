import java.util.Scanner;

class NumGuesser
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int attempts = 4;
	
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Heyy boyss... I'm guessing a number");
		System.out.println("And You both have to guess the number I guessed and tell me secretly in 4 chances..");
		System.out.println();
		System.out.println("So.. Let's play");
		numFromGuesser = scan.nextInt();
		return numFromGuesser;
	}
	

	int Player1()
	{
		Scanner scan=new Scanner(System.in);
			
		for(int i=0 ; i<attempts ; i++)
		{
			System.out.println();
			System.out.println("Heyyy Sudarshan..!! guess the number");
			numFromPlayer1=scan.nextInt();
		
			if(numFromPlayer1 < numFromGuesser)
			{
				System.out.println("Number is lower than guess");
			}
		    else if(numFromPlayer1 > numFromGuesser)
		    {
		    	
			    System.out.println("Number is greater than guess");
			}
			else 
			{
				System.out.println("It's fine");
				break;
			}
	    }
		return numFromPlayer1;
		
	}
	int Player2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println();
		
		for(int i=0 ; i<attempts ; i++)
		{
			System.out.println();
		System.out.println("Heyyy Ram..!! guess the number");
		numFromPlayer2=scan.nextInt();
		
		if(numFromPlayer2 < numFromGuesser)
		{
			System.out.println("Number is lower than guess");
			
		}
		else if(numFromPlayer2 > numFromGuesser)
		{
			System.out.println("Number is greater than guess");
		}
		else
		{
			System.out.println("It's fine..");
			break;
		}
	}
		return numFromPlayer2;
	}
	
	
	void compare()
	{
		
		if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2)
		{
			System.out.println();
			System.out.println("Congratulations..!! Sudarshan And Ram both of you won the game.. :)");
		}
		else if(numFromGuesser == numFromPlayer1)
		{ 
			System.out.println();
			System.out.println("Congratulations..!! Sudarshan you won the game :)");
		}

		else if(numFromGuesser == numFromPlayer2)
		{
			System.out.println();
			System.out.println("Congratulations..!! Ram you won the game :)");
		}
		
		else
		{
			System.out.println();
			System.out.println("Oops..!!! :( Both of you lost the game.. Better luck next time :)");
		}
		System.out.println();
		System.out.println("The guessed number was : " + numFromGuesser);
	}
	
}

public class GuesserGameOrg {

	public static void main(String[] args) {

		NumGuesser ng = new NumGuesser();
		ng.guessNum();
		ng.Player1();
		ng.Player2();
		ng.compare();
		
	}

}
