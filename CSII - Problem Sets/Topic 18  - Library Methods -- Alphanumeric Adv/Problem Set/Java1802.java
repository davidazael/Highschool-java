///////////////////////////////////////////////////////////////////////////
//
// Java1802 Write a program to allow the user to enter two words.
//          Use local definitions to create smaller substrings you extract
//			from the originals.
//
//          Next, concatenate the two words to make one new String, also
//			stored as a local definition.
//
///////////////////////////////////////////////////////////////////////////
//
//    SAMPLE INPUT:
//			Enter 1st word ==> PROFESSOR
//			Enter 2nd word ==> CONVICT
//
//   SAMPLE OUTPUT:
//           From PROFESSOR and CONVICT comes the word CONFESS
//
///////////////////////////////////////////////////////////////////////////
/*

PROFESSOR
CONVICT

*/
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java1802{
    public static void main(String[] args){
    	new WordMaker();
}}


class WordMaker extends JFrame
{
	JTextField word1;
	JTextField word2;
	TextArea   output;
	JButton    event;
	
	WordMaker()
	{
		setSize(500,300);
		setLocationRelativeTo(null);
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout(null);

		setWidgets();

		setVisible(true);
	}

	private void setWidgets()
	{
   		getContentPane().setBackground(new Color(0,0,100));

		JLabel l1= new JLabel("Enter 1st word here:");
			l1.setForeground(Color.WHITE);
			l1.setSize( 150, 30 );
			l1.setLocation (25, 25 );
		add(l1);

		word1 = new JTextField();
			word1.setSize( 200, 30 );
			word1.setLocation (175, 25 );
	   	add( word1 );

		JLabel l2= new JLabel("Enter 2nd word here:");
			l2.setForeground(Color.WHITE);
			l2.setSize( 150, 30 );
			l2.setLocation (25, 70 );
		add(l2);

		word2 = new JTextField();
			word2.setSize( 200, 30 );
			word2.setLocation (175, 70 );
	   	add( word2 );

		event = new JButton("Process");
			event.setFont( new Font(null,3,32) );
			event.setSize( 185, 50 );
			event.setLocation( 125,115 );
			event.addActionListener( new ButtonAction() );
	   	add( event );

		output = new TextArea("",0,0,1);
			output.setSize(435,60);
			output.setLocation(25,180);
   		add( output );
	}

	class ButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		String words1 = word1.getText();
		String words2 = word2.getText();
		
		String editedWord = words1.substring(3,7);
		String editedWord2 = words2.substring(0,3);
		int edited = editedWord.compareTo(editedWord2);
		
		if(edited < 0)
			output.append(editedWord + editedWord2);
		else
			if(edited > 0)
				output.append(editedWord2 + editedWord);
		output.append(" ");
		
		
		
		}
	}
}



