///////////////////////////////////////////////////////////////////////////
//
// Java3904	This program will be gathering grades for an array from a
//			data file with an UNKNOWN amount of integers.  Because the
//			number of elements is unknown, you will need to populate
//			an ArrayList FIRST then transfer the data to a static array.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java3904a.dat
//		Also test with  ->	Java3904b.dat
//
//	SAMPLE OUTPUT:
//		Original Array:
//		[56, 90, 100, 70, 39, 71, 78, 70, 81, 96, 0, 92, 88, 79, 50, 70]
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3904{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private int[] grades;
	ArrayList<Integer> bob = new ArrayList<Integer>();
	
	public Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		try
		{
			
			Scanner scanFile = new Scanner(new File("Java3904a.dat") );
			while( scanFile.hasNext() )
			{
				bob.add( Integer.valueOf(scanFile.next() ));
			}
			
			grades = new int[bob.size()];
			
			for (int i = 0; i < bob.size(); i++)
				{
					grades[i] = bob.get(i);
				}
			
			
			
		
		}catch(Exception e){}
	}

	public void run()
	{
		out.println();
		out.println("Original Arrays: ");
		out.println( Arrays.toString(grades));
		out.println();
	}
}

