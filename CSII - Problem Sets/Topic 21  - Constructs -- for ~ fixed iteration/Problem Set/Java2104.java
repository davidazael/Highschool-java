///////////////////////////////////////////////////////////////////////////
//
// Java2104 Use a "for" loop to write a program to accept an input
//			integer from the user and print all the factors of the
//          number.
//
//         Initializer = 1
//         Incrementer = 1
//         Terminator  = input from user
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter a number:  12
//
//     SAMPLE OUTPUT:
//			The factors of 12 are:  1 2 3 4 6 12
//
///////////////////////////////////////////////////////////////////////////
//
//      ACTUAL INPUT:  39
//                     15
//                     100
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2104{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	int num, factor;

	Solution()
	{
		input();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);

		out.print("Enter a number: ");
		num = Integer.valueOf(scan.nextLine());
		out.print("The factors of " + num + " are: ");
		for(int x = 1; x <= num; x++)
		{
			factor = num % x;
			if(factor == 0)
			{
				out.print(x + " ");
			}
		}
		

	}

	void output()
	{
		out.println();

		out.println();
	}
}

