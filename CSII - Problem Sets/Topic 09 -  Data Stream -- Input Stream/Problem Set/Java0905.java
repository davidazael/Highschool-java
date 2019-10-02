///////////////////////////////////////////////////////////////////////////
//
// Java0905 Use a data file to read in the following:
//                * the r,g,b values for a new Color
//                * a Font name, style, and size
//                * a text emoticon
//       In graphics, create a 1024 x 768 frame.  Use the r,g,b values
//       from the data file for the background color (Choose any color
//       for the text color). Display the emoticon from the data file
//       using the font created from the data file information. (Feel
//       free to change the data file emoticon).
// 
//      Data file: FontFunA.dat
//                         1024
//      +------------------------------------------------+
//      |                                                |
//      |  (Background color from data file)             |  
//      |  Display the emoticon from the data file       |   768
//      |  in the font from the data file                |
//      |                                                |
//      +------------------------------------------------+
//
//      TEST YOUR PROGRAM WITH DATA FILE FontFunB.dat:



import static java.lang.System.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Java0905
{
	public static void main (String[] args)	
		{
		new Solution05();
		}
}


class Solution05 extends JFrame
{
	// lots of instance variables needed
	int r;
	int g;
	int b;
	String font;
	int n1;
	int n2;
	String emoticon;

	public Solution05()
	{		
		// try/catch here
		
		
		
		try
		{
			Scanner scan = new Scanner(new File("FontFunB.dat" ));
			r = Integer.valueOf(scan.nextLine());
			g = Integer.valueOf(scan.nextLine());
			b = Integer.valueOf(scan.nextLine());
			font = scan.nextLine();
			n1 = Integer.valueOf(scan.nextLine());
			n2 = Integer.valueOf(scan.nextLine());
			emoticon = scan.nextLine();
		}
		catch(Exception e){}	
		
		 
			
		setSize(1024,768);
		setBackground(new Color(r,g,b));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new PaintingPanel());
		setVisible(true);
	   
	}
	
	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setFont(new Font (font,n1,n2));
			g.setColor(Color.blue);
			g.drawString("" + emoticon , 200, 200);
		}

	}

	

}


