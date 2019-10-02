///////////////////////////////////////////////////////////////////////////
//
// Pro4101
//
//	*****   Linked List Basics   *****
//  ==================================
//
//  Write a program to place the following integers into an unordered
//	linked list.  Add each item to the front of the linked list.
//	After the list is created, traverse it and print each of the numbers
//	in the list and the sum of the integers in the list.
//	Read the numbers from a data file.
//
//		data:  12 3 24 5 44 2 78 5
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Pro4101{
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
	}

	private void populate()
	{
		theList = new Node( 12,
				  new Node( 3,
				  new Node( 24,
				  new Node( 5,
				  new Node( 44,
				  new Node( 2,
				  new Node( 78,
				  new Node( 5,
				  null
		))))))));
		
	}

	public void display()
	{
		output.setText("Random Numbers. \n");
		int total = 0;
		Node it = theList;
		while( it != null)
		{
			total = total + (int)it.getValue();
			output.append( it.getValue() + "\n");
		
			it = it.getNext();
			
		}
		output.append("\nThe total of this Random Numbers is -> " + total + "\n\n");
	}
}

