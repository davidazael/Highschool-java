///////////////////////////////////////////////////////////////////////////
//
// 	Pro4503
//
//  Write a program  to place the data below from a data file into a
//	linked list of Person Objects (that you define) that is ordered in
//	ascending order based on the last name field.
//	names as they are placed in the list.
//
//	Display the ordered list.
//
//	Allow the user to delete a person using a Person's last name only.
//
//
//		data:	Pete Johnson
//			   	Allen Adams
//			   	Marty Mason
//			   	Bill Barton
//			   	Janice Williams
//			   	Nancy Carter
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Pro4503{
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

		buttonOne.setText("Delete");
	}

	public void ButtonOneAction()
	{
		String dataItem = JOptionPane.showInputDialog("Enter a data item to delete.");


	}

	public void insert(Object data)
	{


	}

	public boolean remove(Object data)
	{


	}

	private void populate()
	{
		list.insert(new Person("Pete","Johnson"));
		list.insert(new Person("Allen","Adams"));
		list.insert(new Person("Marty","Mason"));
		list.insert(new Person("Bill","Barton"));
		list.insert(new Person("Nancy","Carter"));
		list.insert(new Person("Janice","Williams"));
	}

	public void display()
	{


	}
}


class Person
{
	String first, last;



}


