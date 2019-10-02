///////////////////////////////////////////////////////////////////////////
//
// Pro4301
//
//  Write a program to dynamically place an unknown number of data items
//	into an unordered linked list.  Add objects to the back	of the
//	linked list.  This allows you to print values in the order they
//	were entered. Print values in the linked list from beginning to end.
//
/*		data:
            Drum
			Trumpet
			Saxiphone
			Flute
			Tuba
			Trombone
			Clarinet
			French Horn
			Euphonium

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;
import java.io.*;
import java.util.*;

public class Pro4301{
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
			Scanner fileScan = new Scanner(new File("instruments.dat"));
			
			theList = null; 
			
			while(fileScan.hasNext())
			{
				Node nodePointer = new Node(fileScan.nextLine(), null);
				
				if( theList == null)
				{
					theList = nodePointer;
				}
				else
				{
					Node travelPointer = theList;
					while( travelPointer.getNext() != null )
						travelPointer = travelPointer.getNext();
						
					travelPointer.setNext( nodePointer );
				}
			}			
			
			}catch (Exception ex) { System.out.println (ex); }
	}

	public void display()
	{
		output.setText("Data: ");
		output.append( "\n" );
		
		Node it = theList;
		while( it != null)
		{
			output.append("" + it.getValue() + " \n");
			it = it.getNext();
		}
	}
}





