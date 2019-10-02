///////////////////////////////////////////////////////////////////////////
//
// Java0603 Write a program that creates six JTextFields and one JTextArea.
//			Create a simple command line << Enter >> event to trigger
//			an update to the JTextArea.  Have the event access each of the
//			JTextFields to access the data entered by the user.  Have the
//          event populate the JTextArea by placing the words into the
//			JTextArea BACKWARDS (as shown) using a different color and
//          font.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//	+----------------------------------------------+
//	|  <<<  Press return to process.  >>>          |
//	|                                              |
//	|                                              |
//	|		+----------------------------------------------+
//	|		| Title Bar                              _ = X |
//	|		+----------------------------------------------+
//	|		|                                              |
//	|		|  +------------------+                        |
//	|		|  | Computer         |                        |
//	|		|  +------------------+                        |
//	|		|  +------------------+                        |
//	|		|  | Science          |                        |
//	+-------|  +------------------+                        |
//			|  +------------------+                        |
//			|  | is               |                        |
//			|  +------------------+                        |
//			|  +------------------+                        |
//			|  | my               |                        |
//			|  +------------------+                        |
//			|  +------------------+                        |
//			|  | favorite         |                        |
//			|  +------------------+                        |
//			|  +------------------+                        |
//			|  | class            |                        |
//			|  +------------------+                        |
//			|                                              |
//			|  +----------------------------------------+  |
//			|  | class favorite my is Science Computer  |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  +----------------------------------------+  |
//			|                                              |
//			+----------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Java0403
{
	public static void main(String[] args)
{
    	new GUIFrame();
}
}


class GUIFrame extends JFrame
{
	private JTextField inputOne;
	private JTextField inputTwo;
	private JTextField inputThree;
	private JTextField inputFour;
	private JTextField inputFive;
	private JTextField inputSix;
	
	// continue for 6 inputs
	private JTextArea  output;

	GUIFrame()
	{
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
				getContentPane().setBackground(new Color(0,0,100));
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   		setLayout(null);

		inputOne = new JTextField();
			inputOne.setSize(200,25);
			inputOne.setLocation(30,20);
		add( inputOne );
		
		inputTwo = new JTextField();
			inputTwo.setSize(200,25);
			inputTwo.setLocation(30,50);
		add( inputTwo );
		
		inputThree = new JTextField();
			inputThree.setSize(200,25);
			inputThree.setLocation(30,80);
		add( inputThree );

		inputFour = new JTextField();
			inputFour.setSize(200,25);
			inputFour.setLocation(30,110);
		add( inputFour );
		
		inputFive = new JTextField();
			inputFive.setSize(200,25);
			inputFive.setLocation(30,140);
		add( inputFive );
		
		inputSix = new JTextField();
			inputSix.setSize(200,25);
			inputSix.setLocation(30,170);
		add( inputSix );



		// continue for 6 inputs

		output = new JTextArea();
			output.setSize(400,200);
			output.setLocation(30,222);
			output.setEditable(false);
			output.setFont(new Font("Black Arial",3,20));
			output.setForeground(new Color(140,0,140));
	   	add( output );

		setVisible(true);

	   	run();
   }

   public void run()
   {
		Scanner s = new Scanner(in);

		out.print("<<<  Press return to process.  >>>");
		s.nextLine();
		
		String poop6 = inputSix.getText();
		String poop5 = inputFive.getText();
		String poop4 = inputFour.getText();
		String poop3 = inputThree.getText();
		String poop2 = inputThree.getText();
		String poop1 = inputOne.getText();
	
		output.append(poop6);
		output.append(poop5);
		output.append(poop4);
		output.append(poop3);
		output.append(poop2);
		output.append(poop1);
		
		
		
		
		

		setVisible(true);//display here

		toFront();
   }
}

