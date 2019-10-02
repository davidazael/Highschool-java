///////////////////////////////////////////////////////////////////////////
//
// Java2811	 This program is called "menu-driven".  A menu-driven program
//			 allows the user to make choices from a menu until they
//			 decide to quit.  The menu is done for you, but look carefully
//			 at the logic so you understand how it works.
//
//			 The ArrayList will consist of a list of a minimum of 6 fruits.
//
//			 Complete the program so the user can continually choose from
//			 the menu until they decide to quit.  Use a switch() statement
//			 for the process() method.
//
///////////////////////////////////////////////////////////////////////////
//
//			 SAMPLE INPUT AND OUTPUT:
//
//			 List of fruits ==> [banana, kiwi, orange, plum, apple, strawberry]
//
//			 A.  Reverse the list
//			 B.  Shuffle the list
//			 C.  Sort the list alphabetically
//			 D.  Shift the list
//			 E.  Go back to original list
//			 X.  Quit
//			 Enter your choice ==> C
//
///////////////////////////////////////////////////////////////////////////
//
//			 List of fruits ==> [apple, banana, kiwi, orange, plum, strawberry]
//
//			 (* menu appears again)
//			 Enter your choice ==> d
//
///////////////////////////////////////////////////////////////////////////
//
//			 List of fruits ==> [strawberry, apple, banana, kiwi, orange, plum]]
//
//			 (*user continually chooses until they press 'X');
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2811{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	// Instantiate ArrayList
	char choice;

	Solution()
	{
		populate();
		output();
		menu();
	}

	void populate()
	{
		// Populate list with addAll()
	}

	void menu()
	{
		// LOOK and understand how this is done.  You might need to use this
		// for a program in the future!

		Scanner scan = new Scanner(in);
		choice = ' ';			
		while(choice != 'X')
		{
			out.println("A.  Reverse the list");
			out.println("B.  Shuffle the list");
			out.println("C.  Sort the list alphabetically");
			out.println("D.  Shift the list");
			out.println("E.  Go back to original list");
			out.println("X.  Quit");

			out.print("Enter your choice ==> ");
			choice = Character.toUpperCase(scan.nextLine().charAt(0));
			process();													// <-- N O T I C E !!!!
			out.println();
			out.println();
		}
	}

	void process()
	{
		// use switch() statement

	}

	void output()
	{

	}
}


