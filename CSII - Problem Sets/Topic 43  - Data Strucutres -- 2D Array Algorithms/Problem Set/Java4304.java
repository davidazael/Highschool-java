///////////////////////////////////////////////////////////////////////////
//
// Java4304 Write a program to read characters from a data file into a
//			TWO DIMENSIONAL array and print the design created by the
//			characters.  By changing the direction of the loop control
//			variables, change the orientation of the design.  The
//			asterisk should appear in all four corners of the design.
//
//  Data File: Java4304.dat
//
//
//	SAMPLE DATA FILE INPUT:
//		OOO|     ~~~          .
//		OOO||====|||====-O    .
//		OOO|   -=|||=-        .
//		    Jazz is Cool      *
//-------------------------------------------------------------------
//
//	SAMPLE OUTPUT:
//		OOO|     ~~~          .
//		OOO||====|||====-O    .
//		OOO|   -=|||=-        .
//		    Jazz is Cool      *
//
//
//		    Jazz is Cool      *
//		OOO|   -=|||=-        .
//		OOO||====|||====-O    .
//		OOO|     ~~~          .
//
//
//		.          ~~~     |OOO
//		.    O-====|||====||OOO
//		.        -=|||=-   |OOO
//		*      looC si zzaJ
//
//
//		*      looC si zzaJ
//		.        -=|||=-   |OOO
//		.    O-====|||====||OOO
//		.          ~~~     |OOO
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4304{
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
		char[][] matrix  = getMatrix();
		output(matrix);

		char[][] flip    = getFlip(matrix);
		output(flip);

		char[][] reverse = getReverse(matrix);
		output(reverse);

		char[][] rotate  = getRotate(matrix);
		output(rotate);
	}

	public char[][] getMatrix()
	{
		char[][] table = null;

		try
		{
			Scanner file = new Scanner( new File("Java4304.dat") );
			int rowCount = 0;
			int colCount = 0;
			while(file.hasNextLine())
			{
				colCount = file.nextLine().length();
				rowCount++;
			}

			file = new Scanner( new File("Java4304.dat") );
			table = new char[rowCount][colCount];
			for(int r=0; r<table.length; r++)
			{
				String data = file.nextLine();
				for(int c=0; c<data.length(); c++)
					table[r][c] = data.charAt(c);
			}
		}
		catch(Exception e){}

		return table;
	}

	public char[][] getFlip( char[][] m )
	{

		// Complete this method


		return null;
	}

	public char[][] getReverse( char[][] m )
	{
		// Complete this method


		return null;
	}

	public char[][] getRotate( char[][] m )
	{
		// Complete this method


		return null;
	}

	public void output(char[][] t)
	{
		for(char[] r: t)
		{
			for(char e: r)
				out.print( e );
			out.println();
		}
		out.println();
	}
}




