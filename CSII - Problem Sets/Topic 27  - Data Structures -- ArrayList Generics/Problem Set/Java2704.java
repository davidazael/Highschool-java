///////////////////////////////////////////////////////////////////////////
//
// Java2704	What’s Trending on Twitter? Trending topics are those topics
//          being discussed more than others. Create a parameterized
//          ArrayList from a datafile called "HashTagTrends.dat".
//
//   SAMPLE DATA FILE:
//		#mtvstars
//		#peopleschoice
//		#gameinsight
//		#scifiactor
//		#rt
//
// 		After populating the ArrayList, "scrub" the hashtags from each
//      trend in the ArrayList.  Print the freshly scrubbed ArrayList
//      TO A DATA FILE called "HashTagTrendsSolutions.dat". Each
//      trend should be on an individual line in the resulting data file.
//
//   **  You will need to open the data file you have written to see
//       if each hashtag was removed from the trending topic.
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Java2704{
	public static void main (String[] args){
		new Problem();
}}


class Problem
{
	// Declare ArrayList
	???? outFile;

	Problem()
	{
		populate();
		scrub();
		outputToDataFile();
	}

	void populate()
	{
		// Instantiate ArrayList
		try
		{


		}catch(Exception e){out.println("Oops");}
	}

	void scrub()
	{

	}

	void outputToDataFile()
	{
		try{
			outFile = new ?????( new File(?????) );
		}catch(Exception e){}
		out.println("Writing to data file");

		// output ArrayList to data file
		// each element on its own line

	}
}



