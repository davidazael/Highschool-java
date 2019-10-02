///////////////////////////////////////////////////////////////////////////
//
// Pro4201
//
//  Write a program to dynamically place an unknown number of data items
//	into an unordered linked list.  Add values to the front of the
//	linked list.  Print values in the linked list from beginning to end.
//
/*		data:
            Blues
			Jazz
			Hip Hop
			Gospel
			Eclectic
			Rock
			Country
			R&B
			Classical
*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Pro4201{
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
		theList = null;
		
		theList = new Node("Blues", theList);
		theList = new Node("Jazz", theList);
		theList = new Node("Hip Hop", theList);
		theList = new Node("Gospel", theList);
		theList = new Node("Eclectic", theList);
		theList = new Node("Rock", theList);
		theList = new Node("Country", theList);
		theList = new Node("R&B", theList);
		theList = new Node("Classical", theList);
	}

	public void display()
	{
		output.setText("Data :");
		output.append( "\n");
		
		Node it = theList;
		while(it != null)
		{
			output.append("" + it.getValue() + "\n" );
			it = it.getNext();
		}
		
	}
}
