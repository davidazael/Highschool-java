///////////////////////////////////////////////////////////////////////////
//
// Java2706	Create a program that cycles colors.
//			Create a parameterized arraylist of colors.
//
//			ArrayList<Color>;
//
//			Add a minimum of five designer colors into the arraylist.
//			Create a graphics program that fills a circle for each
//			color.  Have the colors cycle through the circles.
//
///////////////////////////////////////////////////////////////////////////
//
//   First
//		+------------------------------------------------------+
//		|                                               _ - X  |
//		+------------------------------------------------------+
//		|                                                      |
//		|     .--.      .--.      .--.      .--.      .--.     |
//		|    /    \    /    \    /    \    /    \    /    \    |
//		|    |red |    |blue|    |grn |    |yell|    |mgta|    |
//		|    \    /    \    /    \    /    \    /    \    /    |
//		|     '--'      '--'      '--'      '--'      '--'     |
//		|                                                      |
//		+------------------------------------------------------+
//
//-------------------------------------------------------------------------
//
//   Next
//		+------------------------------------------------------+
//		|                                               _ - X  |
//		+------------------------------------------------------+
//		|                                                      |
//		|     .--.      .--.      .--.      .--.      .--.     |
//		|    /    \    /    \    /    \    /    \    /    \    |
//		|    |mgta|    |red |    |blue|    |grn |    |yell|    |
//		|    \    /    \    /    \    /    \    /    \    /    |
//		|     '--'      '--'      '--'      '--'      '--'     |
//		|                                                      |
//		+------------------------------------------------------+
//
//-------------------------------------------------------------------------
//
//   etc
//		+------------------------------------------------------+
//		|                                               _ - X  |
//		+------------------------------------------------------+
//		|                                                      |
//		|     .--.      .--.      .--.      .--.      .--.     |
//		|    /    \    /    \    /    \    /    \    /    \    |
//		|    |yell|    |mgta|    |red |    |blue|    |grn |    |
//		|    \    /    \    /    \    /    \    /    \    /    |
//		|     '--'      '--'      '--'      '--'      '--'     |
//		|                                                      |
//		+------------------------------------------------------+
//
//-------------------------------------------------------------------------
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java2706{
	public static void main(String[] args){
		new Solution();
}}

class Solution extends JFrame
{
	ArrayList</* Generic type */> cool;

	Solution()
	{
		populate();

		setSize(610,300);
		setLocationRelativeTo(null);
		setBackground(Color.BLACK);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );

		setVisible(true);

		run();
	}

	void populate()
	{
		cool = new /* instantiate ArrayList with Generic type */;
		//  Add five colors to the ArrayList
	}

	void run()
	{
		while( true )
		{
			move();
			repaint();
			delay(500);
	    }
	}

	void move()
	{
		Color temp = /* remove the 1st element (remaining elements shift) */
		// add the temporary color to the back of the ArrayList
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
		// get the five colors from the ArrayList
			g.setColor( /* ???? */ );		g.fillOval( 10,70,100,100);
			g.setColor( /* ???? */ );		g.fillOval(130,70,100,100);
			g.setColor( /* ???? */ );		g.fillOval(250,70,100,100);
			g.setColor( /* ???? */ );		g.fillOval(360,70,100,100);
			g.setColor( /* ???? */ );		g.fillOval(480,70,100,100);
		}
	}

	public void delay(int time)
	{
		try { Thread.sleep(time); } catch( InterruptedException e ){}
	}
}




