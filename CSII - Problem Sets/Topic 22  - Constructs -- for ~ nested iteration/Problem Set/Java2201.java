///////////////////////////////////////////////////////////////////////////
//
// Java2201  Use nested loops to write a program to print the following
//           design using a happy face (NOT asterisks!)
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  none
//
//     SAMPLE OUTPUT:
//
//        *****
//        *****
//        *****
//
///////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;

public class Java2201{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	final char HAPPY = '\u0001';				// reminder: this is a CONSTANT

	public Solution()
	{
		for(int row = 0; row<3; row++)
		{		
			for(int col = 0; col< 5; col++)
				out.print(HAPPY);
		out.println();
		}
			
	}	
}





