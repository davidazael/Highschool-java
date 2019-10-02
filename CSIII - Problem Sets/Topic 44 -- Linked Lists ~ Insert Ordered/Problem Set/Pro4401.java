///////////////////////////////////////////////////////////////////////////
//
// Pro4401
//
//  Write a program to place the following integers into an ordered
//	linked list in descending order.  Print the final ordered list.
//
//		data:  23   12   5   46   31   9   4   52   85   90   68
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Pro4401{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node rootRef;

	public Model()
	{
		populate();
		display();
	}

	private void populate()
	{
				rootRef = null;
		Node 	nodeRef = null;
		Node 	travelIt = null;
		
		nodeRef = new Node( 23,
				  new Node( 12,
				  new Node( 5,
				  new Node( 46,
				  new Node( 31,
				  new Node( 9,
				  new Node( 4,
				  new Node( 52,
				  new Node( 85,
				  new Node( 90,
				  new Node( 68,
				  null
		)))))))))));
		
		
				  


	}

	public void display()
	{


	}
}




