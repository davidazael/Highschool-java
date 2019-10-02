///////////////////////////////////////////////////////////////////////////
//
// Java3806	Write a program that uses an algorithm to remove an element
//          from an array based on its index. (Basically this is the static
//          array version of the remove(index) method in ArrayList).
//
//			Create an integer array of 10 or more integers.  Populate the
//			integer array with 10 or more random dates from 1 to 31.
//
//			Have the program ask the user for an index value and
//			remove the date at that location.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Press <Enter> to continue.
//		Type "quit"<Enter> to exit.
//
//		[4, 10, 30, 29, 29, 15, 9, 20, 27, 30]
//
//		5
//		[4, 10, 30, 29, 29, 9, 20, 27, 30]
//
//		1
//		[4, 30, 29, 29, 9, 20, 27, 30]
//
//		3
//		[4, 30, 29, 9, 20, 27, 30]
//
//		6
//		[4, 30, 29, 9, 20, 27]
//
//		quit
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3806{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	int[] days;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		days = new int[10];
		for(int x=0; x<days.length; x++)
			days[x] = (int)(Math.random()*31+1);
	}

	public void run()
	{
		Scanner scan = new Scanner(in);
		String input = "";
		int loc = 0;

		out.println("Press <Enter> to continue.");
		out.println("Type \"quit\"<Enter> to exit.");
		out.println();
		out.println( Arrays.toString( days ) );
		out.println();
		while( !(input = scan.nextLine()).equals("quit") )
		{
			loc = Integer.valueOf( input );

			days = remove( days, loc );

			out.println( Arrays.toString( days ) );
			out.println();
		}
		out.println();
	}

	public int[] remove( int[] position, int num )
	{
		position = days;
		if( position.length < position.length+1 )
		{
			int[] working = new int[position.length];
			
			
			System.arraycopy( position, 0, working, 0, position.length );
			
			//working[num] = null;
			
			
			return working;
		}
		return position;

	}
}






