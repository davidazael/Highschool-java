///////////////////////////////////////////////////////////////////////////
//
// Java4104 Write a program that reads an integer 2-dimensional matrix
//          from a data file.  The data file is 8 x 4. Display the matrix
//          using an enhanced for loop.
//
//   Data File:  Java4104.dat
//
//   SAMPLE DATA FILE INPUT:
/*

45 18 53 122
6 234 65 82
34 764 2 65
13 26 78 276
39 54 415 26
170 9 263 61
61 63 7 173
4 531 65 41

*/
//
//	SAMPLE OUTPUT:
//		   45   18   53  122
//		    6  234   65   82
//		   34  764    2   65
//		   13   26   78  276
//		   39   54  415   26
//		  170    9  263   61
//		   61   63    7  173
//		    4  531   65   41
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4104{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	private int[][] table;

	Environment()
	{
		populate();
		output();
	}

	public void populate()
	{
		try
		{
			Scanner file = new Scanner( new File("Java4104.dat") );

			// complete this method
			int rCount = 0;
			int cCount = 0;
			while(file.hasNext())
			{
				cCount = file.nextLine().split(" ").length;
				rCount++;
			}
					
			table = new int[rCount][cCount];
			
			
			file = new Scanner( new File("Java4104.dat") );
			for(int r = 0; r < table.length; r++)
				for(int c = 0; c < table[0].length; c++)
					table[r][c] = Integer.valueOf( file.next() );			
		}
		catch(Exception e){}
	}

	public void output()
	{
		out.println();

		// complete this method using an ENHANCED for loop
		for(int[] row: table)
		{
			for(int colum: row)
				out.print( String.format("%5d",colum) );
			out.println("\n");
		}
		out.println();
		out.println();
	}
}



