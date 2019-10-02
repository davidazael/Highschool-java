///////////////////////////////////////////////////////////////////////////
//
// Java2103 Use a "for" loop to write a program to allow the user to enter
//          a positive number.  Count backwards by 2's from their number
//			to zero.
//
//		   Initializer = input from user
//         Decrementer = 2
//         Terminator  = 0
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
//		Enter a number:  20
//
//	SAMPLE run:
//		Counting backwards by 2's from 20: 20 18 16 14 12 10 8 6 4 2 0
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2103{
	public static void main(String[] args){
		new Solution();
}}



class Solution
{
	int num;
	String result;

	Solution()
	{
		input();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter a number:  ");
		
		num = Integer.valueOf(scan.nextLine());
		
		

	}

	void output()
	{
		out.print("Counting backwards by 2's from " + num + ": ");
		for(int x = num; x >= 0; x -=2)
		{
			out.print(  x  + " ");
		}
		out.println();
		
	}
}






