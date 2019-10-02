///////////////////////////////////////////////////////////////////////////
//
// Java2304 Write a program that allows a user to enter a 4 digit pin number.
//          However, for security purposes, if the user enters an INCORRECT
//          pin number, they are only allowed THREE CHANCES to enter it.
//          After three chances, they are locked out! (You decide what the
//          pin number is.)
//
//  SAMPLE INPUT/OUTPUT:
//		Enter your 4-digit pin number. You have 3 attempts: 9999
//		That wasn't it. Try again: 1234
//		Success! Your PIN is accepted after 2 attempt(s).
//
///////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT/OUTPUT:
//		Enter your 4-digit pin number. You have 3 attempts: 3864
//		That wasn't it. Try again: 9999
//		That wasn't it. Try again: 2345
//
//		You have exceeded your PIN attempts.
//		Please call 1-800-O0H-NOOO to unlock your account.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2304{
	public static void main(String[] args){
		new Solution08().run();
}}



class Solution08
{
	int pin, pin2;

	void run()
	{
		Scanner scan = new Scanner(in);

		int tries = 0;
		out.print("Enter your 4-digit pin number. You have 3 attempts: ");
		// enter initial value for pin
		pin = 1234;
	

		// while loop
		while ( tries <= 3 )
		{
			pin2 = Integer.valueOf(scan.nextLine());
			tries++;
			if(pin == pin2)
			break;
			
			
			out.print("That wasn't it. Please try again: ");
			
			
			
	    }





		out.println();
		out.println();

		if( pin == pin2 )
			out.println("Your PIN is accepted after " + tries +  " attempt(s).");
		else
		{
			out.println("You have exceeded your PIN attempts.");
			out.println("Please call 1-800-O0H-NOOO to unlock your account.");
		}
		out.println();
	}
}

