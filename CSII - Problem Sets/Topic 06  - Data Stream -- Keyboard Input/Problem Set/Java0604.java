///////////////////////////////////////////////////////////////////////////
//
// Java0604 Write a graphics program that allows the user to enter three
//          coordinates.  Connect the coordinates to draw a triangle.
//
//      * DO NOT USE THE nextInt() METHOD! *
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT: Enter coordinate #1:
//				  x1 => 150
//				  y1 => 200
//				  Enter coordinate #2:
//				  x2 => 300
//				  y2 => 50
//				  Enter coordinate #3:
//				  x3 => 225
//				  y3 => 300
//
//  OUTPUT:
//    +---------------------------------------------------------------------+
//    |                                                                     |
//    |                                                                     |
//    |                                                                     |
//    |                                                                     |
//    |                                   ,.-'`/                            |
//    |                              ,.-'`    /                             |
//    |                         ,.-'`        /                              |
//    |                    ,.-'`            /                               |
//    |               ,.-'`                /                                |
//    |             -:                    /                                 |
//    |               '-.                /                                  |
//    |                  '-,            /                                   |
//    |                     '-.        /                                    |
//    |                        '-.    /                                     |
//    |                           '-./                                      |
//    |                                                                     |
//    |                                                                     |
//    |                                                                     |
//    |                                                                     |
//    +---------------------------------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.awt.*;
import javax.swing.*;

class Java0604
{
	public static void main(String[] args)
	{
		new Triangle();
	}
}


class Triangle extends JFrame
{
	private int x1,y1,y2,y3,x2,x3;

	public Triangle()
	{
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );

		input();
	}

	public void input()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("ENTER x1 cordinate>");
			 x1 = Integer.valueOf(scan.nextLine());

		System.out.print("ENTER y1 cordinate>");
			 y1 = Integer.valueOf(scan.nextLine());

		System.out.print("ENTER x2 cordinate>");
			 x2 = Integer.valueOf(scan.nextLine());
			 
		System.out.print("ENTER y2 cordinate>");
			y2  = Integer.valueOf(scan.nextLine());

		System.out.print("ENTER x3 cordinate>");
			x3  = Integer.valueOf(scan.nextLine());

		System.out.print("ENTER y3 cordinate>");
			y3  = Integer.valueOf(scan.nextLine());

		setVisible(true);
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			
			g.drawLine(x1,y1,x2,y2);
			g.drawLine(x2,y2,x3,y3);
			g.drawLine(x3,y3,x1,y1);

		}
	}
}

