///////////////////////////////////////////////////////////////////////////
//
// Java1301 Given three integers, write a program that identifies the
//			largest number.  Use a compound decision in your first
//			conditional ONLY.
//
//			This is considered a "classic" programming problem in
//			computer science.  It is very important that you understand
//			how to solve it EFFICIENTLY.  You must test this program
//			several times to be	sure it is working correctly.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter three numbers:
//					   6
//					   2
//					   10
//
//     SAMPLE OUTPUT:  Of the numbers 6, 2, and 10, the largest number is 10.
//
///////////////////////////////////////////////////////////////////////////
//
//        TEST INPUT:  6 5 4
//                     11 33 26
//                     56 7 56
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1301{
	public static void main (String[] args)	{
		new Problem();
}}


class Problem
{
	int num1, num2, num3;

	public Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);

		out.print("Enter a beginning number: ");
		num1 = Integer.valueOf(scan.nextLine());

		out.print("Enter another number: ");
		num2 = Integer.valueOf(scan.nextLine());
		
		out.print("Enter a final number: ");
		num3 = Integer.valueOf(scan.nextLine());
	}

	void process()
	{
		if(num1 > num2 && num1 > num3)
		{
			out.println(num1);
		}
		else
			if(num2 > num1 && num2 > num3)
			{
				out.println(num2);
			}
			else
				if(num3 > num1 && num3 > num2)
				{
					out.println(num3);
				}
				else
					if(num1 == num2 || num1 == num3 || num2 == num3)
					{
						out.println(num1);
					}

	}

	void output()
	{

	}
}

