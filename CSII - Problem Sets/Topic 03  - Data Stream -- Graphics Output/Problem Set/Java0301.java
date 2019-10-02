///////////////////////////////////////////////////////////////////////////
//
// Java0301 Write a graphics program that displays the following
//			three phrases on an 800x600 panel centered on the
//			screen.  Each phrase should be at a different
//			location on the screen.  Do not use the default Font or Color
//          for the phrases.
//
//	REQUIRED OUTPUT:
//                      800 wide
//		+------------------------------------------+
//		|		Starting here!					   |
//		|						I am here now!	   |600 tall
//      |                                          |
//		|	Look over here!                        |
//      +------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////

// imports
import javax.swing.*;
import java.awt.*;

public class Java0301
{
    public static void main(String[] args)
    {
    	new MyDrawing();
    }

}

class MyDrawing extends JFrame
{
	public MyDrawing()
	{
		setSize(800,600); // set size of panel to 800 x 600
		

		setLocationRelativeTo(null); //center it

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new PaintingPanel());

		// display it
		setVisible(true);
	}
	
	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setFont(new Font ("Arial",3,20));
			g.drawString( "Starting Here!", 100,200);
			g.drawString( "I am here now!",300,100);
			g.drawString( "Look Over Here!",500,300);
		}
	}

	// Inner class goes here
	


}