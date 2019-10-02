///////////////////////////////////////////////////////////////////////////
//
// Java0903 Allow the user to enter their name followed by an index value.
//          Find the char value at that index. If the user does not
//          enter a whole number for the index, terminate the program with
//          a message.
//
//          CHALLENGE: If the user enters an INVALID index (i.e. an out
//          of bounds index), terminate the program with a different
//          message.
///////////////////////////////////////////////////////////////////////////
//
//    SAMPLE RUN:
//		Please enter your name: Jennifer
//		Now enter an index number from 0 to 7: 2
//		Found the letter 'n' at position 2
//
//    SAMPLE RUN:
//		Please enter your name: Sammy
//		Now enter an index number from 0 to 4: 2.5
//		Please enter a whole number!


import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java0903{
	public static void main(String[] args){
		new Runner();
}}


class Runner
{
	String name;
	int index;
	char let;

	public Runner()
	{
		input();
		process();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Please enter your name: ");
		name = scan.nextLine();
		out.print("now enter an index number from 0 to " +(name.length()-1) + " ");
		
		try{
			index = Integer.valueOf(scan.nextLine());
		}
		catch( Exception e)
		{
			System.out.println("BAD DATA");
			exit(2);
		}
			
	}
	
	public void process()
	{
		let = name.charAt(index);
		// use charAt to isolate the char value from the String
	}

	public void output()
	{
		out.println("Found the letter '" + let + "' at position " + index  + " ");
	}
}

