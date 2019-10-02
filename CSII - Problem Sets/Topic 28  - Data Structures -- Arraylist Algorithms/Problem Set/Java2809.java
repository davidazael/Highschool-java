///////////////////////////////////////////////////////////////////////////
//
// Java2807 In many sports events, contestants are rated by judges with an
//          average score being determined by discarding the highest and
//          lowest scores and averaging the remaining scores.  Write a
//          program that sorts the scores and deletes both the high and
//          low score.  Use the remaining scores to compute the average
//          score for the contestant.  Be sure to output the scores used
//          to determine the averge score.  Randomly create the array of
//			eight scores.
//
//    Note:  Be sure to physically delete the scores form the array.
//
//     SAMPLE DATA:  6.1  7.2  6.8  6.9  7.1  6.9  7.0  6.9
//
//   SAMPLE OUTPUT:    Sorted ->  6.1  6.8  6.9  6.9  6.9  7.0  7.1  7.2
//                   Adjusted ->  6.8  6.9  6.9  6.9  7.0  7.1
//                    Average ->  6.93
//
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.awt.*;


public class Java2809{
	public static void main(String[] args){
		new Solution();
}}


class Solution
{
	ArrayList<Integer> nums = new ArrayList<Integer>();
	int sorted, adjusted, average;

	Solution()
	{
		populate();
		process();
		output();
	}

	void populate()
	{
		nums.addAll(Arrays.asList(6.1, 7.2,  6.8,  6.9,  7.1,  6.9,  7.0,  6.9));
	
	}

	void process()
	{
		sorted = Collections.sort(nums);
		adjusted = nums.remove(0);
		average = Math.
		
	
	}

	void output()
	{
		out.println();
		out.println( "Sorted   --> " + sorted );
		out.println( "Adjusted --> " + adjusted );
		out.println( "Average  --> " + String.format( "%1.2f", ???) );
		out.println();
	}
}


