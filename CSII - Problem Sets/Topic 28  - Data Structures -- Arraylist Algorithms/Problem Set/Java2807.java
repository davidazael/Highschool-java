///////////////////////////////////////////////////////////////////////////
//
// Java2807 Write a program to read a list of numbers from a data file
//          into an ArrayList and print each of the following reports.
//
//         Report 1:  print the array forwards
//         Report 2:  print the array backwards
//         Report 3:  print the third and the seventh elements of the array
//         Report 4:  print every data element that is an odd number
//
//        DATA FILES: Java2805a.dat
//                    Java2805b.dat
//                    Java2805c.dat
//
//
//       BATCH INPUT: 11 28 123 45 56 98 75 99 28 31
//
//    SAMPLE REPORTS:
//
//		Report 1 ==> [11, 34, 123, 45, 56, 98, 75, 99, 28, 31]
//		Report 2 ==> [31, 28, 99, 75, 98, 56, 45, 123, 34, 11]
//		Report 3 ==> 75 123
//		Report 4 ==> 31 99 75 45 123 11
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java2807{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	// Instantiate ArrayList
	ArrayList<Integer> list = new ArrayList<Integer>();

	Solution()
	{
		populate();
		report1();
		report2();
		report3();
		report4();
	}

	void populate()
	{
		try
			{
			Scanner fileScan = new Scanner(new File("Java2807a.dat"));
			
			while(fileScan.hasNextInt())
				list.add(fileScan.nextInt());
				
				
				
			}
			catch(Exception e){}
	}

	void report1()
	{
		out.println();
		out.println( "Report 1 ==> " + list );
	}
	
	void report2()
	{
		Collections.reverse( list );
		out.println( "Report 2 ==> " + list );
	}
		
	void report3()
	{
		out.println( "Report 3 ==> " + list.get(3) + " " + list.get(7) );
	}
		
	void report4()
	{
		out.print( "Report 4 ==> ");
		for(Integer item: list)
			if( item%2 != 0 )
		   		out.print( item + " " );
		out.println();
	}
}

