///////////////////////////////////////////////////////////////////////////
//
// Java2301 Write a program to create the alternating infinite sequence
//
//				-1, 2, -4, 8, -16, 32, ...
//
//			Use an if...break statement to terminate the sequence when
//          the absolute value of the lcv is greater than 500.  The
//          sequence should begin with -1.
//
//			REQUIRED LOOP:  	while(true)
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2301{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	Solution()
	{
		run();
	}

	void run()
	{
		/* ??? */
		int i = -1;

		while(true  )
		{
			if( i > 500 )
				break;

			out.print(i + ", ");
			i*=-2;
		}

		out.println();
		out.println();
	}
}










