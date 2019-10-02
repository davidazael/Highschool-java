///////////////////////////////////////////////////////////////////////////
//
// Java2314   Bounce "ball.gif" back and forth on the screen.
//
//
///////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java2314{
	public static void main(String[] args){
		new Solution();
}}


class Solution extends JFrame
{
	ImageIcon ballSprite;

	private int xCor = 280;
	private int yCor = 150;

	private int dx = +1;

	Solution()
	{
		ballSprite = new ImageIcon( "ball.gif" );

		setSize(600,400);
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );
		setVisible(true);

		run();
	}

	void run()
	{
   		/* ??? */
	}

	boolean canMove()
	{
		/* ??? */
	}

	void bounce()
	{
		/* ??? */
	}

	void move()
	{
		/* ??? */
    }

	class PaintingPanel extends JPanel
	{
		PaintingPanel()
		{
			setBackground(Color.BLACK);
		}

		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			g.drawImage( ballSprite.getImage(), xCor, yCor, null );
		}
	}

	public void delay(int time)
	{
		try { Thread.sleep( time );
		} catch( InterruptedException e ){}
	}
}




