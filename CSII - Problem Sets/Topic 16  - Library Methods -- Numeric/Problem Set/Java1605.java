///////////////////////////////////////////////////////////////////////////
//
// Java1605	Write a program to print 10 random integers.
//			The smallest integer is to be 3 and the largest is to be 9.
//
//			RUN THIS PROGRAM SEVERAL TIMES TO CHECK YOUR RANGE OF
//			VALUES!!!
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  none
//     SAMPLE OUTPUT:  3
//					   6
//					   9
//				       7
//					   3
//					   4
//					   5
//					   9
//					   3
//					   5
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;

public class Java1605{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	int low;
	int high;
	int range;
	int range2;

	public Problem()
	{
		low = 3;
		high = 9;
		range =  (int)(Math.random()*(high - low + 1)) + low ;	/* use range formula */

		output();
	}

	public void output()
	{
		
		out.println( (int)(Math.random()*(high - low + 1)) + low  );
		out.println( (int)(Math.random()*(high - low + 1)) + low  );
		out.println( (int)(Math.random()*(high - low + 1)) + low  );
		out.println( (int)(Math.random()*(high - low + 1)) + low  );
		out.println( (int)(Math.random()*(high - low + 1)) + low  );
		out.println( (int)(Math.random()*(high - low + 1)) + low  );
		out.println( (int)(Math.random()*(high - low + 1)) + low  );
		out.println( (int)(Math.random()*(high - low + 1)) + low  );


	}

}




