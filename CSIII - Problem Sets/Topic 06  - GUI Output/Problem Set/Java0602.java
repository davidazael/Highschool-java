///////////////////////////////////////////////////////////////////////////
//
// Java0602 Write an application program that displays the correct
//			message to the appropriate output location.
//
///////////////////////////////////////////////////////////////////////////
//
//	REQUIRED OUTPUT
//
//		Application Window:
//			Yes my lord.
//
//		Message Box:
//			Zug! Zug!
//
//		Console:
//			Jobs done.
//
//		CHALLENGE
//		---------
//		Data File ("Java0602.txt"):
//			You da boss.
//
package lesson;
import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Java0602{
    public static void main(String[] args){
    	new MyFrame();
}}


class MyFrame extends JFrame
{

	private JTextArea   myTextArea;								
	String data;
		
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
			myTextArea = new JTextArea(5,40);						
			add( myTextArea );
			data = "Zug! Zug!";
		 											
		}

		public void paintComponent(Graphics g)
		{
		
			myTextArea.setText("" + data );
			out.println("Jobs done.");												
		}
	}
}











