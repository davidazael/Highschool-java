///////////////////////////////////////////////////////////////////////////
//
// Java0502 Write a program that creates the following three line
//			error message..
//
///////////////////////////////////////////////////////////////////////////
//
//		ERROR!  ERROR!  ERROR!
//		Your request for an A in English
//		does not compute.
//
//


package lesson;
import static javax.swing.JOptionPane.*;

public class Java0502
{
	public static void main (String[] args)
		{
        new Environment();
		}
}


class Environment
{
	public Environment()
	{
		run();
	}

	public void run()
	{
		showMessageDialog
		(
		null,
		"ERROR! \t ERROR! \t ERROR! \nYour request for an A in English \ndoes not compute.",
		"ERROR!",
		 2
		 );
  		
	}
}


































