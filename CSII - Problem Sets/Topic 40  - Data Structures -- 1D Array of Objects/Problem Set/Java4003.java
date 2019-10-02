///////////////////////////////////////////////////////////////////////////
// NOTE: 30 pts (10 for each of the 3 parts)
// Java4003 The Registrar's office has one of the most important jobs in
//          education...to determine GPA's and finalize graduation
//          requirements. Reaching your senior year during college is
//          a proud moment (you can see the light at the end of the tunnel!).
//          This program will contain a data base for the Registrar at a
//          college or university.
//
//			Given the StudentInfo class (which you may NOT change), write
//			the following methods in the Registrar class:
//
//		1.	computeGPA()
//                  * computed by dividing gradePoints by creditHours.
//                  * The GPA for a student with 0 credit hours should be
//                    set to zero.
//		2.  isSenior(student)
//                  * should return true if the given student has at least
//                    125 credit hours and has a GPA of at least 2.0.
//				For example:
/*
                    Student   Credit grade		 Result of call to
					name	  Hours	 Point	GPA	 isSenior(student)
					=======   ==== 	 =====  ===  ====
					King	    45	  171	3.8	 false (not enough credit hours)
					Norton	   128	  448	3.5	 true
					Solo	   125	  350	2.8	 true
					Kramden	   150	  150	1.0	 false (GPA too low)
					Dumbrowski   0	    0	0.0	 false
*/
//      3.  fillSeniorList()
//                  * determines which students in the array roster are
//                    seniors and copies those student's records to the
//                    'seniors' array.
//                  * In writing fillSeniorList, you must call method
//                    isSenior() from requirement #2.
//
///////////////////////////////////////////////////////////////////////////
//
//	 SAMPLE OUTPUT:
//
//		Student Roster:
//
//		<King, 45, 171, 3.8> Senior: false
//		<Norton, 128, 448, 3.5> Senior: true
//		<Solo, 125, 350, 2.8> Senior: true
//		<Kramden, 150, 150, 1.0> Senior: false
//		<Dumbbrowski, 0, 0, 0.0> Senior: false
//
//		Seniors:
//
//		<Norton, 128, 448, 3.5>
//		<Solo, 125, 350, 2.8>
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.io.*;

class Java4003{
	public static void main(String[] args){
		new Environment();
}}

class Environment
{
	private Registrar records;

	public Environment()
	{
		records = new Registrar();

		run();
	}

	public void run()
	{
		out.println("Student Roster:\n");
		out.println( records );

	    out.println("\nSeniors:\n");
	    out.println(records.displaySeniors());
	}

}

class Registrar
{
	StudentInfo students[];
	StudentInfo seniors[];

	public Registrar()
	{
		populate();
	    computeGPA();
		fillSeniorList();
	}

	 private void populate()
	  {
	  	try
		{
			Scanner fileScan = new Scanner( new File("Java4003a.dat") );

			ArrayList<StudentInfo> temp = new ArrayList<StudentInfo>();
			while(fileScan.hasNext())
			{
				String 	nam	= fileScan.nextLine();
				int 	ch	= Integer.valueOf(fileScan.nextLine());
				int	gp	= Integer.valueOf(fileScan.nextLine());
				temp.add( new StudentInfo(nam,ch,gp) );
			}
			students = temp.toArray(new StudentInfo[0]);

		}
		catch(IOException e){}

	   }

		public void computeGPA()
		{
			// complete this method
		}

		public boolean isSenior(StudentInfo student)
		{
			// complete this method
			return false;
		}

		public void fillSeniorList()
		{
			// complete this method

		}

		public String displaySeniors()
		{
			String temp = "";
			for (StudentInfo item: seniors)
            	temp += item + "\n";
            return temp;
		}

	    public String toString()
	    {
			String temp = "";

			for(StudentInfo item: students)
				temp += item.toString() + " Senior: " + isSenior(item) + "\n";

			return temp;

	    }
	}

	/* **************************************/
	/*           StudentInfo class          */
	/* DO NOT CHANGE THIS CLASS IN ANY WAY! */
	/****************************************/
	class StudentInfo
	{
		private String name;
		private int creditHours;
		private int gradePoints;
		private double GPA;

		/* does not allow default object */
		private StudentInfo()
		{

		}

		public StudentInfo(String name, int creditHours, int gradePoints)
		{
			setName(name);
			setCreditHours(creditHours);
			setGradePoints(gradePoints);
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName( ) {
			return name;
		}

		public void setCreditHours(int creditHours) {
			this.creditHours = creditHours;
		}

		public int getCreditHours( ) {
			return creditHours;
		}

		public void setGradePoints(int gradePoints) {
			this.gradePoints = gradePoints;
		}

		public int getGradePoints( ) {
			return gradePoints;
		}

		public void setGPA(double GPA) {
			this.GPA = GPA;
		}

		public double getGPA( ) {
			return GPA;
		}

		public String toString( ) {
			return	"<" + name + ", " + creditHours + ", " +
					gradePoints + ", " + GPA + ">";
		}
	}
