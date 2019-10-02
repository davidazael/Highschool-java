///////////////////////////////////////////////////////////////////////////
//
// Java1809 We are all told as we grow from children to adults that we
//			must learn to share.  Given a string entered by the user,
//			cut the word in half so that it can be shared.  Not all words
//			can be cut perfectly in half.   Just get as close as you can.
//			Identify the center letter and display it as a capital letter.
//			Display the two halves as lowercase letters.
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:
//			Enter a word: Electron
//
//	    SAMPLE OUTPUT:
//         ele <--> C <--> tron 
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java1809{
	public static void main(String[] args){
		new Sharing();
}}


class Sharing 
{
	String word;

	public Sharing()
	{
		input();
		output();
	}
	
	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Please enter a word of any length: ");
		word = scan.nextLine();
	}

	public void output()
	{
		int num = word.length();
		int num2 = num / 2;
		String first = word.substring(0, num2);
		String middle= word.substring(num2, num2+1);
		String end = word.substring(num2+1, num);
		
		if(num % 2 == 0)
		{
			out.println(first.toLowerCase() + " <---> " + middle.toUpperCase() + " <---> " + end.toLowerCase()  );
		}
		else
		{
			out.println(first.toLowerCase() + " <---> " + end.toLowerCase());
		}


	}

}



