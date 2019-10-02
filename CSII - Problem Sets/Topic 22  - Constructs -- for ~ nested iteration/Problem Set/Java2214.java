///////////////////////////////////////////////////////////////////////////
//
// Java2214 Write a program that uses nested loops to create the following
//          design.
//
///////////////////////////////////////////////////////////////////////////
//
// SAMPLE INPUT:
//
//		Enter your name: Waterman
//
// SAMPLE OUTPUT:
//
//		namretaW
//		amretaW
//		mretaW
//		retaW
//		etaW
//		taW
//		aW
//		W
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2214{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	String name;

	Solution()
	{
		input();


	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter your name: ");
		name = scan.nextLine();
	}

}


