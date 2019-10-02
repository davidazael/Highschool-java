///////////////////////////////////////////////////////////////////////////
//
// Java0304 Change the background color of the PaintingPanel to a color of
//			your choice.   Using the image in this folder called "bird.gif",
//			draw the image on the PaintingPanel.  Create a caption for the
//          image and display the caption.  If you wish to use another image,
//          feel free to get one from the Internet (be sure it's not animated).
//
///////////////////////////////////////////////////////////////////////////
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Java0304
{
    public static void main(String[] args)
    {
    	new MyDrawing();
    }

}

class MyDrawing extends JFrame
{
	MyDrawing()
	{
		setSize(600,400);
		setLocationRelativeTo(null);
		setBackground(Color.MAGENTA);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane( new PaintingPanel());
		
		setVisible(true);
	}
	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			ImageIcon imageSource;
			imageSource = new ImageIcon( "bird.gif" );
			g.drawImage( imageSource.getImage(),40,30,null);
			g.drawString("Im the famous Flappy Bird.",140,150);
			
		}
	}
	

}