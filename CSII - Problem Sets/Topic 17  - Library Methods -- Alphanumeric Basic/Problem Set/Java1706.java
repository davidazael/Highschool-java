///////////////////////////////////////////////////////////////////////////
//
// Java1706  Write a program that allows the user to enter a tongue twister,
//			 word in the tongue twister, and a letter in the tongue twister.
//			 Print the output as shown on a graphics screen.  A photo has
//			 been provided for you to use as a background called "twister.jpg".
//
///////////////////////////////////////////////////////////////////////////
//
//	 SAMPLE INPUT:
//		Enter tongue twister ==> The boot black brought the black boot back
//		  Enter word to find ==> black
//		 Enter single letter ==> b
//
//   SAMPLE OUTPUT:
//
//				(on graphics window, photo background)
//          +-----------------------------------------------+
//          |                                               |
//          |     The boot black bought the black boot back |
//          |     is 41 letters long                        |
//			|     black first found at position 9           |
//			|     black last found at position 27           |
//			|     b last found at position 38               |
//          |                                               |
//          +-----------------------------------------------+
//
///////////////////////////////////////////////////////////////////////////
//
//	OTHER TONGUE TWISTERS:
//		Old oily Ollie oils old oily autos
//		Many an anemone sees an enemy anemone
//      Fred fed Ted bread, and Ted fed Fred bread
//
/////////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Java1706
{
	public static void main(String[] args)
	{
		new Hunting();

	}
}


class Hunting extends JFrame
{
	String twister, word, let;
	ImageIcon image;
	
	
	public Hunting()
	{
		input();
		image = new ImageIcon("twister.jpg");
		setSize(image.getIconWidth(),image.getIconHeight());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new PaintingPanel());
		setVisible(true);

	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter tongue twister ==>");
	  	twister = scan.nextLine();

		out.print("Enter word to find   ==>");
	  	word = scan.nextLine();

		out.print("Enter single letter  ==>");
	  	let = scan.nextLine();
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			
			g.drawString(twister + " is " + (twister.length()-1) + " letters long.", 100,100 );
			g.drawString(word + " is first found at position " + twister.indexOf(word) , 100,125 );
			g.drawString(word + " is last found at position " + (twister.lastIndexOf(word)+1) , 100,150 );
			g.drawString(let + " is last found at position " + (twister.lastIndexOf(let)+1) , 100,175 );
		}
	}
}



