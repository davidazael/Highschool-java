///////////////////////////////////////////////////////////////////////////
//
// Java0505 Write a Program that assigns a letter to a character variable.
//          Then assign an integer to an int variable.  Using character
//          arithmetic, output the character that is the int value characters
//          BEFORE and AFTER the assigned character.  For example, if the
//          letter were 'C' and the int value were 2, the letter 'A' is 2 before
//          'C' and the letter 'E' is 2 after 'C'.
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE DATA:  I
//					 5
//
//   SAMPLE OUTPUT:  Letter     :  I
//                   I + 5      :  N
//                   I - 5      :  D
//
//  ALSO TRY THESE CHARACTERS FOR THE SAMPLE DATA:
//					 E
//					 a
//					 ?
//				     Z



import static java.lang.System.*;

public class Java0505{
	public static void main(String[] args){
		new CharacterWorld();
}}


class CharacterWorld
{
	//	define the variables
	char let1,let2,let3;


	public CharacterWorld()
	{
		//	assign data values to the variables
		let1 = 'U';
		let2 = 'Z';
		let3 = 'P';


		show();
	}

	public void show()
	{
		//	output according to instructions
		out.println("Letter		:" + let1);
		out.println(" U + 5  	:" + let2);
		out.println(" U - 5  	:" + let3);


		out.println();
	}
}

