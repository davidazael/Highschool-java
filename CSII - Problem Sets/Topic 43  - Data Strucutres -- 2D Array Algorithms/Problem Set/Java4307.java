///////////////////////////////////////////////////////////////////////////
//
// Java4307 Write a program that ask the user for the index of a row
//          they wish to insert.  Insert the correct row, randomly create
//          data to fill the new row and display the resulting matrix.
//
//   Data File:  Java4307.dat
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Matrix One
//		    3.650    0.600   98.100   54.300    6.000
//		   81.450   31.000    5.500  123.000   38.450
//		    0.200   65.320    9.000   10.010   17.230
//		   36.700   43.000    2.700  524.300    0.435
//
//		Please enter a row to insert: 2
//		[400.595, 344.774, 84.864, 481.589, 28.499]
//
//		Matrix with added row
//		    3.650    0.600   98.100   54.300    6.000
//		   81.450   31.000    5.500  123.000   38.450
//		  400.595  344.774   84.864  481.589   28.499
//		    0.200   65.320    9.000   10.010   17.230
//		   36.700   43.000    2.700  524.300    0.435
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4307{
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

		int targetRow = getTargetRow();
		double[] rowData = getRowData(matrixOne[0].length);
		double[][] matrixSolution = addRow( matrixOne, targetRow, rowData);

		out.println();
		out.println("Matrix with added row");
		output(matrixSolution);
	}

	public double[][] getMatrix()
	{
		double[][] table    = null;
		String  fileName = "Java4307.dat";

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

	public int getTargetRow()
	{
		Scanner scan = new Scanner(System.in);
		out.print("Please enter a row to insert: ");
		int data = Integer.valueOf(scan.nextLine());
		return data;
	}

	public double[] getRowData( int len )
	{
		double[] working = new double[len];
		for(int x=0; x<len; x++)
			working[x] = (int)(Math.random()*500000)/1000.0;
		out.println(Arrays.toString(working));
		return working;
	}

	public double[][] addRow( double[][] matrix, int row, double[] data)
	{
		double[][] working = new double[matrix.length+1][matrix[0].length];

			for(int r=0; r<row; r++)
				arraycopy(matrix[r],0,working[r],0,matrix[r].length);
			arraycopy(data,0,working[row],0,working[row].length);
			for(int r=row; r<matrix.length; r++)
				arraycopy(matrix[r],0,working[r+1],0,matrix[r].length);

		return working;
	}

	public void output(double[][] t)
	{
		for(int r=0; r<t.length; r++)
		{
			for(int c=0; c<t[0].length; c++)
				out.printf( "%9.3f", t[r][c] );
			out.println();
		}
		out.println();
	}
}


