///////////////////////////////////////////////////////////////////////////
//
// Java1803 Write an program that splits a word the user entered into two
//          halves.  If the user does not enter at least 2 letters, display
//          an appropriate message.
//
//  CHALLENGE: Separate an odd-numbered word into thirds like this:
//                  Hall <--> o <--> ween
///////////////////////////////////////////////////////////////////////////
//
// 		SAMPLE INPUT:
//			Please enter a word (of any length) ==> Cougar
//
//	     SAMPLE OUTPUT:
//			Your word split in half: Cou  <--> gar
//
///////////////////////////////////////////////////////////////////////////
//
// 		SAMPLE INPUT:
//			Please enter a word of any length: Halloween
//
//	     SAMPLE OUTPUT:
//			Your word split in half: Hall <--> oween
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java1803{
	public static void main(String[] args){
		new WordChopper();
}}


class WordChopper
{
	String word, result;


	public WordChopper()
	{
		input();
		process();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Please enter a word of any length: ");
		word = scan.nextLine();		
	
	}
	
	public void process()
	{	
		int num = word.length()/2;		
		
		if(word.length() >= 2)
		{
			result = "Your word split in half: " + word.substring(0,num) + " <--> " + word.substring(num,word.length());
		}
		else
		{
			result = "The word " + word + " is to small to split ";
			
		}
	
	}
	
	public void output()
	{
		out.println(result);
	}
}


