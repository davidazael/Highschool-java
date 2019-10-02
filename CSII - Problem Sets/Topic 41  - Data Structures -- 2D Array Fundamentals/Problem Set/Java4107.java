///////////////////////////////////////////////////////////////////////////
//
// Java4107 Write a program to read a string from the keyboard and
//			output the string along the diagonals of a rectangle.  Use
//			a two dimensional array data structure OF CHARACTERS to store
//			the string plotted along the diagonals and then print the
//			two dimensional array.
//
//
//    SAMPLE KEYBOARD INPUT:  CANDYAPPLE
//
//	         DATA STRUCTURE:
//					+---+---+---+---+---+---+---+---+---+---+
//					| C |   |   |   |   |   |   |   |   | C |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   | A |   |   |   |   |   |   | A |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   |   | N |   |   |   |   | N |   |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   |   |   | D |   |   | D |   |   |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   |   |   |   | Y | Y |   |   |   |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   |   |   |   | A | A |   |   |   |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   |   |   | P |   |   | P |   |   |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   |   | P |   |   |   |   | P |   |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					|   | L |   |   |   |   |   |   | L |   |
//					+---+---+---+---+---+---+---+---+---+---+
//					| E |   |   |   |   |   |   |   |   | E |
//					+---+---+---+---+---+---+---+---+---+---+
//
//            SAMPLE OUTPUT:  C        C
//                             A      A
//                              N    N
//                               D  D
//                                YY
//                                AA
//                               P  P
//                              P    P
//                             L      L
//                            E        E
//
//             ACTUAL INPUT: ICECREAM
//                           CHOCOLATE
//
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4107{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	private char[][] table;
	private String data;

	Environment()
	{
		input();

		plotDiagonals();

		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.println("Please enter a single word: ");
		data = scan.nextLine();
	}

	public void plotDiagonals()
	{
		table = new char[data.length()][data.length()];

		// complete this method
	}

	public void output()
	{
		out.println();
		out.println();
		for(int row=0; row<table.length; row++)
		{
			for(int col=0; col<table[0].length; col++)
				out.print( table[row][col] );
			out.println();
		}
		out.println();
	}
}




