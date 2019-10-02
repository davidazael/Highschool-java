///////////////////////////////////////////////////////////////////////////
//
// Java1504 Mr. Arthur Einstein, your high school physics teacher,
//          wants a program for English to metric conversions.  The
//          input values will be a letter (P for pounds, F for feet,
//          or M for miles) and a real number, and the program is to
//          make the appropriate conversions.  There are 4.9 newtons
//          in a pound, 3.28 feet in a meter, and 1.61 kilometers
//          in a mile.
//
//           code table:   code         rate conversions
//                          P         base unit = pounds
//                                         rate = 4.9
//                                    conv unit = newtons
//                          F         base unit = feet
//                                         rate = 0.30488
//                                    conv unit = meters
//                          M         base unit = miles
//                                         rate = 1.61
//                                    conv unit = kilometers
//
///////////////////////////////////////////////////////////////////////////
//
//       SAMPLE INPUT:  Enter P, F, or M ==> M
//						Enter real number ==> 3.0
//
//      SAMPLE OUTPUT:  3.0 miles = 4.83 kilometers
//
///////////////////////////////////////////////////////////////////////////
//
//       ACTUAL INPUT:  M  5.0
//                      F  120
//                      P  7.2
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java1504{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
  	int     code;
  	double  realNum;
  	double  rate;
  	String solution, message, bob;
  	

  	public Problem()
  	{
  		input();
  		process();
  		output();
  	}

	public void input()
	{
		Scanner scan = new Scanner(in);
      	out.print(" Enter P, F, or M ==> ");
      	code = Character.toUpperCase( scan.nextLine().charAt(0) );
      	
      	out.print("Enter real number ==> ");
      	realNum = Double.valueOf(scan.nextLine());
      
	}

	public void process()
	{
		///////////////////////////////////////////////////////////////////
		//	Complete the switch statement
		///////////////////////////////////////////////////////////////////
		
		
		switch(code)
		{
			case 'P' : 	rate = 4.9 * realNum ;
						message = "punds" ;
						solution = "newtons";
						bob = realNum +" " + message + " = " + rate +" " + solution ;
					break;
			
			case 'F' : 	rate = 0.30488 * realNum ;
						message = "feet" ;
						solution = "meters";
						bob = realNum +" " + message + " = " + rate +" " + solution ;
					break;
			
			
			case 'M' :	rate = 1.61 * realNum ;
						message = "miles" ;
						solution = "kilometers";
						bob = realNum +" " + message + " = " + rate +" " + solution ;
				   break;
				   
			default : bob = "Some of your input data is incorect. Please try again!"; break;
		}
		
		

	}

	public void output()
	{
		out.println(bob);
	}
}