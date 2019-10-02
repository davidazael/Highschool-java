///////////////////////////////////////////////////////////////////////////
//
// Java3805	Write a program that uses an algorithm to insert into an array.
//          (Basically this is the static array version of the add(index,element)
//           method in ArrayList).
//
//			Create a String array of size five.  Populate the
//			array with five forest creatures.
//
//			Ask the user for both a new data item and the location
//			it is to be inserted into the array.
//
//			Complete the insert method.
//			Remember to check for boundary errors.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Press <Enter> to continue.
//		Type "quit"<Enter> to exit.
//
//		[deer, squirrel, rabbit, turtle, porcupine]
//
//		bear
//		2
//		[deer, squirrel, bear, rabbit, turtle, porcupine]
//
//		skunk
//		5
//		[deer, squirrel, bear, rabbit, turtle, skunk, porcupine]
//
//		gopher
//		0
//		[gopher, deer, squirrel, bear, rabbit, turtle, skunk, porcupine]
//
//		quit
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3805{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	String[] creatures;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		creatures = new String[]{"deer","squirrel","rabbit","turtle","porcupine"};
	}

	public void run()
	{
		Scanner scan = new Scanner(in);
		String input = "";
		int loc = 0;

		out.println("Press <Enter> to continue.");
		out.println("Type \"quit\"<Enter> to exit.");
		out.println();
		out.println( Arrays.toString( creatures ) );
		out.println();
		while( !(input = scan.nextLine()).equals("quit") )
		{
			input = scan.nextLine();
			
			loc = Integer.valueOf( scan.nextLine() );

			creatures = insert( creatures, input, loc );

			out.println( Arrays.toString( creatures ) );
			out.println();
		}
		out.println(); 
	}

	public String[] insert( String[] beast, String type, int position )
	{
		beast = creatures;
		while(  beast.length  < beast.length+1 )
		{
			String[] working = new String[beast.length+3];
					
			System.arraycopy(beast, position, working, position+1, beast.length+2 );
						
			working[beast.length-1] = type;	
					
			return working;
		}
		return beast;	
				
	}
}






