///////////////////////////////////////////////////////////////////////////
//
// Java3705 Write a program to populate an Array with random integer data.
//			After populating the list, display the data in its original order.
//			Sort the list numerically using the Arrays.sort() algorithm.
//			Finally print the sorted list using the Arrays.toString() method.
//
//
//	 SAMPLE OUTPUT:
//		ORIGINAL LIST:
//		[125, 5743, 3456, -46, 65, 30, 5, 2, 8, 4, 9, 2, 5, -35]
//
//		SORTED LIST:
//		[-46, -35, 2, 2, 4, 5, 5, 8, 9, 30, 65, 125, 3456, 5743]
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3705{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	private int[] numbers;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		numbers = new int[]{125, 5743, 3456, -46, 65, 30, 5, 2, 8, 4, 9, 2, 5, -35};
	}

	public void run()
	{
		out.println();
		out.println("ORIGINAL LIST:");
		/* ? */
		out.println( Arrays.toString( numbers ) );

		//use the utility sort to sort the array
		Arrays.sort( numbers );

		out.println();
		out.println("SORTED LIST:");
		/* ? */
		out.println( Arrays.toString( numbers ) );
		out.println();
		out.println();
	}

	public void display()
	{

	}
}



