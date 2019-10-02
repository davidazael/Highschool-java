///////////////////////////////////////////////////////////////////////////
//
// Java2110 Use a "for" loop to write a program to read a phrase from
//			the keyboard and display the phrase one letter at a time
//			at a diagonal.
//
//      SAMPLE INPUT: Billion
//     SAMPLE OUTPUT: B
//                     i
//                      l
//                       l
//                        i
//                         o
//                          n
//
//      ACTUAL INPUT: FORTUNE
//                    1234567890
//                    Cents
//
//

import static java.lang.System.*;
import java.util.*;

public class Java2110
{
	public static void main(String[]args)
	{
		new Lesson();
	}
}
class Lesson
{
	String name;
	String column;
	int n = 0;

	Lesson()
	{
		input();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);

		out.print("What is your name? ");
		name = scan.nextLine();
	}

	void output()
	{
		out.println();
		try
		{
		for(int x=1; x<name.length()+1; x++)
		{
		   column = "%"+x+"s";         						

		   out.println( String.format(column,name.charAt(n++)) );	
		}

			
		}catch(Exception e){}



	    out.println();
	}
}
