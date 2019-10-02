///////////////////////////////////////////////////////////////////////////
//
// Java0605	Write a program to create the JFrame presented below.
//          1) Use a JLabel for the prompt (see Hint below)
//          2) Use a JTextField for the input
//          3) Use a JButton and actionListener to trigger an event
//          4) The event should use an actionListener that extracts
//             the user input and outputs their name with a GIANT Font size
//             in a JTextArea
//
///////////////////////////////////////////////////////////////////////////
//
//		SAMPLE INPUT/OUTPUT:
//			+----------------------------------------------+
//			| Title Bar                              _ = X |
//			+----------------------------------------------+
//			|                                              |
//			|                        +------------------+  |
//			|  Enter your name -->   | Sam              |  |
//			|                        +------------------+  |
//			|      +---------------------+                 |
//			|      | PUSH THIS BUTTON    |                 |
//			|      +---------------------+                 |
//			|  +----------------------------------------+  |
//			|  |  +----+                                |  |
//			|  |  |        +---+   +        +           |  |
//			|  |  +----+       |   | +    + |           |  |
//          |  |       |   +---+   |/ \  / \|           |  |
//          |  |       |   |   |   |   \/   |           |  |
//          |  |  +----+   +---+   +        +           |  |
//			|  +----------------------------------------+  |
//			+----------------------------------------------+
//
//
//	HINT: How to use JLabel (something new!)
//
//			nameLabel = new JLabel();
//              < set the size>
//              < set the location>
//				nameLabel.setText("Enter your name--> ");
//			add( nameLabel );
//
/////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java0405
{

    public static void main(String[] args){
    	new GUIFrame();
}}


class GUIFrame extends JFrame
{
	private JLabel nameLabel;
	private JTextField name;
	private JButton event;
	private JTextArea output;

	GUIFrame()
	{
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
			getContentPane().setBackground(new Color(0,0,100));
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout(null);
		
		// instantiate and modify nameLabel object
		nameLabel = new JLabel();
			nameLabel.setSize(250,50);
			nameLabel.setLocation(100,50);
			nameLabel.setText("Enter Your Name Bruhh--->>");
				add( nameLabel );
		
		// instantiate and modify name object
		name  = new JTextField();
			name.setSize(250,50);
			name.setLocation(300,50);
				add( name );
				
		// create and modify button event object
		event = new JButton("Push Me!");
			event.setSize(400,50);
			event.setLocation(100,250);
			event.addActionListener( new ButtonAction() );
				add( event );
		
	   	// create and modify output object
		output = new JTextArea();
			output.setFont(new Font("Arial Black",1,145));	
			output.setSize(640,200);
			output.setLocation(100,350);	
				add( output );
			
			
		setVisible(true);
	}

   	// Button class here
   	class ButtonAction implements ActionListener
   	{
   		public void actionPerformed(ActionEvent e)
   		{
   			String poop1 = name.getText();
   			output.append(poop1);
   		}
   	}
}








