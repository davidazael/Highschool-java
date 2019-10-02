///////////////////////////////////////////////////////////////////////////
//
// Java4108 Write a program that allows the user to enter an alter value.
//          The value entered will change an original matrix to an altered
//          matrix.  Create the loops for the alter() method.  The pattern
//          is shown below for 2 alter values as an example.
//
//  HINT: Use a dynamic starting value for your inner loop.
//
//-------------------------------------------------------------------------
//  EXAMPLE 1:
//
//		1 3 5 7
//		2 4 6 8
//		3 5 7 9
//
//		Enter alter value: 1
//
//		3 5 7 7
//		4 6 8 8
//		5 7 9 9
//-------------------------------------------------------------------------
//  EXAMPLE 2:
//
//		1 3 5 7
//		2 4 6 8
//		3 5 7 9
//
//		Enter alter value: 2
//
//		1 5 7 7
//		2 6 8 8
//		3 7 9 9
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4108{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	int[][] mat = {
						{ 1,3,5,7 },
						{ 2,4,6,8 },
						{ 3,5,7,9 }
	  			   };

	Environment()
	{
		Scanner scan = new Scanner(in);
		output();
		out.print("Enter alter value: ");
		alter(Integer.valueOf(scan.nextLine()));
		output();
	}

	public void alter(int c)
	{
		// complete this method
	}

	public void output()
	{
		out.println();
		for(int[] temp: mat)
		{
			for(int e: temp)
				out.print(e + " ");
			out.println();
		}
		out.println();
		out.println();
	}
}




