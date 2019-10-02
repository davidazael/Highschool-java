///////////////////////////////////////////////////////////////////////////
//
// Java0502 How about another Goofy Bob?  Sure, why not!
//
//          Goofy Bob has a job at the local Widgets R Us, and his boss,
//          Gus, wants him to write a program to calculate how much he is
//          many widgets he sells per hour, as well as his total widget sales.
//          Keep Bob from losing his job!
//
//          (it's a good time to review formatting, too!)
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE DATA:  	priceOfItem = 19.95;
//                      hoursWorked = 35;
//                      itemsPerWeek = 87;
//
//   SAMPLE OUTPUT:
//
//	          Hours Worked:   35
//	   Items Sold per week:   87
//	   Items Sold per hour:   2.5
//  	     Price of item:   $19.95
//      	   Total Sales:   $1,735.65
//
//
import static java.lang.System.*;

public class Java0502
{
	public static void main(String[] args)
		{
		new Widgets_R_Us();
		}
}


class Widgets_R_Us
{
	int hoursWorked;
	int itemsPerWeek;
	int itemsPerHour;
	double priceOfItem;
	double totalSales;

	public Widgets_R_Us()
	{
		priceOfItem = 19.95;
		hoursWorked = 35;
		itemsPerWeek = 87;
		double itemsPerHour = itemsPerWeek / hoursWorked ;
		double totalSales = itemsPerWeek * priceOfItem ;

		show();
	}

	public void show()
	{
		out.println("        Hours Worked:   " + hoursWorked);
		out.println(" Items Sold per week:   " + itemsPerWeek);
		out.println(" Items Sold per hour:   " + String.format("%$.1f",itemsPerHour));
		out.println("       Price of item:   " + String.format("$.2f",priceOfItem));
		out.println("         Total Sales:   " + String.format("$.2f",totalSales));
		out.println();
	}
}


