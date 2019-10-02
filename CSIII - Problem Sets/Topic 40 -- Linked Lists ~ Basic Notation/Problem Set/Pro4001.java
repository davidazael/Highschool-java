///////////////////////////////////////////////////////////////////////////
//
// Pro4001
//
//      Write a program that manually creates a linked list of
//      ten cartoon characters.  Display the names of the ten
//      cartoon characters to demonstrate that the list is linked.
//
///////////////////////////////////////////////////////////////////////////



package solution;

public class Pro4001{
	public static void main(String[] args) {
		new Model();
}}



class Node
{
	public Object value;
	public Node next;	
}

class Model extends MyFrame
{
	Node theList;

	public Model()
	{
		buttonOne.setText("Explore");
	}

	public void ButtonOneAction()
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
				 	new Node( "Monkey",	null))))))))));	
	}

	public void display()
	{
		output.setText("The 10 cartoon character names.\n");
		
		Node it = theList;									
			while( it != null )										
			{
				output.append( "" + it.value + "\n" );	
				it = it.next;									
			}
		
	}
}


