///////////////////////////////////////////////////////////////////////////
//
// Java1805 Write a program that accepts a word that contains a 3-letter
//          PREFIX.  Use substring() to extract the prefix from the word,
//			and PERMANENTLY store the prefix in ALL CAPITAL LETTERS. Print
//			the results shown in the output below using JFrame objects.
//
///////////////////////////////////////////////////////////////////////////
//
//		    JFrame WINDOW
//		+--------------------------------------------------------+
//		|                                                        |
//		|      Input                                             |
//		|     +----------------------+                           |
//      |     |  prehistoric         |                           |
//		|     +----------------------+                           |
//		|                                                        |
//		|      Prefix                    Root word               |
//		|     +----------------------+   +-----------------+     |
//      |     |  PRE                 |   | historic        |     |
//		|     +----------------------+   +-----------------+     |
//      |                                                        |
//      +--------------------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////
//
//	TEST INPUT:
//			nonsense, tripod, unicode
//
///////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java1805{
    public static void main(String[] args){
    	new WordSplitter();
}}


class WordSplitter extends JFrame
{
	JTextField input;
	JTextField rootWord;
	JTextField prefix;
	JButton    event;

	public WordSplitter()
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

		JLabel l2= new JLabel("Prefix:");
			l2.setFont(new Font(null,1,18));
			l2.setForeground(Color.WHITE);
			l2.setSize( 150, 30 );
			l2.setLocation (25, 100 );
		add(l2);

		prefix = new JTextField();
			prefix.setSize( 100, 30 );
			prefix.setFocusable(false);
			prefix.setLocation (25, 135 );
	   	add( prefix );

		JLabel l3= new JLabel("Root word:");
			l3.setFont(new Font(null,1,18));
			l3.setForeground(Color.WHITE);
			l3.setSize( 150, 30 );
			l3.setLocation (150, 100 );
		add(l3);

		rootWord = new JTextField();
			rootWord.setSize( 150, 30 );
			rootWord.setFocusable(false);
			rootWord.setLocation (150, 135 );
	   	add( rootWord );

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
			String root = word.substring(0,3);
			prefix.setText(root.toUpperCase());
			rootWord.setText(word.substring(3,word.length() ));

		}
	}
}



