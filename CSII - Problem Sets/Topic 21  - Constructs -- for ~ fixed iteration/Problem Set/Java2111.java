///////////////////////////////////////////////////////////////////////////
//
// Java2111 A perfect number is a positive integer such that the sum of the
//			proper divisors equals the number.  Thus, 28 = 1 + 2 + 4 + 7 + 14
//      	is a perfect number.  If the sum of the divisors is less than the
//      	number, it is deficient.  If the sum exceeds the number, it is
//      	abundant.
//
//			Write an interactive program that allows the user to enter a
//			positive integer and then displays the result, indicating whether
//			the number entered is perfect, deficient, or abundant.
//
//      SAMPLE INPUT: 6
//     SAMPLE OUTPUT: PERFECT
//
//      SAMPLE INPUT: 30
//     SAMPLE OUTPUT: DEFICIENT
//
//      SAMPLE INPUT: 12
//     SAMPLE OUTPUT: ABUNDANT
//


import static java.lang.System.*;
import java.util.*;

public class Java2111
{
	public static void main(String []args)
	{
		int num1 = 1;
		int nums = 0;
		
		Scanner scan = new Scanner(in);
		out.print("Enter a positive integer: ");
		num1 = Integer.valueOf(scan.nextLine());
		for(int x = num1-1; x >= 1; x--)
		{
			if(num1 % x == 0)
			{
				nums += x;
			}	
			
		}		
		if(nums == num1)
			{
				out.println(nums + " IS PERFECT");
			}
		if( num1 < nums)
			{
				out.println(num1 + " IS DEFICIENT");
			}
		if(num1 > nums )
			{
				out.println(num1 + " IS ABUNDANT");
			}
	
	}
}
