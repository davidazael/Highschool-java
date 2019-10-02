0///////////////////////////////////////////////////////////////////////////
//
// Java2219 Parkside's Triangle is generated from two positive integers, one
//			for the size and one for the seed.
//
//  For example.
//
//        SIZE=6
//        SEED=1
//
//        1 2 4 7 2 7
//          3 5 8 3 8
//            6 9 4 9
//              1 5 1
//                6 2
//                  3
//
//        SIZE=5
//        SEED=3
//
//        3 4 6 9 4
//          5 7 1 5
//            8 2 6
//              3 7
//                8
//
//
//      Size gives the number of columns.  Seed specifies the stating value
//      for column 1.  Column n contains n values.  The successive values
//      are obtained by adding 1 to the previous value.  When 9 is reached,
//      the next value becomes 1.
//
//      Write a program that reads pairs of positive integers and produces
//      a Parkside's Triangle for each pair, The check for bad data should
//      include checking for seeds between 1 and 9 inclusive.
//
//




import static java.lang.System.*;
import java.util.*;


public class Java2219{
    public static void main(String[] args) {
		new Solution();
}}


class Solution
{
	private int rows;
	private int seed;

	public Solution()
	{

	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter the rows ==> ");
		rows = scan.nextInt();
		out.print("Enter seed ==> ");
		seed = scan.nextInt();
		out.println();
	}
}





