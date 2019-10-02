///////////////////////////////////////////////////////////////////////////
//
// Java2208	Use nested loops to write a program to print the following
//          design using a music note (NOT ?'s!).
//
//			(HINT: Your inner loop needs a dynamic boundary)
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  none
//
//     SAMPLE OUTPUT:
//
//		?????
//		????
//		???
//		??
//		?
//
//
///////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;

public class Java2208{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	final char MUSICNOTE = '\u000e';

	public Solution()
	{
		for(int r = 5; r > 0;r--)
		{
			for(int c = r; c > 0 ; c--)
			{
				out.printf("%s",MUSICNOTE);
			}
			out.println();
		}
	}
}


