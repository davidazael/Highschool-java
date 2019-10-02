///////////////////////////////////////////////////////////////////////////
//
// Java0303 Change the background color of the PaintingPanel to a color of
//			your choice.   Using Graphics2D, draw a target on the screen
//          (with an x for the bullseye) using fillOval to fill the circles
//          and drawOval to outline the circles in a thick black line. Use
//          red and white for the circles.
//
///////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;

public class Java0303
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
		setBackground(Color.black);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		setContentPane( new PaintingPanel() );
		setVisible(true);		
	}
	
	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			Graphics2D g2d = (Graphics2D)g;
			
			g2d.setStroke(new BasicStroke(18));
				
			g2d.setColor(Color.red);
				g2d.drawOval(150,50,600,600);
			g2d.setColor(Color.white);
				g2d.drawOval(200,100,500,500);
			g2d.setColor(Color.red);
				g2d.drawOval(250,150,400,400);
			g2d.setColor(Color.white);
				g2d.drawOval(300,200,300,300);
			g2d.setColor(Color.red);
				g2d.drawOval(350,250,200,200);
			g2d.setColor(Color.white);
				g2d.drawOval(400,300,100,100);
			g2d.setColor(Color.red);
				g2d.fillOval(425,325,50,50);
				
				
				
			//	g2d.setColor(Color.red);
			//	g2d.drawOval(350,250,200,200);
			g2d.setStroke(new BasicStroke(10));	
			g2d.setColor(Color.white);
				
				g2d.drawLine(425,325,475,375);
				g2d.drawLine(475,325,425,375);
			
		
				
				
		
		}
	}





}