///////////////////////////////////////////////////////////////////////////
//
// Java2605  You've been hired by the FBI to create a random name generator
//			 for creating a new identify (an alias) for the Witness
//			 Protection Program.  Populate TWO different arrayLists.  The
//			 first list should be an array of 10 possible first names.
//			 The second list should be an array of 5 possible last names.
//
//			 Randomly generate two indices:  The first index should be
//			 based on the size of the first list, and the second should be
//			 based on the size of the second list.
//
//			 Based upon these random indices and the two lists, generate
//			 an alias for the person going into the Witness Protection program.
//
///////////////////////////////////////////////////////////////////////////
//
//		 SAMPLE INPUT:  none
//
//		 SAMPLE OUTPUT: (Several are shown because every time you run the
//					     program it will generate a random combination).
//
//				Welcome to the witness protection program!
//				Your new alias is Jennifer Lewis
//
//				Welcome to the witness protection program!
//				Your new alias is Emily Hall
//
//				Welcome to the witness protection program!
//				Your new alias is Jacob Smith
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2605{
	public static void main (String[] args)	{
		new Problem();
}}


class Problem
{

	Problem()
	{
		populate();
		process();
		output();
	}

	void populate()
	{

	}

	void process()
	{

	}

	void output()
	{
		out.println("Welcome to the witness protection program!");
		out.println("Your new alias is " + ??? + " " + ???);
	}
}


