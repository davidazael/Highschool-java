///////////////////////////////////////////////////////////////////////////
//
// Java1705  A top secret encrypted message in a data file must be
//           unencrypted in order for you, a government agent, to complete
//           your mission. Here are the encrypted letters in the message:
//
//                  a - *
//                  e - !
//                  i - +
//                  o - &
//                  u - $
//                  0 (zero) - #
//
//       For example, this encrypted String:  + *m g&+ng t& th! st&r! at 4:##
//       Can be unencrypted to "i am going to the store at 4:00"
//
//       Read in the encrypted message and replace all the occurrences
//       of symbols with their corresponding unencrypted letters and
//       numbers according to the chart above.
//
///////////////////////////////////////////////////////////////////////////
//
//	 SAMPLE INPUT:
//		One encrypted String from a data file called "Secreta.dat"
//      (also run with "Secretb.dat")
//
//   SAMPLE OUTPUT:
//     < The encrypted secret message first>
//
//     < The unencrypted secret message second >
//
/////////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java1705
{
	public static void main(String[] args)
	{
		new TopSecret();
	}
}


class TopSecret
{
	String encrypted;
	String unencrypted;

	public TopSecret()
	{
		input();
		process();
		output();
	}

	public void input()
	{
		try
		{
			Scanner fileScan = new Scanner(new File("Secretb.dat"));
			encrypted = fileScan.nextLine();
			
			
		}
		catch(Exception e){};
		
	}

	public void process()
	{
		if(encrypted.contains("*"))
		{
			unencrypted = encrypted.replace("*","a");
		}
		
		if(encrypted.contains("!"))
		{
			unencrypted = unencrypted.replace("!","e");
		}
		if(encrypted.contains("+"))
		{
			unencrypted = unencrypted.replace("+","i");
		}
		if(encrypted.contains("&"))
		{
			unencrypted = unencrypted.replace("&","o");
		}
		if(encrypted.contains("$"))
		{
			unencrypted = unencrypted.replace("$","u");
		}
		if(encrypted.contains("#"))
		{
			unencrypted = unencrypted.replace("#","0");
		}
		
		
		
		
	}

	public void output()
	{
		out.println(encrypted);
		out.println();
		out.println(unencrypted);
	}
}



