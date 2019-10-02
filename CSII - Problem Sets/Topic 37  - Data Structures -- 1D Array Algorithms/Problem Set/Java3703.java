///////////////////////////////////////////////////////////////////////////
//
// Java3702 Write a program to store an array of grades. Write a display()
//          method and average() method to show the grades and their average.
//
//          Ask the user for a value to curve the grades. Write a curveGrades()
//          method that adds the value to the grades. Display the grades and
//          average after curved values have been added.
//
//          NOTE: No one can make a grade over a 100.
//
//     SAMPLE DATA:  {75, 92, 42, 55, 68, 85, 60, 73}
//
//   SAMPLE OUTPUT:
//
//		Grades: [75, 92, 42, 55, 68, 35, 60, 73, 65, 47]
//		Average of grades: 61.2
//
//		How much to curve grades --> 10
//
//		Grades: [85, 100, 52, 65, 78, 45, 70, 83, 75, 57]
//		Average of grades: 71.0
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3703{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	// declare and fill array
	int list[] = {75, 92, 42, 55, 68, 85, 60, 73};
	public Environment()
	{
		run();
	}
	public void run()
	{
		display();

		Scanner scan = new Scanner(in);
		out.print("How much to curve grades --> ");
		int value = Integer.valueOf(scan.nextLine());

		curveGrades(value);

		display();
	}
	public void display()
	{
		out.println("Grades: " + Arrays.toString( list ) );
		out.println("Average of grades: " + average() );
		out.println();			
		out.println();			
		out.println();			
		
	}
	public double average()
	{
		int total = 0;
		for (int i = 0; i < list.length; i++) 
			{
				total += list[i]; 
			}
			double ave = total / list.length-1;	
						
		return ave;
	}
	public void curveGrades(int value)
	{
		for (int i = 0; i < list.length; i++) 
			{
				list[i] = list[i] + value;
			}
	}



}




