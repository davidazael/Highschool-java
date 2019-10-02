///////////////////////////////////////////////////////////////////////////
//
// Java0901 Time to test user input. Ask the user for a whole number
//          followed by a real number.  See sample input/output below
//          for situational output/program termination.
//
///////////////////////////////////////////////////////////////////////////
//
//      KEYBOARD INPUT:					SAMPLE OUTPUT:  
//            4  3.6					You entered 4 and 3.6
//          1.2							BAD DATA (terminates)
//            3   4                     You entered 3 and 4.0
//         okay                         BAD DATA (terminates)
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.io.*;
import java.util.*;

class Java0901{
	public static void main(String[] args)
	{
		new InputCheck();
}}

class InputCheck
{

	int n1;
	double n2;

	public InputCheck()
	{
		input();
		output();
	}

	public void input()
	{
		// Scanner reference instantiation here (keyboard input)
		Scanner scan = new Scanner(in);
		
     	out.println("Enter a whole number followed by a real number:");
     
     	
        
        try
        {
		  	n1 = Integer.valueOf(scan.nextLine());
     		n2 = Double.valueOf(scan.nextLine()); // user input to be tested
	    }
	   	catch(NumberFormatException error )
	    {
	    	out.println("BAD DATA");
	    	exit(1);	// abnormal termination here
	    }
	}
	
	public void output()
	{
		out.println("You entered " + n1 + " and " + n2);
		
	}
}

