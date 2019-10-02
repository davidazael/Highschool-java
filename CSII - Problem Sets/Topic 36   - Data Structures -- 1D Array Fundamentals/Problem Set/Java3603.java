///////////////////////////////////////////////////////////////////////////
//
// Java3603	Write a program that manually places eight(8) values as integer
//			data items into an array.  Output the numbers and their average.
//
//  MANUAL ARRAY DATA:	4
//						6
//						1
//						3
//						8
//						22
//						9
//						17
//
//	*********************THE OUTPUT MUST MATCH THIS EXACTLY! **************************
//
//   SAMPLE OUTPUT: 	The numbers are: 4  6  1  3  8  22  9  17
//						 The Average is: 8.75
//
//


import static java.lang.System.*;

public class Java3603{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	///////////////////////////////////////////////////////
	// Declare the array
	///////////////////////////////////////////////////////
	int[] values;

	public Environment()
	{
		///////////////////////////////////////////////////////
		// Construct the array (allocate memory)
		///////////////////////////////////////////////////////
		values = new int[8];
		///////////////////////////////////////////////////////
		// Populate - assign values manually
		///////////////////////////////////////////////////////
		values[0] = 4;
		values[1] = 6;
		values[2] = 1;
		values[3] = 3;
		values[4] = 8;
		values[5] = 22;
		values[6] = 9;
		values[7] = 17;

		run();
	}

	public void run()
	{
		out.print( "The numbers are: " );
		out.println( );
		for(int x=0;x<=7;x++)								
        {													
        	out.println( values[x] );	
		}													
		out.println( );
		out.println( "The average is : " + getAverage() );
		out.println( );
	}

	public double getAverage()
	{
		// total up all the numbers and return the average
		double addUp = 0;
		
		for(int i=0;i<=7;i++)								
		{													
			addUp += values[i] ;	
		}
		addUp = addUp / 8 ;													
		return addUp;		// this is just so the program will compile - change this!
	}
}


