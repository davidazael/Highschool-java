///////////////////////////////////////////////////////////////////////////
//
// Java2506	Write a program that counts the individual letter grades
//			contained in a dataLine.
//
//			Use the Scanner class to tokenize the dataLine into chopper.
//			Set the Scanner delimiter to use the colon (":") and CRLF ("\n").
//
//			Output the total numbers of each letter.
//
//
//			REQUIRED LOOP:  while(chopper.has???() )
//							{
//							}
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//		out.println("Enter letter grades separated by colons: ");
/*

A:B:C:A:A:B:B:C:A:B:B:C:F

*/
//     SAMPLE OUTPUT:
//    Letter Grade Totals
//   ===================
//        A's = 4
//        B's = 5
//        C's = 3
//        D's = 0
//        F's = 1
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2506{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	String dataLine;
	int totalAs;
	int totalBs;
	int totalCs;
	int totalDs;
	int totalFs;

	Solution()
	{
		input();
		tokenizer();
		output();
	}

	void input()
	{
	Scanner scan = new Scanner(in);
	out.println("Enter letter grades separated by colons: ");
	dataLine = scan.nextLine();
	}

	void tokenizer()
	{
		Scanner chopper = new Scanner(dataLine);
		chopper.useDelimiter("[- :@$\n]");
		
		while(chopper.hasNext())
		{
			String let = chopper.next();
			
			if(let.equalsIgnoreCase("a") )
				totalAs++;
			if(let.equalsIgnoreCase("b") )
				totalBs++;
			if(let.equalsIgnoreCase("c") )
				totalCs++;
			if(let.equalsIgnoreCase("d") )
				totalDs++;
			if(let.equalsIgnoreCase("f") )
				totalFs++;
			
			
		}
	}

	void output()
	{
		out.println();
		out.println("    Letter Grade Totals");
		out.println("    ===================");
		out.println("        A's = " + totalAs);
		out.println("        B's = " + totalBs);
		out.println("        C's = " + totalCs);
		out.println("        D's = " + totalDs);
		out.println("        F's = " + totalFs);
		out.println();
	}
}



