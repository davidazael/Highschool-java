////////////////////////////////////////////////////////////////////////////
//
// Java0603 The fast food restaurant McJava's is celebrating its 9th
//			anniversary by having a $.99 cent special on EVERYTHING it
//			sells.  Their drive-in window is technologically advanced,
//			and everything is input by keyboard!  Write the program for
//			their interactive drive-through window.  Then purchase enough
//			food for everyone in your classroom.
//
///////////////////////////////////////////////////////////////////////////
//
// SAMPLE INPUT:
//		Dialog Box Input
//
//			+----------------------------------------+
//			| Title Bar                        _ = X |
//			+----------------------------------------+
//			| Welcome to McJava's.                   |
//			| We are having a 99 cent special today! |
// 			| What would you like to order today? 	 |
//			|  +--------------------------------+    |
//			|  | Cheeseburgers                  |    |
//			|  +--------------------------------+    |
//			+----------------------------------------+
//
//			+----------------------------------------+
//			| Title Bar                        _ = X |
//			+----------------------------------------+
//			| How many would you like?               |
//			|  +--------------------------------+    |
//			|  | 24                             |    |
//			|  +--------------------------------+    |
//			+----------------------------------------+
//
//			+----------------------------------------+
//			| Title Bar                        _ = X |
//			+----------------------------------------+
//			| How will you be paying today           |
//          | (cash, debit card, etc)                |
//			|  +--------------------------------+    |
//			|  | credit card                    |    |
//			|  +--------------------------------+    |
//			+----------------------------------------+
//
// SAMPLE OUTPUT:
//
//			+----------------------------------------+
//			| Title Bar                        _ = X |
//			+----------------------------------------+
//			|                                        |
//			|  +--------------------------------+    |
//			|  | Your order:  24 cheeseburgers  |    |
//			|  | Total: $23.76.                 |    |
//			|  | Payment:  credit card          |    |
//			|  |                                |    |
//			|  |                                |    |
//			|  | Please submit payment at       |    |
//			|  | the first window.              |    |
//			|  |                                |    |
//			|  | Thank you!                     |    |
//			|  |                                |    |
//			|  |                                |    |
//			|  +--------------------------------+    |
//			|                                        |
//			+----------------------------------------+
//
///////////////////////////////////////////////////////////////////////////



package lesson;

import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Java0603
{
	   public static void main(String[] args)
	   	{
    	new MyFrame();
		}
}


class MyFrame extends JFrame
{
	private JTextArea  textArea;
	private String food;
	private String amount;
	private String money;
	private double total;
	

	public MyFrame()
	{
		setSize(500,300);
		setLocationRelativeTo(null);
 		setContentPane( new MyPanel() );
 		

		run();													//	Process Control Method

		setVisible(true);
	}

	public void run()
	{
		food       = showInputDialog( null, "Welcome to McJava's.\nWe are having a 99 cent special today!\nWhat would you like to order today?" );
		amount     = showInputDialog( null, "How many would you like?" );
		money     = showInputDialog( null, "How will you be paying today\n(cash, debit card, etc) " );
		
		total = Integer.valueOf(amount) * 0.99;
		
	}

	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			JScrollPane scrollPane = new JScrollPane( textArea = new JTextArea() );
				scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPane.setPreferredSize(new Dimension(250,250));
			add( scrollPane );
		}

		public void paintComponent(Graphics g)
		{
			textArea.setText("Your order: " + amount + " " + food + " \n");
			textArea.append ("Total: " + String.format("$%,.2f",total) + " \n");
			textArea.append ("Payment: You will need " + money + " \n");
			textArea.append ("Please submit payment at\nthe first window.\n\n Thank you! "+ " \n");
		}
	}
}

