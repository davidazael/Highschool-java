///////////////////////////////////////////////////////////////////////////
//
// Java4306	Write a program that will multiply two matrices together.
//
//			For this problem we will multiply matrices that are of the
//			same size.  Use a single instance variable to store the
//			row and column size of all matrices in the problem.
//
//			The solution matrix element is the sum of the elements in the
//			row of the first matrix multiplied with the elements in the
//			column of the second matrix.
//
//		For example,
//			Find the product for cell [1][2]
//
//				row ==> 1  in first matrix
//              col ==> 2  in second matrix
//
//          +---+---+---+---+---+          +---+---+ ..... +---+---+
//          | 1 | 0 | 1 | 1 | 0 |          | 0 | 0 | : 1 : | 1 | 1 |
//          +---+---+---+---+---+          +---+---+ :...: +---+---+
//          .....................          | 0 | 1 | : 0 : | 1 | 0 |
//          : 1 : 1 : 0 : 0 : 1 :---.      +---+---+ :...: +---+---+
//          :...:...:...:...:...:   |      | 1 | 1 | : 1 : | 0 | 1 |
//          +---+---+---+---+---+   |      +---+---+ :...: +---+---+
//          | 1 | 1 | 1 | 1 | 0 |   |      | 1 | 1 | : 0 : | 1 | 0 |
//          +---+---+---+---+---+   |      +---+---+ :...: +---+---+
//          | 1 | 0 | 1 | 0 | 0 |   |      | 1 | 1 | : 1 : | 0 | 0 |
//          +---+---+---+---+---+   |      +---+---+ :...: +---+---+
//          | 1 | 1 | 0 | 1 | 0 |   |                  |
//          +---+---+---+---+---+   |                  |
//                                  V                  |
//                     +---+---+---+---+---+           |
//                     | 1 | 1 | 0 | 0 | 1 |           |
//                     +---+---+---+---+---+           |
//                               *                     |
//                     +---+---+---+---+---+           |
//                     | 1 | 0 | 1 | 0 | 1 | <---------'
//                     +---+---+---+---+---+
//		                         =
//		     (1)(1) + (1)(0) + (0)(1) + (0)(0) + (1)(1)
//                             +---+
//		                       | 2 |            cell[1][2] = 2
//                             +---+
//
//                       Solution Matrix
//                    +---+---+---+---+---+
//                    | 2 | 2.......2 | 2 |
//                    +---+--:     :--+---+
//                    | 0 | 1:  2  :<---------	cell[1][2]
//                    +---+--:     :--+---+
//                    | 2 | 3:.....:3 | 2 |
//                    +---+---+---+---+---+
//                    | 1 | 1 | 2 | 1 | 2 |
//                    +---+---+---+---+---+
//                    | 1 | 2 | 1 | 3 | 1 |
//                    +---+---+---+---+---+
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Matrix One
//		   1   0   1   1   0
//		   1   1   0   0   1
//		   1   1   1   1   0
//		   1   0   1   0   0
//		   1   1   0   1   0
//
//		Matrix Two
//		   0   0   1   1   1
//		   0   1   0   1   0
//		   1   1   1   0   1
//		   1   1   0   1   0
//		   1   1   1   0   0
//
//		Matrix Multiplication
//		   2   2   2   2   2
//		   0   1   1   2   1
//		   2   3   2   3   2
//		   1   1   2   1   2
//		   1   2   1   3   1
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;

public class Java4306{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	private int size = 5;

	public Environment()
	{
		run();
	}

	public void run()
	{
		int[][] matrixOne = getMatrix(size,size);
		out.println("Matrix One");
		output(matrixOne);

		int[][] matrixTwo = getMatrix(size,size);
		out.println("Matrix Two");
		output(matrixTwo);

		int[][] matrixSolution = multiplyMatrices( matrixOne, matrixTwo);
		out.println("Matrix Multiplication");
		output(matrixSolution);
	}

	public int[][] getMatrix( int numRows, int numCols )
	{
		int[][] working = new int[numRows][numCols];
			for(int r=0; r<working.length; r++)
				for(int c=0; c<working[0].length; c++)
					working[r][c] = (int)(Math.random()*2);
		return working;
	}

	public int[][] multiplyMatrices( int[][] m1, int[][] m2 )
	{
		// Complete this method


		return null;
	}

































	public void output(int[][] t)
	{
		for(int r=0; r<t.length; r++)
		{
			for(int c=0; c<t[0].length; c++)
				out.printf( "%4d", t[r][c] );
			out.println();
		}
		out.println();
	}
}


