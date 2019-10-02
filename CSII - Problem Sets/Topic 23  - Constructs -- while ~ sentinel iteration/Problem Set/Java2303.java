///////////////////////////////////////////////////////////////////////////
//
// Java2307 Write a program to average grades.  The program must
//			accept an unknown number of grades and find the average.
//			The user will enter a sentinel value when they are finished
//			entering the grades. Format your answer to two decimal places.
//
//  SAMPLE INPUT:
//
//		Enter a grade, -999 when done: 87
//		Enter another grade, -999 when done: 78
//		Enter another grade, -999 when done: 96
//		Enter another grade, -999 when done: 100
//		Enter another grade, -999 when done: -999
//
//  SAMPLE OUTPUT:
//		The average is 92.05
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2303{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
    double   data;
	double sum;
    double count;
    double average;

	Solution()
	{
		run();
	}

	void run()
	{
		Scanner scan = new Scanner(in);
		

		/* while loop */
		while ( data != -999 ) 
		{
			out.print( "Enter a grade, -999 when done: " );
			data = Double.valueOf(scan.nextLine());
			
			if(data != -999)
			{
			sum += data;
			count ++;
			}
					
		}


		average = sum/count;

		out.println();
		out.println();
		out.println( "The average is " + average);
		out.println();
	}
}







