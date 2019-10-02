///////////////////////////////////////////////////////////////////////////
//
// Java2804	Copy/paste 2803 into this program.  Use the enhanced for loop
//          to print the board games vertically.
//
//		    SAMPLE OUTPUT:
//			MONOPOLY
//			TABOO
//			RISK
//			BALDERDASH
//			CANDY LAND
//			LIFE
//			OPERATION
//			CLUE
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.awt.*;

public class Java2804{
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
				out.println(result.toUpperCase());
			}
	}

	void output()
	{
		out.println();
		out.println();
		out.println();
	}
}
