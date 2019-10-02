///////////////////////////////////////////////////////////////////////////
//
// Java2312 Write a program that moves a spaceship to the right.
//			When the space ship is half of the edge of the frame, program
//			the ship to half appear on the opposite edge and continue
//			moving right.  In essence the ship is wrapping around the
//			frame.
//
//			"Spaceship.png"
//
///////////////////////////////////////////////////////////////////////////


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java2312{
	public static void main(String[] args){
		new Solution();
}}


class Solution extends JFrame
{
	ImageIcon shipSprite;

	private int xCor = 280;
	private int yCor = 150;

	Solution()
	{
		shipSprite = new ImageIcon( "Spaceship.png" );

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
		return xCor+shipSprite.getIconWidth()/2 < getContentPane().getWidth();
	}

	void wrap()
	{
		xCor = 0-shipSprite.getIconWidth()/2;
	}

	void move()
	{
      	xCor+=1;
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage( shipSprite.getImage(), xCor, yCor, null );
		}
	}

	public void delay(int time)
	{
		try { Thread.sleep( time );
		} catch( InterruptedException e ){}
	}
}




