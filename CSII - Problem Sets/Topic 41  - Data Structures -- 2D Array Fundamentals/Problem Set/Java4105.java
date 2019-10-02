///////////////////////////////////////////////////////////////////////////
//
// Java4105 Write a program to read an unknown quantity of numbers from
//          a data file into a 2-D array.  The number of rows and columns
//          is unknown.
//
//          Report 1:  print the 2-dimensional array
//
//			Modify the array so that all even numbers are
//			converted to 0 and all odd numbers are converted to 1.
//
//          Report 2:  the modified array
//
//
//	DATA FILES:
//		First test file -> 	Java4105a.dat
//		Also test with  ->	Java4105b.dat
//
//   SAMPLE DATA FILE INPUT:
/*

18 42 13
38 75 84
24 81 49

*/
//
//	SAMPLE OUTPUT:
//		<== The Data File Contains ==>
//		   18   42   13
//		   38   75   84
//		   24   81   49
//
//		<==  1's and 0's  ==>
//	 	   0    0    1
//	 	   0    1    0
//	 	   0    1    1
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4105{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	private int[][] table;

	Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		String fileName = "Java4105b.dat";

		try
		{
			Scanner file = new Scanner( new File(fileName) );
			

			int rowCount = 0;
			int colCount = 0;

			// use a loop to count rows and columns here
			while( file.hasNext() )
			{
				colCount = file.nextLine().split(" ").length;
				rowCount++;
			}


			table = new int[rowCount][colCount];

			file = new Scanner( new File(fileName) );
			for(int row=0; row<table.length; row++)
				for(int col=0; col<table[0].length; col++)
					table[row][col] = file.nextInt();
		}
		catch(Exception e){}
	}

	public void run()
	{
		out.println();
		out.println("<== The Data File Contains ==>");
			output();

		oddsAndEvens();

		out.println();
		out.println("<==  1's and 0's  ==>");
			output();
		out.println();
	}

	public void oddsAndEvens()
	{
		for(int r = 0; r < table.length; r++)
		{
			for(int c = 0; c < table[0].length; c++)
			{
				if( table[r][c] % 2 == 1 )
				{
					table[r][c] = 1;
				}
				else
				{
					table[r][c] = 0;
				}
					
					
			}
		}	
		
		
	}

	public void output()
	{
		
		for(int[] row: table)
		{
			for(int col : row)
				out.print( String.format("%5d", col));
			out.println("\n");
		}	
		
	}
}




