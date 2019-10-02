///////////////////////////////////////////////////////////////////////////
//
// Java2806	Use the addAll() method to populate an ArrayList of
//			integers. Output the number of positive and negative numbers
//			in the list.  Use the enhanced super loop to process the data.
//
//			ARRAYLIST ELEMENTS: 17, -5, 4, 31, 72, -24, -93, 75, 38, -6
//
///////////////////////////////////////////////////////////////////////////
//
//			INPUT:  None
//
//		    SAMPLE OUTPUT:
//			The original list ==> [17, -5, 4, 31, 72, -24, -93, 75, 38, -6]
//			There are 6 positive numbers.
//			There are 4 negative numbers.
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2806{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	ArrayList<Integer> nums = new ArrayList<Integer>();
	int positives, negatives;	

	Solution()
	{
		populate();
		process();
		output();
	}

	void populate()
	{
		nums.addAll(Arrays.asList(17, -5, 4, 31, 72, -24, -93, 75, 38, -6));
	
	}

	public void process()
	{
		for (int i = 0; i < nums.size(); i++)
		{
			if(nums.get(i) >= 0)
			{
				positives++;
			}
			else
			{
				negatives++;
			}			
		}
	
	}

	void output()
	{
		out.println();
		out.println( "numbers o-->  "  + nums );
		out.println( "There are " + positives + " positive numbers." );
		out.println( "There are " + negatives + " negative numbers." );
		out.println();
		out.println();
	}
}

