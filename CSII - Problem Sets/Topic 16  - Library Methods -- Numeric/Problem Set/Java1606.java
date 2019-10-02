///////////////////////////////////////////////////////////////////////////
//
// Java1606	Write a program to generate a random 5-letter word.  Obviously,
//			the	lowest letter should be 'A' and the largest should be 'Z'.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:	none
//
//	SAMPLE OUTPUT:	ZYELG
//
//	NOTE:  Run your program SEVERAL times to make sure you're getting a
//		   good random sample of the letters of the alphabet.
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1606{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
	char randomLet;

	public Problem()
	{
		for(int x=0;x<5;x++)
		{
			if(x % 5 == 0)
				out.println();
			output();
		}
		out.println();
		out.println();
	}

	void output()
	{
		randomLet = (char)((Math.random()*26)+ 65);
		out.print(randomLet  );

	}
}



