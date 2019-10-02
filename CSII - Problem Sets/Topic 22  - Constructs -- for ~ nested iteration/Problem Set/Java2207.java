///////////////////////////////////////////////////////////////////////////
//
// Java2207	Use nested loops to write a program to print the following
//          design using a check mark (NOT v's!). NOTE: Your print statement
//           may ONLY contain ONE checkmark (not 3).
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  none
//
//     SAMPLE OUTPUT:
//
//		vvvv
//		 vvvv
//		  vvvv
//		   vvvv
//		    vvvv
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;

public class Java2207{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	String colum;

	final String CHECKMARK = "\u00fb";
	
	public Solution()
	{
		for(int row = 1; row <6; row++)
		{
			colum = "%"+row+"s";
			
			for(int col = row; col < row+1; col++)
				
				out.printf(colum,CHECKMARK);
				
			out.println();
		}

	}
}

