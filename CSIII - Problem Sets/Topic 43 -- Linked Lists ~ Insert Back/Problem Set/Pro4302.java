///////////////////////////////////////////////////////////////////////////
//
// Pro4302
//
//  Write a program to dynamically place an unknown number of data items
//	into an unordered linked list.  Use the add button to add the data
//	items dynamically to the BACK of the list.
//
//	Print values in the list each time a new item is added.  Use setText()
//	for the first item and append for the remaining items.
//
//	Add at least 12 items to a list of fruit in a basket.
//
/*		data:
            cherry
			peach
			apple
			banana
			pear
			grapes
			watermellon
			oranges
			strawberrys
			mango
			etc...
*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;

public class Pro4302{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node theList;

	public Model()
	{
		theList = null;
		Node nodePointer = null;
		buttonOne.setText("Add");
	}

	public void ButtonOneAction()
	{
		
		
		String dataItem = JOptionPane.showInputDialog("Enter a data item.");
		
		theList = new Node( dataItem , theList );
		
		Node travelPointer  = theList;
											
		display();
	}

	public void display()
	{
		output.setText("Data: \n");
		output.setText("\n");
		
		Node it = theList;
		while( it != null )
		{
			output.append("" + it.getValue() + "\n" );
			it = it.getNext();
		}			

	}
}

