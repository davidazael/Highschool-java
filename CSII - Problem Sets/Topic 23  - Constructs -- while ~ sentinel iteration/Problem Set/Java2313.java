///////////////////////////////////////////////////////////////////////////
//
// Java2313 Write a program that has a soccer ball wrap around
//			the frame.  Use some math the get the soccer ball to bounce.
//			Move the ball to the bottom of the frame and have it
//			bounce along the bottom of the screen.
//
//			"SoccerBall.png"
//
///////////////////////////////////////////////////////////////////////////


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java2313{
	public static void main(String[] args){
		new Solution();
}}


class Solution extends JFrame
{
	ImageIcon soccerSprite;

	private int xCor = 280;
	private int yCor = 150;

	Solution()
	{
		soccerSprite = new ImageIcon( "SoccerBall.png" );

		setSize(600,400);
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );
		setVisible(true);

		run();
	}

	void run()
	{

	}

	boolean canMove()
	{
		/* ??? */
	}

	void wrap()
	{
		/* ??? */
	}

	void move()
	{
      	/* ??? */
	}

	public int getY(int x)
	{
		int wavelength = 200;
		int amplitude = 100;
		int phase = 20;

		double degreesPerPixel = 360.0 / wavelength;
		double degrees = (-phase+180) + x*degreesPerPixel;

		return (int)(amplitude*Math.sin(degrees*Math.PI/180.0));
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage( soccerSprite.getImage(), xCor, yCor, null );
		}
	}

	public void delay(int time)
	{
		try { Thread.sleep( time );
		} catch( InterruptedException e ){}
	}
}




