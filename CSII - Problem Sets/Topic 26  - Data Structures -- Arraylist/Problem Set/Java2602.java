///////////////////////////////////////////////////////////////////////////
//
// Java2602	Write a program that populates an ArrayList with 5 Doubles.
//
//  		After the list is populated, the user can choose an index for
//			any of the numbers from 0-4.  Print the element of the ArrayList
//			at that index.
//
//			HINT:  You will need to use the get() method.
//
//	  	POPULATE ARRAY:
//				10.992
//				15.23
//				12.0    (Hmm, wonder what happens if you enter a 12)
//			    8.25
//				2.599
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//				Enter an index from 0-4 ==> 3
//
//		SAMPLE OUTPUT:
//				You picked the number 8.25
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2602{
	public static void main (String[] args)	{
		new Problem();
}}


class Problem
{
	ArrayList<Double> bob = new ArrayList<Double>();
	int nums;
	
	Problem()
	{
		populate();
		input();
		output();
	}

	void populate()
	{
		bob.add(10.992);
		bob.add(15.23);
		bob.add(12.0);
		bob.add(8.25);
		bob.add(2.599);
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter an index from 0-4 ==> ");
		nums = Integer.valueOf( scan.nextLine());
		
		// enter index number
	}

	void output()
	{
		out.println();
		out.println("You picked the number " + bob.get(nums));
		out.println();
	}
}


