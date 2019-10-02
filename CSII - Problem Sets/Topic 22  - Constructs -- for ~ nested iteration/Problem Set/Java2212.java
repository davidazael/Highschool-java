///////////////////////////////////////////////////////////////////////////
//
// Java2212	 Write a program that uses nested loops to create the following
//          design. You CANNOT use out.print("ABC").
//
//       	(HINT: For the inner loop, try using dual counters)
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  none
//
//     SAMPLE OUTPUT:
//
//		ABC
// 		 ABC
//        ABC
//         ABC
//          ABC
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;

public class Java2212{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	public Solution()
	{
		for(int r = 1; r < 6; r++)
		{
			for(int c = 1; c < r; c++ )
			{
				out.printf("%"+r+"s", "ABC");
			}
			out.println();
		}
		

	}
}


