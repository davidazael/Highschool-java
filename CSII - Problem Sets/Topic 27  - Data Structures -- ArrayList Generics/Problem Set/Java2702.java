///////////////////////////////////////////////////////////////////////////
//
// Java2702 Create a parameterized ArrayList from a datafile called
//          "numbersa.dat".  Print the list, and find the smallest item
//          in the list.  Also test your program with "numbersb.dat".
//
//	The list: [24, 72, 45, 87, 1, 7, 2, -6, 5, 0, 34, 9, 35, -1, 105, 302, 7, 7]
//	The smallest in the list is -6
//
//  HINT: This is considered a classic algorithm.
//            * Assume the 0th element is the smallest and assign
//              it to a variable.
//            * Next, starting from the 1st element, go through all
//              remaining elements in the list.
//            * If you find an element smaller than the smallest one
//              you've found so far, assign it to your variable.
//            * After you've searched the entire list, your variable
//              contains the smallest number.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Java2702{
	public static void main (String[] args){
		new Problem();
}}


class Problem
{
	ArrayList<Integer>list;
	int smallest;

	Problem()
	{
		populate();
		process();
		output();
	}

	void populate()
	{
		list = new ArrayList<Integer>();
		try
		{
			// populate ArrayList
			Scanner scan = new Scanner(new File("numbersa.dat"));
			
			while(scan.hasNextLine())
			{
				list.add(scan.nextInt());
			}

		}catch(Exception e){out.println("Oops");}
	}
	void process()
	{
		
		for (int i = 0; i < list.size()-1 ; i++) 
			{
				smallest = Math.min(smallest, list.get(i));				
			}
		


	}

	void output()
	{
		out.println("The list is: " + list);
		out.println("The smallest number in the list is --> " + smallest);
		out.println();

	}
}



