 ///////////////////////////////////////////////////////////////////////////
//
// Java1303 Write a program to determine if a character entered is a vowel,
//          consonant, or neither.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter a SINGLE letter: a
//
//		SAMPLE OUTPUT:
//			The letter a is a vowel.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter a SINGLE letter: B
//
//		SAMPLE OUTPUT:
//			The letter B is a consonant.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter a SINGLE letter: *
//
//		SAMPLE OUTPUT:
//			Please enter a letter.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Java1303{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	String message;
	char letter, vowels;

	public Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		
		out.print("Please enter a single letter: ");
		letter = scan.nextLine().charAt(0);


	}

	void process()
	{
		if(letter == 'a' || letter == 'e'  || letter == 'i'  || letter == 'o'  || letter == 'u' )
		{
			message = "This letter " + letter +  " is a vowel";
		}
		else
			if(Character.isLetter(letter))
			{
				message = "This lettter " + letter + " is a consonant";
			}
			
		if(Character.isDigit(letter) || !(Character.isLetter(letter)))
		{
			message = "Please enter a single LETTER.";
		}


	}

	void output()
	{
		out.println(message);

	}
}

