///////////////////////////////////////////////////////////////////////////
//
// Java2209 Write a program that uses nested loops to create the following
//          pattern.
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE INPUT:  none
//
//     SAMPLE OUTPUT:
//		234567
//		34567
//		4567
//		567
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;

public class Java2209{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	Solution()
	{
		for (int r = 1; r < 5; r++)
		{
			for(int c = r+1 ; c < 8; c++)
			{
				out.print(c);
			}
			out.println();			
		}


	}
}


