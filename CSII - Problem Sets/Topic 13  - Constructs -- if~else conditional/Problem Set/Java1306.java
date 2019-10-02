 ///////////////////////////////////////////////////////////////////////////
//
// Java1306  Write a program that uses a combination of && and || to
//           accomplish a task. You must either use Container Input and Output
//           (TextAreas, Buttons, etc) or data file input/output.
//
//           NOTE:  You are designing the solution, not the problem set. If
//                  Waterman likes it, she will use it for a future problem
//                  set and quote YOU as the author!
//
///////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;
import java.util.*;

public class Java1306{
	public static void main (String[] args)	{
		new Problem();
}}


class Problem
{
	int age;
	String name, message;

	public Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);

		out.print("Enter Your Name: ");
		name = scan.nextLine();

		out.print("Enter Your Age: ");
		age = Integer.valueOf(scan.nextLine());
		
	}

	void process()
	{
		if( age < 21 && age > 5)
		{
			message = name + ", you are still a baby.";
		}
		if( age > 21 && age < 22)
		{
			message = name + ", you are not old but you are now old enough to drink!";
		} 
		if( age >22 && age < 35)
		{
			message = name + ", you are getting older, you should start setteling down.";
		}
		if(age >35 && age < 50)
		{
			message = name + ", how many kids do you have?";
		}
		if(age > 50 || age <=5)
		{
			message = name + ", someone must look after you.";
		}
	}

	void output()
	{
		out.println(message);

	}
}

