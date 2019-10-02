///////////////////////////////////////////////////////////////////////////
//
// Java3709 Write a program to populate an array with movies. After populating
//          the list and displaying it in its original order, sort the list
//          alphabetically using the Arrays.sort() algorithm and print the
//          sorted list.
//
//			Program the Shuffle button to randomly shuffle the movies.
//			Program the rotate button to rotate the list of movies.
//
//          Don't worry about the GUI class. You will learn about abstract
//          classes and methods later. All you need to know is the reference
//          to the GUI window is called 'output'. REMINDER: setText() is for
//          an original String and append() adds to the String.
//
//		VIEW:
//   		    +------------------------------------------------+
//              |   Process:          Output:                    |
//		    	| +-------------+  +---------------------------+ |
//	    		| |   Shuffle   |  | Citizen Kane (1941)       | |
//              | +-------------+  | Casablanca (1941)         | |
//              | +-------------+  | Gone With The Wind (1939) | |
//		    	| |   Sorted    |  |   <etc>                   | |
//              | +-------------+  |                           | |
//              | +-------------+  |                           | |
//		    	| |   Rotate    |  |                           | |
//              | +-------------+  |                           | |
//              |                  |                           | |
//			    |                  |                           | |
//	    		|                  +---------------------------+ |
//   	    	+------------------------------------------------+
//               :                                              :
//		    	| +-------------+  +---------------------------+ |
//	    		| |   Shuffle   |  | Casablanca (1941)         | |
//              | +-------------+  | Citizen Kane (1941)       | |
//              | +-------------+  | Gone With The Wind (1939) | |
//		    	| |   Sorted    |  |   <etc>                   | |
//              | +-------------+  |                           | |
//               :                                              :
//   	    	+------------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////



import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class Java3709{
	public static void main(String[] args){
		new Environment();
}}


class Environment extends GUI
{
	private String[] movies;

	public Environment()
	{
		populate();
	}

	private void populate()
	{
		
	}

	public void shuffleAction()
	{
		// Shuffle the array

		// activate display() method

	}

	public void sortAction()
	{
		// Sort the array


		// activate display() method

	}

	public void rotateAction()
	{
		// Rotate the array


		// activate display() method

	}

	public void display()
	{
		// Output the array to the output area

	}
}


abstract class GUI extends JFrame
{
	protected JTextArea output;

	public GUI()
	{
		setSize(420,490);
		setLayout(null);

   		JLabel processLabel = new JLabel("  Process:");
   			processLabel.setSize(70,30);
   			processLabel.setLocation(10,10);
   		add(processLabel);

	   	JButton shuffle = new JButton("Shuffle");
   			shuffle.setSize(120,30);
   			shuffle.setLocation(10,40);
	   		shuffle.addActionListener( new shuffleButtonListener() );
	   	add(shuffle);

		JButton sorted = new JButton("Sorted");
   			sorted.setSize(120,30);
   			sorted.setLocation(10,80);
			sorted.addActionListener( new SortedButtonListener() );
		add(sorted);

		JButton rotated = new JButton("Rotated");
   			rotated.setSize(120,30);
   			rotated.setLocation(10,120);
			rotated.addActionListener( new RotateButtonListener() );
		add(rotated);

		JLabel outputLabel = new JLabel("Output:");
   			outputLabel.setSize(70,30);
   			outputLabel.setLocation(150,10);
		add(outputLabel);

   		output = new JTextArea(10,25);
			output.setEditable(false);
			output.setFocusable(false);
			JScrollPane outputPane = new JScrollPane(
				output,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
			);
  			outputPane.setSize(250,400);
 			outputPane.setLocation(150,40);
   		add(outputPane);

		setResizable(false);
		setLocationRelativeTo(null);
  		setDefaultCloseOperation(3);
		setVisible(true);
	}

	class shuffleButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			shuffleAction();
		}
	}

	abstract public void shuffleAction();

	class SortedButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			sortAction();
		}
	}

	abstract public void sortAction();

	class RotateButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			rotateAction();
		}
	}

	abstract public void rotateAction();
}


