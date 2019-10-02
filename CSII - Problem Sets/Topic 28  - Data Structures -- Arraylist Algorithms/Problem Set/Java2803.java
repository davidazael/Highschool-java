///////////////////////////////////////////////////////////////////////////
//
// Java2803	Write a program that uses the addAll() method and Arrays.asList()
//			method to populate an ArrayList of eight board games.  Then
//			output the list in all caps.
//
//			ARRAYLIST ELEMENTS: Monopoly, Taboo, Risk, Balderdash, etc.(8 items)
//
///////////////////////////////////////////////////////////////////////////
//
//			INPUT:  None
//
//		    SAMPLE OUTPUT:
//			[MONOPOLY, TABOO, RISK, BALDERDASH, CANDY LAND, LIFE, OPERATION, CLUE]
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.awt.*;

public class Java2803{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	// Instantiate ArrayList
	ArrayList<String> games = new ArrayList<String>();
	String result;
	
	Solution()
	{
		populate();
		process();
		output();
	}

	void populate()
	{
		//	use addAll() to populate
		games.addAll(Arrays.asList("Monopoly", "Taboo", "Risk", "Balderdash", "Candy Land", "Life", "Operation", "Clue"));
	}
	
	void process()
	{
		for (int i = 0; i<games.size(); i++) 
			{
			//	result = games.get(i);
			//	result = games.get(i).toUpperCase();
				result = games.set(i,games.get(i).toUpperCase());
		//		out.println(games.get(i).toUpperCase()); 
		//		out.println(games);
			}
	}

	void output()
	{
		out.println();
		out.println(games);
		out.println();
	}
}


