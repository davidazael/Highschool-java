///////////////////////////////////////////////////////////////////////////
//
// Java0602	Write a program that creates a JTextField and a TextArea
//          (including scrollbars) in a JFrame.  The user will enter
//          a String in the JTextField.  Use a simple command line
//          << Enter >> event to trigger an update to the TextArea.
//          Have the event populate the	TextArea with a multiple
//          instances of the entered String.
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
//	|		|  | The Avengers		         |             |
//	|		|  +-----------------------------+             |
//	|		|                                              |
//	+-------|  +-----------------------------+             |
//	        |  | The Avengers                |             |
//	        |  | The Avengers                |             |
//	        |  | The Avengers                |             |
//	        |  | The Avengers                |             |
//	        |  | The Avengers                |             |
//			|  +-----------------------------+             |
//			|                                              |
//			+----------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Java0402
{

	public static void main(String[] args)
{
    	new GUIFrame();
}
}


class GUIFrame extends JFrame
{
	private JTextField input;
	private TextArea  output;

	GUIFrame()
	{
		setSize(500,300);
		setLocationRelativeTo(null);
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   		getContentPane().setBackground(new Color(0,0,100));
   		setLayout(null);

		input = new JTextField();
			input.setSize(200,25);
			input.setLocation(30,20);
		add( input );

		output = new TextArea("",0,0,1);
			output.setSize(400,200);
			output.setLocation(30,50);
			output.setEditable(false);
			output.setFont(new Font(null,Font.BOLD,16));
	   	add( output );

		setVisible(true);

	   	run();
   }

   public void run()
   {
		Scanner s = new Scanner(in);

		out.print("<<<  Press return to process.  >>>");
		s.nextLine();
		
		String poop1 = input.getText();
		String space = "\n";
		output.setText(poop1);
			output.append(space);
		output.append(poop1);
			output.append(space);
		output.append(poop1);
			output.append(space);
		output.append(poop1);
			output.append(space);
		output.append(poop1);
		
		setVisible(true);
		
		toFront();

   }
}

