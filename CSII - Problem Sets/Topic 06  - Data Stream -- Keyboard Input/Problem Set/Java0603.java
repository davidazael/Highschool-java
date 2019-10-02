///////////////////////////////////////////////////////////////////////////
//
// Java0603 Write a program that allows the user to enter a single character
//          followed by a number.  Add the number to the character
//          value and print out the corresponding character value. Follow
//          the sample output below for the correct labels when printing.
//
//      * DO NOT USE THE nextInt() METHOD! *
//
//  REVIEW:  input(), process(), output(), concatenation, integer division
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
//		Enter any character --> E
//		Enter a whole number --> 4
//
//  SAMPLE OUTPUT:
//
//		The letter 'E' plus 4 = 'I'
//
//        TEST INPUT:  ! 5
//					   Z 10
//
///////////////////////////////////////////////////////////////////////////
//


import static java.lang.System.*;
import java.util.*;

public class Java0603{
	public static void main(String[] args){
		new CharArithmetic();
}}


class CharArithmetic
{
	char let1;
	int  num1;
	int  solution;

	public CharArithmetic()
	{
		input();
		process();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		
		out.println("Enter any character --->");
		let1 = scan.nextLine().charAt(0);
		
		out.println("Enter a whole number -->"); 
		num1 = Integer.valueOf(scan.nextLine() );
		
		

	}

	public void process()
	{
		solution = let1 + num1;	
	}

	public void output()
	{
		
		out.println("The letter '" + let1 + "' plus " + num1 + " =" +  (char )solution);
		out.println("The letter '" + let1 + "' plus " + num1 + " =" +  solution);

	}
}



