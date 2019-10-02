///////////////////////////////////////////////////////////////////////////
//
//	Java4301 Write a program that creates a 3 by 7 two dimensional
//			 array. Fill the matrix with the data shown below.
//
//				+----+----+----+----+----+----+----+
//				|  1 |  2 |  1 |  1 |  3 |  2 |  1 |
//				+----+----+----+----+----+----+----+
//				|  2 |  3 |  3 |  1 |  1 |  1 |  2 |
//				+----+----+----+----+----+----+----+
//				|  1 |  1 |  2 |  3 |  1 |  2 |  1 |
//				+----+----+----+----+----+----+----+
//
//			 Obtain from the user a single integer value.  Apply the
//			 rules of algebra, using the input data, by implementing
//			 scalar multiplication to the matrix.
//
//
//	SAMPLE OUTPUT:
//
//		   1   2   1   1   3   2   1
//		   2   3   2   1   1   1   2
//		   1   1   2   3   1   2   1
//
//		Please enter a scalar value: 5
//
//		   5  10   5   5  15  10   5
//		  10  15  10   5   5   5  10
//		   5   5  10  15   5  10   5
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java4301{
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
		int[][] matrix = populate();
		output(matrix);

		int scalar = input();

		int[][] solution = scalarMultiply( matrix, scalar );
		output(solution);
	}

	public int[][] populate()
	{
		int[][] matrix = new int[][]
		{
			{ 1, 2, 1, 1, 3, 2, 1 },
			{ 2, 3, 2, 1, 1, 1, 2 },
			{ 1, 1, 2, 3, 1, 2, 1 }
		};
		return matrix;
	}

	public int[][] scalarMultiply(int[][] t, int s)
	{
		// Complete this method

		return null;
	}

	public int input()
	{
		Scanner scan = new Scanner(System.in);
		out.print("Please enter a scalar value: ");
		int data = Integer.valueOf(scan.nextLine());
		return data;
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



