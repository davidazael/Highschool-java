///////////////////////////////////////////////////////////////////////////
//
// Java0506 Assign a letter to a char primitive variable and a number to
//          an int variable.  Use a loop to go from that letter in the
//          alphabet the numerical value amount of times.  For example:
//          If the letter is 'A' and the number is 10, it would print
//          ABCDEFGHIJ.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE DATA:  'H'
//                 5
//
//  SAMPLE OUTPUT:  HIJKL

import static java.lang.System.*;

public class Java0506
{
	public static void main(String[] args)
	{
		new Environment();
	}

}

class Environment
{
	char let;
	int num;

	public Environment()
	{
		num = 5;
		let = 'H';
		for(int x = (int)let; x < (let + num); x++)
		{
			out.print((char)x + "");
		}
		out.println();
	}
}

