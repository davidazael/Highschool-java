///////////////////////////////////////////////////////////////////////////
//
// Java3808	There are eight guys that are friends and enjoy hanging
//			out together.  An original array has been created holding
//			the nicknames of each of the guys.
//
//			"Hunk", "Beau", "Dude", "Stud", "BigBoy",
//			"Slick", "Prince", "Killer"
//
//			With prom quickly approaching, the guys need to add the
//			names of their dates to the list.  You know, for dinner
//			reservations and such.
//
//			Write a method called promDates() that will double the size
//			of the original array and copy all of the guys names into
//			the even cells.  The odd cells will be used to store the
//			names of the guy's dates.
//
//			method promDates()
//				1) create a working array twice as big as the original
//				2) display the working array in the insideOutput text area.
//				3) fill the working array with blank Strings ( " " ).
//				4) copy the boys names into the even cells
//				5) return the working array
//
//			inside the run method
//				1) display the working array in the beforeOutput text area.
//				2) call the promDates() method
//				3) assign the returned array to the original array
//				4) ANGEL has agreed to be Beau's date
//				5) PUMPKIN has agreed to be Prince's date
//				6) display the working array in the afterOutput text area.
//
///////////////////////////////////////////////////////////////////////////




import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java3808 {
	public static void main(String[] args) {
		new Environment();
}}


class Environment extends BeforeInsideAfterView
{
	// FYI TextArea objects to use are:  beforeOutput, insideOutput, afterOutput;

	String[] original;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		original = new String[]{ "Hunk", "Beau", "Dude", "Stud",
			                     "BigBoy", "Slick", "Prince", "Killer" };
	}

	public void run()
	{
		beforeOutput.setText  ( View.toString(original) );

		/* ??? */

		afterOutput.setText   ( View.toString(original) );
	}

	public /* ???? */ promDates( /* ???? */ )
	{

	}
}

