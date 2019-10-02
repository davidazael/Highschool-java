////////////////////////////////////////////////////////////////////////////
//
// Java1505 Allow the to enter a choice for their favorite sport.
//			After the user chooses, print a photo of that sport. If the user
//          does not choose from the 3 choices, display "No sport chosen"
//          on the graphics screen. (you may use the sample sports or pick 3
//          of your own)
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
//		Please choose your favorite sport:
//		A.  Football
//		B.  Basketball
//		C.  Baseball
//		D.  None of the above
//		Enter choice now ==> a
//
//	SAMPLE OUTPUT (ON GRAPHICS SCREEN):
//		+-------------------------------------+
//  	|                                     |
//  	|     (Football photo)                |
//  	|                                     |
//  	|                                     | 
//  	|                                     |
//		+-------------------------------------+
//
///////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import static java.lang.System.*;
import java.util.*;
import java.awt.*;
import java.io.*;
public class Java1505{
	public static void main(String[] args)	{
		new Problem05();
}}


class Problem05 extends JFrame
{
  	ImageIcon imageSource;

	char code;
  	String picture;
  
  	Problem05()
  	{
  		input();
  		process();

		imageSource = new ImageIcon( picture );

		setSize( imageSource.getIconWidth(), imageSource.getIconHeight() );
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );

		setVisible(true);
  	}

	void input()
	{
		Scanner scan = new Scanner(System.in);
		out.println("Please choose your favorite sport: ");
      	out.println("A. Football ");
      	out.println("B. Basketball ");
      	out.println("C. Baseball ");
      	out.println("D.  None of the above");
      	out.print("Enter choice now ==> ");
      	
      	
      	code = Character.toUpperCase( scan.nextLine().charAt(0) );
      	// input char value here
	}

	void process()
	{
			// complete switch here
			switch(code)
			{
				case 'A' : picture = "footbal.jpg"; imageSource = new ImageIcon(picture);	 	;break;
				case 'B' : picture = "basketball.jpg"; imageSource = new ImageIcon(picture);	;break;
				case 'C' : picture = "baseball.jpg"; imageSource = new ImageIcon(picture);		;break;
				case 'D' : picture = "No sport chosen";										 	;break;
			}
  	
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage( imageSource.getImage(),0,0,null );	
			g.drawString(picture,1,10);	
			
		}
	}
}

