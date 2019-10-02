///////////////////////////////////////////////////////////////////////////
//
// Java0302 Write a program that uses the drawLine() method in graphics
//			to create a giant trapezoid on a 1024x768 panel.  Use a
//			Graphics2D object to draw the line with a line thickness of 10.
//
///////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;

public class Java0302
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
		setSize(1024,768);
		setLocationRelativeTo(null);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		setContentPane( new PaintingPanel() );
		setVisible(true);
	}
	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			Graphics2D g2d = (Graphics2D)g;
			
			g2d.setStroke( new BasicStroke(12));
		
			g2d.drawLine(500,200,700,200);
			g2d.drawLine(400,400,800,400);
			g2d.drawLine(500,200,400,400);
			g2d.drawLine(700,200,800,400);
			
			
		}
	}
}