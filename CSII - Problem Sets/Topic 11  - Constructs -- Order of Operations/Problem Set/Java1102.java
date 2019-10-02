///////////////////////////////////////////////////////////////////////////
//
// Java1102 You have been hired by Electronics R Us to write a program to
//			teach employees how to count back change to customers when they
//			pay in cash.  The employees don't know how to make change, so
//			your program must convert the dollar amount to the smallest
//			number of bills (twenties, tens, fives, ones) and coins
//			(quarters, dimes, nickels, pennies).
//
//          You must use / and %!  
//
//          HINT: (int)($38.97 * 100) = 3897 cents
//				  How many cents are in a $20 dollar bill?
//
//			Run your program a second time to convert $52.42.
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE DATA:  
//
//			Enter dollar amount ==> 38.97
//
//   SAMPLE OUTPUT:  $38.97 = 3897 cents
//
//		Please give the customer:
//		1 twenties
//		1 tens
//		1 fives
//		3 ones
//		3 quarters
//		2 dimes
//		0 nickels
//		2 pennies
//
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*; 
import java.util.*;

public class Java1102
{
	public static void main(String[] args)
	{
		new Problem02();
   	}
}

class Problem02
{
	
	int twenties, tens, fives, ones ;
	double quarters, dimes, nickels, pennies ;
	double amount;
	
	public Problem02()
	{
		input();
		process();
		output();
	}
	
	void input()
	{
		Scanner scan = new Scanner(in);
		out.println("Enter dollare amount -->" );
		amount = Double.valueOf(scan.nextLine());
		
	}
	
	void process()
	{
		twenties = (int)amount / 20;
		tens = (int)amount % 20 / 10 ;
		fives = (int)amount % 20 % 10 / 5;
		ones = (int)amount % 20 % 10 % 5 / 1;
		quarters = amount % 20 % 10 % 5 % 1 / .25;
		dimes = amount % 20 % 10 % 5 % 1 % .25 / .10;
		nickels = amount % 20 % 10 % 5 % 1 % .25 % .10 / .05;
		pennies = amount % 20 % 10 % 5 % 1 % .25 % .10 % .05 / .01;
		
		
		
	}
	
	void output()
	{
			out.println("You neeed this many twenties " + twenties );
			out.println("You neeed this many tens " + Math.abs(tens) );
			out.println("You neeed this many fives " + fives );
			out.println("You neeed this many ones " + ones );
			out.println("You neeed this many quarters " + (int)quarters );
			out.println("You neeed this many dimes " + (int)dimes );
			out.println("You neeed this many nickles " + (int)nickels );
			out.println("You neeed this many penies " + (int)pennies );
	}
}


