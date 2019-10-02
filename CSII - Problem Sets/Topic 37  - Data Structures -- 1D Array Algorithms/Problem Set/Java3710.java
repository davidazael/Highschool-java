///////////////////////////////////////////////////////////////////////////
//
// Java3710 Enter integers (as a String) into a text field. Use
//			split() to separate the String into individual String items.
//			Use Integer.valueOf() to convert the individual String
//			items into integer data and place the numbers into an array.
//			When the user presses the 'all' button, display the original
//			array.  When the 'even' numbers button is pushed, display
//			the even numbers. When the 'odd' numbers button is pushed,
//			display the odd numbers.
//
//
//     SAMPLE DATA:  15 85 123 45 37 92 34 14 57 16
//
//			  VIEW:
//
//          +--------------------------------------------------------+
//          |         +--------------------------------------------+ |
//          | Input:  | 15 85 123 45 37 92 34 14 57 19             | |
//          |         +--------------------------------------------+ |
//          |      +----------------+  +---------+  +---------+      |
//          |      |      All       |  |  Even   |  |   Odd   |      |
//          |      +----------------+  +---------+  +---------+      |
//          |         +--------------------------------------------+ |
//          | Output: | [15, 85, 123, 45, 37, 92, 34, 14, 57, 19]  | |
//          |         +--------------------------------------------+ |
//          +--------------------------------------------------------+
//           :                                                      :
//          |         +--------------------------------------------+ |
//          | Output: | 37 92 34 14                                | |
//          |         +--------------------------------------------+ |
//          +--------------------------------------------------------+
//           :                                                      :
//          |         +--------------------------------------------+ |
//          | Output: | 15 85 123 45 57 19                         | |
//          |         +--------------------------------------------+ |
//          +--------------------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////
//
//
//



import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Java3710{
	public static void main(String[] args){
		new Environment();
}}


class Environment extends GUI
{
	private int[] numbers;

	public void allAction()
	{
		String data = input.getText();

		

		output.setText( Arrays.toString( numbers ) );
	}

	public void oddAction()
	{
		
	}

	public void evenAction()
	{
	
	}
}


abstract class GUI extends JFrame
{
	protected TextArea 	output;
	protected TextArea 	input;

	public GUI()
	{
		setLayout(null);
		setSize(500,180);
		getContentPane().setBackground(new Color(150,0,60));

		JLabel inputLabel = new JLabel("Input: ");
			inputLabel.setForeground(Color.white);
			inputLabel.setSize(50,20);
			inputLabel.setLocation(20,20);
			inputLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(inputLabel);

		JLabel outputLabel = new JLabel("Output: ");
			outputLabel.setForeground(Color.white);
			outputLabel.setSize(50,20);
			outputLabel.setLocation(20,100);
			outputLabel.setHorizontalAlignment(JLabel.RIGHT);
		add(outputLabel);

		input = new TextArea("",1,25,TextArea.SCROLLBARS_NONE);
			input.setSize(400,30);
			input.setLocation(70,20);
			input.setBackground(new Color(200,200,200));;
		add(input);

		output = new TextArea("",1,25,TextArea.SCROLLBARS_NONE);
			output.setSize(400,30);
			output.setLocation(70,100);
			output.setBackground(new Color(200,200,200));;
		add(output);

		JButton allButton = new JButton("All");
			allButton.setSize(160,30);
			allButton.setLocation(60,60);
			allButton.addActionListener( new AllButtonAction() );
		add(allButton);

		JButton oddButton = new JButton("Odd");
			oddButton.setSize(100,30);
			oddButton.setLocation(230,60);
			oddButton.addActionListener( new OddButtonAction() );
		add(oddButton);

		JButton evenButton = new JButton("Even");
			evenButton.setSize(100,30);
			evenButton.setLocation(340,60);
			evenButton.addActionListener( new EvenButtonAction() );
		add(evenButton);

		setLocationRelativeTo(null);
  		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class AllButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			allAction();
		}
	}

	abstract public void allAction();

	class OddButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			oddAction();
		}
	}

	abstract public void oddAction();

	class EvenButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			evenAction();
		}
	}

	abstract public void evenAction();

}
