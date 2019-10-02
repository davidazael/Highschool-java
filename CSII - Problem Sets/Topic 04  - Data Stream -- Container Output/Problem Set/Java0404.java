///////////////////////////////////////////////////////////////////////////
//
// Java0604	Write a program to create the JFrame presented below. Use 2
//          JButtons and 2 JTextAreas.  The 1st Button should trigger
//          the riddle question in the first text area, and the 2nd Button
//			should trigger the answer in the second text area.
//
///////////////////////////////////////////////////////////////////////////
//
//		SAMPLE INPUT/OUTPUT:
//			+----------------------------------------------+
//			| Title Bar                              _ = X |
//			+----------------------------------------------+
//			|      +---------------------+                 |
//			|      | PUSH FOR RIDDLE     |                 |
//			|      +---------------------+                 |
//			|  +----------------------------------------+  |
//			|  |  Your Riddle Here                      |  |
//			|  +----------------------------------------+  |
//			|      +---------------------+                 |
//			|      | PUSH FOR ANSWER     |                 |
//			|      +---------------------+                 |
//			|  +----------------------------------------+  |
//			|  |  Answer to Your Riddle Here            |  |
//			|  +----------------------------------------+  |
//			+----------------------------------------------+
//
/////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java0404
{
    public static void main(String[] args)
{
    	new GUIFrame();
}
}


class GUIFrame extends JFrame
{
	private JButton event1;
	private JButton event2;
	private JTextArea output1;
	private JTextArea output2;

	GUIFrame()
	{
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(new Color(0,0,100));
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout(null);

		// instantiate 1st JButton here
		event1 = new JButton("Push Me For Riddle!");
			event1.setFont( new Font(null,3,26) );
			event1.setSize( 500, 50 );
			event1.setLocation( 50, 50 );
			event1.addActionListener( new ButtonAction1() );
			// activate addActionListener() method here
	   	add( event1 );

	   	// instantiate 1st output object here
	   	output1 = new JTextArea();
			output1.setFont(new Font("Times New Roman",0,36));
			output1.setSize(600,100);
				output1.setEditable(false);
			output1.setLocation(50,125);
   		add( output1 );

   		// 2nd button and output object here
   		
   			event2 = new JButton("Push For Answer!");
			event2.setFont( new Font(null,3,26) );
			event2.setSize( 500, 50 );
			event2.setLocation( 50, 250 );
			event2.addActionListener( new buttonAction2() );
	   	add( event2 );
	   	
	   	output2 = new JTextArea();
			output2.setFont(new Font("Times New Roman",0,36));
			output2.setSize(600,100);
				output2.setEditable(false);
			output2.setLocation(50,350);
   		add( output2 );
   		

		setVisible(true);
	}

   	class ButtonAction1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			output1.setText("What has a tongue,\ncannot walk, but gets around a lot?");
		}
	}
	class buttonAction2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			output2.setText("A Shoe");
		}
	}

	// 2nd ButtonAction here

}








