///////////////////////////////////////////////////////////////////////////
//
// Java4103 Write a program that creates an 8 by 5 matrix of random
//          numbers for 1000 to 9999.  Display the matrix using an
//          ENHANCED for loop.
//
//
//	SAMPLE OUTPUT:
//		   7996   2799   2006   2419   1147
//		   7661   5383   8428   6487   3961
//		   2799   8789   6948   8584   8634
//		   7462   5051   4942   5378   1028
//		   9978   1533   7657   4240   7894
//		   6183   6277   9629   2996   8240
//		   8985   9712   3922   2589   5323
//		   8152   4612   6563   9460   3045
//
//  	Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;

public class Java4103{
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
		table = new int[8][5];

		// complete this method
		
		for(int r = 0; r < table.length; r++)
		{
			for(int c = 0; c < table[0].length; c++)
				table[r][c] = (int)(Math.random()*9000+1000);
		}
		
		
	}

	public void output()
	{
		out.println();

		// complete this method using an ENHANCED for loop
		for(int r = 0; r < table.length; r++)
		{
			for(int c = 0; c < table[0].length; c++)
				out.print( String.format("%2d", table[r][c]) + " "  );
			out.println("\n");
		}

		out.println();
		out.println();
	}
}



