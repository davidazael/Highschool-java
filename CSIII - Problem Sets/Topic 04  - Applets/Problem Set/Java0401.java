///////////////////////////////////////////////////////////////////////////
//
// Java0401 Create an applet that displays the following statement.
//
//
///////////////////////////////////////////////////////////////////////////
//
//	REQUIRED OUTPUT
//
//		I <you name goes here> understand that:
//
//		1)  Objects are created when you make an instance of a class.
//		2)  A class is the definition of an object.
//
//

import static java.lang.System.*;
import java.awt.*;
import java.applet.Applet;

public class Java0401 extends Applet
{
	public void  paint(Graphics g)
	{	
		g.drawString("I David Bernal understand that:",20, 30);
		g.drawString("1)  Objects are created when you make an instance of a class.",20,40);
		g.drawString("2)  A class is the definition of an object.",20,50);
		
	}
}

















