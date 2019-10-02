///////////////////////////////////////////////////////////////////////////
//
// Java2307	Write a program that reads the data file "ToothBook.dat".
//			Count how many lines are in the book.
//			Count how many words are in the book.
//
//	INPUT: ToothBook.dat
//
//	SAMPLE OUTPUT:
//		There are 164 lines in the file Toothbook.dat
//		There are 431 words in the file Toothbook.dat
//
//          ALSO TEST WITH: "Stairway to Heaven.dat"
//
//  CHALLENGE: The nextLine() method also counts blank lines. Modify the
//             code so that blank lines are NOT counted in the line count.
///////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;
import java.util.*;
import java.io.*;


public class Java2307{
	public static void main(String args[]){
		new Solution();
}}


class Solution
{
	int wordCount,lineCount;
	String fileName;

	Solution()
	{
		fileName = "ToothBook.dat";
		input();
		output();
	}

	void input()
	{
		try
		{
			Scanner fileScan = new Scanner(new File(fileName));
			String lineCount = fileScan.nextLine();
			while( fileScan.hasNextLine() )
			{
				lineCount.length();
			}

			// reset fileScan object here to top of data file
			fileScan = new Scanner(new File(fileName));
			String wordCount = fileScan.next();

			while( fileScan.hasNext() )
			{
				wordCount.length();
			}
		}
		catch( Exception e ){}


		out.println();
	}

	void output()
	{
		out.println("There are "+lineCount+" lines in the file "+ fileName);
     	out.println("There are "+wordCount+" words in the file "+ fileName);
	}
}
