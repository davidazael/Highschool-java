///////////////////////////////////////////////////////////////////////////
//
// Java2204 Use nested for loops to write a program to print the following
//          chart.  Look at the relationship of the numbers to determine
//          your code segments.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  none
//
//     SAMPLE OUTPUT:
//   	2   4   6   8  10
//   	3   6   9  12  15
//   	4   8  12  16  20
//   	5  10  15  20  25
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;

public class Java2204{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	public Solution()
	{
		for(int row = 2; row < 6; row++)
		{
			out.print(row + " ");
			for(int col = row*2; col <= row*5; col+= row*row)
				out.print(col + " " );
			out.println();
		}
	}
}



