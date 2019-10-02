///////////////////////////////////////////////////////////////////////////
//
// Java1807 Given three words,  print a message as to whether they are in
//          alphabetical order or not.
//
//	SAMPLE INPUT:
//			Enter a word ==> banana
//			Enter another word ==> apple
//			Enter one more word ==> orange
//
//	SAMPLE OUTPUT:
//
//			Your words are NOT in alphabetical order.
//
//  CHALLENGE: If the words are NOT in alphabetical order, display them
//             alphabetically.
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1807{
	public static void main(String[] args){
		new Alphabetical();
}}


class Alphabetical
{
	String word1, word2, word3;

	public Alphabetical()
	{
		input();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter a word: ");
		word1 = scan.nextLine();
		out.print("Enter another word: ");
		word2 = scan.nextLine();
		out.print("Enter a final word: ");
		word3 = scan.nextLine();
	
	}
	

	public void output()
	{
		int value = word1.compareTo(word2);
		int value2 = word2.compareTo(word3);
	
		if(value < 0 && value2 < 0)
			out.println(word1 + ", " + word2 + ", " + word3 + ", "  );
		else
	 		if(value >0 && value2 < 0)
			{
				out.println("Your words are NOT in alphabetical order.");
				out.println("Here they are alphabetically ordered, " + word2+ ", " + word1+ ", " + word3);
			}
			else
			if(value > 0 && value2 > 0)
			{
				out.println("Your words are NOT in alphabetical order.");
				out.println("Here they are alphabetically ordered, " + word3+ "\\ " + word2 + "\\ " + word1);
			}
	}
}





