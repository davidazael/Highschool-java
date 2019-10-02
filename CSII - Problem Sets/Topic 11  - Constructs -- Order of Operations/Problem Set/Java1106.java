///////////////////////////////////////////////////////////////////////////
//
// Java1106 Write a program to convert a whole number to separate digits for
//			the thousands, the hundreds, the tens, and the ones place values.
//			Print each digit on a separate line with a label indicating its
//			place value.  Use / and % operators to separate out the digits.
//			Run your a program a second time and separate the integer 8143.
//
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE INPUT:
//
//			Enter whole number ==> 4528
//
//   SAMPLE OUTPUT:  4528 equals
//                   4 thousands
//                   5 hundreds
//                   2 tens
//                   8 ones
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE INPUT (just test another number):
//
//			Enter whole number ==> 8143
//
//   SAMPLE OUTPUT:  8,143 equals
//                   8 thousands
//                   1 hundreds
//                   4 tens
//                   3 ones
//
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*; 
import java.util.*;

public class Java1106
{
	public static void main(String[] args)
	{
		new Problem01();
   	}
}

class Problem01
{
	int num, thousands, hundreds, tens, ones;
	
		
	public Problem01()
	{
		input();
		process();
		output();
	}
	void input()
	{
		Scanner scan = new Scanner(in);
		
		out.print("Enter the number  === > ");
		num = Integer.valueOf(scan.nextLine());
		
		
	}
	
	void process()
	{
		thousands = num / 1000;
		hundreds = num % 1000 / 100;
		tens = num % 1000 % 100 / 10;
		ones = num % 1000 % 100 % 10 / 1;	
	}
	
	void output()
	{
		out.println( num );
		out.println( thousands );
		out.println( hundreds );
		out.println( tens );
		out.println( ones );
	}
}


