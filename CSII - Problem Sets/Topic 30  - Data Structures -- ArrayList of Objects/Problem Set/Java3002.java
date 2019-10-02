///////////////////////////////////////////////////////////////////////////
//
// Java3002 Create a data structure class for a Coin.  The data
//			structure must contain the following fields:
//
//			double value
//			String name
//
//			Your mom's purse contains many loose coins which she from time
//          to time donates to you.  Use a populate method to read the coin
//			data into a parameterized ArrayList of Coin. Count and total the
//          coins in her purse.  However, she hates pennies, so remove the
//          the pennies.  Display the purse contents before and after the
//          pennies are removed.
//
//  CHALLENGE: If she has pennies that can partially be changed into coins,
//             do so (but still drop the pennies). In another words, if
//             she has 12 pennies, add a dime to her purse. If she has 42
//             pennies, add a quarter, a dime, and a nickel to her purse.
///////////////////////////////////////////////////////////////////////////
//
//	DATAFILE INPUT:  "Java3002.dat"
//
//	SAMPLE OUTPUT:
//
//	[<0.01,penny>, <0.01,penny>, <0.01,penny>, <0.1,dime>, <0.25,quarter>, <0.05,nic
//	kel>, <0.01,penny>, <0.1,dime>, ... etc]
//
//		12 pennies
//		4 nickels
//		6 dimes
//		12 quarters
//
//		The total of your coins: ???
//
//		NOW REMOVING PENNIES!
//
//		0 pennies
//		4 nickels
//		6 dimes
//		12 quarters
//
//		The total of your coins: ???
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.awt.*;

public class Java3002{
	public static void main (String[] args){
		new Purse();
}}


class Purse
{
	ArrayList<Coin> coins = new ArrayList<Coin>();
	int pennyCount, nickCount, dimeCount, quartCount, totalCoins;
	String change;
	double total;

	Purse()
	{
		populate();

		challange();
		outputAll();
		countCoins();
		outputTotal();
		removePennies();
		countCoins();
		outputTotal();

	}

	void populate()
	{
		try{
			Scanner fileScan = new Scanner(new File("Java3002.dat"));
			while(fileScan.hasNext())
			{
				double money = fileScan.nextDouble();
				change = fileScan.next();
				
				coins.add(new Coin(money, change));
			
				if( money == 0.01 && change.equals("penny"))
				{
					pennyCount++;
					
				}
				if(  money == 0.05 && change.equals("nickel"))
				{
					nickCount++;	
				}
				if( money == 0.10 &&  change.equals("dime"))
				{
					dimeCount++;	
				}
				if( money == 0.25 &&  change.equals("quarter"))
				{
					quartCount++;	
				}
			}
			/* Extract all data */
		
			

			/* add Coin objects to ArrayList */
			}catch(Exception e){}
	}

	void outputAll()
	{
		out.println(coins);
		out.println();
		out.println(pennyCount + " Pennies");
		out.println(nickCount + " Nickels");
		out.println(dimeCount + " Dimes");
		out.println(quartCount + " Quarters");
		out.println();
		outputTotal();
		out.println("The total of your coins " + total); 
		out.println();
		countCoins();
		out.print("Total amount of coins in the purse... " + totalCoins);
		out.println();
		out.println();
		
	}

	void removePennies()
	{
		out.println("NOW REMOVING PENNIES!\n");
		pennyCount = 0;
		out.println(pennyCount + " Pennies");
		out.println(nickCount + " Nickels");
		out.println(dimeCount + " Dimes");
		out.println(quartCount + " Quarters");
		out.println();
		outputTotal();
		out.println("The total of your coins " + total );
		out.println();
		countCoins();
		out.print("Total amount of coins in the purse after removing pennies... " + totalCoins);
		out.println();
	}

	void outputTotal()
	{
		total = pennyCount * .01 + nickCount * .05 + dimeCount * .10 + quartCount * .25 ;
	}

	public void countCoins()
	{
		totalCoins = pennyCount + nickCount + dimeCount + quartCount;
	}
	public void challange()
	{
		if(pennyCount >= 25)
		{
			pennyCount = pennyCount - 25;
			quartCount =	quartCount + 1;
		}
		if(pennyCount >= 10)
		{
			pennyCount = pennyCount - 10;
			dimeCount = dimeCount + 1;
		}
		if(pennyCount >= 5)
		{
			pennyCount = pennyCount - 5;
			nickCount = nickCount + 1;
		}
		
		
	}


class Coin
{
   	private double value;
   	private String name;

	public Coin( double v, String n)
	{
		value = v;
		name = n;
	}

	// write a getValue() accessor method
	public double getValue()
	{
		return value;
	}
	// write a getName() accessor method
	public String getName()
	{
		return name;		
	}
	public String toString()
	{
		return "<"+value+","+name+">";
	}
}

}





