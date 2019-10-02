///////////////////////////////////////////////////////////////////////////
//
// Java3907 This program will be gathering lower case letters for an array
//			from a data file with an UNKNOWN amount of characters.  Again,
//			you will need to populate first with an ArrayList, then transfer
//			the data to a static array.
//
//			The vowelCount() method should count the number of vowels
//			in the array.  The consonantCount() method should count the
//			number of consonants in the array.  The scrubber() method
//			should remove all non-vowels and non- consonants from the array.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java3907a.dat
//		Also test with  ->	Java3907b.dat
//
//	SAMPLE OUTPUT:
//		ORIGINAL ARRAY:
//		[a, j, k, 6, e, w, 8, *, u, b, }, 2, @, k, %, a, l, +, z]
//
//		SCRUBBED ARRAY:
//		[a, j, k, e, w, u, b, k, a, l, z]
//
//		There are 4 vowels and 7 consonants.
//
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3907{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private String[] letters;

	public Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		try
		{
		

		}catch(Exception e){}
	}

	public String[] scrubber(String[] list)
	{
	
		return null;
	}

	public int vowelCount()
	{
		return 0;
	}

	public int consonantCount()
	{
		return 0;
	}

	public void run()
	{
		out.println("ORIGINAL ARRAY:");
		out.println( Arrays.toString(letters) );
		out.println();

		letters = scrubber(letters);

		out.println("SCRUBBED ARRAY:");
		out.println( Arrays.toString(letters) );
		out.println();
		out.println( "There are "+vowelCount()+" vowels and "+consonantCount()+" consonants." );
		out.println();
		out.println();
	}
}

