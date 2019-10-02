///////////////////////////////////////////////////////////////////////////
//
// 	Pro4504
//
//  Write a program to read a list of Game Boy games into an ordered
//	linked list.  Allow the user to select a starting entry and an
//	ending entry.  Remove he entry's between the starting and ending
//	entry.  As with all list processes, the starting entry is inclusive
//	and should be included in the removal process.  However the ending
//	entry is exclusive and should NOT be included in the removal process.
//
//		file Names: GameBoy01.dat
//					GameBoy02.dat
//
//	   sample file:	Serpent
//					Golf
//					Zipball
//					Cosmo Tank
//					TaleSpin
//					Donkey Kong
//					Zoop
//					Tetris
//					Mega Man
//					Q*bert
//					Mario Brothers
//					Lunar Lander
//					Prince of Persia
//					Legend
//					Pipe Dream
//
//	 sample start:	Golf
//	   sample end:	Pipe Dream
//
// sample solution:
//					Cosmo Tank
//					Donkey Kong
//					Pipe Dream
//					Prince of Persia
//					Q*bert
//					Serpent
//					TaleSpin
//					Tetris
//					Zipball
//					Zoop
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Pro4504{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node rootRef;

	public Model()
	{
		populate();
		display();

		buttonOne.setText("Starting Entry");
		buttonTwo.setText("Ending Entry");
	}

	public void ButtonOneAction()
	{
		String dataItem = JOptionPane.showInputDialog("?????????????.");


	}

	public void ButtonTwoAction()
	{
		String dataItem = JOptionPane.showInputDialog("?????????????.");


	}

	public boolean remove(Object data)
	{

		return false;
	}

	private void populate()
	{


	}

	public void display()
	{


	}
}




