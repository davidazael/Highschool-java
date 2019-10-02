///////////////////////////////////////////////////////////////////////////
//
// Java2503 From a sentence of words, write a program that displays each
//		    word and its length.
//
//			Use the Scanner class to tokenize the sentence into tokens.
//			Display each token and its length.
//
//			REQUIRED LOOP:  while(chopper.has???())
//							{
//							}
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
/*

Victory goes to the player who makes the next-to-last mistake.

*/
//	SAMPLE OUTPUT:
//		Victory = 7
//		goes = 4
//		to = 2
//		the = 3
//		player = 6
//		who = 3
//		makes = 5
//		the = 3
//		next-to-last = 12
//		mistake. = 8
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2503{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	String dataLine;

	Solution()
	{
		input();
		output();
	}

	void input()
	{
		// instantiate Scanner for dataLine input
		Scanner scan = new Scanner(in);

		// prompt and input dataLine
		out.println("Enter a 1 line story!");
		out.println();
		dataLine = scan.nextLine();

	}

	void output()
	{
     	// instantiate Scanner for tokenizing dataLine
     	Scanner chopper = new Scanner(dataLine);
	
		// loop
		while(chopper.hasNext())
		{
			// extract one token
			String word = chopper.next();
			
			out.println(word + " = " + word.length());
	
			// output token and its length
			
		}
		out.println();
	}
}








