///////////////////////////////////////////////////////////////////////////
//
// Java2202	Use for loops to create the following chart. The number placed
//          in each cell is the sum of the row and col.
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE OUTPUT:
//
//  	0   1   2   3   4   5   6   7   8   9
//   	1   2   3   4   5   6   7   8   9  10
//  	2   3   4   5   6   7   8   9  10  11
//   	3   4   5   6   7   8   9  10  11  12
//   	4   5   6   7   8   9  10  11  12  13
//   	5   6   7   8   9  10  11  12  13  14
//   	6   7   8   9  10  11  12  13  14  15
//   	7   8   9  10  11  12  13  14  15  16
//   	8   9  10  11  12  13  14  15  16  17
//   	9  10  11  12  13  14  15  16  17  18
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;

public class Java2202{
    public static void main(String[] args) {
		new Solution();

}}


class Solution
{
	public Solution()
	{
		for(int row = 0; row < 10; row++ )
		{
			for(int col = row; col < row+10; col++ )
				out.print(col + " ");
			out.println();
			
		}



	}
}




