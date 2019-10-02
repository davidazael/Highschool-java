///////////////////////////////////////////////////////////////////////////
//
// Java1808 This problem set includes many Alphanumeric methods to work.
//          Given the input, use the correct methods necessary to produce
//          the sample output. Include all quotes seen in the sample.
//
//
//	SAMPLE INPUT:
//			Enter a sentence ==> Fishing is a smelly sport
//			Enter a word in the sentence ==> smell
//			Enter a letter in the sentence ==> e
//
//	SAMPLE OUTPUT:
//
//			The length of the sentence is 25
//			The length of the word is 5
//			The 1st letter of the sentence is F
//			The last letter of the sentence is t
//			Your letter capitalized: E
//			Your word capitalized: SMELL
//			The letter 'e' is found in "smell" at position 2
//			The word "smell" is found at position 13
//			The last word in the sentence is sport
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1808{
	public static void main(String[] args){
		new Alphabetical();
}}


class Alphabetical
{
	String sent,word,let;

	public Alphabetical()
	{
		input();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter a sentence ==>");
		sent = scan.nextLine();
			
		out.print("Enter a word in the sentence ==> ");
		word = scan.nextLine();
	
		out.print("Enter a letter in the sentence ==> ");
		let = scan.nextLine();
	
	}
	

	public void output()	
	{
		
		
		out.println("The length of the sentence is " + ( sent.length() ) );
		out.println("The length of the word is " + ( word.length()-1 ) );
		out.println("The 1st letter of the sentence is " + sent.substring( 0,1  ));
		out.println("The last letter of the sentence is " + sent.substring(sent.length()-1) );
		out.println("Your letter capitalized: " + let.toUpperCase() );
		out.println("Your word capitalized: " + word.toUpperCase() );
		out.println("The letter '" + let + "' is found in "+ word +" at position " + word.indexOf(let) );
		out.println("The word "+ word +" is found at position " + sent.indexOf(word) );
		out.println("The last word in the sentence is " + sent.endsWith(sent)  );
		
		
		
	}
}







