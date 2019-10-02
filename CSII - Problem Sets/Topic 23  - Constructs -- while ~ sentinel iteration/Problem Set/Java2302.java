///////////////////////////////////////////////////////////////////////////
//
// Java2302	Write a program that calculates the sum of the following
//			sequence using a loop control variable:
//
//				1, 4, 7, 10, 13, 16, 19, ...  34
//
//			REQUIRED LOOP:  	while(boolean expression)
//
//	SAMPLE OUTPUT:
//		Sequence --> 1 4 7 10 13 16 19 22 25 28 31 34
//		Sum      --> 210
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2302{
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
        int x=1;
        int sum=0;

		out.print("Sequence --> ");

		// while loop here
		while ( x < 34 ) 
		{			
			x+=3;
			sum += x;
			
		out.print(x + ", ");
		}
		




		out.println();
		out.print("Sum      --> " + sum);
		out.println();
		out.println();
	}
}












