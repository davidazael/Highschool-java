///////////////////////////////////////////////////////////////////////////
//
// Java1703 Allow the user to input their first, middle, and last name and
//          print their initials inside three DIFFERENTLY colored squares.
//          NOTE: Always capitalize initials!
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE DATA:  Enter your first name  ==> James
//                   Enter your middle name ==> Paul
//                   Enter your last name   ==> McCartney
//
//   SAMPLE OUTPUT:
//
//				(on graphics window)
//          +-----------------------------------------------+
//          |                                               |
//          |                                               |
//          |        +----+      +----+      +----+         |
//          |        |    |      |    |      |    |         |
//			|        | J  |      | P  |      | M  |         |
//          |        |    |      |    |      |    |         |
//          |        +----+      +----+      +----+         |
//          |                                               |
//          |                                               |
//          +-----------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Java1703{
	public static void main(String[] args){
		new Initials();
}}


class Initials extends JFrame
{
	// INSTANCE VARIABLES HERE
	String f,m,l;
	

	public Initials()
	{
		setSize( 600, 300 );
		setLocation(100,100);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );

		input();

		setVisible(true);
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter first name ==> ");
	  	f = scan.nextLine();

		out.print("Enter middle name ==> ");
	  	m = scan.nextLine();

		out.print("Enter last name ==> ");
	  	l = scan.nextLine();

	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setFont(new Font(null,Font.BOLD,24));

			g.setColor(Color.YELLOW);
			g.fillRect(100,50,50,50);

			g.setColor(Color.BLACK);
			g.drawString(" " + f.charAt( (f.length() - (f.length()) ) ),110,85);

			g.setColor(Color.BLUE);
			g.fillRect(200,50,50,50);

			g.setColor(Color.YELLOW);
			g.drawString(" " + m.charAt( (m.length() - (m.length()) ) ),210,85);


			g.setColor(Color.RED);
			g.fillRect(300,50,50,50);

			g.setColor(Color.WHITE);
			g.drawString(" " + l.charAt( (l.length() - (l.length()) ) ),310,85);
		}
	}
}



