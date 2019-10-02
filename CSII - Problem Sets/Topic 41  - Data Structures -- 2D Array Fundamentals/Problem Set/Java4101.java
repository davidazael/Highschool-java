///////////////////////////////////////////////////////////////////////////
//
// Java4101	Write a program that populates and prints the values
//         	shown in the sample output in a 3-by-7 table. Below
//          is a chart representing each row and column to help
//          you determine the values in the matrix.
//
//          Use an INDEXED for loop to display the matrix.
//
//				+-----+-----+-----+-----+-----+-----+-----+
//				| 0,0 | 0,1 | 0,2 | 0,3 | 0,4 | 0,5 | 0,6 |
//				+-----+-----+-----+-----+-----+-----+-----+
//				| 1,0 | 1,1 | 1,2 | 0,3 | 1,4 | 1,5 | 1,6 |
//				+-----+-----+-----+-----+-----+-----+-----+
//				| 2,0 | 2,1 | 2,2 | 2,3 | 2,4 | 2,5 | 2,6 |
//				+-----+-----+-----+-----+-----+-----+-----+
//
//	SAMPLE OUTPUT:
//
//   0    1    2    3    4    5    6
//   1    2    3    4    5    6    7
//   2    3    4    5    6    7    8
//
//
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;

public class Java4101{
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
		table = new int[3][7];
				
		int n = 0;
		
		out.println( table.length );				// testing
		out.println( table[0].length );
		
		
		for (int r = 0; r < table.length; r++) 
		{
			n = r;
				for (int c = 0; c < table[0].length; c++)
				{
					table[r][c] = n++;
				}					
		}
	}

	public void output()
	{
		out.println("\n");

		// complete this method using INDEXED for loops
		
		for (int r = 0; r < table.length; r++) 
		{
			for (int c = 0; c < table[0].length; c++)
				out.print( String.format("%4d",table[r][c]) );
			
			out.println("\n");

		}
		out.println();
		out.println();
	}
}


