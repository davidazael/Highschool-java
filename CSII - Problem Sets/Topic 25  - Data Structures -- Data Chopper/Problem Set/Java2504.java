///////////////////////////////////////////////////////////////////////////
//
// Java2504	Write a program that counts how many real numbers are contained
//          in a dataLine.  The numbers will be separated with a comma.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
/*

3.1,2,0.8,12.5862,7,0,41.23,-3,0.87,1.5

*/
//     SAMPLE OUTPUT:
//				There are 10 numbers in this line.
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2504{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	String dataLine;
	int count;

	Solution()
	{
		input();
		tokenizer();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.println("Enter a line of numbers seperated by comas: ");
		dataLine = scan.nextLine();
		
	}

	void tokenizer()
	{
		Scanner chopper = new Scanner(dataLine);
		chopper.useDelimiter(",");
		
		while(chopper.hasNextDouble())
		{
			double num = Double.valueOf(chopper.next());
			count++;
		}
	}

	void output()
	{
		out.println();
		out.println("There are " + count + " numbers in this line.");
     	out.println();
	}
}








