///////////////////////////////////////////////////////////////////////////
//
// Java0303 Find an image on the Internet (.jpg or .png) and resize the
//          Panel to the size of the image.  Display any pun, joke, or
//          caption on the image.
///////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java0305
{
	public static void main (String[] args) 
		{
			new MyDrawing();
		}
		
}
class MyDrawing extends JFrame
{
	ImageIcon imageSource;
	
	public MyDrawing()
	{
		imageSource = new ImageIcon( "Happypotato.jpg" );
		
		setSize( imageSource.getIconWidth(),imageSource.getIconHeight() );
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane( new PaintingPanel());
		
		setVisible(true);
	}
	
	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			
			g.drawImage(imageSource.getImage(),0,0,null);
		}
	}
}