///////////////////////////////////////////////////////////////////////////
//
// Pro4204
//
//  Write a program to read a list of names from a data file and place
//	them into an unordered linked list.  As the linked list is created,
//	add each item to the front of the list.
//
//	Print the values from the list as indicated below.
//
//		1.  the entire list
//		2.  those words beginning with the letter h
//		3.  those words beginning with any letter from f through p
//
//
//		File Name: chips01.dat
//				   chips02.dat
//
/*		data:
			Doritos
			Ruffles
			Cheetos
			Fritos
			Lays Chips
			Pretzels
			Funyuns
			Buggles
			Hot Frys
*/
//
///////////////////////////////////////////////////////////////////////////
//
package solution;
import java.util.*;
import java.io.*;

public class Pro4204{
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
			Scanner fileScan = new Scanner( new File("chips01.dat") );
			theList = null;
		
			while( fileScan.hasNext() )
				{
					String next = fileScan.nextLine();
					if( next.startsWith("H") )
						theList = new Node( next , theList ); 
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
			output.append("\t" + it.getValue() + "\n");
			it = it.getNext();			
		}
	}
}

