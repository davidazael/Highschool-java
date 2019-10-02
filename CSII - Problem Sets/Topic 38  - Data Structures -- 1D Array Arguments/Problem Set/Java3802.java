///////////////////////////////////////////////////////////////////////////
//
// Java3802	Write a program that uses an algorithm to delete the first
//          element of an array.
//
//			Create an integer array of 6 or more integers.  Populate the
//			integer array with 6 or more random ages from 15 to 18.
//
//			Complete the deleteFront() method.
//
//			1)	create a working array one less than the source.
//			2)	copy the source length array less one items
//				into the working array
//			3)	return the working array
//			4)	provide error checking for when the array
//				length reaches zero.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Press <Enter> to continue.
//		Type "quit"<Enter> to exit.
//
//		[15, 18, 16, 16, 15, 16]
//
//		[18, 16, 16, 15, 16]
//
//		[16, 16, 15, 16]
//
//		[16, 15, 16]
//
//		[15, 16]
//
//		[16]
//
//		[]
//
//		[]
//		quit
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3802{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	int[] ages;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		// see instructions for populating array
		ages =  new int[] { 15, 18, 16, 16, 15, 16 }; 
	}

	public void run()
	{
		Scanner scan = new Scanner(in);

		out.println("Press <Enter> to continue.");
		out.println("Type \"quit\"<Enter> to exit.");
		out.println();
		out.println( Arrays.toString( ages ) );
		out.println();
		while( !scan.nextLine().equals("quit") )
		{
			ages = deleteFront( ages );

			out.println( Arrays.toString( ages ) );
		}
		out.println();
	}

	public int[] deleteFront( int[] sources )
	{
		sources = ages;
		
		if( sources.length < sources.length+1 && sources.length != 0 )
		{
			int[] working = new int[sources.length-1];
			
			System.arraycopy(sources, 1, working, 0, sources.length-1 );
			
			return working;
		}
		return sources;
	}
}







