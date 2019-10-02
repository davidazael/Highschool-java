///////////////////////////////////////////////////////////////////////////
//
// Java3704  Write a program that uses the Arrays.fill() algorithm to fill
//			 a static array with 10 names.  Then use Arrays.fill() with
//			 index arguments to modify the list to produce the results seen below.
//			 To display the array use Arrays.toString().
//
//		SAMPLE OUTPUT:
//
//		Original List: [Bob, Bob, Bob, Bob, Bob, Bob, Bob, Bob, Bob, Bob]
//
//		After modifying: [Bob, ***, ***, Bob, Bob, HELP, Bob, S.O.S., S.O.S., S.O.S.]
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3704{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	// declare and allocate memory space for array
	String[] name = new String[10];

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		// fill static array with "Bob"
		Arrays.fill(name,"Bob");

	}

	public void run()
	{
		out.println();
		out.print("  Original List: ");
		display();

		modify();

		out.println();
		out.print("After modifying: " );
		display();

		out.println();
		out.println();
	}

	public void display()
	{
		// use Arrays utility
		out.println(Arrays.toString( name ));
	}

	public void modify()
	{
		// use fill() as needed to modify the array
		Arrays.fill(name, 1,3, "***");
		Arrays.fill(name, 5,6, "HELP");
		Arrays.fill(name, 7,10, "S.O.S");
		



	}

}



