///////////////////////////////////////////////////////////////////////////
//
// Java2108 The factorial of a number is defined is the product of natural
//          numbers from one to that particular number. A factorial is
//          represented by n followed by an exclamation point. For example,
//          the factorial of 4 is:
//
//                 4! = 1 * 2 * 3 * 4 = 24
//
//          Allow the user to enter a number and use a for loop to
//          calculate the number's factorial. HINT: You can't start at 0
//          like a count or total!
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter n:  6
//
//     SAMPLE OUTPUT:
//			6! = 720
//
///////////////////////////////////////////////////////////////////////////
//
//       CHALLENGE OUTPUT:
//          6! = 1 * 2 * 3 * 4 * 5 * 6 = 720
//
//////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;
import java.util.*;

public class Java2108{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	int num, total = 1;

	Solution()
	{
		input();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter n --> ");
		num = Integer.valueOf(scan.nextLine());
		
		for(int x = 1; x <= num; x++)
		{
				out.print(x + " ");
				total = x * x;
		}
	}

	void output()
	{
		
		out.println("The total of the evens between 0 and " + num + " is " + total );
	}
}



