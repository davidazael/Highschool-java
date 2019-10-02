///////////////////////////////////////////////////////////////////////////
//
// Java0904	In baseball a pitcher can only throw a set number of pitches
//			before his arm gets tired.  If a manager continues to use the
//			pitcher there is a good chance they could physically damage
//			the pitchers arm.
//
//			Write a pitch could program.  The program should have two
//			JButtons.  One button is used to increment a counter.
//			the other button is a reset button and sets the counter
//			back to zero.  The number is to be displayed in the JFrame
//			in a nice large font.
//
//
//	SAMPLE INTERFACE:
//
//				+---------------------------------------------+
//				|          +---------+   +---------+          |
//				|          |  count  |   |  Reset  |          |
//				|          +---------+   +---------+          |
//  	        |                ___                          |
//  	        |               /   \    |                    |
//  	        |                    |   |   |                |
//  	        |                  /     |___|__              |
//  	        |                /           |                |
//   	        |              /_____        |                |
//   	        |                                             |
//				+---------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////

package problems;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java7201 extends JFrame
{
	public static void main(String[] args)
	{
		new Controller();
	}
}


class Controller extends JFrame
{
	private JButton        count,reset;
	private ActionListener whatToDo;
	private ActionListener whatToDo2;
	int num = 0;

	public Controller()
	{
		setLayout( new FlowLayout() );

			count = new JButton("Count");
			reset = new JButton("Reset");
			whatToDo    = new ButtonListener();
			whatToDo2    = new ButtonListener2();
			count.addActionListener( whatToDo );
			reset.addActionListener( whatToDo2 );

		add( count );
		add( reset );

		setSize(300,150);
		setLocationRelativeTo(null);
  		setDefaultCloseOperation(3);
		setVisible(true);
	}

	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JPanel frame = (JPanel)((JButton)event.getSource()).getParent();
			Graphics pen = ((JPanel)((JButton)event.getSource()).getParent()).getGraphics();

			num++;

			pen.setColor(Color.RED);
			pen.fillRect(100,75,50,50);
			pen.setColor(Color.BLACK);
			pen.drawString("" + num, 110,95);
		}
	}

	class ButtonListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JPanel frame = (JPanel)((JButton)event.getSource()).getParent();
			Graphics pen = ((JPanel)((JButton)event.getSource()).getParent()).getGraphics();

			num = 0;

			pen.setColor(Color.RED);
			pen.fillRect(100,75,50,50);
			pen.setColor(Color.BLACK);
			pen.drawString("" + num, 110,95);
		}
	}
}



