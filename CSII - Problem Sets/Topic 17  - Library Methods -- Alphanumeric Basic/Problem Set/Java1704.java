///////////////////////////////////////////////////////////////////////////
//
// Java1704 Your math teacher needs to be able to enter a complex
//			mathematical formula and isolate the location of a single
//			item in the formula.  Once that location is found, your
//			teacher also needs to be able to locate the next time that
//			item is found in the formula.
//
///////////////////////////////////////////////////////////////////////////
//
//   SAMPLE INPUT:
//		  ENTER FORMULA ==> 	a/b = a(1/b)
//		ENTER CHARACTER ==>     /
//
//   SAMPLE OUTPUT:
//		The character '/' is found at position 1
//		Next it is found at position 9
//
///////////////////////////////////////////////////////////////////////////
//
//	 OTHER INPUT TO TRY:
//	   (a + b) + c = a + (b + c)   			...  Use ) for target item
//		1/2 N(N-3)   						...  Use N for target item
//		2(pi * r^2) + (2 * pi * r) * h	 	...  Use r for target item
//
///////////////////////////////////////////////////////////////////////////



import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java1704{
    public static void main(String[] args){
    	new Isolate();
}}


class Isolate extends JFrame
{
	JTextField formula;
	JTextField target;
	TextArea   output;
	JButton    event;

	Isolate()
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

		JLabel l1= new JLabel("  ENTER FORMULA ==>");
			l1.setForeground(Color.WHITE);
			l1.setSize( 150, 30 );
			l1.setLocation (25, 25 );
		add(l1);

		formula = new JTextField();
			formula.setSize( 200, 30 );
			formula.setLocation (175, 25 );
	   	add( formula );

		JLabel l2= new JLabel("ENTER CHARACTER ==>");
			l2.setForeground(Color.WHITE);
			l2.setSize( 150, 30 );
			l2.setLocation (25, 70 );
		add(l2);

		target = new JTextField();
			target.setSize( 200, 30 );
			target.setLocation (175, 70 );
	   	add( target );

		event = new JButton("Process");
			event.setFont( new Font(null,3,32) );
			event.setSize( 225, 50 );
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
			String bob = formula.getText();
			String boby = target.getText();
			
			output.append("'" + target.getText() + "' is first found at " + bob.indexOf(boby) );
			output.append("\nNext it is found at " + bob.indexOf(boby, bob.indexOf(boby)+1 ) );
			
			
		
		}
	}
}



