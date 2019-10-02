///////////////////////////////////////////////////////////////////////////
//
// Java3004 College-4-All is looking at overall high school GPAs for
//          admission requirements. Write a program that reads in a data
//          and populates an ArrayList of Students. Each Student object
//          contains a name, an age, and an overall GPA. Print the entire
//          ArrayList, then allow the user to enter a target GPA. Print a
//          list of all students (and their age) that have a GPA greater than
//          or equal to the target GPA.
//
//          REQUIRED:  YOU MUST USE A FOR EACH LOOP TO PROCESS THE LIST OF
//                     STUDENTS WITH NAME AND AGE.
//
///////////////////////////////////////////////////////////////////////////
//
//	DATAFILE INPUT:  "Students.dat"
//
///////////////////////////////////////////////////////////////////////////
//
// SAMPLE OUTPUT/INPUT
//	[<William Robbins,20,2.875>, <Brian Roberts,23,3.175>, <....etc....>
//
//	Enter lowest GPA to include: 3.4
//		All students with GPAs of 3.4 or higher:
//		Laurie Neuberg - age 45
//		Lori Salbury - age 23
//      <etc>

import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3004{
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
			if( temp.getGPA() >= lowestGPA )
			{
				out.println( temp.getName() + " - age " + temp.getAge()  );
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
		return gpa;
	}

	public String toString()
	{
		return "<"+name+","+age+","+gpa+">";
	}
}
