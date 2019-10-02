///////////////////////////////////////////////////////////////////////////
//
// Java0504 Pete is going to plant a rectangular garden.  He needs
//          to build a fence to keep his very curious puppy out of
//          the plants.  The garden measures 10 feet long and 5 feet
//          wide.  HE IS GOING TO USE THE GARAGE WALL FOR ONE LONG
//          SIDE OF THE GARDEN.  Compute and print the area of
//          the garden plot and the amount of fencing he will need.
//
//			HINT:  Here is a visual image of the existing garage and
//			new garden to help you.
//                                      <---5--->
//				+----------------------+--------+  A
//				|                      |        |  |
//				|                      |        |  |
//				|        GARAGE        | GARDEN | 10
//				|                      |        |  |
//				|                      |        |  |
//				+----------------------+--------+  V
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE DATA:  length = 10        //  Using assignment statements
//                   width = 5
//
//   SAMPLE OUTPUT:
//	 		+----------------------------------------------+
//	 		| Title Bar                              _ = X |
//	 		+----------------------------------------------+
//	 		|                                              |
//	 		|   A garden that is 10 feet long and          |
//			|   5 feet wide will have an area              |
//			|   of 50 square feet.  Because Pete is        |
//			|   using an existing garage wall, he          |
//			|   will need 20 feet of fencing.              |
//			|                                              |
//			+----------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////


import javax.swing.*;
import java.awt.*;

public class Java0504{
	public static void main(String[] args){
		new GUIFrame();
}}

class GUIFrame extends JFrame
{
	// variables
	final int length = 10;
	final int width = 5;
	int area;
	int fencing;

	public GUIFrame()
	{
		setSize(800,600);
		setLocationRelativeTo(null);
		setTitle("Fencing");
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setContentPane( new PaintingFrame() );

     	// assignments and calculation
     	area = length * width;
     	fencing = length +(width * 2);

		setVisible(true);
   	}

	class PaintingFrame extends JPanel
    {
		public void paintComponent(Graphics g)
		{
			g.setColor( Color.BLUE );
			g.setFont( new Font(null,Font.BOLD,36) );
			

			// output here
			g.drawString("A garden that is " + length + " feet long and " + width + " feet wide",25,100);
			g.drawString("will have an area of " + area + " square feet. Because",25,150);
			g.drawString("Pete is using an existing garage,",25,200);
			g.drawString("wall he will need " + fencing + " feet of fencing.",25,250);
		}
    }
}
