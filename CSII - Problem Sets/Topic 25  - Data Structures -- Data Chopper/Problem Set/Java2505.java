///////////////////////////////////////////////////////////////////////////
//
// Java2505	Write a program that counts AND totals the EVEN integers
//			contained in a dataLine.
//
//			Use the Scanner class to tokenize the dataLine into chopper.
//			Set the Scanner delimiter to use the comma (",") and CRLF ("\n").
//
//			REQUIRED LOOP:  while(chopper.has???() )
//							{
//							}
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
//
//     Enter some numbers on one line separated by commas:
/*

5,8,03,9,23,14,6,19,8,2,11

*/
//
//	SAMPLE OUTPUT:
//
//     The even numbers are: 8 14 6 8 2
//     You entered 5 even numbers.
//     The total of the even numbers is 38.
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2505{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	String dataLine;
	int count;
	int total;

	Solution()
	{
		input();
		tokenizer();
		output();
	}

	void input()
	{
	Scanner scan = new Scanner(in);
	out.println("Enter some numbers on one line separated by commas: ");
	dataLine = scan.nextLine();
	}

	void tokenizer()
	{
     	// instantiate Scanner for tokenizing and prepare with delimiter
     	Scanner chopper = new Scanner(dataLine);
     	chopper.useDelimiter(",");
     	out.println();
     	out.print("The even numbers are: ");
     	while(chopper.hasNextInt())
     	{
     		int num = chopper.nextInt();
     		
     		
     		if(num % 2 == 0)
     		{
     			count++;
     			out.print(num + " " );
     			total += num;	
     		}
     			
     	}     
		
	}

	void output()
	{
		out.println("\nYou entered " + count + " even numbers.");
		out.println("The total of the numbers is " + total + ".");
		out.println();
	}
}


