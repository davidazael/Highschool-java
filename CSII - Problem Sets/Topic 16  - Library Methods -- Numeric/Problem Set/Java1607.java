///////////////////////////////////////////////////////////////////////////
//
// Java1607 Use the pythagorean theorem and Math methods to find
//			the length of the hypotenuse.
//                            ______________
//  THEOREM:  hypotenuse =  v/  x^2 + y^2
//
//                  6
//               -------
//               |    /
//               |   /
//           10  |  /   hypotenuse
//               | /
//               |/
//
///////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT:  Enter side 1 of triangle: 10
//				   Enter side 2 of triangle: 6
//
//  SAMPLE OUTPUT:
//			With sides of 10 and 6 the hypotenuse of the triangle is
//          11.661903 or approximately 12
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java1607{
	public static void main(String[] args){
		new Problem();
}}

class Problem
{
	double side1,side2;
	double theorem;

	Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter the first side of the triangle: ");
		side1 = Double.valueOf(scan.nextLine());

		out.print("Enter the second side of the triangle: ");
		side2 = Double.valueOf(scan.nextLine());

	}

	void process()
	{
		//  THEOREM:  hypotenuse =  v/  x^2 + y^2
		
		
		theorem =  Math.hypot(side1,side2);
		


	}

	void output()
	{
		out.println("With sides of "+ side1 +" and " + side2 + " the hypotenuse of the triangle is "+ theorem +" or approximately " + Math.round(theorem) +"." );

	}

}

