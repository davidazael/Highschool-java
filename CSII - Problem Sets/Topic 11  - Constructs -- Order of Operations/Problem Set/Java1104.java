///////////////////////////////////////////////////////////////////////////
//
// Java1104 Write a program to convert a decimal number into its two 
//			parts, its quotient and decimal.  Use type casting to 
//			truncate the real number to obtain the whole number portion 
//			and subtract the whole number portion from the original 
//			number to obtain the decimal portion.
//
///////////////////////////////////////////////////////////////////////////
//
//          SAMPLE INPUT:
//				Enter number ==> 437.3193
//
//			SAMPLE OUTPUT:
//				437.3193 = 437 + 0.3193
//									\
//									 \-----------You will see something unusual
//											     about this decimal
//
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*; 
import java.util.*;

public class Java1104
{
	public static void main(String[] args)
	{
		new Problem01();
   	}
}

class Problem01
{
	double num, june, bob;
	
		
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
		num = Double.valueOf(scan.nextLine());
		
		
	}
	
	void process()
	{
		bob =  (int)num ;
		june =  num - bob   ;
		
		
		
		
	}
	
	void output()
	{
		out.println("" + num + " = " + (int)num + " + " + june );
	}
}


