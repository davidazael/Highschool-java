// Java3202	Create a data entity class that allows you to store soft drinks.
//
//			All soft drinks are not created equal.  Some are diet...some
//          are not.
//
//			The argument for a type of drink is 'true' if it is diet or
//          'false' if it is not diet.
//
//			Overwrite the toString() method to represent the object
//          as shown below.
//
//			Overwrite the equals() method to allow the drink to tested
//			for equality.
//
///////////////////////////////////////////////////////////////////////////
//
//	Arguments:	drink1 ==> false,"Coke"
//				drink2 ==> true,"Coke"
//
//	Output:     Coke and Diet Coke are not equal.
//
///////////////////////////////////////////////////////////////////////////
//
//	Arguments:	drink1 ==> false,"Coke"
//				drink2 ==> false,"Pepsi"
//
//	Output:     Coke and Pepsi are not equal.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java3202
{
	public static void main(String[] args)
	{
		new Environment().run();
	}
}

class Environment extends JFrame
{
	private TextArea output;
	private String message;

	public Environment()
	{
		add( output = new TextArea("",6,70,1) );
		output.setFont(new Font(null,1,24));
		pack();

		setLocationRelativeTo(null);
  		setDefaultCloseOperation(3);
		setVisible(true);
	}

	public void run()
	{
//		Soft drink1 = new Soft(false,"Coke");
		Soft drink1 = new Soft(true,"Coke");
		Soft drink2 = new Soft(true,"Coke");
//		Soft drink2 = new Soft(true,"Pepsi");

		// conditional
		if ( drink1.equals(drink2) )
			message = "equal";
		else
			message = "NOT equal";


		output.setText( "\n\t" + drink1 + " and " + drink2 + " are " + message + ".\n");
	}
}

class Soft extends Object
{
	private boolean type;
	private String drink;
	
	public Soft(boolean t, String d)
	{
		type = t;
		drink = d;
	}
	public boolean equals(Soft source )
	{
		return 
		(
			this.type == source.type
				&&
			this.drink.equals(source.drink)
		);
		
	}
	public String toString()
	{
		if( this.type == true )
			return "< Diet "+ drink + " >";
		return "< " + drink + " >";
	}
	

}




