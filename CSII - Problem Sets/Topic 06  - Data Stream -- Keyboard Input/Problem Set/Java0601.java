///////////////////////////////////////////////////////////////////////////
//
// Java0601	Write a program to read a name from the keyboard. Display
//          in graphics.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  "What is your name?" ==> Luke
//
//     SAMPLE OUTPUT:  Graphic surprise.
//
//  REVIEW:  console input(), Graphics output with shadow
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Java0601{
	public static void main(String[] args){
		new TheTruth();
}}


class TheTruth extends JFrame
{
	ImageIcon 	imageSource;
	String 	name;

	TheTruth()
	{
		imageSource = new ImageIcon( "Vader.jpg" );

		setSize( imageSource.getIconWidth(), imageSource.getIconHeight() );
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );

		input();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner (in );
		
		out.print("Please enter your name	=>");
		name = scan.nextLine();

	}

	public void output()
	{
		setVisible(true);
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage( imageSource.getImage(), 0, 0, null );

			g.setFont(new Font(null,Font.BOLD,48));
			g.setColor( Color.WHITE );
			g.drawString(name + ",", 310, 100);
			g.drawString("I am ",        310, 175);
			g.drawString("your father!", 310, 225);
			g.setColor(Color.BLUE);
			g.drawString(name + ",", 312, 102);
			g.drawString("I am ",        312, 177);
			g.drawString("your father!", 312, 227);
		}
	}
}





