///////////////////////////////////////////////////////////////////////////
//
// Java1702 Write a program that allows the user to enter any word or
//          sentence.  Print the length of the sentence, the 1st
//			character in the sentence, and the last character in
//			the sentence.
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE INPUT:
//			Enter a word or phrase --> WE ARE THE KNIGHTS THAT SAY "NI"!
//
//   SAMPLE OUTPUT:
//			WE ARE THE KNIGHTS THAT SAY "NI"! is 33 characters long
//			The first character in WE ARE THE KNIGHTS THAT SAY "NI"! is W
//			The last character in WE ARE THE KNIGHTS THAT SAY "NI"! is !
//
///////////////////////////////////////////////////////////////////////////
//
//  INQUIRY:  Do you have to do anything special to print double quotes
//            when they are input from the keyboard?
//
//	OTHER SAMPLE INPUT TO TRY.  (Do you recognize these quotes?)
//
//		A 5-ounce bird could not carry a 1-pound coconut.
//		Are you suggesting coconuts migrate?
//		What are you gonna do, bleed on me?
//		You make me sad. So be it. Come, Patsy!
//		I don't want to go on the cart.
//		Why do you think I have this outrageous accent, you silly king?
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1702{
	public static void main(String[] args){
		new MontyPython();
}}


class MontyPython
{
	String phrase;

	public MontyPython()
	{
		input();
		output();
	}

	public void input()
	{
		out.println("Enter a word or phrase ==>");
		Scanner scan = new Scanner(in);
	  	phrase = scan.nextLine();
	}

	public void output()
	{
		out.println(phrase + " is " + (phrase.length()-1) + " characters long." );
		out.println("The first character in " + phrase + " is " + phrase.charAt( (phrase.length() - (phrase.length()) ) )   );
		out.println("The last character in " + phrase + " is " + phrase.charAt( (phrase.length() - 1) ) );



	}
}












