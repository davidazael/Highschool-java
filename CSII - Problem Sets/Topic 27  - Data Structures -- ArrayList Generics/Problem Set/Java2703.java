///////////////////////////////////////////////////////////////////////////
//
// Java2703	Create a parameterized ArrayList from a datafile called
//          "charactersa.dat".  The data file contains a variety of
//          characters.  After populating the datafile, "scrub" the
//          ArrayList by removing all non-letters from the ArrayList.
//          Display the results as shown below.  Also test with
//          "charactersb.dat".
//
//		The original List:
//		[t, h, 7, i, s, i, *, *, s, a, l, l, t, h, %, $, %, a, t, (, s, h, o, ), u, l, d
//		  , 9, r, e, $, $, m, a, i, n, #]
//		After scrubbing:
//		[t, h, i, s, i, s, a, l, l, t, h, a, t, s, h, o, u, l, d, r, e, m, a, i, n]
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Java2703{
	public static void main (String[] args){
		new Problem();
}}


class Problem
{
		// Declare ArrayList
	ArrayList<String> randomLets = new ArrayList<String>();
	

	Problem()
	{
		populate();
		out.println("The original List:");
		output();
		scrub();
		out.println("After scrubbing:");
		output();
	}

	void populate()
	{
		// Instantiate ArrayList	done up there/\
		
		try
		{
			Scanner scan = new Scanner(new File("charactersb.dat"));
		//	scan.useDelimiter( "[//s!@#$%^&*()<>?]" );
			while(scan.hasNextLine() )
			{
				randomLets.add(scan.nextLine());
			}
			// populate

		}catch(Exception e){out.println("Oops");}
	}

	void scrub()
	{
		
	}

	void output()
	{
		out.println(randomLets);
		out.println();


	}
}



