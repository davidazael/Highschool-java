///////////////////////////////////////////////////////////////////////////
//
// Java3605	Write a program that places ten(10) values as String
//			data items into an array as the array is constructed.
//			Input an integer from the keyboard and output the
//			element in that location of the array.
//
//
//  INITIALIZE DATA AS ARRAY IS CONSTRUCTED:
//      central processing unit
//      hard drive
//      cd/dvd drive
//      mother board
//      RAM
//      video card
//      network interface card
//      printer
//      monitor
//		wireless mouse
//
//  KEYBOARD DATA:
//		Enter index number 0 - 9 ==> 7
//
//
//  SAMPLE OUTPUT:  Index value => 7
//                  Element =====> printer
//
//
//
import static java.lang.System.*;
import java.util.*;

public class Java3605{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	String[] compParts = {"central processing unit","hard drive","cd/dvd drive","mother board"
				,"RAM","video card","network interface card","printer","monitor","wireless mouse"};

	public Environment()
	{

		run();
	}

	public void run()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter index number 0 - 9 ==> " );
		int x = scan.nextInt();

		out.println( );
		out.println( "Element ==> " + compParts[x] /* single element */);
		out.println( );
		out.println( );
	}
}
