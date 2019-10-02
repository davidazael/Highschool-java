///////////////////////////////////////////////////////////////////////////
//
// Java2307	Write a program to read a list of Star Wars actors from
//			a data file called "Starwarsa.dat".  There is a corresponding
//          .gif image for each actor.
//
//          Each time the actor's name is processed in the loop, place
//          the .gif image in a random location on the graphics screen.
//         (Because of the nature of random(), actors may overlap)
//
//          A utility method named setRandomLocation() has been defined
//          for you. LOOK AT IT CAREFULLY. It shows how to use the Point
//          class. You must add the code for getting a random x and y
//          value to fit on the graphics screen. You should activate
//          setRandomLocation() every time you need a random location.
//
//      ALSO TEST YOUR PROGRAM WITH DATA FILE Starwarsb.dat:
//
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

class Java2307{
	public static void main(String[] args){
		new Solution();
}}


class Solution extends JFrame
{
	int x,y;
	ImageIcon imageSource;


	Solution()
	{
		setBackground(Color.LIGHT_GRAY);
		setSize(800,600);
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );
		setVisible(true);
	}

	public void setRandomLocation()
	{
		int localx = Math.random(()*249)+200 ;
		int localy = /* ??? */;
		Point location = new Point(localx,localy);	// Creates Point object
		x = (int)location.x;					    // extract x coordinate
		y = (int)location.y;						// extract y coordinate
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			try
			{
				Scanner fileScan = new Scanner(new File("Starwarsa.dat"));
				while(/* ??? */)
				{


				}
			}catch(Exception e){}
		}
	}

}

