///////////////////////////////////////////////////////////////////////////
//
// Java2206 Write a program that uses nested loops to create the following
//          output. HINT: The Row number must be printed BEFORE the inner
//          loop.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  none
//
//     SAMPLE OUTPUT:
//		Row 1: 1
//		Row 2: 1 2
//		Row 3: 1 2 3
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;

public class Java2206{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	public Solution()
	{
		for(int row = 1; row <= 3; row++)
		{
		out.printf("Row " + row + ":");
			for(int col = 1; col <= row; col++)
			out.print(col + " ");
		out.println();
		}
		

	}
}




