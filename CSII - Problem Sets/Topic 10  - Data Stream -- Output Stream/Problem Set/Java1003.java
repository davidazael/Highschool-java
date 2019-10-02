///////////////////////////////////////////////////////////////////////////
//
// Java1003  Use following GUI interface.
//
//		+-----------------------------------------------------------+
//		|                                                     _ - X |
//		+-----------------------------------------------------------+
//		|                                                           |
//		|                    +-----------------------------+        |
//		|    First Name      |                             }        |
//		|                    +-----------------------------+        |
//		|                                                           |
//		|                    +-----------------------------+        |
//		|    Last Name       |                             |        |
//		|                    +-----------------------------+        |
//		|                                                           |
//		|                    +-----------------------------+        |
//		|    Favorite Movie  |                             |        |
//		|                    +-----------------------------+        |
//		|                                                           |
//		|     +-----------------------------------------------+     |
//		|     |                      Go                       |     |
//		|     +-----------------------------------------------+     |
//		+-----------------------------------------------------------+
//
//		Write a program that copies the data from the text fields
//		to a data file when the user presses the "Go" button.
//
//		DATA FILE OUTPUT: info.dat
//

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;							

public class Java1003{
	public static void main(String[] args){
		new Notepad();
}}


class Notepad extends JFrame
{
	JTextField first;
	JTextField last;
	JTextField movie;
	JButton    goButton;

	Notepad()
	{
		setSize(500,275);
		setLocationRelativeTo(null);
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout(null);

		JLabel l1 = new JLabel("First Name:");
			l1.setFont(new Font(null,3,24));
			l1.setSize(175,40);
			l1.setLocation(25,20);
		add(l1);

		first = new JTextField();
			first.setSize(235,30);
			first.setLocation(225,25);
   		add( first );

		JLabel l2 = new JLabel("Last Name:");
			l2.setFont(new Font(null,3,24));
			l2.setSize(175,40);
			l2.setLocation(25,70);
		add(l2);

		last = new JTextField();
			last.setSize(235,30);
			last.setLocation(225,75);
   		add( last );

		JLabel l3 = new JLabel("Favorite Movie:");
			l3.setFont(new Font(null,3,24));
			l3.setSize(175,40);
			l3.setLocation(25,120);
		add(l3);

		movie = new JTextField();
			movie.setSize(235,30);
			movie.setLocation(225,125);
   		add( movie );

		goButton = new JButton();
			goButton.setText("Go");
			goButton.setFont(new Font(null,1,24));
			goButton.setSize(435,40);
			goButton.setLocation(25,180);
			goButton.addActionListener( new GoButtonListener() );
   		add( goButton );

		setVisible(true);
	}

	class GoButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			try{

				PrintStream outFile = new PrintStream( "info.dat" );

				outFile.println( first.getText() );
				outFile.println( last.getText() );
				outFile.println( movie.getText() );
				

				System.out.println("Data copied to file.");

			}catch(Exception e){}
		}
	}
}





