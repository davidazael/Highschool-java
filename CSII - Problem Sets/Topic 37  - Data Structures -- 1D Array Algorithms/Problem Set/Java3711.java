//////////////////////////////////////////////////////////////////////////
//
// Java3711 Enter real numbers (as a String) into a text field. Use
//			split() to separate the String into individual String items.
//			Use Double.valueOf() to convert the individual String
//			items into double data and place the numbers into an array.
//			When the 'process button' is pressed your program should
//			display the original data and calculate the average of the
//			data.  Then display all the numbers above the average and
//			all the numbers below the average.
//
//          Look inside the GUI class for the list of the JTextField
//          output references.
//
//         	Input: a list of reals from the user
//
//         	Display 1: original array
//         	Display 2: sorted array
//         	Display 3: average of all elements in the array
//         	Display 4: those elements above the average
//         	Display 5: those elements below the average
//
//
//		VIEW:
//
// +---------------------------------------------------------------------+
// |                 +-------------------------------------------------+ |
// |          Input: |23.5 4.1 12.0 7.9 15.3 18.1 22.4 13.7            | |
// |                 +-------------------------------------------------+ |
// |                                                                     |
// |    +-----------------------------------------------------------+    |
// |    |                          Process                          |    |
// |    +-----------------------------------------------------------+    |
// |                                                                     |
// |                 +-------------------------------------------------+ |
// | Original Array: |[23.5, 4.1, 12.0, 7.9, 15.3, 18.1, 22.4, 13.7]   | |
// |                 +-------------------------------------------------+ |
// |                 +-------------------------------------------------+ |
// |   Sorted Array: |[4.1, 7.9, 12.0, 13.7, 15.3, 18.1, 22.4, 23.5]   | |
// |                 +-------------------------------------------------+ |
// |                 +-------------------------------------------------+ |
// | The Average Is: |14.625                                           | |
// |                 +-------------------------------------------------+ |
// |                 +-------------------------------------------------+ |
// |  Above Average: |23.5 15.3 18.1 22.4                              | |
// |                 +-------------------------------------------------+ |
// |                 +-------------------------------------------------+ |
// |  Below Average: |4.1 12.0 7.9 13.7                                | |
// |                 +-------------------------------------------------+ |
// +---------------------------------------------------------------------+
//
//
//////////////////////////////////////////////////////////////////////////




import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Java3711{
	public static void main(String[] args){
		new Environment();
}}


class Environment extends GUI
{
	private double[] numbers;
	private double   average;

	public void processAction()
	{
		original();
		sorted();
		average();
		aboveAverage();
		belowAverage();
	}

	public void original()
	{
		String data = input.getText();

	
	}

	public void sorted()
	{
		
	}

	public void average()
	{
	
	}

	public void aboveAverage()
	{
		

	}

	public void belowAverage()
	{
		
	}
}


abstract class GUI extends JFrame
{
	protected JTextField input;
	protected JTextField originalOutput;
	protected JTextField sortedOutput;
	protected JTextField averageOutput;
	protected JTextField aboveOutput;
	protected JTextField belowOutput;

	public GUI()
	{
		setLayout(null);
		setSize(700,300);

		JLabel inputLabel = new JLabel("Input :");
			inputLabel.setSize(110,20);
			inputLabel.setLocation(20,20);
			inputLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(inputLabel);

		input = new JTextField();
			input.setSize(500,25);
			input.setLocation(150,20);
		add(input);

		JButton processButton = new JButton("Process");
			processButton.setSize(260,40);
			processButton.setLocation(260,50);
			processButton.addActionListener( new ProcessButtonAction() );
		add(processButton);

		JLabel originalLabel = new JLabel("Original Array:");
			originalLabel.setSize(110,20);
			originalLabel.setLocation(20,100);
			originalLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(originalLabel);

		originalOutput = new JTextField();
			originalOutput.setSize(500,25);
			originalOutput.setLocation(150,100);
			originalOutput.setFocusable(false);
		add(originalOutput);

		JLabel sortedLabel = new JLabel("Sorted Array:");
			sortedLabel.setSize(110,20);
			sortedLabel.setLocation(20,130);
			sortedLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(sortedLabel);

		sortedOutput = new JTextField();
			sortedOutput.setSize(500,25);
			sortedOutput.setLocation(150,130);
			sortedOutput.setFocusable(false);
		add(sortedOutput);

		JLabel averageLabel = new JLabel("The Average Is:");
			averageLabel.setSize(110,20);
			averageLabel.setLocation(20,160);
			averageLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(averageLabel);

		averageOutput = new JTextField();
			averageOutput.setSize(500,25);
			averageOutput.setLocation(150,160);
			averageOutput.setFocusable(false);
		add(averageOutput);

		JLabel aboveLabel = new JLabel("Above Average:");
			aboveLabel.setSize(110,20);
			aboveLabel.setLocation(20,190);
			aboveLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(aboveLabel);

		aboveOutput = new JTextField();
			aboveOutput.setSize(500,25);
			aboveOutput.setLocation(150,190);
			aboveOutput.setFocusable(false);
		add(aboveOutput);

		JLabel belowLabel = new JLabel("Below Average:");
			belowLabel.setSize(110,20);
			belowLabel.setLocation(20,220);
			belowLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(belowLabel);

		belowOutput = new JTextField();
			belowOutput.setSize(500,25);
			belowOutput.setLocation(150,220);
			belowOutput.setFocusable(false);
		add(belowOutput);

		setLocationRelativeTo(null);
  		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class ProcessButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			processAction();
		}
	}

	abstract public void processAction();
}

