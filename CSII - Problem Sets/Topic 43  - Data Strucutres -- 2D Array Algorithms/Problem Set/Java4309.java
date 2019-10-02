///////////////////////////////////////////////////////////////////////////
//
//  Java4309 You are the public relations executive for an advertising
//           company and it is your responsibility to come up with a
//           new slogan for a major client.  You task is to randomly
//           pick a work from a column to come up with a catchy phase.
//
//           Write a program that reads strings from a data file into
//			 a two dimensional array.  Randomly choose a word from
//			 each column in the array.  Write out 3 possible new slogans.
//
//	DATA FILES:
//		First test file -> 	Java4309.dat
//
///////////////////////////////////////////////////////////////////////////
//
//   SAMPLE DATA FILE INPUT:
/*

Eat Chunky Cheese Daily
Nibble Stringy Beef Now
Gobble Creamy Chicken Forever
Devour Chewy Pork Today
Munch Delicious Vegetables Often
Chew BBQ Buffalo Soon

*/
//
//	SAMPLE OUTPUT:
//		The actual data is:
//		       Eat:    Chunky:    Cheese:     Daily:
//		    Nibble:   Stringy:      Beef:       Now:
//		    Gobble:    Creamy:   Chicken:   Forever:
//		    Devour:     Chewy:      Pork:     Today:
//		     Munch: Delicious:Vegetables:     Often:
//		      Chew:       BBQ:   Buffalo:      Soon:
//
//		Possible Slogans:
//		1) Devour Chunky Beef Often
//		2) Chew Chunky Vegetables Often
//		3) Munch Chewy Beef Soon
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4309{
	public static void main(String args[]){
		new Environment();
}}


class Environment
{
	private String[][] words;

	Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		String fileName = "Java4309.dat";

		try
		{
			Scanner file = new Scanner( new File(fileName) );

			int rowCount = 0;
			int colCount = 0;
			while(file.hasNextLine())
			{
				colCount = file.nextLine().split(" ").length;
				rowCount++;
			}

			words = new String[rowCount][colCount];

			file = new Scanner( new File(fileName) );
			for(int row=0; row<words.length; row++)
				for(int col=0; col<words[0].length; col++)
					words[row][col] = file.next();
		}
		catch(Exception e){}
	}

	public void run()
	{
		out.println("The actual data is:");
		outputData( words );

		String[][] slogans = createSlogans( words );

		out.println("Possible Slogans:");
		outputSlogans( slogans );
	}

	public String[][] createSlogans(String[][] data)
	{
		// Complete this method


		return null;
	}

	public void outputData(String[][] data)
	{
		for(int row=0; row<data.length; row++)
		{
			for(int col=0; col<data[0].length; col++)
				out.printf( "%10s:", data[row][col] );
			out.println();
		}
		out.println();
	}

	public void outputSlogans(String[][] data)
	{
		for(int row=0; row<data.length; row++)
		{
			out.print( "" + (row+1) + ") " );
			for(int col=0; col<data[0].length; col++)
				out.print( data[row][col] + " " );
			out.println();
		}
		out.println();
	}
}




