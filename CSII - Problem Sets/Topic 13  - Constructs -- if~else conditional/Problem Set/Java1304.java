 ///////////////////////////////////////////////////////////////////////////
//
// Java1304  Write a program that asks the user for a single character.
//			 Print a message that tells if they input a letter, digit,
//			 or symbol.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter a SINGLE character: 4
//
//		SAMPLE OUTPUT:
//			You entered a NUMBER.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter a SINGLE character: $
//
//		SAMPLE OUTPUT:
//			You entered a SYMBOL.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;


public class Java1304{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	char letter;

	public Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);

      	out.print("Enter a single character --> ");

      	letter = scan.nextLine().charAt(0);
	}

	void process()
	{
		if(Character.isDigit(letter))
		{
			out.println("You entered a NUMBER.");
		}
		if(Character.isLetter(letter))
		{
			out.println("You entered a LETTER.");
		}
		if(  !(Character.isLetter(letter)) && !((Character.isDigit(letter) )     ) )
		{
			out.println("You entered a SYMBOL.");
		}


	}

	void output()
	{


	}
}

