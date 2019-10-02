///////////////////////////////////////////////////////////////////////////
//
// Java3604	Write a program that places twenty(20) values as integer
//			data items into an array as the array is constructed.
//			This data represents a secret encrypted message.  Output
//          the array two times:
//              1) output the secret code as the encrypted integer data.
//			    2) typecast each code item as a char when it is output to
//			       reveal the secret code (decrypted).
//
//
//  INITIALIZE INTEGER DATA AS ARRAY IS CONSTRUCTED:
//		67 97 110 32 121 111 117 32 104 101 97 114 32 109 101 32 78 79 87 63
//
//  SAMPLE OUTPUT:
//
//	The encrypted secret code is:
//		67 97 110 32 121 111 117 32 104 101 97 114 32 109 101 32 78 79 87 63
//
//	The decrypted secret message is:
//		* The secret code will be revealed here! *
//
//


import static java.lang.System.*;

public class Java3604{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	///////////////////////////////////////////////////////
	// Declare the array
	///////////////////////////////////////////////////////
	int[] code;

	public Environment()
	{
		///////////////////////////////////////////////////////
		// Construct the array and assign values (one line)
		///////////////////////////////////////////////////////
		code = new int[]{67,97,110,32,121,111,117,32,104,101,97,114,32,109,101,32,78,79,87,63}; 

		run();
	}

	public void run()
	{
		out.println( "The encrypted secret code is: " );
		for(int x=0;x<20;x++)								
        {													
        	out.print( code[x] + " " );	
		}
		out.println( );
		out.println( );

		out.println( "The decrypted secret message is: " );
		char encrypt;
		for(int i=0;i<20;i++)								
		{								
			encrypt = (char)code[i];					
			out.print( encrypt );	
		}
		out.println( );
		out.println( );
	}
}


