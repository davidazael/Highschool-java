///////////////////////////////////////////////////////////////////////////
//
// Java1502 You want to send your friends a text message, but you get tired
//			of having to type the same one over and over again.  You
//          decide to program your phone to send default text messages
//			depending upon the character you choose.  Whenever you want
//			to send a message you simply enter the single letter.  WAP to
//          program your cell phone.
//
//          code table:   code  message
//                         C      Call me back right now!
//                         T      Text me back ASAP
//                         W      Where are you?
//                         R      What are you doing after school?
//                         M      Are you mad at me?
//                         D      What are you doing tonight?
//                         V      Do you want to go to the movies?
//                         H      Can you give me a ride home?
//	                     default   No message at this time
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT:  Enter code ==> m
//
//     SAMPLE OUTPUT:     Code ==> M
//                     Message ==> Are you mad at me?
//
///////////////////////////////////////////////////////////////////////////
//
//      ACTUAL INPUT:  M
//                     d
//                     X
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;

public class Java1502{
	public static void main(String[] args)	{
		new Problem();
}}


class Problem
{
  	char code;
  	String message;

  	public Problem()
  	{
  		input();
  		process();
  		output();
  	}

	public void input()
	{
		Scanner scan = new Scanner(in);
      	out.print("Please enter a character => ");

      	//**********************CHECK THIS OUT!!**************************/
      	code = Character.toUpperCase( scan.nextLine().charAt(0) );
      	//**********************CHECK THIS OUT!!**************************/
	}

	public void process()
	{
		///////////////////////////////////////////////////////////////////
		//	Complete the switch statement
		///////////////////////////////////////////////////////////////////


		switch(code)
		{
			case  'C' : message = "Call me back right now!"  ;			break;
			case  'T' : message = "Text me back ASAP " ;				break;
			case  'W' : message = "Where are you?  ";					break;
			case  'R' : message = "What are you doing after school? ";  break;
			case  'M' : message = "Are you mad at me?";					break;
			case  'D' : message = "What are you doing tonight?"  ;		break;
			case  'V' : message = "Do you want to go to the movies?";	break;
			case  'H' : message = "Can you give me a ride home? " ;		break;
		default:  message = "No message at this time" ;					break;
			
		}


	}

	public void output()
	{
		out.println();
		out.println();
   		out.println("   Code ==> " + code);
   		out.println("Message ==> " + message);
		out.println();
	}
}

