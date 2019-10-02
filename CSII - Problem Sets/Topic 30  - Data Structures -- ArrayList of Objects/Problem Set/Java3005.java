///////////////////////////////////////////////////////////////////////////
//
// Java3005	This program is an extension of College-4-All. Copy/paste
//          Java3004 into this program and MODIFY it. Again allow the
//          user to enter a gpa as a target.
//
//          Do NOT print the entire list with all students. Instead,
//          REMOVE students from the original list who have a GPA lower
//          than the target GPA. After removal, print the list.
//
//          Create a separate list and populate it with the students
//          who were removed from the admittance list. Print the list
//          of students who were not admitted.
//
//      SAMPLE INPUT:
//
//		Enter lowest GPA to include: 3.0
//
//      SAMPLE OUTPUT:
//
//		Students with a GPA of 3.0 or higher:
//
//		[<Brian Roberts,23,3.175>, <Rick Robinson,26,3.215>, <etc>]
//
//		Students with a GPA lower than 3.0:
//
//		[<Patti Skinner,32,2.743>, <Tom Tooch,18,1.456>, <etc> ]
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3005{
	public static void main (String[] args){
		new Lesson();
}}


class Lesson
{
	ArrayList<Student> overAll = new ArrayList<Student>();
	String name1;
	int age1;
	double gpa1;
	double lowestGPA;

	Lesson()
	{
		populate();
		outputAll();
		input();
		outputRange();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter lowest GPA to include: ");
		lowestGPA = Double.valueOf( scan.nextLine() );

	}

	void populate()
	{
		try{
			Scanner fileScan = new Scanner(new File("Students.dat"));
			while(fileScan.hasNextLine())
			{
				name1 = fileScan.nextLine(); 
				age1 = Integer.valueOf( fileScan.nextLine() );
				gpa1 = Double.valueOf( fileScan.nextLine() );
				
				overAll.add( new Student(name1, age1, gpa1) );
			}			
			
						
			}catch(Exception e){}
	}

	void outputAll()
	{
		out.println();
		out.println(overAll);
		out.println();

	}


	void outputRange()
	{
		for(Student temp: overAll)
		{
			if( temp.getGPA() == lowestGPA )
			{
				overAll.remove(1);
				//out.println( temp.getName() + " - age " + temp.getAge()  );
			}		
		}
		

	}
}


class Student
{
	private String name;
	private int age;
	private double gpa;

	// constructor
	public Student(String n, int a, double g)
	{
		name = n;
		age = a;
		gpa = g;
	}

	// accessors
	public String getName()
	{
		return name;
	}
	public Integer getAge()
	{
		return age;
	}
	public Double getGPA()
	{
		return Math.floor(gpa);
	}

	public String toString()
	{
		return "<"+name+","+age+","+gpa+">";
	}
}
