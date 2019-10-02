///////////////////////////////////////////////////////////////////////////
//
// Java2310 Harry's Hardware store is having trouble with their light switches.
//			They keep blinking on and off and the only way they can get them
//		    to stop blinking is to press the emergency escape button by the
//			door.
//
//			Write a program that alternates saying "ON" and "OFF" on the
//		    graphics screen until the user presses the STOP button.
//
//			REQUIRED LOOP:  	while(!stop)
//
///////////////////////////////////////////////////////////////////////////


import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Java2310{
	public static void main(String[] args){
		new Solution();
}}


class Solution extends JFrame
{
	ImageIcon imageSource;

	String data;
	boolean stop;
	boolean switchOnFlag;

	Solution()
	{
		imageSource = new ImageIcon( "hardware.jpg" );

		setSize( imageSource.getIconWidth(), imageSource.getIconHeight() );
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );
		setVisible(true);

		run();
	}

	void run()
	{
   		while( !stop )
     	{




        }
	}

	class StopButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			stop = true;
		}
	}

	class PaintingPanel extends JPanel
	{
		PaintingPanel()
		{
			setLayout(null);

			JButton stopButton = new JButton("STOP BLINKING");
				stopButton.setFont(new Font(null,1,24));
				stopButton.setSize(250,50);
				stopButton.setLocation(220,380);
				stopButton.addActionListener( new StopButtonListener() );
			add(stopButton);
		}

		public void paintComponent(Graphics g)
		{
			g.drawImage( imageSource.getImage(), 0, 0, null );

			g.setFont(new Font("Elephant",Font.BOLD,64));
			g.setColor(Color.WHITE);
	 		g.drawString( data , 250, 75 );
		}
	}

	public void delay(int time)
	{
		try { Thread.sleep( time );
		} catch( InterruptedException e ){}
	}
}



