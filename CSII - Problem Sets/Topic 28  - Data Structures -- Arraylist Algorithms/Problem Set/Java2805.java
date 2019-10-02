///////////////////////////////////////////////////////////////////////////
//
// Java2805	 Use the addAll() method to populate an ArrayList of
//			 integers. Output only the odd numbers in the list, arranged
//			 vertically.  Use the enhanced super loop for your output.
//
//			ARRAYLIST ELEMENTS: 12,24,100,5,7,12,15,45,87,26,-7,-1
//
///////////////////////////////////////////////////////////////////////////
//
//			INPUT:  None
//
//		    SAMPLE OUTPUT:
//			The original list ==> [12, 24, 100, 5, 7, 12, 15, 45, 87, 26, -7, -1]
//
//			The odd numbers in the list are:
//			5
//			7
//			15
//			45
//			87
//			-7
//			-1
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2805{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	// Instantiate ArrayList
	ArrayList<Integer> nums = new ArrayList<Integer>();

	Solution()
	{
		populate();
		output();
	}

	void populate()
	{
		nums.addAll(Arrays.asList(12, 24, 100, 5, 7, 12, 15, 45, 87, 26, -7, -1));
	
	}

	void output()
	{
		out.println();
		out.println("The original list ==> " + nums);
		out.println();

		///////////////////////////////////////////////////////
		// output the odd numbers using an enhanced for() loop
		///////////////////////////////////////////////////////
		
		for (int i = 0; i < nums.size(); i++) 
			{
				if( nums.get(i) % 2 == 0 )
				{
					nums.remove(i);					
				}
	    	}
	
		out.println("The odd numbers in the list are:");
		for (int x = 0; x < nums.size(); x++) 
			{
				out.println(nums.get(x));
	    	}
	}
}

