///////////////////////////////////////////////////////////////////////////
//
// Java0901 Write a program that reads the radius of a circle from a
//			JTextField.  Output the circumference and area of the circle
//			in a JTextArea.  Use a constant of 3.14159 for the value of PI.
// 			The problem is that the number read from the JTextField will
//			be a String.
//
//				"8.2"
//
//			You must convert the strring to a number value before
//			you can perform aritmatic with it.  You must convert the
//			String data to a real number.
//
//				"8.2"  ---->   8.2
//
//			HINT:
//				double num =  Double.parseDouble( "8.2" );
//
//
//			Formulas:	area = PI * r^2
//				        circumference = 2 * PI * r
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
//		ENTER RADIUS           ===>>  8.2
//
//	SAMPLE OUTPUT:
//			+----------------------------------------------+
//			| Title Bar                              _ = X |
//			+----------------------------------------------+
//			|                                              |
//			|  +------------------+                        |
//			|  | 8.2              |                        |
//			|  +------------------+                        |
//			|                                              |
//			|    +---------------------+                   |
//			|    |       PROCESS       |                   |
//			|    +---------------------+                   |
//			|                                              |
//			|  +----------------------------------------+  |
//			|  | The radius is 8.2                      |  |
//			|  | The area is 211.24                     |  |
//			|  | The circumference is 51.52             |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  |                                        |  |
//			|  +----------------------------------------+  |
//			|                                              |
//			+----------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////





package lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java0901
{
    public static void main(String[] args)
    	{
    	new MyFrame();
		}
}


class MyFrame extends JFrame
{
	
	 JTextArea  textArea;
	 JTextField textField;
	 JButton   buttonOne;
	
	
	public MyFrame()
	{
		setSize(700,350);
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

  		setContentPane( new MyPanel() );

		setVisible(true);
	}

	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setLayout( new FlowLayout() );

			textField = new JTextField("",30);
			add( textField );

			buttonOne = new JButton("Process");
				buttonOne.addActionListener( new ButtonAction() );
			add( buttonOne );

			textArea  = new JTextArea(5,50);
			textArea.setEditable(false);
			textArea.setFocusable(false);
			add( textArea );
		}
	}

	class ButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
			double num =  Double.parseDouble( textField.getText() );
			
			double area = 3.14159 * num * num;
	        double circumference = 2 * 3.14159 *num;
		
			
			textField.setText(" " + num);
			textArea.append("The radius is " + String.format("%,.2f",num) + "\n");
			textArea.append("The area is " + String.format("%,.2f",area)  + "\n");
			textArea.append("The circumference is " + String.format("%,.2f",circumference)+ "\n");
		
			System.out.println(event.getActionCommand() +"\n");
			
		
		}	
	
	}
	
				
}


	
	
















