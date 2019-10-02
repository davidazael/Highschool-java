///////////////////////////////////////////////////////////////////////////
//
// Java2108 Allow the user to input a word.  Display and count the vowels
//          in the word.
//
///////////////////////////////////////////////////////////////////////////
//
//  SAMPLE INPUT:
//		Enter a word: Antarctica
//
//  SAMPLE OUTPUT:
//
//		Here are the vowels in Antarctica: Aaia
//		Vowel count: 4
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java2106{
	public static void main(String[] args)	{
		new Solution();
}}


class Solution
{
	String word, vowels;
	int count;

	Solution()
	{

		input();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);

		out.print("Enter a word: ");
		word = scan.nextLine();
		
		vowels = "AEIOU";
		count = 0;
		for(int x = 0; x < word.length(); x++)
		{
			if(word.contains("A"))
			{
				count++;
			}
		}

	}

	public void output()
	{
		out.println("Here are the vowels in the word " + word + ":" );
		out.println("Vowel cuont: " + count );

	}
}







