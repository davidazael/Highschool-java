///////////////////////////////////////////////////////////////////////////
//
// Java1602 There are three categories of college professor:  The "really
//			mean" professor, the "really nice" professor, and the
//			"mathematically precise" professor.
//
//			Write a program that asks the user for a real grade and
//			then stores the grade as an integer three different ways:
//		    the "mean" professor ALWAYS rounds down; the "nice" professor
//			ALWAYS rounds up; and the "precise" professor rounds to the
//			CORRECT decimal place.
//
//			Use the Math methods (hmm, which ones? ) needed to process
//			this grade.
//
//   WARNING!  Most Math methods return a floating point number.  If
//			   you want to store the answer as an int, you will have to
//			   typecast when you store the grades!!
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:     Is your professor mean, nice, or precise? mean
//					  Enter your grade: 89.4
//
//	SAMPLE OUTPUT:    89.4 to the mean professor is 89
//
/*************************************************************************/
//         NOTICE:
//					  89.4 to the nice professor is 90
//					  89.4 to the precise professor is 89
//


import static java.lang.System.*;
import java.util.*;

public class Java1602{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	double grade;
	String professor;

	public Problem()
	{
		input();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(System.in);

		out.print("Is your professor mean, nice, or precise?  ");
		professor = scan.nextLine().toUpperCase();

		out.print("Enter your grade==>  " );
		grade = Double.valueOf(scan.nextLine());
	}

	public void output()
	{
		if(professor.equalsIgnoreCase("mean"))
		{
			out.println( grade + " to the mean professor is " + Math.floor(grade) );
		}
		if(professor.equalsIgnoreCase("really nice"))
		{
			out.println( grade + " to the " + professor.equals("really nice") +" professor is " + Math.ceil(grade) );
		}
		if(professor.equalsIgnoreCase("precise"))
		{
			out.println( grade + " to the " + professor.equals("mathematically precise") +" professor is " + Math.abs(grade) );
		}

	}

}




