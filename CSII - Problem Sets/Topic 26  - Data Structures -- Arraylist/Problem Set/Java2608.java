///////////////////////////////////////////////////////////////////////////
//
// Java2608	Triskaidekaphobia is a fear of the number 13. It is usually
//			considered to be a superstition. (A specific fear of Friday the 13th
//			is called paraskavedekatriaphobia or friggatriskaidekaphobia).
//
//			Write a program that uses a CONSTRUCTOR to initialize a data
//			structure.  Use a populate method to populate an ArrayList
//			of integers from a data file.  Write a mutator method called
//			change13() that changes all 13's in the data file to the lucky
//			number 7 (which happens to represent the number of spots in a
//			common ladybug).
//
//
//			Sample data file is 13sa.dat
//
//      SAMPLE DATA FILE INPUT:
//				4
//				6
//				13
//			 <etc>
//
//				The original list:
//				-----------------
//				4 6 13 8 4 13 13 6 9 13 13 6 9 2
//
//
//				After changing 13's:
//				--------------------
//				4 6 7 8 4 7 7 6 9 7 7 6 9 2
//
//
//      TEST YOUR PROGRAM WITH DATA FILE 13sb.dat:
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java2608{
	public static void main (String[] args){
		new Problem();
}}

class Problem
{
	ArrayList list = new ArrayList();

	Problem()
	{
		input();
		out.println("Before changing");
		out.println(list);
		change13();
		out.println("After changing");
		out.println(list);
	}

	void input()
	{
		try
			{
				



			} catch(Exception e){}

	}

	void change13()
	{

	}
}


