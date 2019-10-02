///////////////////////////////////////////////////////////////////////////
//
// 	Pro4505
//
//  Write a program that reads US City/State/Population data from a
//	data file and stores the data in a linked list in order by city.
//	Complete a delete algorithm that asks the user for a state
//	and removes all the cties in that state.  This program must be
//	interactive and the user should have the ability to delete more
//	than one state.
//
//
//		 file Name: Cities01.dat
//		            Cities02.dat
//
//	   sample file:	New York
//					New York
//					8489713
//
//					Chicago
//					Illinois
//					2901633
//
//					Phoenix
//					Arizona
//					1657153
//
//					Aurora
//					Illinois
//					171782
//
//					Philadelphia
//					Pennsylvania
//					1656138
//
//						:
//					   etc.
//						:
//						V
//
//	 sample state:	Illinois
//
// sample solution:	New York, 		New York,  			8,489,713
//					Philadelphia, 	Pennsylvania,		1,656,138
//					Phoenix,  		Arizona,	 		1,657,153
//						:
//					   etc.
//						:
//						V
//
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Pro4505{
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

		buttonOne.setText("State Removal");
	}

	public void ButtonOneAction()
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




