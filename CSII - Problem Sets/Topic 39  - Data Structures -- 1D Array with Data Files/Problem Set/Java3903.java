///////////////////////////////////////////////////////////////////////////
//
// Java3903	The bureau of labor and statistics is responsible for
//			counting all the citizens in the country.  The data files
//			for this program store the raw data for the cities that have
//			the greatest population.
//
//                       .--------------------	city
//                      /     .---------------	state
//                     /     /     .----------	population
//                    /     /     /
//                New York:NY:8175133
//                         \  \
//                          '--'--------------	delimiters
//
//
//			Write a program to read an n followed by n pieces of data
//			file and parse the data items to display only the city names.
//
//			Complete the citiesCount(String[] raw, String state) method.
//			This method counts the number of cities in the state passed
//			to the method in the state parameter.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java3903a.dat
//		Also test with  ->	Java3903b.dat
//
//   SAMPLE DATA FILE:
//		10
//		New York:NY:8175133
//		Los Angeles:CA:3792621
//		Chicago:IL:2695598
//		  <etc. for a total of 10 pieces of data>
//
//	 SAMPLE OUTPUT:
//		RAW DATA:
//		New York:NY:8175133
//		Los Angeles:CA:3792621
//		Chicago:IL:2695598
//		  <etc. for a total of 10 pieces of data>
//
//		CITY DATA:
//		New York
//		Los Angeles
//		Chicago
//		  <etc. for a total of 10 pieces of data>
//
//		RESULTS:
//		Number of cities in TX: 3
//		Number of cities in CA: 2
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3903{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private String[] rawData;
//	String[] cities;

	public Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		try
		{
			Scanner scanFile = new Scanner(new File("Java3903a.dat") );
			int n = Integer.valueOf( scanFile.nextLine() );
			rawData = new String[n];
			for (int i = 0; i < rawData.length ; i++) 
				{
					rawData[i] = scanFile.nextLine();
				}
			

		}catch(Exception e){}
	}

	public String[] parseData(String[] raw)
	{		
		String[] city = new String[raw.length];
		for (int i = 0; i < raw.length ; i++) 
				{
					String[] random = raw[i].split(":");
					city[i] = random[0];
				}	
		return city;
	}

	public int citiesCount(String[] raw, String state)
	{
		String[] states = new String[raw.length];
		int num = 0;
		for (int i = 0; i < raw.length; i++)
		{
			String[] random = raw[i].split(":");
			states[i] = random[1];
			if( states[i].equals(state) )
				num++;
		}			
		return num;
	}


	public void run()
	{
		out.println("RAW DATA:");
		for(String datum: rawData)
			out.println( datum );
		out.println();

		String[] cities = parseData(rawData);

		out.println("CITY DATA:");
		for(String datum: cities)
			out.println( datum );
		out.println();

		out.println("RESULTS:");
		out.print  ("Number of cities in TX:  ");
		out.println( citiesCount(rawData,"TX") );

		out.print  ("Number of cities in CA:  ");
		out.println( citiesCount(rawData,"CA") );
		out.println();
	}
}

