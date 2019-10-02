///////////////////////////////////////////////////////////////////////////
//
// 	Pro4502
//
//  Write a program to allow a user to add or remove integers to
//	and from a linked list.
//
//	SAMPLE COMMAND LIST:
//		add		12
//		remove 	12
//		remove 	12
//		add		 8
//		add		35
//		add		81
//		add		16
//		add		 7
//		add		92
//		add		33
//		remove 	92
//		add		 3
//		remove 	 8
//		add		42
//		add		27
//		remove 	 5
//		remove 	 7
//		add		79
//		add		50
//		remove 	79
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Pro4502{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node rootRef;
	Object addedData;
	int count = 0;

	public Model()
	{
		populate();
		display();

		buttonOne.setText("Delete");
		buttonTwo.setText("Add");
	}

	public void ButtonOneAction()
	{
		String dataItem = JOptionPane.showInputDialog("Enter a data item to delete.");
		
		boolean result = remove(dataItem);
		
		display();
		
		output.append("The item " + dataItem + " was " + (!result?" NOT":"") + " deleted. \n\n" );


	}

	public void ButtonTwoAction()
	{
		count++;
		
		String dataItem = JOptionPane.showInputDialog("Enter a data item to add.");					
			
		addedData = dataItem;
		
		display();
		
		output.append("The item " + dataItem + " was added to the list." ); 
	}

	public boolean remove(Object data)
	{
		
		if( rootRef == null)
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
		int x = 0;
		while( x < count )
		{
			rootRef = new Node( addedData ,
						   null
						  );
			x++;			  
		}
		
	}

	public void display()
	{
		output.setText("Values --> \n");
		Node it = rootRef;
		while( it != null )
		{
			output.append( "Value: " + it.getValue() + "\n" );
			it = it.getNext();
		}



	}
}




