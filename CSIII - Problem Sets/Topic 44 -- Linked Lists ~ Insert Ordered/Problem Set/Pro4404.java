///////////////////////////////////////////////////////////////////////////
//
// Pro4404
//
//  Write a program to place the data below into a linked list of a
//	created UDJC, user defined java class, that is ordered in ascending
//	order based on the teams fantasy team rank score field.  Write a new
//	search method that will search the linked list for an input team name.
//	If the name is in the list, output the teams ranking and an
//	appropriate message.  If the name is not in the list, output an
//	appropriate message.
//
//  Output the final ordered list followed by the interactivehe messages.
//
//		file Names: teams01.dat
//					teams02.dat
//
//		data: Rockets
//			  95
//            Jazz
//			  112
//            Lakers
//			  110
//            Trailblazers
//			  115
//            Spurs
//			  96
//            Timberwolves
//			  88
//            Celtics
//			  91
//            Nicks
//			  99
//
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;

public class Pro4404{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node theList;

	public Model()
	{
		buttonOne.setText("Add");
	}

	public void ButtonOneAction()
	{
		String dataItem = JOptionPane.showInputDialog("Enter a data item.");




		display();
	}

	private void populate()
	{

	}

	public void display()
	{

	}
}


class Team
{
	//  name
	//  rank
}



