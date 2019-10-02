///////////////////////////////////////////////////////////////////////////
//
// Java0501	Assign EACH LETTER of the word COMPUTER to separate character
//          variables.  Output the word following the pattern shown using
//          a single print command and concatenation using those variables.
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE DATA:  COMPUTER (each letter assigned to a variable)
//					 eg. let1 = 'C'
//					     let2 = 'O'
//						 etc.
//
//   SAMPLE OUTPUT:  COMPUTERETUPMOC
//

import static java.lang.System.*;

public class Java0501{
	public static void main(String[] args){
		new CharacterWorld();
}}


class CharacterWorld
{
	//	define the variables
	char let1,let2,let3,let4,let5,let6,let7,let8;


	public CharacterWorld()
	{
		//	assign data values to the variables
		let1 = 'C';
		let2 = 'O';
		let3 = 'M';
		let4 = 'P';
		let5 = 'U';
		let6 = 'T';
		let7 = 'E';
		let8 = 'R';



		show();
	}

	public void show()
	{
		//	output according to pattern in instructions
		out.println("" + let1 + let2 +let3 +let4 +let5 +let6 +let7 +let8 +let7 +let6 +let5 +let4 +let3 +let2 +let1 );


		out.println();
	}
}
