///////////////////////////////////////////////////////////////////////////
//
//  Java1004 Remember formatting? If not, you might have to look back at
//           your old Computer Science IK stuff.
//
//           Read in 5 numeric values from a data file and format them
//           to 1 decimal place. Include commas in your formatting. Write
//           your answers to a data file called "Java1104answers.dat".
//
//           INPUT DATA FILE: Java1004.dat
//           OUTPUT DATA FILE: Java1004answers.dat

import static java.lang.System.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Java1004{
	public static void main(String[] args){
		new DataStream();
}}


class DataStream extends JFrame
{
	private double n1,n2,n3,n4,n5;

	public DataStream()
	{
		// input stream from data file
		try
		{
		Scanner scan = new Scanner( new File ("Java1004.dat"));
		
		 n1 = Double.valueOf(scan.nextLine());
		 n2 = Double.valueOf(scan.nextLine());
		 n3 = Double.valueOf(scan.nextLine());
		 n4 = Double.valueOf(scan.nextLine());
		 n5 = Double.valueOf(scan.nextLine());
		 
		
		}catch(Exception e){}

		run();
		
	}

	void run()
	{
		try
		{
				PrintStream outFile = new PrintStream( "Java1004answers.dat" );
				outFile.println( "" + String.format("%,.1f",n1) );
				outFile.println( "" + String.format("%,.1f",n2) );
				outFile.println( "" + String.format("%,.1f",n3) );
				outFile.println( "" + String.format("%,.1f",n4) );
				outFile.println( "" + String.format("%,.1f",n5) );
		}
		catch(Exception e){}
	
	}
		


	
}





