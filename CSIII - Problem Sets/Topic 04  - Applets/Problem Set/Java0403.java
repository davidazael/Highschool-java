///////////////////////////////////////////////////////////////////////////
//
// Java0403 Writen a program that places the following cardinal directions
//			in the correct locations in an applet window.  Draw each
//			direction in a different color.
//
///////////////////////////////////////////////////////////////////////////
//
//	REQUIRED OUTPUT
//		- North
//		- South
//		- East
//		- West
//		- Center
//
//

import static java.lang.System.*;
import java.awt.*;
import java.applet.Applet;

public class Java0403 extends Applet
{
	public void  paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawString("NORTH",250,45);
		g.drawLine(270,50,270,100); 
			
		g.setColor(Color.black);	
		g.drawString("CENTER",245,115);
		
		g.setColor(Color.red);
		g.drawString("SOUTH",247,190 );	
		g.drawLine(270,120,270,175);
		
		g.setColor(Color.green);
		g.drawString("EAST",325,105);
		g.drawLine(325,105,375,105);
		
		
		
	
	}
	
}	
	
	
	
	
	
	
	