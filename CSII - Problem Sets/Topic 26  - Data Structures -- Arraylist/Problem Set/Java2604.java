///////////////////////////////////////////////////////////////////////////
//
// Java2604	 Write a program to populate an ArrayList with a minimum of
//			 10 Doubles.  Then allow the user to enter an index followed
//			 by an element.  Print a message to the user as to whether
//			 the element was located in the position they entered.
//
//		 Use these numbers in your list:
//           45.277, 21.8, -6.3, 26.86, 367.82, -12.6, 27.899, 6.8, -4.0, 10.3
//
///////////////////////////////////////////////////////////////////////////
//
//		 SAMPLE INPUT:
//			 What are you looking for ==> 21.8
//
//		 SAMPLE OUTPUT:
//			   21.8 is in position 1
//
///////////////////////////////////////////////////////////////////////////
//
//		 SAMPLE INPUT:
//			 What are you looking for ==> -6.5
//
//		 SAMPLE OUTPUT:
//			   -6.5 is NOT in this list.
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.awt.*;

public class Java2604{
	public static void main (String[] args)	{
		new Problem();
}}


class Problem
{
	ArrayList<Double> ints = new ArrayList<Double>();
	double nums;
	String result;

	Problem()
	{
		populate();
		input();
		output();
	}

	void populate()
	{
		ints.addAll(Arrays.asList(45.277, 21.8, -6.3, 26.86, 367.82, -12.6, 27.899, 6.8, -4.0, 10.3));
	}

	void input()
	{
		Scanner scan = new Scanner(in);	
		out.print(" What are you looking for ==> " );	
		nums = Double.valueOf(scan.nextLine());
			for (int i = 0; i< ints.size(); i++) 
			{
				if( nums == ints.get(i) )
				{
					result = nums + " is in position " + i ;
					break;
				}		
				else
					result = nums + " is NOT in the list." ;
						
			}
		
	}

	void output()
	{
			
		out.println(result);			
		out.println(ints);			

	}
}


