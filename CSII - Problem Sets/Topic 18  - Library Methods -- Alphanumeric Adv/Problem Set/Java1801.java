///////////////////////////////////////////////////////////////////////////
//
// Java1801 Write a program to allow the user to enter three words.
//			Use substring() to extract smaller words from the
//			larger words.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:
//		Enter word     ==> CONCATENATE
//      Enter index #1 ==> 3
//      Enter index #2 ==> 6
//
//	SAMPLE OUTPUT:
//		CONCATENATE contains the word CAT
//
///////////////////////////////////////////////////////////////////////////
//
//  OTHERS TO TRY
/*

IMPERSONATE   (PERSON, SON, ATE, AT)
OCCUPATION    (CUP, PAT)


*/
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java1801{
	public static void main(String args[]){
		new SmallerWords();
}}

class SmallerWords
{
	String word;
	int num, num2;

	public SmallerWords()
	{
		input();
		output();
	}

	public void input()
	{
		Scanner scan = new Scanner(System.in);
		out.print("Enter word     ==>");
		word = scan.nextLine();
		
		out.print("Enter index #1 ==>");
		num = Integer.valueOf(scan.nextLine());
		
		out.print("Enter index #2 ==>");
		num2 = Integer.valueOf(scan.nextLine());
	
	}

	public void output()
	{
		out.println(word + " contains the word " + word.substring(num,num2));

	}
}

