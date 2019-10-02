///////////////////////////////////////////////////////////////////////////
//
// Java3801	Write a program that uses an algorithm to delete the last
//          element of an array.
//
//			Create a String array of 6 or more Strings.  Populate the
//			String array with 6 or more types of soda.
//
//			Complete the deleteBack() method using the following
//			signature.
//
//				public String[] deleteBack(String[] source)
//
//
//			1)	create a working array one less than the source.
//			2)	copy the source array into the working array
//			3)	return the working array
//			4)	Because the new array continually shrinks in size, provide
//              error checking for when the array length reaches zero.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Press <Enter> to continue.
//		Type "quit"<Enter> to exit.
//
//		[Coke, 7-Up, Mr Pibb, Orange Crush, Pepsi, Dr. Pepper]
//
//		[Coke, 7-Up, Mr Pibb, Orange Crush, Pepsi]
//
//		[Coke, 7-Up, Mr Pibb, Orange Crush]
//
//		[Coke, 7-Up, Mr Pibb]
//
//		[Coke, 7-Up]
//
//		[Coke]
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

public class Java3801{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	String[] sodas;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		sodas = new String[] {"Sprite","Coke","Sangria","Fanta","Pepsi","Siera Mist"};
	}
	public void run()
	{
		Scanner scan = new Scanner(in);

		out.println("Press <Enter> to continue.");
		out.println("Type \"quit\"<Enter> to exit.");
		out.println();
		out.println( Arrays.toString( sodas ) );
		out.println();
		while( !scan.nextLine().equals("quit") )
		{
			sodas = deleteBack( sodas );

			out.println( Arrays.toString( sodas ) );
		}
		out.println();
	}

	public String[] deleteBack(String[] source)
	{
		source = sodas;
		if( source.length < source.length+1 && source.length != 0 )
		{
			// working array
			String[] working = new String[source.length-1];

			// copy from source to working
			System.arraycopy( source, 0,  working, 0, source.length-1 );	
			
				
			// return working array each time
			return working;
		}
		return source;

		// if bad things happened, return source array
		
	}
}





