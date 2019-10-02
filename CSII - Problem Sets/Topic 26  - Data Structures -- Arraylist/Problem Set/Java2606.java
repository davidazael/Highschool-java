///////////////////////////////////////////////////////////////////////////
//
// Java2606	Write a program to read a list of numbers from a data file and add
//			them to an ArrayList data structure.  Print the list and the
//          number of elements in the list.
//
//			Sample data file is numbersa.dat
//
//      SAMPLE DATA FILE INPUT:
//
//			4.56
//			100.123
//			-7.5
//			18
//			 <etc>
//
//		SAMPLE OUTPUT:
//
//     [54.56, 100.123, -7.5, 18.0, 45.76, 345.2, 0.0, -6.3, 999.99, 45.3, 18.1,
//     -57.56, 7, 48.0, 435.34, 67.67, -5.2, -60.1, -20.8, 60.2, 10.1]
//
//		There are 21 numbers in the data file.
//
//      TEST YOUR PROGRAM WITH DATA FILE numbersb.dat:
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java2606{
	public static void main (String[] args){
		new Problem();
}}


class Problem
{
	ArrayList<Double> ints = new ArrayList<Double>();
	double nums;
	
	Problem()
	{
		populate();
		output();
	}

	void populate()
	{
		// Populate Arraylist from the data file
		try
		{
			Scanner scan = new Scanner(new File("numbersb.dat"));
			while(scan.hasNextLine())
			{
				nums = Double.valueOf(scan.nextLine() );
				ints.add(nums);
				
			}


		}catch(Exception e){}
	}

	void output()
	{
		out.println();
		out.println(ints);
		out.println();		
		out.println("There are " + ints.size() + " numbers in the data.");



		out.println();
	}
}



