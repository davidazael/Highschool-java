///////////////////////////////////////////////////////////////////////////
//
// Java2309 Write a graphics program that creates the appearance of
//			a light blinking from red to green continuously.  Use
//			setColor() and fillOval() commands inside a while(true)
//			loop to create the program.
//
//			REQUIRED LOOP:  	while(true)
//
///////////////////////////////////////////////////////////////////////////


import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java2309{
	public static void main(String[] args){
		new Solution();
}}


class Solution extends JFrame
{
	boolean redFlag;
	Color   currentColor;

	Solution()
	{
		setSize( 600,400 );
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );
		setVisible(true);

		run();
	}

	void run()
	{
   		while( true )
     	{

    	}

	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(currentColor);
	 		g.fillOval( 245, 75,100,100 );
		}
	}

	public void delay(int time)
	{
		try { Thread.sleep( time );
		} catch( InterruptedException e ){}
	}
}







