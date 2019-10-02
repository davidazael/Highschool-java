///////////////////////////////////////////////////////////////////////////
//
// Java0904 Use a data file to read in a picture file name, a Star Wars 
//          vehicle/item, and its height (in METERS).  CONVERT the METERS 
//          to FEET and display on a graphics frame using the image read
//          in from the data file as the background.
//
//      Data file: Starwarsa.dat
//
//      +------------------------------------------------+
//      |                                                |
//      |  (Background filename contained in data file)  |
//      |  Display the name of the vehicle/item          |
//      |  and its size in feet.                         |
//      |                                                |
//      +------------------------------------------------+
//
//      TEST YOUR PROGRAM WITH DATA FILE Starwarsb.dat:



import static java.lang.System.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Java0904{
	public static void main (String[] args)	{
		new Solution04();
}}


class Solution04 extends JFrame
{
	ImageIcon image;
	Scanner stream;												//	1) Define reference to Stream
	String fileName;
	String vehicle;
	double meters;

	public Solution04()
	{
		// need a try catch for an input file stream here
		try
		{
		Scanner scan = new Scanner(new File("StarWarsa.dat"));
		fileName = scan.nextLine();
		vehicle = scan.nextLine();
		meters = Integer.valueOf(scan.nextLine());
		}
		catch(Exception e){}
			
		image = new ImageIcon(fileName);							// you're welcome :)
		setSize(image.getIconWidth(),image.getIconHeight());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new PaintingPanel());
		setVisible(true);
		
		
		
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			// display vehicle and size here
			// don't forget to convert meters to feet before you display it!
			g.drawImage(image.getImage(),0,0,null);
			g.setFont(new Font("Arial",1,30));
			g.setColor(Color.red);
			g.drawString( vehicle, 200, 200);
			g.setFont(new Font("Times New Roaman",1 ,20));
			double feet = meters * 3.28084;
			g.drawString("The death Star is " + String.format("%,.0f",feet) + " feet tall.",200,250 );
			
		}

	}

}




