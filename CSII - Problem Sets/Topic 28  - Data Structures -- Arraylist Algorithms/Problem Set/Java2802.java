///////////////////////////////////////////////////////////////////////////
//
// Java2802  You've been really sick lately, and the nurse would like for
//			 you to keep a list of your temperatures when you wake up for
//			 7 days in a row.  The list will be input as one line of data
//			 separated by commas.  Chop the datum into an ArrayList
//			 and output the list. Count the number of days you had a fever.
//
// SAMPLE INPUT:
//		Enter your temperatures for the week separated by commas:
//		98.5,102.2,98.1,102.6,100.0,99.1,98.6
//
// SAMPLE OUTPUT:
//		Your temps for the week were ==>  [98.5, 102.2, 98.1, 102.6, 100.0, 99.1, 98.6]
//		You had a fever for 4 days.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2802{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	ArrayList<Double> temperatures = new ArrayList<Double>();
	String  temp;
	int count;


	Solution()
	{
		input();
		populate();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.println("Enter your temperatures for the week separated by commas:");
		temp = scan.nextLine();
     
	}

	void populate()
	{
		Scanner chopper = new Scanner(temp);
		chopper.useDelimiter(",");
		while(chopper.hasNext())
		{
			Double daysTemp = chopper.nextDouble();
			temperatures.add(daysTemp);
		}
	
	}
	
	void process()
	{
		for (int i = 0; i < temperatures.size() ; i++) 
			{
				double bob = temperatures.get(i);
				if( bob >= 99.0 )
				{
					count++;
				}
			}
	
	}

	void output()
	{
		out.println();
		out.println("Your temps for the week were ==>  "  + temperatures );
		out.println("You had a fever for " + count + " days.");
		out.println();
	}
}



