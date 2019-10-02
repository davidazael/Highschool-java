///////////////////////////////////////////////////////////////////////////
//
// Java3804	Write a program that uses an algorithm to add to the front
//          of an array.  (Basically this is the static array version of
//          the add(0,element) method in ArrayList).
//
//			Create a double array of eight random gas prices.
//			The range of prices is between 2.75 and 5.00.
//
//			Add each new price to front of the the array as it
//			is entered.  Calculate the average price of the new array.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE OUTPUT:
//
//		Press <Enter> to continue.
//		Type "quit"<Enter> to exit.
//
//		[4.18, 3.97, 4.73, 3.28, 3.45, 3.95, 2.87, 3.43]
//		average = 3.73
//
//		4.25
//		[4.25, 4.18, 3.97, 4.73, 3.28, 3.45, 3.95, 2.87, 3.43]
//		average = 3.79
//
//		4.80
//		[4.8, 4.25, 4.18, 3.97, 4.73, 3.28, 3.45, 3.95, 2.87, 3.43]
//		average = 3.89
//
//		4.45
//		[4.45, 4.8, 4.25, 4.18, 3.97, 4.73, 3.28, 3.45, 3.95, 2.87, 3.43]
//		average = 3.94
//
//		quit
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3804{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	double[] prices;

	public Environment()
	{
		populate();
		run();
	}

	private void populate()
	{
		prices = new double[8];
		for(int x=0; x<prices.length; x++)
			prices[x] = ((int)(Math.random()*226+275))/100.0;
	}

	public void run()
	{
		Scanner scan = new Scanner(in);
		String input = "";

		out.println("Press <Enter> to continue.");
		out.println("Type \"quit\"<Enter> to exit.");
		out.println();
		out.println( Arrays.toString( prices ) );
		out.println( "average = " + average(prices) );
		out.println();
		while( !(input = scan.nextLine()).equals("quit") )
		{
			double data = Double.parseDouble( input );
			prices = addFront( prices, data );

			out.println( Arrays.toString( prices ) );
			out.println( "average = " + average(prices) );
			out.println();
		}
		out.println();
	}

	public double[] addFront( double[] dinero, double numeros )
	{
		dinero = prices;
		if( dinero.length < dinero.length+1 )
		{
			double[] working = new double[dinero.length+1];
						
			System.arraycopy(dinero, 0, working, 1, dinero.length );
			
			working[0] = numeros;
			
			return working;
		}
		return dinero;

	}

	public double average(double[] source)
	{
		source = prices;
		int count = 0;
		double aver = 0;
		
		for (int i = 0; i < source.length; i++)
		{
			aver += source[i];
			count++;			
		}
		aver = aver / count ;
		
		return aver;

	}
}






