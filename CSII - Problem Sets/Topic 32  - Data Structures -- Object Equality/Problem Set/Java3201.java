///////////////////////////////////////////////////////////////////////////
//
// Java3201	Create a data entity class that allows you to store tools.
//
//			The class definition must include a string instance variable
//			to store the name of the tool and a double to store the size.
//
//			Write the constructor to reflect the data types passed as
//          arguments.
//
//			Overwrite the toString() method to textually display the tool.
//
//			Overwrite the equals() method to allow the tool to tested
//			for equality.
//
///////////////////////////////////////////////////////////////////////////
//
//			<wrench,5/8> and <wrench,5/8> are equal.
//
///////////////////////////////////////////////////////////////////////////
//
//			<wrench,5/8> and <phillips screw driver,3/16> are NOT equal.
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java3201{
	public static void main(String[] args){
		new Environment().run();
}}


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
 		Tools t1 = new Tools("wrench","5/8");
		Tools t2 = new Tools("wrench","5/8");						 //
//      Tools t2 = new Tools("phillips screw driver","3/16");        // use comments to test other tools
//		Tools t2 = new Tools("wrench","3/16");        				 //

		if ( t1.equals(t2) )
			message = "equal";
		else
			message = "NOT equal";

		output.setText( "\n\t" + t1 + " and " + t2 + " are " + message + ".\n");

	}
}




class Tools extends Object
{
	// instance variables
	private String name;
	private String demension;

	// constructor
	public Tools(String n, String d)
	{
		name = n;
		demension = d;
	}

	// override equals() method
	public boolean equals(Tools source )
	{
		return 
		(
			this.name.equals(source.name)
				&&
			this.demension.equals(source.demension)
		);
		
	}

	// override toString() method
	public String toString()
	{
		return "<" + name + ", "+ demension + ">";
	}
}




