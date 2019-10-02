///////////////////////////////////////////////////////////////////////////
//
// Java4102	Write a program that stores and prints the numbers
//         	from 1 to 21 in a 3-by-7 table.
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
//	 1    2    3    4    5    6    7
//	 8    9   10   11   12   13   14
//	15   16   17   18   19   20   21
//
//
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;

public class Java4102{
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

		// complete this method
		int n = 1;
		
		for (int r = 0; r < table.length; r++) 
		{
				for (int c = 0; c < table[0].length; c++)
				{
					table[r][c] = n++;
				}					
		}
	}

	public void output()
	{
		out.println();

		// complete this method using an INDEXED for loop
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


