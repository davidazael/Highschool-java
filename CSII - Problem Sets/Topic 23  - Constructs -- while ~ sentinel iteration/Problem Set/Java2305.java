///////////////////////////////////////////////////////////////////////////
//
// Java2305	Write a program to read characters from a data file.
//			Determine how many times the letter A (upper or lower case)
//          is in the file.
//
///////////////////////////////////////////////////////////////////////////
//
//      DATA FILE NAME:  "letters01.dat"
//
// DATA FILE:  b j h G d A A I y t A F E A S y A K j f S A g a s a h J h l k j h G F D D f a D f a H g A A z
//
//              OUTPUT:  The letter 'A' occurs 12 times.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java2305{
	public static void main(String args[]){
		new Solution();
}}


class Solution
{
	Solution()
	{
		run();
	}

	void run()
	{
		int count = 0;

		try
		{
			Scanner scan = new Scanner(new File("letters01.dat"));
			
			
			while(scan.hasNext())
			{
				if(scan.next().equalsIgnoreCase("A"))
					count++;
			}
			 
			
			
	    }
		catch(Exception e){}

		out.println();
		out.println("The letter 'A' occurs "+count+" times.");
		out.println();
		out.println();
	}
}
