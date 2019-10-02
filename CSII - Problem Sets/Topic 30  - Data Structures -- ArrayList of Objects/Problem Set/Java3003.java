///////////////////////////////////////////////////////////////////////////
//
// Java3003	Create a data structure class for movies.  The data
//			structure must contain the following fields:
//
//			String title
//			int length
//
//			A video collector wants to be able to seach his video
//			collection for various information.  You are to begin the
//			design process.  Use a populate method to read the video
//			data into a parameterized ArrayList of Video.  Find the
//			shortest and longest movie and print the titles of the
//			movies.
//
///////////////////////////////////////////////////////////////////////////
//
//	DATAFILE INPUT:  "Java3003.dat"
//
//	SAMPLE OUTPUT:
//
//  [<Shrek,133>, <Road to Perdition,117>, <The Truth about Cats and Dogs,93>, <Enig
//  ma,114>, <Grown Ups,102>, <The Last Air Bender,123>, <Hulk,113>, etc]
//
//  Shortest movie: ??????
//  Longest movie: ???????
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Java3003{
	public static void main (String[] args){
		new Solution();
}}


class Solution
{
	ArrayList<Movie> movieType = new ArrayList<Movie>();
	String typeOfMovie;
	int movieTime, longest, shortest;

	Solution()
	{
		populate();

		outputAll();
		outputShortest();
		outputLongest();
	}

	void populate()
	{

		try{
			Scanner fileScan = new Scanner(new File("Java3003.dat"));
			while(fileScan.hasNextLine())
			{
				typeOfMovie = fileScan.nextLine();
				movieTime = Integer.valueOf(fileScan.nextLine());
				
				movieType.add( new Movie(typeOfMovie, movieTime) );
			}
				
			}catch(Exception e){}
	}

	void outputAll()
	{
		out.println( movieType );
		out.println();

	}

	void outputShortest()
	{
		shortest = 999 ;
		String shortestMovieName = ""; // assign 1st element to shortest
		// Process the ArrayList and select the shortest movie
		for(Movie temp: movieType)
		{
			if(temp.getTime() <= shortest )
			{
				shortest = temp.getTime();
				shortestMovieName = temp.getTitle();
			}
		}

		out.println();
		out.print( "Shortest Movie:"   );
		out.println( shortestMovieName );
		out.println();
	}

	void outputLongest()
	{
		longest = 0/* ???? */ ;
		String longestMovieName = "";

		// Process the ArrayList and select the longest Movie
		for(Movie temp: movieType)
		{
			if( temp.getTime() >= longest)
			{
				longest = temp.getTime();
				longestMovieName = temp.getTitle();
				
			}
					
		}

		out.println();
		out.print( "Longest Movie:"   );
		out.println( longestMovieName );
		out.println();
		out.println();
	}
}


class Movie
{
   	private String title;
	private int    duration;

	public Movie( String t, int d )
	{
		title = t;
		duration = d;
	}

	// Write the getTime() accessor method
	public Integer getTime()
	{
		return duration;
	}

	// Write the getTitle() accessor method
	public String getTitle()
	{
		return title;
	}

	// Write the toString() overloaded method
	public String toString()
	{
		return "<" + title + "," + duration + ">";
	}
}





