///////////////////////////////////////////////////////////////////////////
//
// Pro4203
//
//  Write a program to read a list of names from a data file and place
//	them into an unordered linked list.  As the linked list is created,
//	add each item to the front of the list.
//
//	Print the values from the list.
//
//
//		File Name: tools01.dat
//				   tools02.dat
//
/*		data:
            gadget
			widget
			broom
			label
			bucket
			hammer
			nails
			saw
			hoe
*/
//
///////////////////////////////////////////////////////////////////////////
//

package solution;
import java.util.*;
import java.io.*;

public class Pro4203{
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
		try {
			Scanner fileScan = new Scanner( new File("tools01.dat") );
			theList = null;
		
			while( fileScan.hasNext() )
				{
					theList = new Node(fileScan.nextLine(), theList ); 
				}
			}
			catch (Exception ex) {}
		
	}
	public void display()
	{
		output.setText("Data: \n");
		
		Node it = theList;
		while( it != null )
		{
			output.append("" + it.getValue() + "\n");
			it = it.getNext();			
		}
	}
}



































