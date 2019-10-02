///////////////////////////////////////////////////////////////////////////
//
// Java2601	There once was an old woman who lived in a shoe;
//			She had so many children she didn't know what to do;
//			So she hugged them, and fed them, and sent them to bed
//			And put them into an ArrayList to keep them straight in her head!
//
//			The old woman has nine children.  Please put them into an ArrayList
//			and print them out so she will know what to do!
//
//  		Using the add() method, populate the ArrayList to produce the
//			following output:
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE OUTPUT:
//			Here are the children who lived in a shoe:
//
//			[Mary, Molly, Timmy, Tommy, Jimmy, Pat, Angela, John, Katie]
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2601{
	public static void main (String[] args)	{
		new Problem();
}}


class Problem
{

	// ArrayList instance variable
	ArrayList<String> shoe = new ArrayList<String>();

	Problem()
	{
		populate();
		output();
	}

	void populate()
	{
		shoe.add("Mary");
		shoe.add("Molly" );
		shoe.add("Timmy");
		shoe.add("Tommy");
		shoe.add("Jimmy");
		shoe.add("Pat");
		shoe.add("Angela");
		shoe.add("John");
		shoe.add("Katie");
	}

	void output()
	{
		out.println();
		out.println("Here are the children who lived in a shoe:");
		out.println(shoe);	
		// print list

		out.println();
		out.println();
	}
}


