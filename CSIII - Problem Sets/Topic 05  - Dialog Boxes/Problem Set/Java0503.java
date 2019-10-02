///////////////////////////////////////////////////////////////////////////
//
// Java0503 Write a program that uses two message boxes to tell your
//			favorite joke.  Display the jokes setup in the first message
//			box and display the punch line in the second message box.
//
///////////////////////////////////////////////////////////////////////////
//
//
//


package lesson;
import static javax.swing.JOptionPane.*;

public class Java0503
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
		showMessageDialog(null,"Do you have a bandaid?",      "Joke!", 3);
		showMessageDialog(null,"Becuase I scraped my knee falling for you!",      "Joke!", 1);
  		
	}
}































