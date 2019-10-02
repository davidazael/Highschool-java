///////////////////////////////////////////////////////////////////////////
//
// Java2109	Write a program that that allows the user to determine how
//          many random numbers to generate within a certain range.
//			Run the program several times, (and at least once, generate
//          a fairly large amount of numbers) to make sure the numbers
//          are falling within the given range.
//
//  SAMPLE INPUT:
//  	How many numbers to generate --> 10
//		Low value --> 30
//		High value --> 55
//
//  SAMPLE OUTPUT:
//		38 36 41 49 46 34 53 53 44 43
//
/////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2109{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	int num, num1, num2;

	Solution()
	{
		input();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("How many numbers to generate --> ");
		num = Integer.valueOf(scan.nextLine());
		
		out.print("Low value --> ");
		num1 = Integer.valueOf(scan.nextLine());
		

		out.print("High value --> ");
		num2 = Integer.valueOf(scan.nextLine());
		
		for(int x = 0; x <= num; x++)
		{
			out.println( (int)(Math.random()*num1)+num2-num1 );
		}

	}

	void output()
	{
		

	}
}






