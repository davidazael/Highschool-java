////////////////////////////////////////////////////////////////////////////
//
// Java1503 Often a complicated if-then-else statement can be
//         simplified by rewriting it as a simplistic switch
//         statement.  Convert the following if - else
//         statements into a switch statement and write a program
//         that asks for a person's age.
//
//         Determine the price of admission to a fall fundraising
//         festival as a result of the person's age.  Format your answer
//		   to dollars and cents.
//
//         if (age == 23)
//           price = 5.15;
//         else
//           if ((age == 22) || (age == 21) || (age == 20))
//             price = 4.75;
//           else
//             if ((age == 19) || (age == 18))
//               price = 3.25;
//             else
//               if ((age > 14) && (age <17))
//                 price = 2.60;
//               else
//                 if (age == 14)
//                   price = 1.55;
//                 else
//                   price = 1.00;
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter age ==> 19
//
//     SAMPLE OUTPUT:  Admission for a 19 year old is $3.25
//
///////////////////////////////////////////////////////////////////////////
//
//      ACTUAL INPUT:  16
//                     25
//                     11
//
///////////////////////////////////////////////////////////////////////////

import java.util.*;
import static java.lang.System.*;

public class Java1503{
	public static void main(String[] args)	{
		new Problem();
}}


class Problem
{
  	int age;
  	double price;

  	public Problem()
  	{
  		input();
  		process();
  		output();
  	}

	public void input()
	{
		Scanner scan = new Scanner(in);
      	out.print("Please enter your age => ");
      	age = Integer.valueOf(scan.nextLine());
      	
	}

	public void process()
	{
		///////////////////////////////////////////////////////////////////
		//	Complete the switch statement
		///////////////////////////////////////////////////////////////////
		
		if (age == 23)
		  price = 5.15;
		else
		  if ((age == 22) || (age == 21) || (age == 20))
		    price = 4.75;
		  else
		    if ((age == 19) || (age == 18))
		      price = 3.25;
		    else
		      if ((age > 14) && (age <17))
		        price = 2.60;
		      else
		        if (age == 14)
		          price = 1.55;
		        else
		          price = 1.00;

	}

	public void output()
	{
		out.println();
		out.println("Admission for a " + age + " year old is " + String.format("$%.2f",price) );
		out.println();
	}
}

