///////////////////////////////////////////////////////////////////////////
//
// Java2603	Write a program that populates an ArrayList with six integers
//			using the add() method.  Print the list.  Then allow the user
//			to enter an index of an element followed by a new element to
//			replace the old element.  Use the set() method to replace
//			the old element and display the new improved list.
//
///////////////////////////////////////////////////////////////////////////
//
//		SAMPLE INPUT AND OUTPUT:
//			The numbers are: [12, -15, 300, -6, 20, 10, -100]
//
//			Enter an index from 0-6 ==> 3
//			What is the new element ==> 7
//
//			The numbers are: [12, -15, 300, 7, 20, 10, -100]
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2603{
	public static void main (String[] args)	{
		new Problem();
}}


class Problem
{
	ArrayList<Integer> ints = new ArrayList<Integer>();
	int index, elements;
	
	
	Problem()
	{
		populate();		// <-------------------------+
		output();		//       NOTICE THE ORDER    |
		input();		//            OF   			 |
		process();		//       THE METHOD CALLS!   |
		output();		// <-------------------------+
	}

	void populate()
	{
		ints.add(12);
		ints.add(-15);
		ints.add(300);
		ints.add(-6);
		ints.add(20);
		ints.add(10);
		ints.add(-100);

	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter an index from 0-6 ==> ");
		index = Integer.valueOf( scan.nextLine());
		out.print("What is the new element ==> ");
		elements = Integer.valueOf( scan.nextLine());
		
	}

	void process()
	{
		ints.set(index,elements);		
	}

	void output()
	{
		out.println();
		out.println("The numbers are: " + ints);

		out.println();
	}
}


