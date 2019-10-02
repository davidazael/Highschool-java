///////////////////////////////////////////////////////////////////////////
//
// Java2211 Write a program that uses nested loops to create the following
//          design. HINT: Use a separate char variable that is NOT a lcv.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//
//			Enter rows: 6
//			Enter columns: 10
//
//     SAMPLE OUTPUT:
//
//			ABCDEFGHIJ
//			KLMNOPQRST
//			UVWXYZABCD
//			EFGHIJKLMN
//			OPQRSTUVWX
//			YZABCDEFGH
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java2211{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	int numRows,numCols;

	public Solution()
	{
		input();

	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter rows: ");
		numRows = Integer.valueOf(scan.nextLine());
		out.print("Enter columns: ");
		numCols = Integer.valueOf(scan.nextLine());
	}
}










