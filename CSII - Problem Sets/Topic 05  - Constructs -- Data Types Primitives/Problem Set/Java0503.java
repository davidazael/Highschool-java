///////////////////////////////////////////////////////////////////////////
//
// Java0503 Time to draw some graffiti on a brick wall using reference
//          variables.  Use an ImageIcon object with "Bricks.jpg".
//          Use the PaintingFrame class for the main container object
//          and a JButton for a button event.  The actionPerformed method
//          should set a Font and a Color, and display a String message on
//          the brick wall after the button is pressed.
//
///////////////////////////////////////////////////////////////////////////
//
//   SAMPLE OUTPUT:
//
//			+------------------------------------------------+
//          | +---------+     |             |                |
//          | | PUSH ME |     |             |                |
//          | +---------+     |             |                |
//			|------------------------------------------------|
//          |         |            |             |           |
//			|       NO GRAFITTI ON THIS WALL!  		         |
//			|------------------------------------------------|
//			|             |                 |                |
//			+------------------------------------------------+
//
//

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Java0503
{
	public static void main(String[] args)
		{
		new BrickWall();
}
}

class BrickWall extends JFrame
{
	ImageIcon imageSource;
	PaintingFrame mainContainer;
	JButton coolButton;

	public BrickWall()
	{
	 	imageSource = new ImageIcon( "Bricks.jpg" );
		setSize( imageSource.getIconWidth(), imageSource.getIconHeight() );
		setLocationRelativeTo(null);
		setResizable(false);
   		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   		mainContainer = new PaintingFrame();
   		mainContainer.setLayout(null);

			coolButton = new JButton();
				coolButton.setText("PUSH ME!!");
				coolButton.setSize(100,35);
				coolButton.setLocation(50,20);
				coolButton.setForeground(Color.BLUE);
				coolButton.addActionListener( new CoolAction() );
			mainContainer.add(coolButton);
  		setContentPane( mainContainer );

 		setVisible(true);
	}

	class PaintingFrame extends JPanel
    {
		public void PaintComponent(Graphics g)
		{
			g.drawImage( imageSource.getImage(), 0, 0, null );
		}
    }

    class CoolAction implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
  			Graphics g = mainContainer.getGraphics();

  			// see instructions above
  			g.setFont(new Font("Elephant",3,34));
  			g.setColor(Color.blue);
  			g.drawString("NO GRAFITTI ON THIS WALL!",50,200);
  	//		g.drawString("THIS IS MY WALL!",50,250);
 	  	}
    }
}

