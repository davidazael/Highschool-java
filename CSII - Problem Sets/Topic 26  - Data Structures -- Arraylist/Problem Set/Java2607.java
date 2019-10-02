///////////////////////////////////////////////////////////////////////////
//
// Java2607	Write a program to read a list of grades from a data file.
//			For each grade print the grade with its corresponding
//			letter grade.
//
//			Sample data file is gradesa.dat
//
//      SAMPLE DATA FILE INPUT:
//
//			100
//			78
//			80
//			 <etc>
//
//		SAMPLE OUTPUT:
//			100 - A
//			78 - C
//			80 - B
//			 <etc>
//
//      TEST YOUR PROGRAM WITH DATA FILE gradesb.dat:
//
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java2607{
	public static void main (String[] args){
		new Problem();
}}


class Problem
{
	ArrayList<Integer> ints = new ArrayList<Integer>();
	int nums;

	Problem()
	{
		populate();
		output();
	}

	void populate()
	{

		try
		{
			Scanner scan = new Scanner(new File("gradesa.dat"));
			while(scan.hasNextLine())
			{
				nums = Integer.valueOf( scan.nextInt() );
				
				if(nums >= 90)
					out.println(nums + " - A");
				else
				if(nums >= 80)
					out.println(nums + " - B");
				else	
				if(nums >= 75)
					out.println(nums + " - C");
				else	
				if(nums >= 70)
					out.println(nums + " - D");
				else
				if(nums <= 69)
					out.println(nums + " - F");
			}
			



		}catch(Exception e){}
	}

	void output()
	{
		out.println();
		out.println();

	}
}



