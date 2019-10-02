///////////////////////////////////////////////////////////////////////////
//
// Java3001	Create a data structure class for used cars.  The data
//			structure must contain the following fields.
//
//			String make
//			String model
//			String color
//			int    year
//			double price
//
//			A local used car lot needs a data structure to store
//			its inventory.  Create an environment class that establishes
//			a parameterized ArrayList of type Car.  Use a populate method
//			to read the car lot's inventory into the ArrayList.  First,
//			output the car lot's full current inventory.  Next, display
//			a list of all models in stock.  Finally, display only the
//			red cars.
//
///////////////////////////////////////////////////////////////////////////
//

//	DATAFILE INPUT:  "Java3001.dat"
//
//	SAMPLE OUTPUT:
//
//		Full Inventory
//		[<Dodge,Charger,red,1974,3245.00>,<Ford,F150 XLT,2003,white,
//      11998.00>,<Chrysler,PT Cruiser,2009,Blue,9998.00>, ... etc. ]
//
//		Models Available
//		Charger, F150, PT Cruiser, Tundra SR5, Fortwo Passion, ... etc.
//
//		Red Vehicles
//		Charger, Cooper, ... etc.
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Java3001{
	public static void main (String[] args){
		new Inventory();
}}


class Inventory
{
	// instantiate ArrayList of Car objects here
	ArrayList<Car> cars = new ArrayList<Car>();
	String make;
	String model;
	String color;
	int    year;
	double price;
		
	Inventory()
	{
		populate();
	
		outputAll();
		outputModels();
		outputRed();
	}

	void populate()
	{
		try{
			Scanner fileScan = new Scanner(new File("Java3001.dat"));

			while(fileScan.hasNext())
			{
																// Extract data for each object field
				make = 	fileScan.nextLine();					
				model = fileScan.nextLine();
				year = Integer.valueOf(fileScan.nextLine());
				color = fileScan.nextLine();
				price = Double.valueOf(fileScan.nextLine());

				cars.add( new Car(make, model,year,color,price) ); 				// Create a new Car object and add it to the Arraylist
			}
		}catch(Exception e){}
	}

	void outputAll()
	{
		out.println();
		// output the ArrayList
		
		out.println(cars);
		out.println();
	}

	void outputModels()
	{
		out.println();
		out.println("Models Available");
		// display all models
		for(Car list: cars)
		{
			out.println(list.getModel() + " ");	
		}
	
		out.println();
		out.println();
	}

	void outputRed()
	{
		out.println();
		out.println("Red models");
		// display all red cars
		for(Car temp: cars)
		{		
			if(temp.getColor().equalsIgnoreCase("red") )
				out.println(temp.getModel() + " ");
		}
		out.println();
		out.println();
	}
}

class Car
{
   	private String make;
    private String model;
	private String color;
	private int    year;
	private double price;

	public Car( String a, String b, int y, String c, double p   )
	{
		make = a;
		model = b;
		color = c;
		year = y;
		price = p;
	}

	// Write the getModel() accessor method
	public String getModel()
	{
		return model;
		
	}

	// Write the getColor() accessor method
	public String getColor()
	{
		return color;
	}

	// Write the toString() overloaded method
	public String toString()
	{
		return "<"+make+","+model+","+color+","+year+","+price+">";
	}
}












