///////////////////////////////////////////////////////////////////////////
//
// Java3601	Write a program that manually through assignment places
//			six(6) values as double	data items into an array.
//			Output the values in the original order using a for loop.
//
//           BE SURE TO LABEL THE OUTPUT!!
//
//  MANUAL INPUT DATA:	3.4
//						5.1
//						6.7
//						2.9
//						5.7
//						8.3
//
//      SAMPLE OUTPUT:  Original Order:
//                   	3.4  5.1  6.7  2.9  5.7  8.3
//
//

import static java.lang.System.*;
import java.util.*;

public class Java3601{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	///////////////////////////////////////////////////////
	// Declare the array
	///////////////////////////////////////////////////////
	double[] scores;

	public Environment()
	{
		///////////////////////////////////////////////////////
		// Construct the array (allocate memory)
		///////////////////////////////////////////////////////
		scores	= new double[6];

		///////////////////////////////////////////////////////
		// Populate - assign values manually
		///////////////////////////////////////////////////////
		scores[0] = 3.4;
		scores[1] = 5.1;
		scores[2] = 6.7;
		scores[3] = 2.9;
		scores[4] = 5.7;
		scores[5] = 8.3;
		run();
	}

	public void run()
	{
		///////////////////////////////////////////////////////
		// Display the data horizontally using a loop
		///////////////////////////////////////////////////////
		out.println( "Original Order:" );
		for (int i = 0; i < 6; i++) 
			{
				out.print( scores[i] + "  ");
	    	}

		out.println();
	}
}
