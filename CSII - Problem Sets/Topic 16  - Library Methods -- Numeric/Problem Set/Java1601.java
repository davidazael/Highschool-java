///////////////////////////////////////////////////////////////////////////
//
// Java1601 Write a program that asks the user for a number.  Find the
//          the square root of the number and store the captured answer
//          in an answer instance variable.  Display the answer.  Format
//			the answer to 3 decimal places.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter a number: 45
//
//		SAMPLE OUTPUT: The square root of 45 is 6.708
//
///////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Java1601{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	int number;
	double answer;

	public Problem()
	{
		input();
		process();
		output();
	}

	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number===>");
		number = Integer.valueOf( scan.nextLine() );
	}

	public void process()
	{
		answer = Math.sqrt(number);

	}

	public void output()
	{
		System.out.println("The square root of " + number + " is " + String.format("%,.3f",answer ) );

	}
}


