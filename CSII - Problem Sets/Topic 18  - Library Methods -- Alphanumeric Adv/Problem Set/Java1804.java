///////////////////////////////////////////////////////////////////////////
//
// Java1804 In this program the user enters a word of at least six
//			characters in length.  From the word, use the substring()
//			method to extract three pairs of letters.  If the word is
//          not at least 6 letters, display an apppropriate message.
//
//			1)	The first 2 letters of the word.
//			2)	The middle 2 letters of the word, and
//			3)	The last 2 letters of the word.
//
//
///////////////////////////////////////////////////////////////////////////
//
// 		SAMPLE INPUT:
//			Please enter a word ==> Spiderman
//
//	     SAMPLE OUTPUT:
//          Sp <--> er <--> an
//
///////////////////////////////////////////////////////////////////////////
//
//
// 		SAMPLE INPUT:
//			Please enter a word ==> Catwoman
//
//	     SAMPLE OUTPUT:
//          Ca <--> wo <--> an
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java1804{
	public static void main(String[] args){
		new LetterPairs();
}}


class LetterPairs
{
	String word,result;

	public LetterPairs()
	{
		input();
		process();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Please enter a word at least six characters long: ");
		word = scan.nextLine();
	
	}
	
	public void process()
	{
		String first2 = word.substring(0,2); 
		String middle2 = word.substring( (word.length()/2-1),(word.length()/2+1) ); 
		String last2 = word.substring((word.length()-2),word.length()); 
			
		
		if(word.length() >= 6)
		{
			result = first2 + " <==> " + middle2 + " <==> " + last2;
		}
		else
		{
			result = "Please enter a 6 letter word";
			
		}
		
	
	}

	public void output()
	{
		out.println(result);

	}
}



