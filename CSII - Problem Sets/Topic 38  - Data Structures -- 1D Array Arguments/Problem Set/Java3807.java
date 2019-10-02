///////////////////////////////////////////////////////////////////////////
//
// Java3807	Write a program that uses an algorithm to remove an element
//          from an array based on the element. (Basically this is the static
//          array version of the remove(element) method in ArrayList).
//
//			Create a String array of 10 or more Strings.  Populate the
//			String array with 10 or more cartoon heros.
//
//			Complete the remove() method using the following
//			signature.
//
//				public String[] remove(String[] source, int index)
//
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Press <Enter> to continue.
//		Type "quit"<Enter> to exit.
//
//		[superman, batman, wonderwoman, aquaman, spiderman, ironman, captain america, th
//		or, flash, green lantern]
//
//		captain america
//		[superman, batman, wonderwoman, aquaman, spiderman, ironman, thor, flash, green
//		lantern]
//
//		GREEN LANTERN
//		[superman, batman, wonderwoman, aquaman, spiderman, ironman, thor, flash]
//
//		aQuAmAn
//		[superman, batman, wonderwoman, spiderman, ironman, thor, flash]
//
//		quit
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3807{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	String[] heros;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		heros = new String[]{"superman","batman","wonderwoman","aquaman","spiderman",
							   "ironman","captain america","thor","flash","green lantern"};
	}

	public void run()
	{
		Scanner scan = new Scanner(in);
		String input = "";

		out.println("Press <Enter> to continue.");
		out.println("Type \"quit\"<Enter> to exit.");
		out.println();
		out.println( Arrays.toString( heros ) );
		out.println();
		while( !(input = scan.nextLine()).equals("quit") )
		{
			heros = remove( heros, findHero(heros, input) );

			out.println( Arrays.toString( heros ) );
			out.println();
		}
		out.println();
	}

	public String[] remove(String[] source, int index)
	{

	}

	public int findHero(String[] source, String item)
	{

	}
}







