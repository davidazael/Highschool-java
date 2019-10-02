///////////////////////////////////////////////////////////////////////////
//
// Java3803	Write a program that uses an algorithm to add to the back
//          of an array.  (Basically this is the static array version of
//          the add() method in ArrayList).
//
//			Create a String array of size four.  Populate the
//			String array with four cities.  ADD EACH NEW CITY TO
//			BACK OF THE THE ARRAY AS IT IS ENTERED.  The new city
//			is stored in the variable input by the user.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Press <Enter> to continue.
//		Type "quit"<Enter> to exit.
//
//		[Houston, Atlanta, New Orleans, Las Vegas]
//
//		Washington
//		[Houston, Atlanta, New Orleans, Las Vegas, Washington]
//
//		Seattle
//		[Houston, Atlanta, New Orleans, Las Vegas, Washington, Seattle]
//
//		New York
//		[Houston, Atlanta, New Orleans, Las Vegas, Washington, Seattle, New York]
//
//		quit
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3803{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	String[] cities;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		cities = new String[]{"Houston","Atlanta","New Orleans","Las Vegas"};
	}

	public void run()
	{
		Scanner scan = new Scanner(in);
		String input = "";

		out.println("Press <Enter> to continue.");
		out.println("Type \"quit\"<Enter> to exit.");
		out.println();
		out.println( Arrays.toString( cities ) );
		out.println();
		while( !(input = scan.nextLine()).equals("quit") )
		{
			cities = addBack( cities, input );

			out.println( Arrays.toString( cities ) );
			out.println();
		}
		out.println();
	}

	public String[] addBack( String[] source, String addOn )
	{
		source = cities;
		if( source.length < source.length+1 )
		{
			String[] working = new String[source.length+1];
			
			working[source.length] = addOn;
			
			System.arraycopy(source, 0, working, 0, source.length);
			
			return working;			
		}
		return source;
	}
}





