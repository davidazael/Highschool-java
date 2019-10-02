///////////////////////////////////////////////////////////////////////////
//
// Java2610 Read in a data file of names that do not have the first letter
//          capitalized.  Capitalize the first letter of each name.
//
//
//			Sample data file is namesa.dat
//
//      SAMPLE DATA FILE INPUT:
//			tom hanks
//			harrison ford
//			joaquin phoenix
//			bruce willis
//			 <etc>
//
//		SAMPLE OUTPUT:
//
//			The original list:
//			------------------
//			tom hanks
//			harrison ford
//			joaquin phoenix
//			bruce willis
//			<etc>
//
//			The improved list:
//			------------------
//			Tom Hanks
//			Harrison Ford
//			Joaquin Phoenix
//			Bruce Willis
//			<etc>
//
//      TEST YOUR PROGRAM WITH DATA FILE namesb.dat:
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java2610{
	public static void main (String[] args){
		new Actors();
}}


class Actors
{
	ArrayList list;

	public Actors()
	{
		list = new ArrayList();
		populate();
		out.println("The original list:");
		out.println("------------------");
		output();

		out.println();
		fixName();

		out.println("The improved list:");
		out.println("------------------");
		output();
	}

	void populate()
	{
		try{



		} catch(Exception e){}
	}

	public void fixName()
	{

	}
	public void output()
	{

	}
}






