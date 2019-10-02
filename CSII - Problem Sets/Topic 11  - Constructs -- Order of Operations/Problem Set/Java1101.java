///////////////////////////////////////////////////////////////////////////
//
// Java1101 Write a program that converts total seconds to the number of 
//			minutes and seconds it represents.  Use integer division to 
//			determine the number of minutes (quotient) and % to determine the 
//			number of seconds (remainder).
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE INPUT:  
//
//		Enter number of seconds ==> 31987
//
//   	SAMPLE OUTPUT:  31,987 seconds = 533 minutes and 7 seconds.
//
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*; 
import java.util.*;

public class Java1101
{
	public static void main(String[] args)
	{
		new Problem01();
   	}
}

class Problem01
{
	int sec, min;
	double num;
	
	public Problem01()
	{
		input();
		process();
		output();
	}
	void input()
	{
		Scanner scan = new Scanner(in);
		
		out.print("Enter the number of seconds === > ");
		num = Integer.valueOf(scan.nextLine());
		
		
	}
	
	void process()
	{
		min = (int)num /60;
		sec = (int)num % 60;
		
	}
	
	void output()
	{
		out.print(String.format("%,.0f", num) + " =  " + min + " minutes and " + sec + " seconds left. \n" );	
	}
}


