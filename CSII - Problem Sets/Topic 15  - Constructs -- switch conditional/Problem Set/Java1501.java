///////////////////////////////////////////////////////////////////////////
//
// Java1501 WAP to calculate the cost of a telephone call when a code
//          number and the length of the call is input.  Output the 2
//          input values in a sentence along with the cost of the call.
//
//           code table:   code       rate per minute
//                          1               0.14
//                          2               0.22
//                          3               0.73
//                          4               1.12
//                          5               2.38
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter the code ==> 2
//				       Enter minutes ==> 35
//     SAMPLE OUTPUT:  Your code 2 call for 35 minutes costs $7.70.
//
///////////////////////////////////////////////////////////////////////////
//
//      ACTUAL INPUT:  3 10
//                     5 45
//                     1 70
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1501{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
  	int     code;
  	int     callLength;
  	double  cost;

  	public Problem()
  	{
  		input();
  		process();
  		output();
  	}

	public void input()
	{
		Scanner scan = new Scanner(in);
      	out.print("Please enter the code number => ");
      	code = Integer.valueOf(scan.nextLine());
      	
      	out.print("Please enter the length of the call => ");
      	callLength = Integer.valueOf(scan.nextLine());
      
	}

	public void process()
	{
		///////////////////////////////////////////////////////////////////
		//	Complete the switch statement
		///////////////////////////////////////////////////////////////////
		
		
		switch(code)
		{
			case 1 : cost = 0.14  * callLength ;break;
			case 2 : cost = 0.22  * callLength ;break;
			case 3 : cost = 0.73  * callLength ;break;
			case 4 : cost = 1.12  * callLength ;break;
			case 5 : cost = 2.38  * callLength ;break;
		}
		
		
		






	}

	public void output()
	{
		out.println("Your code " + code + " call for " + callLength + " minutes costs " + String.format("$%,.2f",cost) + "." );
	}
}