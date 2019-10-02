///////////////////////////////////////////////////////////////////////////
//
// Java2216 Use nested for loops to print the following design, based on a
//          'size' variable:
//
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE SIZE:  Enter # of branches ==> 4
//
//     SAMPLE OUTPUT:
//                         *
//                        ***
//                       *****
//                      *******
//                         |
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE SIZE:  Enter # of branches ==> 7
//
//     SAMPLE OUTPUT:
//					       *
//					      ***
//					     *****
//					    *******
//					   *********
//					  ***********
//					 *************
//					       |
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2216{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	int size;

	Solution()
	{
		input();




	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter number of branches ==> ");
		size = Integer.valueOf(scan.nextLine());
		out.println();
	}


}



