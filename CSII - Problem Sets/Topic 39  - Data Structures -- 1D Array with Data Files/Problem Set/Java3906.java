///////////////////////////////////////////////////////////////////////////
//
// Java3906 Read in  an unknown number of doubles from a data file.
//			Physically round all the numbers to 1 decimal place.
//			DO NOT USE STRING.FORMAT() TO ROUND.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java3906a.dat
//		Also test with  ->	Java3906b.dat
//
//	SAMPLE OUTPUT:
//  	ORIGINAL STRING:
//  	[-5.66, 3.44, 6.8987, 1.001, -4.1924, 5.4333, 1.3, 2.43582435, -6.74, 2.3152]
//
//  	AFTER FORMATTING:
//  	[-5.7, 3.4, 6.9, 1.0, -4.2, 5.4, 1.3, 2.4, -6.7, 2.3]
//
//  	Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3906{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private double[] numbers;

	public Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		try
		{
		
		}catch(Exception e){}
	}

	public double[] processList(double[] list)
	{
		

		return null;
	}

	public void run()
	{
		out.println("ORIGINAL STRING: ");
		out.println( Arrays.toString(numbers) );
		out.println();

		numbers = processList(numbers);

		out.println("AFTER FORMATTING: ");
		out.println( Arrays.toString(numbers) );
		out.println();
	}
}
