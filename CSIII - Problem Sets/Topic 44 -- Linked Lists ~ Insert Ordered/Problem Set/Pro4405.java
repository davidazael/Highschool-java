///////////////////////////////////////////////////////////////////////////
//
// Pro4405
//
//  Write a program to place the data below from a data file into a
//	linked list of UDJC structures that is ordered in ascending order
//	based on the last name field.
//
//	Print the original names as they are placed in the list.
//  Then print the final ordered list.
//
//		data file name: names01.dat
//		                names02.dat
//
//		  sample data:  Pete Johnson
//			   			Allen Adams
//			   			Marty Mason
//			   			Bill Barton
//			   			Janice Williams
//			   			Nancy Carter
//
//
//	Next write an additional function that will search the linked list
//  for an input name.  If the name is in the list, print an
//	appropriate message.  If the name is not in the list,  print an
//	appropriate message
//			AND ADD IT TO THE LIST.
//
//	Output the messages and the final ordered list.    The messages
//	are to include the name of the personss "added" to the list.
//
//    	  Print the final ordered list.
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;

public class Pro4405{
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


class Person
{
	//  first
	//  last
}



