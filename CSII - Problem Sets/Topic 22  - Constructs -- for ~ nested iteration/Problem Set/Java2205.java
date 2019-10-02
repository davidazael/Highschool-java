///////////////////////////////////////////////////////////////////////////
//
// Java2205 Use nested for loops to write a program to print a grid of
//          random letters. The number of rows and columns will be input.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//
//			Enter rows: 5
//			Enter columns: 10
//
//     SAMPLE OUTPUT:
//
//			LTFUPKAHKS
//			NUBCJUHGJW
//			PIDWEPUVKH
//			FTKXCKGWKW
//			SFAQNFQVEM
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2205{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	int numRows;
	int numCols;

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
		
		for(char let = 'A', rows = 0; rows <= numRows; rows ++, let++ )
		{
			for(int col = 0; col < numCols; col++)
			{
				out.print(let);
			}
			out.println();
		}
	}
}
