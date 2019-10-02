///////////////////////////////////////////////////////////////////////////
//
// Java3901	Write a program that populates a static array of actors from
//			a data file. The data file is arranged so that the first line
//			in the data file contains the number of Strings to allocate
//			for the array. Following this line are the actual actor
//			names.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java3901a.dat
//		Also test with  ->	Java3901b.dat
//
//   SAMPLE DATA FILE:
//		14
//		Tom Hanks
//		Harrison Ford
//		Joaquin Phoenix
//		  <etc. for a total of 14 actors>
//
//	 SAMPLE OUTPUT:
//		ORIGINAL ARRAY:
//		Tom Hanks
//		Harrison Ford
//		Joaquin Phoenix
//			<etc>
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3901{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private String[] actors;

	public Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		try
		{
			Scanner scanFile = new Scanner(new File("Java3901b.dat"));
			
			int n = Integer.valueOf(scanFile.nextLine() );
			
			actors = new String[ n ];
			
			for (int i = 0; i < actors.length ; i++) 
				{
					actors[i] = scanFile.nextLine();	
				}
		

		}catch(Exception e){}
	}

	public void run()
	{
		out.println();
		
		// use an enhanced for loop to display elements
		for(String temp: actors)
			out.println( temp );
		
		out.println();
	}
}








