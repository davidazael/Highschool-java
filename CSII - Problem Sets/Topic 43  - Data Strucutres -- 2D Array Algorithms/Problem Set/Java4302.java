///////////////////////////////////////////////////////////////////////////
//
// Java4302 Write a program that creates two 4 by 5 two dimensional
//			arrays. Fill each matrix with random integer data within
//			the range of 25 to 45.
//
//			Apply the rules of algebra, using the two matrices, by
//			implementing matrix addition.  In matrix addition corresponding
//			cells are added togather.
//
//		For example,
//			matrixSolution[1][1] = matrixOne[1][1] + matrixTwo[1][1]
//				etc.....
//
//	SAMPLE OUTPUT:
//
//		Matrix One
//		  57  61  49  68  26
//		  64  43  55  60  49
//		  60  59  54  63  42
//		  31  54  37  74  29
//-
//		Matrix Two
//		  63  50  61  72  66
//		  32  66  25  58  59
//		  48  65  33  61  27
//		  36  53  33  35  46
//
//		Matrix Addition
//		 120 111 110 140  92
//		  96 139  80 118 108
//		 108 124  87 124  69
//		  67 107  70 109  75
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;

public class Java4302{
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
		int[][] matrixOne = getMatrix(4,5);
		out.println("Matrix One");
		output(matrixOne);

		int[][] matrixTwo = getMatrix(4,5);
		out.println("Matrix Two");
		output(matrixTwo);

		int[][] matrixSolution = addMatrices( matrixOne, matrixTwo);
		out.println("Matrix Addition");
		output(matrixSolution);
	}

	public int[][] getMatrix( int numRows, int numCols )
	{
		int[][] working = new int[numRows][numCols];
			for(int r=0; r<working.length; r++)
				for(int c=0; c<working[0].length; c++)
					working[r][c] = (int)(Math.random()*50+25);
		return working;
	}

	public int[][] addMatrices( int[][] m1, int[][] m2 )
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



