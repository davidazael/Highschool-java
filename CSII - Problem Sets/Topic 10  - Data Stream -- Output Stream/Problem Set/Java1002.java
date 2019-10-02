///////////////////////////////////////////////////////////////////////////
//
// Java1002 In this folder is a data file ALREADY CREATED called "mouse.dat".
//          Its contents are unimportant, but we will investigate its properties.
//
//          Write a program to investigate the characteristics of "mouse.dat".
//          The program will output to a File called "newMouse.dat" the name,
//          exists, length, path, etc. of all the attributes of "mouse.dat".
//
//          You will need to open "newMouse.dat" after program execution
//          to see if it worked. It should contain all the characteristics of
//          "mouse.dat".
//
//			Is the "mouse.dat" file writeable?
//
///////////////////////////////////////////////////////////////////////////
//
//
//


import static java.lang.System.*;
import java.io.*;

public class Java1002
{
	public static void main(String[] args)
	{
		// Create a File handle for your INPUT file (the file that already exists)
		
		// Declare, initialize, and instantiate a new output stream (this is
		// the file you WRITE to) 
		File mouseFile = null;
		try
		{
			mouseFile = new File("newMouse.dat");
		}
		catch(Exception e){}


		out.println("Does mouse file exist:    " + mouseFile.exists());


		PrintStream outFile = null;
		try
		{
			outFile = new PrintStream( mouseFile );
		}
		catch(Exception e){}


		outFile.println("File name:          " + mouseFile.getName());
		outFile.println("Does file exist:    " + mouseFile.exists()  );
		outFile.println("File size:          " + mouseFile.length() );
		outFile.println("Complete file path: " +  mouseFile.getAbsolutePath() );
		outFile.println("File is readable:   " +  mouseFile.canRead() );
		outFile.println("File is writeable:  " +  mouseFile.canWrite() );
		outFile.println();
	}
}

