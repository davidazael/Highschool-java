///////////////////////////////////////////////////////////////////////////
//
// Java0902 KINETIC ENERGY:  The kinetic energy of a moving object
//			is given by the formula
//
//               KE = (.5)mv^2.
//
//           Given the mass (m) and the speed (v) of an object, find its
//           kinetic energy.  Read the data from the keyboard.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
//		ENTER MASS           ===>>  100
//		ENTER VELOCITY       ===>>  25
//
//	SAMPLE OUTPUT:
//
//			+----------------------------------------+
//			| Title Bar                        _ = X |
//			+----------------------------------------+
//			|  +------------------+                  |
//			|  | 100              |                  |
//			|  +------------------+                  |
//			|  +------------------+                  |
//			|  | 25               |                  |
//			|  +------------------+                  |
//			|                                        |
//			|    +---------------------+             |
//			|    |       PROCESS       |             |
//			|    +---------------------+             |
//			|                                        |
//			|  +-----------------------------+       |
//			|  | For an object with          |       |
//			|  | a mass of 100               |       |
//			|  | and a speed of 25,          |       |
//			|  | kinetic energy is 31250.0   |       |
//			|  |                             |       |
//			|  |                             |       |
//			|  |                             |       |
//			|  +-----------------------------+       |
//			|                                        |
//			+----------------------------------------+
//
//	TEST INPUT:  50
//				 12
//
//	HINT:	String numStr = 50;
//			int    num    = Integer.parseInt( numStr );
//
///////////////////////////////////////////////////////////////////////////


package lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java0902
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
	 JTextField textField1;
	 JButton   buttonOne;
	
	
	public MyFrame()
	{
		setSize(200,350);
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

			textField = new JTextField("",10);
			add( textField );
			
			textField1 = new JTextField("",10);
			add( textField1 );

			buttonOne = new JButton("Process");
				buttonOne.addActionListener( new ButtonAction() );
			add( buttonOne );
			
			

			textArea  = new JTextArea(10,10);
			textArea.setEditable(false);
			textArea.setFocusable(false);
			add( textArea );
		}
	}

	class ButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
			
			double  mass =  Double.parseDouble( textField.getText() );
			int velocity =  Integer.parseInt( textField1.getText() );
			double kinetic = (.5) * mass * velocity * velocity;
			
			textArea.append("For an object with\n") ;
			textArea.append("a mass of " + mass + " \n" ) ;
			textArea.append("and a speed of " + velocity + ", \n") ;
			textArea.append("kinetic energy is " + String.format("%,.2f", kinetic) + "\n" ) ;
			
			
			System.out.println(event.getActionCommand() +"\n");
		}	
	}
			
}
