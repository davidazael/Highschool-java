///////////////////////////////////////////////////////////////////////////
//
// Pro4102
//
//      Write a program that manually creates a linked list of
//      ten cartoon characters.  Display the names of the ten
//      cartoon characters to demonstrate that the list is linked.
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Pro4102{
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
		theList = 	new Node( "Donald Duck",
				 	new Node( "Tom",
				 	new Node( "Jerry",
				 	new Node( "SpongeBob",
				 	new Node( "Patrick",
				 	new Node( "Sandy",
				 	new Node( "Squidward",
				 	new Node( "Mr.Crabs",
				 	new Node( "Dora",
				 	new Node( "Monkey",
				 	null
		))))))))));

	}

	public void display()
	{
		output.setText("The 10 cartoon character names.\n");
		
		Node it = theList;
		while( it != null)
		{
			output.append( it.getValue() + "\n");
			it = it.getNext();
		}
		
	}
}

