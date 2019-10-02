///////////////////////////////////////////////////////////////////////////
//
// Java4305 A magic square is a square array of numbers such that
//			the values of each row and column, and the main diagonals,
//			have the same sum.  Write a program to read a square array
//			of numbers from a data file and determine whether it is
//			a magic square.
//
//			Write a method that inspects an n by n magic square,
//			and returns true if it passes the magic square test and
//			false otherwise.
//
//    Data File:
//		Java4305a.dat
//		Java4305b.dat
//		Java4305c.dat
//		Java4305d.dat
//		Java4305e.dat
//
//    SAMPLE DATA FILE INPUT:
//         3  3  6
//         7  4  1
//         2  5  5
//
//    SAMPLE OUTPUT:
//         The data file contains:
//           3  3  6
//           7  4  1
//           2  5  5
//
//         This data IS a magic square.
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4305{
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
		int[][] matrix = getMatrix();
		out.println("The data file contains:");
		output(matrix);

		boolean result = isMagicSquare( matrix );

		if(result)
			out.println("This data IS a magic square.");
		else
			out.println("This data IS NOT a magic square.");
		out.println();
	}

	public int[][] getMatrix()
	{
		int[][] table    = null;
		String  fileName = "Java4305a.dat";

		try
		{
			Scanner file = new Scanner( new File(fileName) );
			int rowCount = 0;
			int colCount = 0;
			while(file.hasNextLine())
			{
				colCount = file.nextLine().split(" ").length;
				rowCount++;
			}

			file = new Scanner( new File(fileName) );
			table = new int[rowCount][colCount];
			for(int r=0; r<table.length; r++)
				for(int c=0; c<table[0].length; c++)
					table[r][c] = file.nextInt();
		}
		catch(Exception e){}
		return table;
	}

	public boolean isMagicSquare(int[][] table)
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



