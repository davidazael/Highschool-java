///////////////////////////////////////////////////////////////////////////
// NOTE: 40 pts (10 for each of the 4 parts)
// Java4002 Write a program to create a static array of Students. It is time
//          to practice reading code, which is a skill you must learn for
//          the AP test.  Study the Student class and its code to determine
//          its function.
//
//			We populated the static array from a data file for you.
//          You're welcome.  Do look at it, though.
//
//			The run method should produce a report.
//
//	 	1.	the numerical class average
//	 	2.  the name of the student with the highest average
//	 	3.  a static array of all the students names that made an A (see *hint)
//	 	4.  a static array of all the students names whose average is
//			above the class average (see *hint)
//
//        * hint:  populate as an ArrayList first, then use toArray()
//                 to transform it into a static array!
///////////////////////////////////////////////////////////////////////////
//
//	 SAMPLE OUTPUT:
//
//	The class average is 85.22
//
//	The top student is Ed Jackson
//
//	The list of students that made A's:
//	[Janice Kull, Ed Jackson, Major Miner]
//
//	The students above the class average are:
//	[Sally Johnson, Pete Repeat, Janice Kull, Mary Grayson, Ed Jackson, Major Miner,
// 	Dallas Austin]
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4002{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	private GradeBook grades;

	public Environment()
	{
		grades = new GradeBook();

		run();
	}

	public void run()
	{
	//	out.println( grades );			//	Uncomment for testing purposes

		out.println();
		out.printf( "The class average is %.2f \n", grades.classAverage() );
		out.println();
		out.print ( "The top student is ");
		out.println( grades.topStudent() );
		out.println();
		out.println( "The list of students that made A's:");
		out.println( Arrays.toString(grades.allAs()) );
		out.println();
		out.println( "The students above the class average are:");
		out.println( Arrays.toString(grades.aboveAverage()) );
		out.println();
		out.println();
	}
}


class GradeBook
{
	Student[] book;

	public GradeBook()
	{
		populate();
	}

	private void populate()
	{
		try
		{
			Scanner fileScan = new Scanner( new File("Java4002a.dat") );

			ArrayList<Student> temp = new ArrayList<Student>();
			while(fileScan.hasNext())
			{
				String 	nam	= fileScan.nextLine();
				String 	num	= fileScan.nextLine();
				String	quz	= fileScan.nextLine();
				String	tst	= fileScan.nextLine();
				temp.add( new Student(nam,num,quz,tst) );
			}

			book = temp.toArray(new Student[0]);		// NOTICE...toArray() works with Objects!
		}
		catch(IOException e){}
	}

	public double classAverage()
	{
		double average;
		double sum = 0;
		int count = 0;
		
		for (int i = 0; i < book.length ; i++) 
		{
			sum = sum + book[i].getAverage();
			
			count++;			
	    }
	    
	    average = sum / count;
		
		return average;
	}		// DONE

	public String topStudent()
	{
		// complete this method
		
		String name = "";
		double total = book[0].getAverage();
		
		for (int i = 0; i < book.length; i++)
		{
			
			if(book[i].getAverage() >=  total)
			{
				name = book[i].getName();
				total = book[i].getAverage();
			}
			
		}
		
		
		return name;
	}		// DONE

	public String[] allAs()
	{
		int size = 0;

		for (int i = 0; i < book.length; i++) 
		{
			if( book[i].getLetter() == 'A' )
			{
				size++;
			}
	    }
	    
		String[] theAs = new String[size];
		
		int n = 0;
		
		for (int z = 0; z < book.length; z++) 
		{
			if( book[z].getLetter() == 'A' )
			{
				theAs[ n ] = book[z].getName();
				n++;
			}
	    }
	    
		return theAs;
	}			// DONE

	public String[] aboveAverage()
	{
		ArrayList<String> names = new ArrayList<String>();
		
		
		for (int i = 0; i < book.length; i++) 
		{
			if( book[i].getAverage() > classAverage() )
			{
				names.add( book[i].getName() );
			}
				
	    }
	    
		return names.toArray( new String[0]  );
	}

	public String toString()
	{
		String temp = "";
			for(Student item: book)
				temp += item.toString() + "\n";
		return temp;
	}
}
/************************************************/
/* DO NOT CHANGE ANY CODE IN THE STUDENT CLASS! */
/************************************************/
class Student
{
	private String name;
	private String number;
	private int[]  quizGrades;
	private int[]  testGrades;

	public Student(String nm, String ab, String qz, String tg)
	{
		name        = nm;
		number      = ab;
		populateQuizzes(qz);
		populateTests(tg);
	}

	private void populateQuizzes(String qz)
	{
		String[] quizStr = qz.split(" ");

		quizGrades = new int[quizStr.length];
		for(int x=0; x<quizStr.length; x++)
			quizGrades[x] = Integer.valueOf( quizStr[x] );
	}

	private void populateTests(String tg)
	{
		String[] testStr = tg.split(" ");

		testGrades = new int[testStr.length];
		for(int x=0; x<testStr.length; x++)
			testGrades[x] = Integer.valueOf( testStr[x] );
	}

	public String getName()
	{
		return name;
	}

	public double getAverage()
	{
		double quizTotal = 0;
		for(int x=0; x<quizGrades.length;x++)
			quizTotal += quizGrades[x];

		double quizAverage = (double)quizTotal/quizGrades.length;

		double testTotal = 0;
		for(int x=0; x<testGrades.length;x++)
			testTotal += testGrades[x];

		double testAverage = (double)testTotal/testGrades.length;

		return (quizAverage + testAverage*2)/3.0;
	}

	public char getLetter()
	{
		double average = getAverage();

		if(average >= 89.5)
			return 'A';

		if(average >= 79.5)
			return 'B';

		if(average >= 74.5)
			return 'C';

		if(average >= 40.5)
			return 'D';

		return 'F';
	}

	public String toString()
	{
		return "<" + name +
			   "," + number +
			   "," + Arrays.toString(quizGrades) +
			   "," + Arrays.toString(testGrades) +
			   ">";
	}
}






