///////////////////////////////////////////////////////////////////////////
//
// Java1001 	Write a program that outputs the following Nutrition facts
//			    label to a data file. NOTE: It is not necessary to print
//              anything to the console unless you want to indicate that
//              that the action has been performed. Your teacher will be
//              checking the data file for correct output.
//
//              DATA FILE OUTPUT: Nutrition.dat
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE OUTPUT TO DATA FILE:
//
//			NUTRITION FACTS
//		======================================
//			Serving Size 1 tbsp (6g)
//			Servings Per Container about 4
//		======================================
//			Amount Per Serving
//			Calories			20
//			Calories from Fat 	5
//		======================================
//			Total Fat 0.5g
//			Sodium 280mg
//			Total Carbohydrate 4g
//			Sugars 0g
//			Protein less than 1 g
//		======================================
//
//


import static java.lang.System.*;
import java.io.*;

public class Java1001
{
	public static void main(String[] args) throws IOException
	{
		// Create file output stream
		PrintStream outFile = null;
		try
		{
		outFile = new PrintStream(new File("Nutrition.dat") );
		
		}
		catch(Exception e){}

		outFile.println("NUTRITION FACTS");
		outFile.println("======================================");
		outFile.println("Serving Size 1 tbsp (6g)");
		outFile.println("Servings Per Container about 4");
		outFile.println("======================================");
		outFile.println("Amount Per Serving");
		outFile.println("Calories			20");
		outFile.println("Calories from Fat 	5");
		outFile.println("======================================");
		outFile.println("Total Fat 0.5g");
		outFile.println("Sodium 280mg");
		outFile.println("Total Carbohydrate 4g");
		outFile.println("Sugars 0g");
		outFile.println("Protein less than 1 g");
		outFile.println("======================================");
	}
}

