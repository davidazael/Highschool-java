///////////////////////////////////////////////////////////////////////////
//
// Java2105 Use a "for" loop to write a program to print the odd numbers
//			betwen values input by the user and their total.
//
///////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT:
//		Enter starting value: 2
//		Enter stopping value: 21
//
//  SAMPLE OUTPUT:
//
//		The odd numbers from 2 through 21: 3 5 7 9 11 13 15 17 19 21
//		The total is 120
//
///////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT:
//
//		Enter starting value: 3
//		Enter stopping value: 15
//
//  SAMPLE OUTPUT:
//
//		The odd numbers from 3 through 15: 3 5 7 9 11 13 15
//      The total is 63
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2105{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	int total, num1, num2;

	Solution()
	{
		input();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter starting value: ");
		num1 = Integer.valueOf(scan.nextLine());
		

		out.print("Enter stopping value: ");
		num2 = Integer.valueOf(scan.nextLine());
		
		out.println("The odd numbers from " + num1 + " to " + num2 + " are: ");
		for(int x = num1; x <= num2; x++)
		{
			if(x%2 != 0)
			{
				out.print(x + " ");
				total += x;
			}
		}
		System.out.println ("\n");
		out.println("The total of the odd numbers is: " + total);
	
	}

	void output()
	{
		
	}
}


















