///////////////////////////////////////////////////////////////////////////
//
// Pro4104
//
//      Write a program that manually creates a linked list of
//		breakfast ingrediant items in the fridge.
//
//		Write the search method to determine if the ingrediant
//		is available to make breakfast.
//
//		data: milk
//			  bacon
//			  egg
//			  cheese
//			  ham
//			  oranges
//
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;

public class Pro4104{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node theList;

	public Model()
	{
		populate();
		display();

		buttonOne.setText("Search");
	}

	public void ButtonOneAction()
	{
		String dataItem = JOptionPane.showInputDialog("Enter integer to delete.");

	}

	public boolean search(Integer data)
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



