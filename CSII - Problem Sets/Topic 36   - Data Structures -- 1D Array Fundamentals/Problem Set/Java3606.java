///////////////////////////////////////////////////////////////////////////
//
// Java3606	Write a program that places twenty(20) letters as char
//			data items into an array as the array is constructed.
//			Input an integer from the keyboard to represent a starting
//			index and an integer from the keyboard to represent a
//			stopping index.  Output the elements in the array that
//			are located within the starting and stopping indexes,
//			inclusive.
//
//          * YES, I REALIZE WE COULD DO THE SAME THING WITH A STRING.
//            BUT WE'RE PRACTICING USING ARRAYS. *
//
//  INITIALIZE DATA AS ARRAY IS CONSTRUCTED:
//      A B C D E f g h i j 1 2 3 4 5 ! @ # $ %
//
//  KEYBOARD DATA:
//		Enter beginning index ==> 3
//		Enter ending index ==> 12
//
//
//  SAMPLE OUTPUT:
//		ELEMENTS 3 THROUGH 12 ARE : DEfghij123
//
//
//

import static java.lang.System.*;
import java.util.*;

public class Java3606{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	String[] abc = {"A","B","C","D","E","f","g","h","i","j","1","2","3","4","5","!","@","#","$","%"};

	public Environment()
	{
		

		run();
	}

	public void run()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter beginning index ==> " );
		int start = scan.nextInt();
		out.print("Enter ending index ==> ");
		int finish = scan.nextInt();


		out.println( );
		out.print( "ELEMENTS " + start + " THROUGH " + finish + " ARE : " );
		
		for (int i = start; i <= finish; i++)
			{
				out.print(abc[i]);
	    	}




		out.println( );
		out.println( );
	}
}