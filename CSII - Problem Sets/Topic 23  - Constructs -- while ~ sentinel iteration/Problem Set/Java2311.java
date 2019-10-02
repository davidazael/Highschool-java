///////////////////////////////////////////////////////////////////////////
//
// Java2311 Write a program that sends "donkey.gif" in a random
//			direction.  Have the image stop when he hits the edge of the
//			screen.
//
///////////////////////////////////////////////////////////////////////////


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java2311{
	public static void main(String[] args){
		new Solution();
}}


class Solution extends JFrame
{
	ImageIcon donkeySprite;

	private int xCor = 280;
	private int yCor = 150;
	private int xOffset;
	private int yOffset;

	Solution()
	{
		donkeySprite = new ImageIcon( "donkey.gif" );
		xOffset = /* ??? */;
		yOffset = /* ??? */;

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
		return
			xCor > 0
				&&
			yCor > 0
				&&
			xCor+donkeySprite.getIconWidth() < getContentPane().getWidth()
				&&
			yCor+donkeySprite.getIconHeight() < getContentPane().getHeight();
	}

	void move()
	{
      	xCor+=xOffset;
      	yCor+=yOffset;
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawImage( donkeySprite.getImage(), xCor, yCor, null );
		}
	}

	public void delay(int time)											//
	{																	//	Delay method
		try { Thread.sleep( time );										//
		} catch( InterruptedException e ){}								//
	}
}




