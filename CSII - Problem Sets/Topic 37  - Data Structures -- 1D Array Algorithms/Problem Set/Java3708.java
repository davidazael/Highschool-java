///////////////////////////////////////////////////////////////////////////
//
// Java3708  Acronyms are abbreviations made when a word is formed from
//			 the initials or other parts of several words.  Example:  NATO
//			 is the acronym for North Atlantic Treaty Organization.
//
//			 The input for this problem is a single String:  the phrase
//			 that will eventually form the acronym.  Read in this String,
//			 and use the split() method to separate the words.  Write the
//			 acronym() method that will extract the first character from each
//			 word to form the acronym.
//
//   SAMPLE INPUT:  American Standard Code Information Interchange
//
//
//	SAMPLE OUTPUT:
//
//	 Original Phrase:
//	 American Standard Code Information Interchange
//
//	 Words in array form:
//	 [American, Standard, Code, Information, Interchange]
//
//   Acronym:
//	 ASCII
//
///////////////////////////////////////////////////////////////////////////




import static java.lang.System.*;
import java.util.*;

public class Java3708{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	private String phrase;
	private String[] words;
	private String acronym;

	public Environment()
	{
		populate();
		process();
		run();
	}

	private void populate()
	{
		Scanner scan = new Scanner(in);
		out.println("Enter a phrase to process:");
		phrase = scan.nextLine();
		out.println();
	}

	public void run()
	{
		out.println("The original phrase: \n" + phrase );
		words = phrase.split(" ");
		out.println("The words in Array form: \n" + Arrays.toString( words ) );
		acronym = "";
		for (int i = 0; i < words.length; i++) 
			{
				acronym += words[i].substring(0,1);				
			}
		out.println("Acronym: \n" + acronym);
	}

	private void process()
	{
		
	}
	
}


