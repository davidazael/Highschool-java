///////////////////////////////////////////////////////////////////////////
//
// Java1305	Two kids are playing a guessing game and you have to determine
//          a winner. You think of a number between 1 and 10, and the two
//          kids guess a number. Whoever is closest to your number WINS!
//          If they are the same distance from your number, it is a TIE.
//
//     CHALLENGE: Gently admonish the children if they don't follow the
//                the directions.
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter child #1 --> Kristy
//          Enter child #2 --> Max
//
//			Kristy, what is your guess --> 3
//      	Max, what is your guess --> 8
//
//		SAMPLE OUTPUT:
//			I was thinking of the number 7. Max wins!
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter child #1 --> Kristy
//          Enter child #2 --> Max
//
//			Kristy, what is your guess --> 5
//      	Max, what is your guess --> 9
//
//		SAMPLE OUTPUT:
//			I was thinking of the number 7. Kristy and Max tie!
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;


public class Java1305{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	String child1, child2, message;
	int guess1,guess2, num;

	public Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		num = 7;
		
		Scanner scan = new Scanner(in);

      	out.print("Enter child #1   --> ");
      	child1 = scan.nextLine();
      	out.print("Enter child #2   --> ");
      	child2 = scan.nextLine();
      	
      	
      	out.println( child1 + ", what is your guess --> ");
      	guess1 = Integer.valueOf(scan.nextLine());
      	
      	out.println( child2 + ", what is your guess --> ");
      	guess2 = Integer.valueOf(scan.nextLine());


	}

	void process()
	{
		if( guess1 == num && guess2 == num )
		{
			message = "I was thinking of the number " + num + "." + child1 + " and" + child2 + "tie!";
		}
		else
			if( guess1 > num && guess1 < guess2 )
			{
				message = "I was thinking of the number "+ num + "." +child1+" wins!";
			}
			else
			{
				message = "I was thinking of the number "+ num + "." +child2+" wins!";
			}
			if(guess1 < num && guess1 > guess2)
			{
				message = "I was thinking of the number "+ num + "." +child1+" wins!";
			}
			else
			{
				message = "I was thinking of the number "+ num + "." +child2+" wins!";
			}

	}

	void output()
	{
		
		out.println(message);

	}
}

