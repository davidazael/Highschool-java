///////////////////////////////////////////////////////////////////////////
//
// Java2102 Obtain a letter from the user and use a "for"
//          loop to print all letters from 'A' to the letter
//          input by the user. All output will be uppercase.
//
//         Initializer = 'A'
//         Incrementer = 1
//         Terminator  = char input from user
//
///////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT:
//
//		Enter a letter: G
//
//  SAMPLE OUTPUT:
//
//		Letters from 'A' to 'G': A B C D E F G
////////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT:
//
//		Enter a letter: n
//
//  SAMPLE OUTPUT:
//
//		Letters from 'A' to 'N': A B C D E F G H I J K L M N
////////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;
import java.util.*;

public class Java2102{
	public static void main(String[] args)	{
		new Solution();
}}


class Solution
{
	char letter;
	 
		
	public Solution()
	{
		input();
		run();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter a letter: ");
		letter = scan.nextLine().charAt(0);
		
		
		
		for(char let = 'A'; let <= letter; let++)
		{
			out.print(let +  " " );
		}

	}

	public void run()
	{
		out.println();

		out.println();
	}
}


