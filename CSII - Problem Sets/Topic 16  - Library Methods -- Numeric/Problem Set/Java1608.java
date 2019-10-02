///////////////////////////////////////////////////////////////////////////
//
// Java1608	Write a program that allows the user to enter their name, and
//			generate a random color that prints a message to the user in
//			the new color.  The red, green, and blue values in the Color
//			arguments range from 0-255.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:	Enter your name ==> Ralph
//
//	SAMPLE OUTPUT (on Graphics Window):
//
//		+------------------------------------+
//		|									 |  The output should be in
//		|        Hello, Ralph!               |	a random color.  Run
//		|									 |  several times!
//		+------------------------------------+
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Java1608{
	public static void main(String[] args){
		new Problem();
}}

class Problem extends JFrame
{
	int r,g,b;
	int low,high;

	Problem()
	{
		input();
		setSize(800,600);
		setBackground(Color.getHSBColor(r,g,b));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new PaintingPanel());
		setVisible(true);
	}

	void input()
	{
		low = 0;
		high = 250;
		r =  (int)(Math.random()*(high - low + 1)) + low ;
		g =  (int)(Math.random()*(high - low + 1)) + low ;
		b =  (int)(Math.random()*(high - low + 1)) + low ;
		
		
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setFont( new Font("Courier", Font.BOLD, 50) );
			g.drawString("Hello, Ralph!", 50 ,50);

		}

	}

}