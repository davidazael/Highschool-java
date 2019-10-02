///////////////////////////////////////////////////////////////////////////
//
// Java4106 A treasure map is represented as a rectangular grid. The grid
//          is represented using a matrix of boolean values. If a cell in
//          the grid contains a treasure then the value true is stored in
//          the corresponding matrix location; otherwise, the value false
//          is stored.
//
//			For example, suppose that the 9 x 6 grid shown below is a 
//          treasure map where the symbol $ in a cell indicates a treasure
//          and x indicates no treasure in that cell:
/*
					   0  1  2  3  4  5  6  7  8
					0  x  $  $  x  $  x  $  x  x
					1  x  $  x  x  x  x  $  x  x
					2  x  $  x  $  $  x  x  $  $
					3  $  x  $  x  $  $  x  x  x
					4  x  $  x  x  $  x  x  $  x
					5  $  x  x  $  x  $  x  x  x
*/
//
//     Write the following TreasureMap methods:
//
//         1) hasTreasure()
//                  * returns true if there is a treasure at the location
//                    (row, col)
//                  * If (row, col) is not within the bounds of the grid
//                    or if there is no treasure at that location, hasTreasure
//                    returns false.
//         2) numAdjacent()
//                  * returns the number of treasures that are adjacent to a
//                    given location specified by row and col
//                  * To be adjacent, a treasure must be in one of the (at most)
//                    eight cells that border the given location horizontally,
//                    vertically, or diagonally
//                  * a treasure in the given location does not count as being
//                    adjacent.
//            		* DO call hasTreasure() inside this method!!
//
//   Example: (2,3) --> you found treasure, and there are 3 treasures around you
//            //(1,5) --> no treasure, but there are 4 treasures around you

///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4106{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	TreasureMap myMap = new TreasureMap();
	int row,col;

	Environment()
	{
		input();
		testHasTreasure();
		countNumAdjacent();
		myMap.output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.println("Can you find buried treasure?");
		out.print("Enter a row: ");
		row = Integer.valueOf(scan.nextLine());
		out.print("Enter a col: ");
		col = Integer.valueOf(scan.nextLine());
	}

	public void testHasTreasure()
	{
		out.println();
		if(myMap.hasTreasure(row,col))
			out.println("You found treasure!");
		else
			out.println("Sorry, no treasure at that location.");
	}

	public void countNumAdjacent()
	{
		out.println("\nThere are " + myMap.numAdjacent(row,col) + " treasures around you!");
	}


}

class TreasureMap
{

		// myGrid[r][c] being true indicates a treasure at (r, c)
	private boolean myGrid[][] = {{false, true, true, false, true, false, true, false, false},
								 {false, true, false, false, false, false, true, false, false},
								 {false, true, false, true, true, false, false, true, true},
								 {true, false, true, false, true, true, false, false, false},
								 {false, true, false, false, true, false, false, true, false},
								 {true, false, false, true, false, true, false, false, false}};


    // postcondition:	returns true if the cell at location (row, col) contains a treasure;
	// 	returns false if location (row, col) is not within the bounds of the grid
	//	or if there is no treasure at that location
	public boolean hasTreasure(int row, int col)
	{
		// complete this method
		
		return false;
	}

	// precondition:	0 <= row <= numRows; 0 <= col <= numCols
	// postcondition:	returns a count of the number of treasures in the cells adjacent to
	// the location (row, col), horizontally, vertically, and diagonally
	public int numAdjacent(int row, int col)
	{
		// complete this method

		return 0;
	}


	public void output()
	{
		out.println();
		out.println();
		out.print(" ");
		for(int x=0;x<myGrid[0].length;x++)
			out.print(String.format(" %2d",x));

		out.println();
		int x=0;
		for(boolean[] row: myGrid)
		{
			out.print(x);
			for(boolean temp: row)
				if(temp)out.print(String.format("%3s","$"));
				else out.print(String.format("%3s","x"));
			x++;out.println();
		}
		out.println();
	}

}




