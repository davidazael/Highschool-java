///////////////////////////////////////////////////////////////////////////
//
// Java2101	Use a "for" loop to write a program to print the integers
//          from a starting and stopping value input by the user.
//
//         Initializer = input by user
//         Incrementer = 1
//         Terminator  = input by user
//
///////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT:
//
//		Enter starting value: 5
//		Enter stopping value: 21
//
//  SAMPLE OUTPUT:
//
//		Integers from 5 through 21: 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2101{
	public static void main(String[] args)	{
		new Solution();
}}


class Solution
{
	int num1, num2;


	public Solution()
	{
		input();
		run();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter starting value: ");
		num1 = Integer.valueOf(scan.nextLine());
		out.print("Enter stopping value: ");
		num2 = Integer.valueOf(scan.nextLine());
	}

	public void run()
	{
		out.println();
		out.print("Integers from " + num1 + " through " + num2 + ": " );

		// for loop goes here
		
		for(int x = num1; x <= num2; x++)
		{
			out.print(x + " ");
		}


		out.println();
	}
}



