// Java3203	When choosing a TV, you must consider many factors, such as
//   		the brand, the size, if you want 3D, Smart features, refresh
//          rate, resolution, price, etc.
//
//			Allow the user to input a brand, size, and price for a TV. Use
//          an 'instock' object for data to compare with, and see if the
//          TV is in stock and the user can afford it.  See the output
//          below for the appropriate display.
//
///////////////////////////////////////////////////////////////////////////
//
//  ARGUMENT INPUT/OUTPUT DISPLAY:
//
//	Enter brand you are looking for: samsung
//	Enter size of screen you want: 55
//	Enter price you want to pay: 1000
//
//	You are looking for <samsung,55,$1000.00>
//	We have <Samsung,55,$1299.00>
//  We did find a TV for you!
///////////////////////////////////////////////////////////////////////////
//
//  ARGUMENT INPUT/OUTPUT DISPLAY:
//
//	Enter brand you are looking for: samsung
//	Enter size of screen you want: 55
//	Enter price you want to pay: 1400
//
//	You are looking for <SAMSUNG,55,$1400.00>
//  We have <Samsung,55,$1299.00>
//  We did not find a TV for you!
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Java3203
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
	private String data1;
	private int data2;
	private double data3;
	private boolean inStock;

	public Environment()
	{
		input();
		add( output = new TextArea("",6,70,1) );
		output.setFont(new Font(null,1,24));
		pack();

		setLocationRelativeTo(null);
  		setDefaultCloseOperation(3);
		setVisible(true);
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter brand you are looking for: ");
		data1 = scan.nextLine();
		out.print("Enter size of screen you want: ");
		data2 = Integer.valueOf(scan.nextLine());
		out.print("Enter price you want to pay: ");
		data3 = Double.valueOf(scan.nextLine());
	}

	public void run()
	{
		// instock objects here (use comments to test several)
		TV tv1 = new TV("Samsung", 55, 999.99);
		TV tv2 = new TV("Sony", 35, 599.99);
		TV tv3 = new TV("Toshiba", 45, 799.99);
		TV tv4 = new TV("LG",60, 1299.99);
		
		TV customer = new TV(data1, data2, data3);

		// conditional here
		if ( tv1.equals( customer ) || tv2.equals( customer ) || tv3.equals( customer ) || tv4.equals( customer ))
			message = " did ";
		else
			message = " did NOT ";
		
		

		output.setText( "You are looking for " + customer + "\n");
		output.append ( "We have " + inStock + "\n");
		output.append ("We " + message + " find a TV for you!\n");
		out.println( "\n\t" + inStock + " and " + customer + " are " + message + ".\n");
	}
}

class TV extends Object
{
	private String name;
	private int size;
	private double price;
	
	public TV(String n, int s, double p)
	{
		name = n;
		size = s;
		price = p;
	}
	public boolean equals(TV source)
	{
		return 
		(			
			this.name.equals(source.name)
				&&
			this.size <= source.size
				&&
			this.price <= source.price
		);
	}
	public String toString()
	{
		return "<" + name + ", "+ size + "," + price + ">";
	}
	
	

}




