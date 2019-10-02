///////////////////////////////////////////////////////////////////////////
//
// Java2701	Create a parameterized ArrayList of gpa's.  Count the number of
//          gpa's below 5.0.  Display the output as shown below:
//
//		[6.5, 6.3, 5.5, 4.3, 4.0, 6.1, 3.2, 2.5, 6.7, 6.2, 4.9, 5.0]
//		There were 12 gpas in the list.
//		There were 5 gpas below 5.0 and 7 gpas at 5.0 or higher.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2701{
	public static void main(String[] args){
		new Lesson();
}}


class Lesson
{
	ArrayList<Double/* Generic type */>  gpas;
	int count;

	Lesson()
	{
		populate();
		process();
		output();
	}

	void populate()
	{
		gpas = new ArrayList<Double>();/* instantiate ArrayList with Generic type */
		gpas.add(6.5);
		gpas.add(6.3);
		gpas.add(5.5);
		gpas.add(4.3);
		gpas.add(4.0);
		gpas.add(6.1);
		gpas.add(3.2);
		gpas.add(2.5);
		gpas.add(6.7);
		gpas.add(6.2);
		gpas.add(4.9);
		gpas.add(5.0);
	}

	void process()
	{
		for (int i = 0; i < gpas.size() ; i++) 
		{
			double bob = gpas.get(i);
			if(bob >= 5)
				count++;
				
	    }
	}


	void output()
	{
		double sub = count - gpas.size();
		out.println("There were "+ gpas.size() + " gpas in the list."  );
	
		out.println("There were "+ (int)Math.abs(sub) +" gpas below 5.0 and "+ count +" gpas at 5.0 or higher.");
	}
}




