///////////////////////////////////////////////////////////////////////////
//
// Java2501 From a list of body parts, write a program that displays each
//		    body part on its own line.
//
//			Use the Scanner class to tokenize the dataLine into tokens.
//			Display each token.
//
//			REQUIRED LOOP:  while(chopper.has???())
//							{
//							}
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
/*

Head Arm Heart Foot Knee Finger Wrist Spine

*/
//	SAMPLE OUTPUT:
//		You entered the body parts:
//		Head
//		Arm
//		Heart
//		Foot
//		Knee
//		Finger
//		Wrist
//		Spine
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2501{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	String dataLine;

	Solution()
	{
		input();
		tokenizer();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		// Scanner object for console input
		out.println("Enter a list of body parts. ");
		// scan entire dataLine
		dataLine = scan.nextLine();
		
	}

	void tokenizer()
	{
		// Scanner object for tokenizer
		Scanner chopper = new Scanner(dataLine);
   
		out.println();
		out.println("You Have Entered the Body Parts:");
		// loop
		while( chopper.hasNext() )
		{
			String bob = chopper.next();
						
			out.print(bob + " \n" );
			
			// chop and process
		}
	}

}








