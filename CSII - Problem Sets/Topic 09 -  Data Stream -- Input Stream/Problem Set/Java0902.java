///////////////////////////////////////////////////////////////////////////
//
// Java0902 Write a program that asks the user for an integer value.
//			Like a NASA count down, display the numbers backwards from
//			the input number to zero.  Be sure to put a delay between each
//          number.
//
//	REQUIREMENT
//		1)	You must use a try/catch block to get the data from the user. If they
//          make any error, catch it, but do nothing.
//		2)	You must also use a try/catch block to delay the countdown clock.
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE RUN:
//
//		Please enter an integer:  8
//
//		<< Count Down >>
//			   8
//			   7
//			   6
//			   5
//			   4
//			   3
//			   2
//			   1
//		<< BLAST OFF! >>
//
//

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java0902{
	public static void main(String[] args){
		new Runner();
}}


class Runner
{
	int num;

	public Runner()
	{
		input();
		output();
	}

	public void input()
	{
		// try/catch block here
		Scanner scan = new Scanner(in);
		
		try
		{
			num = Integer.valueOf(scan.nextLine());
		}
		catch (Exception Error)
		{
			out.println();
		}
	}

	public void output()
	{
		out.println("COUNTDOWN:");
		
		//for loop that counts backwards
		for(int x = num; x >= 1; x--)
		{
			out.println(x);
			
			// pause
			try{Thread.sleep(250);} catch(Exception e){} 	
		}
			
		out.println("BLAST OFF!");
	}
		
}


