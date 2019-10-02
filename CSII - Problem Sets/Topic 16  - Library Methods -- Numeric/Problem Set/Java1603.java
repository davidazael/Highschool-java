///////////////////////////////////////////////////////////////////////////
//
// Java1603 Use the Math.pow() method to display all the powers of
//			an input value up to an exponent of 8.
//
//  		For this problem, no processing is required.  Simply call the
//			pow() method in your output() method.  You will have to use
//			typecasting in the output.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter a number:  2
//
//     SAMPLE OUTPUT:  2^0 = 1
//					   2^1 = 2
//					   2^2 = 4
//					   2^3 = 8
//					   2^4 = 16
//					   2^5 = 32
//					   2^6 = 64
//					   2^7 = 128
//					   2^8 = 256
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1603{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	int num;

	public Problem()
	{
		input();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(System.in);
		out.print("Enter a number:" );
		num = Integer.valueOf(scan.nextLine());
	}

	public void output()
	{
		out.println(num + "^0 = " + (int)Math.pow(num,0));
		out.println(num + "^1 = " + (int)Math.pow(num,1));
		out.println(num + "^2 = " + (int)Math.pow(num,2));
		out.println(num + "^3 = " + (int)Math.pow(num,3));
		out.println(num + "^4 = " + (int)Math.pow(num,4));
		out.println(num + "^5 = " + (int)Math.pow(num,5));
		out.println(num + "^6 = " + (int)Math.pow(num,6));
		out.println(num + "^7 = " + (int)Math.pow(num,7));
		out.println(num + "^8 = " + (int)Math.pow(num,8));



	}

}



