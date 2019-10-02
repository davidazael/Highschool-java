///////////////////////////////////////////////////////////////////////////
//
// Java0501 Write a program that creates a warning message that
//			we are out of milk..
//
///////////////////////////////////////////////////////////////////////////
//
//
//


package lesson;
import static javax.swing.JOptionPane.*;

public class Java0501
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
		showMessageDialog(null,"Out of Milk!",      "WARNING!", 2);
  		
	}
}





































