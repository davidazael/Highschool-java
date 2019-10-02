///////////////////////////////////////////////////////////////////////////
//
// Pro4002
//
//      Write a program that manually creates a linked list of
//      five integers.  Display the memory address of each next pointer
//      after the list has been created.  How much memory is between
//      each pointer.  Change the data type to double and character.
//      What is the difference in the gap of the memory pointers.
//      Why does this difference exist?
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Pro4002{
	public static void main(String[] args) {
		new Model();
}}



class Node
{



}



class Model extends MyFrame
{
	Node pointer;

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


	}

	public void display()
	{
		output.setText( "Some Output.\n" );


	}
}


