///////////////////////////////////////////////////////////////////////////
//
// Java2306	Write a program to read characters from a data file.
//			Build a String from the characters, but with the consonants
//          uppercase. For ALL other characters, add an '*' to the new
//          String.  The new String will be displayed AFTER the completion
//          of the loop.
//
//		    The amount of characters contained in the data file is unknown.
//
//			Sample data file is Java5006a.dat
//
///////////////////////////////////////////////////////////////////////////
//
//  DATA FILE NAME: "characters01.dat"
//
//       DATA FILE:	c
//					o
//					m
//					p
//					u
//					< etc >
//
//	 SAMPLE OUTPUT: C*MP*T*RSC**NC*
//
///////////////////////////////////////////////////////////////////////////
//
//  	For different test data,
//			TEST YOUR PROGRAM WITH DATA FILE "characters02.java"
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java2306{
	public static void main(String args[]){
		new Solution();
}}


class Solution
{
	String buildString;
	Solution()
	{
		run();
	}

	void run()
	{
		String buildString = "";

		try
		{
			Scanner scan = new Scanner(new File("characters01.dat"));
			while( scan.hasNext() )
			{
				buildString = scan.nextLine().replace("u","*").replace("e","*").replace("i","*");
				out.print(buildString);	
			}
	    }
		catch(Exception e){}

		out.println();
		out.println();
		out.println();
		out.println();
	}
}



