///////////////////////////////////////////////////////////////////////////
//
// Java4308 Write a program that ask the user for the index of a col
//          they wish to insert.  Insert the correct col, randomly create
//          data to fill the new col and display the resulting matrix.
//
//   Data File:  Java4308.dat
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Matrix One
//		   25.5   96.1   87.5   31.1
//		   94.5   79.2   31.4   62.5
//		   10.5   46.2   64.5   67.4
//
//		Please enter a col to insert: 2
//		[6.5, 12.2, 48.6]
//
//		Matrix with added row
//		   25.5   96.1    6.5   87.5   31.1
//		   94.5   79.2   12.2   31.4   62.5
//		   10.5   46.2   48.6   64.5   67.4
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4308{
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
		double[][] matrixOne = getMatrix();
		out.println("Matrix One");
		output(matrixOne);

		int targetCol = getTargetCol();
		double[] colData = getColData(matrixOne.length);
		double[][] matrixSolution = addCol( matrixOne, targetCol, colData);

		out.println();
		out.println("Matrix with added row");
		output(matrixSolution);
	}

	public double[][] getMatrix()
	{
		double[][] table    = null;
		String  fileName = "Java4308.dat";

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
			table = new double[rowCount][colCount];
			for(int r=0; r<table.length; r++)
				for(int c=0; c<table[0].length; c++)
					table[r][c] = file.nextDouble();
		}
		catch(Exception e){}
		return table;
	}

	public int getTargetCol()
	{
		Scanner scan = new Scanner(System.in);
		out.print("Please enter a col to insert: ");
		int data = Integer.valueOf(scan.nextLine());
		return data;
	}

	public double[] getColData( int len )
	{
		double[] working = new double[len];
		for(int x=0; x<len; x++)
			working[x] = (int)(Math.random()*500)/10.0;
		out.println(Arrays.toString(working));
		return working;
	}

	public double[][] addCol( double[][] matrix, int col, double[] data)
	{
		// Complete this method


		return null;
	}

	public void output(double[][] t)
	{
		for(int r=0; r<t.length; r++)
		{
			for(int c=0; c<t[0].length; c++)
				out.printf( "%7.1f", t[r][c] );
			out.println();
		}
		out.println();
	}
}

