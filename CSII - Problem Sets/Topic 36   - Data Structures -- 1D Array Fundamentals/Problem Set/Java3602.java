///////////////////////////////////////////////////////////////////////////
//
// Java3602	Write a program that manually places five(5) names as string
//			data items into an array.  Output the names in a column,
//			both forwards and backwards, using loops.
//
//  MANUAL INPUT DATA: 	Larry
//                    	Moe
//                    	Curly
//                    	Daffy Duck
//                    	Bugs Bunny
//
//      SAMPLE OUTPUT:
//                      NAMES (forwards)
//                      ====================
//                      Larry
//                      Moe
//                      Curly
//                      Daffy Duck
//                      Bugs Bunny
//
//                      NAMES (backwards)
//                      ====================
//                      Bugs Bunny
//                      Daffy Duck
//                      Curly
//                      Moe
//                      Larry
//
//

import static java.lang.System.*;
import java.util.*;

public class Java3602{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	///////////////////////////////////////////////////////
	// Declare the array
	///////////////////////////////////////////////////////
	String[] names;

	public Environment()
	{
		///////////////////////////////////////////////////////
		// Construct the array (allocate memory)
		///////////////////////////////////////////////////////
		names = new String[5]; 
		

		///////////////////////////////////////////////////////
		// Populate - assign values manually
		///////////////////////////////////////////////////////
		names[0] = "Larry";
		names[1] = "Moe";
		names[2] = "Curly";
		names[3] = "Daffy Duck";
		names[4] = "Bugs Bunny";


		run();
	}

	public void run()
	{
		///////////////////////////////////////////////////////
		// loop to print names forwards (vertically)
		///////////////////////////////////////////////////////
		out.println( "NAMES (forwards)"     );
		out.println( "====================" );
		for (int i = 0; i < 5; i++) 
			{
				out.println(names[i]);				
	    	}
		out.println( );
		out.println( );

		///////////////////////////////////////////////////////
		// loop to print names forwards (vertically)
		///////////////////////////////////////////////////////
		out.println( "NAMES (backwards)"    );
		out.println( "====================" );
		for (int x = 4; x >= 0; x--) 
			{
				out.println(names[x]);				
	    	}
		out.println( );
		out.println( );
	}
}

