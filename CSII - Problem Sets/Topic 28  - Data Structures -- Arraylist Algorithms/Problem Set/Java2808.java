///////////////////////////////////////////////////////////////////////////
//
// Java2808	Write a program that generates 10 random whole numbers between 20
//			and 28(inclusive) and puts them into an ArrayList.  Use an indexed
//			for() loop and the add() method to populate the list.
//
//			Print the list.  Then use the enhanced for() loop to count the even
//			numbers in the list.
//
//			ARRAYLIST ELEMENTS:  10 random integers between 20-28 (inclusive)
//
///////////////////////////////////////////////////////////////////////////
//
//			SAMPLE OUTPUT:
//
//	 10 random numbers between 20-28: [22, 20, 24, 20, 22, 28, 24, 23, 27, 21]
//
//	 There were 7 even numbers in the list.
//
///////////////////////////////////////////////////////////////////////////
//
//		WARNING:  Execute your program several times and double check to
//		          be sure the random numbers are within the given range!
//
//		REMINDER:  how to use Math.random() method to generate a number
//		within a given range:
//
//	    To generate a number between (as an example) 10 and 20, first
//		you must find a range:
//			(High - Low + 1):  (20-10+1) = 11 numbers from 10 to 20
//										   (inclusive).
//
//		Now that you have the range, MULTIPLY the RANGE by the
//		Math.random() number generated:
//			    Math.random() * 11       gives you x.xxxxxxxxxxxx
//
//      Add back the LOW value to keep the number within the range from
//		10 to 20.  Now the formula would look something like this:
//				Math.random() * 11 + 10  gives you xx.xxxxxxxxxxxx
//
//		You don't need the decimal anymore, just the whole number portion,
//	    so typecast it with (int).
//				(int)(Math.random() * 11 + 10).
//
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2808{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	ArrayList<Integer> nums = new ArrayList<Integer>();
	int count;

	Solution()
	{
		populate();
		process();
		output();
	}

	void populate()
	{
		for (int i = 0; i < 10; i++)
		{
			nums.add((int)(Math.random()*8 + 20 ) );
			
		}
		
	}

	void process()
	{
		for (int i = 0; i < nums.size(); i++)
		{
				if( nums.get(i) % 2 == 0 )
				{
					count++;									
				}
			
		}
	
	}
	void output()
	{
		out.println();
		out.print("10 random numbers between 20-28: " + nums );
		out.println("\n\nThere were " + count + " even numbers in the list.");
		out.println();
	}
}



