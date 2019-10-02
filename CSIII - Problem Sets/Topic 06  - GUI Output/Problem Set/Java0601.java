///////////////////////////////////////////////////////////////////////////
//
// Java0601	Write a program that Creates a single TextArea in a JFrame.
//			Populate the TextArea with a sentence detailing your
//			favorite cartoon characters.
//
///////////////////////////////////////////////////////////////////////////
//
//
//     SAMPLE OUTPUT:
//	+----------------------------------------------+
//	|  <<<  Press return to process.  >>>          |
//	|                                              |
//	|                                              |
//	|		+----------------------------------------------+
//	|		| Title Bar                              _ = X |
//	|		+----------------------------------------------+
//	|		|                                              |
//	|		|  +-----------------------------+             |
//	|		|  | My favorite cartoon         |             |
//	|		|  | characters are              |             |
//	|		|  | Rocky and Bullwinkle.       |             |
//	|		|  |                             |             |
//	+-------|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  |                             |             |
//			|  +-----------------------------+             |
//			|                                              |
//			|                                              |
//			|                                              |
//			+----------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////




package lesson;

import javax.swing.*;
import java.awt.*;

public class Java0601{
    public static void main(String[] args){
    	new MyFrame();
}}


class MyFrame extends JFrame
{

	private TextArea   myTextArea;								

	public MyFrame()
	{
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
 		this.setContentPane( new MyPanel() );
		this.setVisible(true);
	}

	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			myTextArea = new TextArea("",5,40,2);				
			add( myTextArea );										
		}

		public void paintComponent(Graphics g)
		{
			myTextArea.setText("My favorite cartoon\ncharacters are\nTom & Jerry!!!");														
		}
	}
}









