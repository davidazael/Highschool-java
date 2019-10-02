///////////////////////////////////////////////////////////////////////////
//
// Java0601	Write a program that creates a single JTextArea in a JFrame.
//          Create a simple command line << Enter >> event to trigger
//          an update to the JTextArea.  Have the event populate the
//			JTextArea with a sentence detailing your favorite cartoon
//			characters.
//
///////////////////////////////////////////////////////////////////////////
//
//
//     SAMPLE OUTPUT:
//	+----------------------------------------------+
//	|  <<<  Press return to process.  >>>          |
//	|                                              |
//	|                                              |
//	|		+----------------------------------------------+
//	|		| Title Bar                              _ = X |
//	|		+----------------------------------------------+
//	|		|                                              |
//	|		|  +-----------------------------+             |
//	|		|  | My favorite cartoon         |             |
//	|		|  | characters are              |             |
//	|		|  | Rocky and Bullwinkle.       |             |
//	|		|  |                             |             |
//	+-------|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  +-----------------------------+             |
//			|                                              |
//			|                                              |
//			|                                              |
//			+----------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Java0401
{

	public static void main(String[] args)
{
    	new GUIFrame();
}
}


class GUIFrame extends JFrame
{
	private	JTextArea output;

	GUIFrame()
	{
		setSize(500,300);
		setLocationRelativeTo(null);
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   		getContentPane().setBackground(new Color(0,0,100));
   		setLayout(null);

		output = new JTextArea();
			output.setEditable(false);
			output.setFont(new Font(null,Font.BOLD,24));
			output.setSize(400,170);
			output.setLocation(40,50);
	   	add( output );

	   	run();
   }

   public void run()
   {
		Scanner s = new Scanner(in);

		out.print("<<<  Press return to process.  >>>");
		s.nextLine();

		output.setText("My favorite cartoon \ncharacters are     ");
		
		
		setVisible(true);
   }
}

