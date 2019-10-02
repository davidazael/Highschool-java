///////////////////////////////////////////////////////////////////////////
//
// Java2301 Write a program to read from a text field and determine the
//			number of consonents and vowels.  Create a consenent set
//			and a vowel set.  Compare each letter in the input string
//			to the two sets.  If the letter is in the consonent set count
//			it as a consonent and if the letter is in the vowel set count
//			it as a vowel.  Punctuation, numbers, and spaces are not
//			counbuttonOne.
//
//		 REQUIREMENT: Your program must use a Hashset data structure.
//
//
//       BATCH INPUT: Power corrupts. Absolute power is kind of neat.
//
//			    VIEW:
//
//       +---------------------------------------------------------+
//       | +-----------------------------------------------------+ |
//       | | Power corrupts. Absolute power is kind of neat.     | |
//       | +-----------------------------------------------------+ |
//       |               +-------------------------+               |
//       |               |         Process         |               |
//       |               +-------------------------+               |
//       | +-----------------------------------------------------+ |
//       | | Vowels: 15                                          | |
//       | | Consonents: 23                                      | |
//       | |                                                     | |
//       | |                                                     | |
//       | +-----------------------------------------------------+ |
//       +---------------------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////
//
//
//

import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java2301 
{
	public static void main(String[] args)
	{
		new Model();
	}
}
class Model extends JFrame
{
	JTextArea  textArea;
	JTextField textField;
	JButton   buttonOne;
	
	
	public Model()
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
			setBackground(new Color(100,100,250));

			textField = new JTextField("",50);
			add( textField );

			buttonOne = new JButton("Process");
				buttonOne.addActionListener( new ButtonAction() );				
				buttonOne.setFont( new Font(null,3,32) );				
				buttonOne.setForeground( new Color(250,150,0) );		
				buttonOne.setSize( 200, 50 );						
				buttonOne.setLocation( 250, 100 );
			add( buttonOne );

			textArea  = new JTextArea(5,50);
		//	textArea.sebuttonOneitable(true);
			textArea.setFocusable(false);
			add( textArea );
		}
	}
	
	public void ButtonAction()
	{
		String let = textArea.getText();
		Set vowels;
		
		vowels = new HashSet();
		
		textArea.append( let );
		
		
	}

	class ButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{		
			ButtonAction();
		}	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





