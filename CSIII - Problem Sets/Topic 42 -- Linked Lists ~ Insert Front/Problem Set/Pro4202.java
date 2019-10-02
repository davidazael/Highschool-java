///////////////////////////////////////////////////////////////////////////
//
// Pro4202
//
//  Write a program to dynamically place an unknown number of data items
//	into an unordered linked list.  Use the add button to add the data
//	items dynamically to the front of the list.
//
//	Print values int the list each time a new item is added.  Use setText()
//	for the first item and append for the remaining items.
//
//	Add at least 12 item to a list of baking tools.
//
/*		data:
            blender
			bowl
			wisk
			knife
			rolling pin
			oven
			mixer
			spatula
			ladle
			etc...
*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

import javax.swing.*;

public class Pro4202{
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
		theList = new Node(dataItem , theList);
		
		display();
	}

	public void display()
	{
		output.setText("Data: \n");
		
		Node it = theList;
		while( it != null)
		{
			output.append( "" + it.getValue() + "\n" );
			it = it.getNext();
		}
		

	}
}

