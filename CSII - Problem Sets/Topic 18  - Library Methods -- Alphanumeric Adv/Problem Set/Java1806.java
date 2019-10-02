///////////////////////////////////////////////////////////////////////////
//
// Java1806 This program is similar to #5, but a bit more challenging.
//			A suffix is a word element that is placed AFTER the root and
//			changes the word's meaning as well as its function (use).
//
//          Write a program that accepts a word that contains a 3-letter
//          suffix.  Use substring() to extract the suffix from the root,
//			and print the results shown in the output below using a
//			graphics Window.
//
//			hint:  use word.length()-3
//
///////////////////////////////////////////////////////////////////////////
//
//		    JFrame WINDOW
//		+--------------------------------------------------------+
//		|                                                        |
//		|      Input                                             |
//		|     +----------------------+                           |
//      |     |  helpful             |                           |
//		|     +----------------------+                           |
//		|                                                        |
//		|      Root Word                  Suffix                 |
//		|     +----------------------+   +-----------------+     |
//      |     |  help                |   | ful             |     |
//		|     +----------------------+   +-----------------+     |
//      |                                                        |
//      +--------------------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////
//
//	TEST INPUT:
//      	building, dependent, strongest
//
///////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java1806{
    public static void main(String[] args){
    	new WordSplitter();
}}


class WordSplitter extends JFrame
{
	JTextField input;
	JTextField rootWord;
	JTextField suffix;
	JButton    event;

	WordSplitter()
	{
		setSize(445,300);
		setLocationRelativeTo(null);
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout(null);

		setWidgets();

		setVisible(true);
	}



	private void setWidgets()
	{
   		getContentPane().setBackground(new Color(0,0,100));

		JLabel l1= new JLabel("Input:");
			l1.setFont(new Font(null,1,18));
			l1.setForeground(Color.WHITE);
			l1.setSize( 150, 30 );
			l1.setLocation (25, 25 );
		add(l1);

		input = new JTextField();
			input.setSize( 300, 30 );
			input.setLocation (25, 60 );
	   	add( input );

		JLabel l2= new JLabel("Root Word:");
			l2.setFont(new Font(null,1,18));
			l2.setForeground(Color.WHITE);
			l2.setSize( 150, 30 );
			l2.setLocation (25, 100 );
		add(l2);

		rootWord = new JTextField();
			rootWord.setSize( 200, 30 );
			rootWord.setFocusable(false);
			rootWord.setLocation (25, 135 );
	   	add( rootWord );

		JLabel l3= new JLabel("Suffix:");
			l3.setFont(new Font(null,1,18));
			l3.setForeground(Color.WHITE);
			l3.setSize( 150, 30 );
			l3.setLocation (250, 100 );
		add(l3);

		suffix = new JTextField();
			suffix.setSize( 150, 30 );
			suffix.setFocusable(false);
			suffix.setLocation (250, 135 );
	   	add( suffix );

		event = new JButton("Process");
			event.setFont( new Font(null,3,32) );
			event.setSize( 185, 40 );
			event.setLocation( 100,200 );
			event.addActionListener( new ButtonAction() );
	   	add( event );
	}

	class ButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String word = input.getText();
			String root = word.substring(word.length()-3);
			suffix.setText(root);
			rootWord.setText(word.substring(0,word.length()-3 ));
		
		}
	}
}



