///////////////////////////////////////////////////////////////////////////
//
// Java1302 Write a program to allow the user to enter two integers. Print
//			an appropriate message that indicates if the second number is
//			a factor of the first number.
//
//			HINT:  Use modulus to help!  (Example:  10 % 5 == 0)
//											        10 % 3 != 0
//
///////////////////////////////////////////////////////////////////////////
//
//			SAMPLE INPUT:
//				Enter an integer: 1000
//				Enter another (smaller) integer: 4
//
//			SAMPLE OUTPUT:
//				4 is a factor of 1000
//
///////////////////////////////////////////////////////////////////////////
//
//			SAMPLE INPUT:
//				Enter an integer: 350
//				Enter another (smaller) integer: 13
//
//			SAMPLE OUTPUT:
//				13 is NOT a factor of 350
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1302{
	public static void main(String[] args)	{
		new Problem();
}}


class Problem
{
	int num1, num2;

	public Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter an integer: ");
			num1 = Integer.valueOf(scan.nextLine());

		out.print("Enter another (smaller) integer: ");
			num2 = Integer.valueOf(scan.nextLine());

	}

	void process()
	{
		if( num1 % num2 == 0)
		{
			out.println(num2 + " is a factor of " + num1 );
		}
		if( num1 % num2 != 0 )
		{
			out.println(num2 + " is NOT a factor of " + num1  );
		}


	}

	void output()
	{

	}
}



