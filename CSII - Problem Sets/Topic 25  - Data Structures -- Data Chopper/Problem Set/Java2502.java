///////////////////////////////////////////////////////////////////////////
//
// Java2502 From an unknown number of real datum entered on one line,
//			write a program that separates the composite data and displays
//			each data item on its own line.
//
//			Use the Scanner class to tokenize the composite data into
//			tokens.  Display each token.
//
//			REQUIRED LOOP:  while(chopper.has???())
//							{
//							}
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
/*

45.2 648.25 0.225 16.2 8452.32 45.7 842.6

*/
//	SAMPLE OUTPUT:
//
//		You entered:
//		45.2
//		648.25
//		0.225
//		16.2
//		8452.32
//		45.7
//		842.6
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2502{
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
		// instantiate Scanner object for input
		Scanner scan = new Scanner(in);

		out.println("Enter numbers separated by spaces. ");
		// dataLine input
		dataLine = scan.nextLine();
	
	}

	void output()
	{
     	// instantiate Scanner object for tokenizing
     	Scanner chopper = new Scanner(dataLine);
		out.println();
		out.println("You entered:");
		
		// while loop to chop and process

		while(chopper.hasNext())
		{
			String doub = chopper.next();
			out.print(doub + "\n");
		}

		out.println();
	}
}








