///////////////////////////////////////////////////////////////////////////
//
// Java1604 Write a program to calculate the area of a circle using the
//          Math PI constant, the pow() method, and an input value for the
//          radius.  Print the precise answer as well as a rounded answer.
//
//			Remember that area = pi*r^2
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter a radius: 7
//
//     SAMPLE OUTPUT:  The area of a circle with a radius
//					   of 7 is 153.938040002589985
//					   or approximately 154.
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Java1604{
	public static void main(String[] args){
		new Problem();
}}


class Problem extends JFrame
{
	ImageIcon imageSource;

	double radius, radius1;
	double area;

	Problem()
	{
		imageSource = new ImageIcon( "pi.jpg" );
		setSize( imageSource.getIconWidth(), imageSource.getIconHeight() );
		setLocation(100,100);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );

		input();
		process();

		setVisible(true);
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter a radius: ");
		radius = scan.nextDouble();
	}

	void process()
	{
		radius1 = Math.PI * Math.pow(radius,2);

	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage( imageSource.getImage(), 0, 0, null );

			g.setFont( new Font("Courier", Font.BOLD, 32) );
			g.setColor(new Color(0,160,0,160));
			int y = 116;
			for(int x=55;x<=65;x++)
			{
				g.fill3DRect(x,y,660,175,true);y++;
			}



			g.setColor(Color.WHITE);

			g.drawString("The area of a circle with a radius ",80, 150);
			g.drawString("of " + radius + " is " + radius1  + Math.round(radius1) , 80, 190);
			g.drawString("or approximately " + Math.round(radius1) + "." , 80, 230);
		}
	}
}






