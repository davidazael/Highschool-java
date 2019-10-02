///////////////////////////////////////////////////////////////////////////
//
// Java3607	The Texas Lottery allows a player 21 or over to try to guess
//          six numbers from 1 to 54. Write a program that allows the user
//          to guess ONE of the 6 numbers. Populate the array with random
//          numbers from 1 to 54. (CHALLENGE: Do not allow repeating numbers).
//
//          Display an appropriate message, and display all 6 numbers using
//          the Arrays.toString() utility method.
//
//  INPUT DATA:
//		Enter a lottery number from 1 to 54 ==> 7
//
//  SAMPLE OUTPUT:
//		Sorry, you didn't pick a winning number.
//		Here were the winning numbers: [46, 24, 49, 1, 30, 36]
//

import static java.lang.System.*;
import java.util.*;

public class Java3607{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	// declare array here
	int[] nums;

	final int MAX = 6;
	int guess;

	public Environment()
	{
		// allocate memory space
		nums = int[MAX];

		// indexed for loop here
			ray[x] =  /* assign a random value from 1 through 54 */;

		input();
		run();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter a lottery number from 1 to 54 ==> " );
		guess = scan.nextInt();
	}

	public void run()
	{
		// use conditional to activate findIt() method and print appropriate messages
		if(guess == )

		out.println( "Here were the winning numbers: " + /* use Arrays utility method to display */);
		out.println( );
	}

	public boolean findIt()
	{
		// use a loop to traverse array and return boolean result

	}
}