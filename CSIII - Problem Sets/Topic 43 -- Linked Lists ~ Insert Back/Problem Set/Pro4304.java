///////////////////////////////////////////////////////////////////////////
//
// Pro4304
//
//  Write a program to read a list of menu items and their prices from
//	a data file. Place each data into a user created class MenuItem data
//	structure.  Add each to an unordered linked list.  As the linked list
//	is created, add each object to the BACK of the list.
//
//  Write a search method that will search the linked list for an input
//	entre.  If the menu item is in the list, print the price for that item
//	appropriate message.  If the menu item is not in the list, print an
//	appropriate message
//
//  Output the final ordered list and the messages.  The messages are to
//  include the name of the menu item and its price.
//
//
//		File Name: Menu01.dat
//				   Menu02.dat
//
//		  data:	Cheesesteak Sandwich
//				9.19
//				Buffalo Chicken Ranch Sandwich
//				8.89
//				Grilled Chicken Sandwich
//				8.89
//				Classic Turkey Toasted Sandwich
//				7.99
//				California Turkey Club Toasted Sandwich
//				8.99
//				Grilled Chicken & Guacamole Sandwich
//				10.19
//				Bacon Burger
//				8.99
//				Southern Smokehouse Burger
//				9.99
//				Mushroom-Swiss Burger
//				8.99
//				Oldtimer Burger
//				7.29
//
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Pro4304{
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
		
	}

	public void display()
	{
		
		output.append( "\n\n" );
	}
}


class MenuItem
{

}

