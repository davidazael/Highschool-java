///////////////////////////////////////////////////////////////////////////
//
// Java2217  Write a program using nested for loops to print the following
//           grid. Look closely at the pattern. Use a t-chart to help you.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter the rows ==> 6
//					   Enter the columns ==> 3
//
//     SAMPLE OUTPUT:
//
//   	2   4   6
//   	3   6   9
//   	4   8  12
//   	5  10  15
//   	6  12  18
//   	7  14  21
//
///////////////////////////////////////////////////////////////////////////
//
//      ACTUAL INPUT:  2 10
//                     8 4
//                     6 6
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;


public class Java2217{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	private int numRows;
	private int numCols;

	public Solution()
	{
		input();

	}


	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter the rows ==> ");
		numRows = scan.nextInt();
		out.print("Enter the columns ==> ");
		numCols = scan.nextInt();
		out.println();
	}
}


