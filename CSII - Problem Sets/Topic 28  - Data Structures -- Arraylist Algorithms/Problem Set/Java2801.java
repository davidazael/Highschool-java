///////////////////////////////////////////////////////////////////////////
//
// Java2801  Your parents' home insurance company needs a list of all the
//			 furniture in your room.  The data will be input as one line
//			 separated by spaces, and needs to be chopped and populated
//			 into an ArrayList.  Then the ArrayList should be outputed.
//
///////////////////////////////////////////////////////////////////////////
//
//		SAMPLE INPUT:
/*

table chair desk bed chest-of-drawers lamp mirror

*/
//
//		SAMPLE OUTPUT:
//
//		Your furniture ==> [table, chair, desk, bed, chest-of-drawers, lamp, mirror]
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2801{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	// Instantiate ArrayList
	ArrayList<String> furniture = new ArrayList<String>(); 

	// Declare input instance variable
	String furn;


	Solution()
	{
		input();
		populate();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner( in );
		
		out.println("Enter a list of the furniture in your room");
		out.println("separated by single spaces");
		furn = scan.nextLine();

     	// allow user to enter one line of data
     	
	}

	void populate()
	{
		// instantiate Scanner object to be tokenized
		Scanner chopper = new Scanner(furn);
	//	chopper.useDelimiter(" ");
			

		// loop & add data to ArrayList
		while(chopper.hasNext())
		{
			String stuff = chopper.next();
			furniture.add(stuff);
		}
	
	}

	void output()
	{
		out.println();
		out.println("Your furniture ==> "  + furniture);
		out.println();
	}
}



