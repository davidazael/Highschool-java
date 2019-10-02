///////////////////////////////////////////////////////////////////////////
//
// Java0602 Write a program that allows the user to enter 2 whole numbers
//          using the valueOf() method. The process() method should add,
//          subtract, multiply, and divide the whole numbers.  Produce
//          the sample output seen below.
//
//      * DO NOT USE THE nextInt() METHOD!!! *
//
//  REVIEW:  input(), process(), output(), concatenation, integer division
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  ENTER A WHOLE NUMBER ==> 25
//                     ENTER ANOTHER WHOLE NUMBER ==> 12
//
//     SAMPLE OUTPUT:
//     		25 + 12 = 37
//     		25 - 12 = 13
//     		25 * 12 = 300                                           _
//     		25 / 12 = 2    *Do you remember why 25/12 = 2 not 2.08333 ?
//
//
//        TEST INPUT:  5
//					   16
//
///////////////////////////////////////////////////////////////////////////
//


import static java.lang.System.*;
import java.util.*;

public class Java0602{
	public static void main(String[] args){
		new Arithmetic();
}}


class Arithmetic
{
	// private instance variables
	private int wnum;
	private int wnum2;
	
	private int addUp;
	private int subUp;
	private int multy;
	private int divide;

	public Arithmetic()
	{
	// activate methods
	input();
	process();
	output();
	}

	public void input()
	{
		// use valueOf method for all input
		Scanner scan = new Scanner(in);
		
		out.print("ENTER A WHOLE NUMBER ------------>");
		wnum = Integer.valueOf(scan.nextLine());
		out.print("ENTER A SECOND WHOLE NUMBER ----->");
		wnum2 = Integer.valueOf(scan.nextLine());
	}

	public void process()
	{
		addUp = wnum + wnum2;
		subUp = wnum - wnum2;
		multy = wnum * wnum2;
		divide = wnum / wnum2;

		

	}

	public void output()
	{
			// use concatenation to display as shown in instructions above
			out.println("" + wnum + " + " + wnum2 + " = " + addUp );
			out.println("" + wnum + " - " + wnum2 + " = " + subUp );
			out.println("" + wnum + " * " + wnum2 + " = " + multy );
			out.println("" + wnum + " / " + wnum2 + " = " + divide );
			
	}
}



