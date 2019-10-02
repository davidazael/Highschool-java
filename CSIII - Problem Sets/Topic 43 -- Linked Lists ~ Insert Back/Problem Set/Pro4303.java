///////////////////////////////////////////////////////////////////////////
//
// Pro4303
//
//  Write a program to read a list of names from a data file and place
//	them into an unordered linked list.  As the linked list is created,
//	add each item to the back of the list.
//
//	Print the values from the list.
//
//
//		File Name: Vitamins01.dat
//				   Vitamins02.dat
//
/*		data:
			Vitamin A
			Vitamin K
			thiamine
			Riboflavin
			Niacin
			Vitamin C
			Vitamin E
			Pantothenic acid
			Biotin
			Vitamin B6
			Vitamin B12
			Vitamin D
			Folic Acid
*/
//
///////////////////////////////////////////////////////////////////////////


package solution;
import java.util.*;
import java.io.*;

public class Pro4303{
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
		
		
		try {
			
			Scanner scan = new Scanner(new File("Vitamins01.dat") );
			
			while( scan.hasNext() ) 
				{
					Node nodePointer = new Node(scan.nextLine(), null);
					if( theList == null )
					{
						theList = nodePointer;
					}
					else
					{
						Node listPointer = theList;
						while( listPointer.getNext() != null )
							listPointer = listPointer.getNext();
							
						listPointer.setNext( nodePointer );
						
					}
					
			    }
						 
			
			}
			catch (Exception ex){}


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




