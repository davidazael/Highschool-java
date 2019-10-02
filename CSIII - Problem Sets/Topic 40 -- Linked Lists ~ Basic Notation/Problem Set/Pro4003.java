///////////////////////////////////////////////////////////////////////////
//
// Pro4003
//
//      Write a program that manually creates a linked list of
//      ten doubles.  Display the linked list both forwards and backwards.
//      Explain the differences in the two processes.
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Pro4003{
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


