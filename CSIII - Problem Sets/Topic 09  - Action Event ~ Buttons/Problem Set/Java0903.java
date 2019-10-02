///////////////////////////////////////////////////////////////////////////
//
// Java0903	Write a program that asks the user for two numbers.
//			Create 4 buttons that perform basic math operations.
//
//			You must create and use the following GUI interface,
//
//
//
//                    +----   Sign is changed with each button action
//                    |
//                    V
//		    +------------------------------+
//		    |  +----+   +----+     +----+  |
//		    |  |    | + |    |  =  |    |  |  <----  Text Fields
//		    |  +----+   +----+     +----+  |
//		    |                              |
//		    |  +---+  +---+  +---+  +---+  |
//		    |  | + |  | - |  | * |  | / |  |  <----  Buttons
//		    |  +---+  +---+  +---+  +---+  |
//		    +------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////
//
//
//
//
//

package lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java0903
{
    public static void main(String[] args)
    	{
    	new MyFrame();
		}
}


class MyFrame extends JFrame
{
	
	 TextArea  textArea;
	 TextField textField;
	 TextField textField1;
	 TextField answer;
	 JButton   buttonOne;
	 JButton   buttonTwo;
	 JButton   buttonThree;
	 JButton   sum;
	 JButton   sub;
	 JButton   multy;
	 JButton   divide;
	
	
	public MyFrame()
	{
		setSize(500,350);
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

			textField = new TextField("",10);
			add( textField );
			
			buttonOne = new JButton("+");
				buttonOne.addActionListener( new ButtonAction() );
			add( buttonOne );
			
			textField1 = new TextField("",10);
			add( textField1 );
			
			buttonTwo = new JButton("=");
				buttonTwo.addActionListener( new ButtonAction() );
			add( buttonTwo );
			
			answer 	= new TextField("",15);							
			this.add(answer);
			
			sum = new JButton("+");
				sum.addActionListener( new ButtonAction() );
			add( sum );
			
			
				

		/*	textArea  = new TextArea(5,10);
			textArea.setEditable(false);
			textArea.setFocusable(false);
			add( textArea ); 
			*/
		}
	}

	class ButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
		
		}	
	}
			
}
