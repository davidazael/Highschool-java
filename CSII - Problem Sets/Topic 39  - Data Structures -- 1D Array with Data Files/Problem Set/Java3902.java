///////////////////////////////////////////////////////////////////////////
//
// Java3902	Standardized test such as the SAT are administered with
//			different forms.  As a result there are multiple answer keys.
//			Test results are stored as true for a correct answer and false
//			for an incoreect answer.
//
//			Write a program to read an n followed by n pieces of data
//			file and report the number of correct and incorrect answers.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java3902a.dat
//		Also test with  ->	Java3902b.dat
//
//   SAMPLE DATA FILE:
//		18
//		true
//		true
//		false
//		  <etc. for a total of 18 boolean values>
//
//	 SAMPLE OUTPUT:
//		SCORED ANSWERS
//		true
//		true
//		false
//		  <etc. for a total of 18 boolean values>
//
//		RESULTS
//		There are 18 questions.
//		There are 7 correct answers.
//		There are 11 incorrect answers.
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3902{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private boolean[] answers;

	public Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		try
		{
			Scanner scanFile = new Scanner(new File("Java3902b.dat") );
			
			int n = Integer.valueOf( scanFile.nextLine() );
			
			answers = new boolean[n];
			
			for (int i = 0; i < answers.length; i++) 
				{
					answers[i] = Boolean.valueOf(scanFile.nextLine() );
				}	

		}catch(Exception e){}
	}

	public int countTrue(boolean[] list)
	{
		int z = 0;
		for (int i = 0; i < answers.length; i++)
		{
			if( answers[i] == true )
				z++;			
		}
		return z;
	}

	public int countFalse(boolean[] list)
	{
		int z = 0;
		for (int i = 0; i < answers.length; i++)
		{
			if( answers[i] == false )
				z++;			
		}
		return z;
	}

	public void run()
	{
		out.println("SCORED ANSWERS");
		for(boolean datum: answers)
			out.println( datum );
		out.println();
		out.println("RESULTS");
		out.println( "There are " + answers.length      + " questions."         );
		out.println( "There are " + countTrue(answers)  + " correct answers."   );
		out.println( "There are " + countFalse(answers) + " incorrect answers." );
		out.println();
	}
}
















