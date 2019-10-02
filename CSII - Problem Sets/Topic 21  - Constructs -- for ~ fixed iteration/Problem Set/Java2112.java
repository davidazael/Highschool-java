///////////////////////////////////////////////////////////////////////////
//
// Java2112 Use a "for" loop to write a program to print the following:
//
//
//
//      SAMPLE INPUT:  4
//     SAMPLE OUTPUT:  *      *
//                      *    *
//                       *  *
//                        **
//
//
//

import static java.lang.System.*;
import java.util.*;

public class Java2112
{
	public static void main(String[]args)
	{
		new Lesson();
	}
}
class Lesson
{
	int num;
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

		out.print("Enter a number: ");
		num = Integer.valueOf(scan.nextLine());
	}

	void output()
	{
		out.println();
		try
		{
			for(int x=1; x <= num ; x++)
			{
			   column = "%"+x+"s";         						
	
			   out.println( String.format(column,"*") );	
			}
			for(int x=num; x <= num*2  ; x--)
			{
			   column = "%"+x+"s";         						
	
			   out.println( String.format(column, "*") );	
			}
		}catch(Exception e){}



	    out.println();
	}
}