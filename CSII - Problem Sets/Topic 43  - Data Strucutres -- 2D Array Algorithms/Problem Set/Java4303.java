///////////////////////////////////////////////////////////////////////////
//
// Java4303 Write a program that creates two 3 by 8 two dimensional
//			arrays. Fill each matrix with random integer data within
//			the range of 100 to 200.
//
//			Apply the rules of algebra, using the two matrices, by
//			implementing matrix subtraction.  In matrix subtraction
//			the cell in the second matrix is subtracted from the
//			corresponding cell in the first matrix.
//
//		For example,
//			matrixSolution[1][1] = matrixOne[1][1] - matrixTwo[1][1]
//				etc.....
//
//	SAMPLE OUTPUT:
//
//		Matrix One
//		 124 145 136 191 185 181 158 112
//		 100 196 187 124 166 144 167 161
//		 114 127 101 182 114 168 106 170
//
//		Matrix Two
//		 166 148 157 155 130 141 115 177
//		 101 101 172 165 108 191 106 193
//		 100 124 191 128 163 149 124 190
//
//		Matrix Subtraction
//		 -42  -3 -21  36  55  40  43 -65
//		  -1  95  15 -41  58 -47  61 -32
//		  14   3 -90  54 -49  19 -18 -20
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;

public class Java4303{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	public Environment()
	{
		run();
	}

	public void run()
	{
		int[][] matrixOne = getMatrix(3,8);
		out.println("Matrix One");
		output(matrixOne);

		int[][] matrixTwo = getMatrix(3,8);
		out.println("Matrix Two");
		output(matrixTwo);

		int[][] matrixSolution = subtractMatrices( matrixOne, matrixTwo);
		out.println("Matrix Subtraction");
		output(matrixSolution);
	}

	public int[][] getMatrix( int numRows, int numCols )
	{
		int[][] working = new int[numRows][numCols];
			for(int r=0; r<working.length; r++)
				for(int c=0; c<working[0].length; c++)
					working[r][c] = (int)(Math.random()*100+100);
		return working;
	}

	public int[][] subtractMatrices( int[][] m1, int[][] m2 )
	{
		// Complete this method


		return null;
	}

	public void output(int[][] t)
	{
		for(int[] row: t)
		{
			for(int element: row)
				out.printf( "%4d", element );
			out.println();
		}
		out.println();
	}
}




