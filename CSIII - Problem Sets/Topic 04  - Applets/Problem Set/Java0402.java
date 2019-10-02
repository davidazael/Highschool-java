///////////////////////////////////////////////////////////////////////////
//
// Java0402 Write a program that displays the correct message to the
//			appropriate output location.
//
///////////////////////////////////////////////////////////////////////////
//
//	REQUIRED OUTPUT
//
//		Console:
//			Can you see me now?
//
//		Applet Window:
//			I'm over here!
//
//		Data File ("Pro11402.txt"):
//			Bet you can't see me here.
//
//		Message Box:
//			I'm on top of the world ma.
//


import static java.lang.System.*;
import java.awt.*;
import java.applet.Applet;

public class Java0402 extends Applet
{
	public void  paint(Graphics g)
	{
		out.println("Can you see me now?");
		g.drawString("I'm over here!",20,50);
		
	}
}
























