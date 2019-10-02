///////////////////////////////////////////////////////////////////////////
//
// Java3702 Write a program to store an array of 10 random numbers from -25
//          to 25. Print the original array, the smallest number, and the
//          largest number. DO NOT COPY THE ALGORITHM FROM THE LESSON SETS.
//
//     SAMPLE DATA:  randomly generated
//
//   SAMPLE OUTPUT:  (RUN SEVERAL TIMES TO CHECK RANGE!)
//
//		The original array: [-1, -6, 9, 19, -6, 19, -3, -5, -5, 1]
//		The smallest number is -6
//		The largest number is 19
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3702{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	int[] list = new int[10];
	public Environment()
	{
		populate();
		run();
	}
	private void populate()
	{
		for (int i = 0; i < list.length-1; i++) 
			{
				list[i] = (int)(Math.random()*50 - 25);				
			}
	}
	public void run()
	{
		out.println();
		out.println("The original array: " + Arrays.toString( list )/* use Arrays utility */);
		out.println();
		out.println("The smallest number is " + smallest() /* activate smallest() */);
		out.println();
		out.println("The largest number is " + largest() /* activate largest() */);
		out.println();
	}
	public int smallest()
	{
		int total = 25;
		for (int i = 0; i < list.length; i++) 
			{
				if(total > list[i])
					total = list[i];				
			}

		return total;
	}
	public int largest()
	{
		int total = -25;
		for (int i = 0; i < list.length; i++) 
			{
				if(total < list[i])
					total = list[i];				
			}


		return total;
	}
}




