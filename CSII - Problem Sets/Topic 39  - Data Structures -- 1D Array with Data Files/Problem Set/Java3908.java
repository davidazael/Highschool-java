///////////////////////////////////////////////////////////////////////////
//
// Java3908 We are all lazy when it comes to typing text messages.
//			In fact there are many acronyms used by texters to help
//			easy our typing burden.  In this program you are to read
//			a data file of standard messages into an array.
//
//			From this message array create a new array of acronyms.
//
//		HINT:
//			As a reminder we can use split on a String to create
//			an array of words from the string.
//
//
//			String phrase = "At Your Own Risk";
//
//			String[] working = phrase.split(" ");
//
//			working --> ["At", "Your", "Own", "Risk"]
//
//
///////////////////////////////////////////////////////////////////////////
//
//  DATA FILES:
//		First test file -> 	Java3908a.dat
//		First test file -> 	Java3908b.dat
//
//	SAMPLE OUTPUT:
//		TEXT MESSAGES:
//		[All Done Bye Bye, As Soon As Possible, At Your Own Risk, Bye Bye for Now, Blue
//		Screen of Death, Check your Email, Does Not Compute, Fatal Error, Give Me A Brea
//		k, Looks Like Trouble, Stay In Touch]
//
//		TEXT ACRONYMS:
//		[ADBB, ASAP, AYOR, BBFN, BSOD, CYE, DNC, FE, GMAB, LLT, SIT]
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3908{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private String[] textMessages;

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

	public String[] acronyms(String[] list)
	{
		return null;
	}

	public String decoder(String p)
	{
		return null;
	}

	public void run()
	{
		out.println("TEXT MESSAGES:");
		out.println( Arrays.toString(textMessages) );
		out.println();

		String[] shorthand = acronyms(textMessages);

		out.println("TEXT ACRONYMS:");
		out.println( Arrays.toString(shorthand) );
		out.println();
	}
}




