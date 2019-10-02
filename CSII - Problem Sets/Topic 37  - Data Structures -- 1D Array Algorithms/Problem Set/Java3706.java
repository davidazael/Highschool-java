///////////////////////////////////////////////////////////////////////////
//
// Java3706 Write a program that asks the user for 8 daily stock market
//			averages and stores those averages in a floating-point array.
//			Display the array forward and backward.  Print the highest
//			and lowest stock market quotes in the list.
//
//     SAMPLE DATA:  2.32  15.46  6.18  25.01  1.94  12.47  9.16  19.88
//
//   SAMPLE OUTPUT:
//
//	   Forward ->  2.32  15.46  6.18  25.01  1.94  12.47  9.16  19.88
//   Backwards ->  19.88  9.16  12.47  1.94  6.18  15.46  2.32  25.01
//      Sorted ->  1.94  2.32  6.18  9.16  12.47  15.46  19.88  25.01
//	        Hi ->  25.01
//         Low ->  1.94
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java3706{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	private double[] prices;

	public Environment()
	{
		populate();
		run();
	}
	private void populate()
	{
		prices = new double[]{2.32 , 15.46 , 6.18 , 25.01 , 1.94 , 12.47 , 9.16 , 19.88};
	}

	public void run()
	{
		out.println();
		out.print("  Forward ->  "   );
		forward();

		out.println();
		out.print("Backwards ->  "   );
		backward();
			
		Arrays.sort( prices );
		out.println();
		out.print("   Sorted ->  " + Arrays.toString( prices ) );
		
		double high = 0;
		for (int i = 0; i < prices.length; i++) 
			{
				if(high < prices[i])
					high = prices[i];				
			}
		out.println();
		out.println("       Hi ->  " + high /* ??? */);
		
		double  low = 100;
		for (int x = 0; x < prices.length; x++) 
			{
				if(low > prices[x])
					low = prices[x];				
			}
		out.println("      Low ->  " + low /* ??? */);
		out.println();
		out.println();
	}
	public void forward()
	{
		for (int i = 0; i < prices.length-1; i++) 
        	{
        		out.print( prices[i] + "  " );
        	}   
	}
	public void backward()
	{
		for (int i = prices.length-1; i > 0; i--) 
        	{
        		out.print( prices[i] + "  " );
        	}
	}
}





