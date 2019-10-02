///////////////////////////////////////////////////////////////////////////
//
// Pro4501
//
//  Write a program to place the data below into a linked list that is
//	ordered in ascending.  Write a new method that will delete a node
//	from the linked list.  Delete the given item for the linked list.
//
//	Output the final ordered list.
//
//		data:   1.2  65.4  712.4  2.2  54  623.3  72
//
//    delete:   65.4  54  2.2
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Pro4501{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node rootRef;

	public Model()
	{
		rootRef = null;
		populate();
		display();

		buttonOne.setText("Delete");
	}

	public void ButtonOneAction()
	{
		String dataItem = JOptionPane.showInputDialog("Enter a data item to delete.");
		
		boolean result = remove(dataItem);
		
		display();
		
		output.append(dataItem + " was" + (!result?" NOT":"") + " deleted. \n\n");
		

	}

	public boolean remove(Object data)
	{
		if( rootRef == null )
			return false;
			
		if(rootRef.getValue().toString().equals(data.toString()) )
		{
			rootRef = rootRef.getNext();
			return true;
		}
		
		Node searchRef = rootRef;
		
		while( searchRef.getNext() != null && !searchRef.getNext().getValue().toString().equals(data.toString()) )
			searchRef = searchRef.getNext();
			
		if( searchRef.getNext() != null )
		{
			searchRef.setNext( searchRef.getNext().getNext() );
			return true;
		}
		
		return false;


	}

	private void populate()
	{
		rootRef = null;
		rootRef = new Node( 1.2,
				  new Node( 65.4,
				  new Node( 712.4,
				  new Node( 2.2,
				  new Node( 54,
				  new Node( 623.3,
				  new Node( 72,
				  null
		)))))));

	}

	public void display()
	{
		output.setText("Values --> \n");
		Node it = rootRef;
		while( it != null)
		{
			output.append("" + it.getValue() + "\n");
			it = it.getNext();
		}
	}
}




