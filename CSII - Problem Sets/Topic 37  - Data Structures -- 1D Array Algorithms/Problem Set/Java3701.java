///////////////////////////////////////////////////////////////////////////
//
// Java3701 Pre-load an array of integers with multiples of 11.
//          Use a for loop to traverse through the array both
//          forwards and backwards. Do not look back or copy/paste
//          any code for your loops. This is basically a warm-up!
//
//     SAMPLE DATA:  11 22 33 44 55 37 77 88 99
//
//   SAMPLE OUTPUT:    Forward ->  11 22 33 44 55 37 77 88 99
//                   Backwards ->  99 88 77 37 55 44 33 22 11
//
//
///////////////////////////////////////////////////////////////////////////
//
//
//



import static java.lang.System.*;
import java.util.*;

public class Java3701{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	// declare and populate list here
	int[] elevens = {11,22,33,44,55,66,77,88,99};

	public Environment()
	{
		forwards();
		backwards();
	}
	public void forwards()
	{
		out.print( "Forwards --> " );
		for (int i = 0; i < elevens.length-1; i++) 
        	{
        		out.print( elevens[i] + " " );
        	}
		out.println();
		out.println();
	}
	public void backwards()
	{
		out.print( "Backwards --> ");
        for (int i = elevens.length-1; i > 0; i--) 
        	{
        		out.print( elevens[i] + " " );
        	}
		out.println();
		out.println();
	}
}

