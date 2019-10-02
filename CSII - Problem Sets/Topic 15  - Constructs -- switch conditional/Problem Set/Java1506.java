///////////////////////////////////////////////////////////////////////////
//
// Java1506 Write a program that has the user enter an integer number
//          within the range 0..9999.  Convert this integer to its
//          corresponding written string.
//
//     HINT:  Use integer division and modulus to isolate each
//            digit, then use a switch statment for each digit.
//
//     HINT:  Be careful with the teens, e.g. 17.
//
///////////////////////////////////////////////////////////////////////////
//
//     SAMPLE INPUT:  1532
//
//    SAMPLE OUTPUT:  one thousand five hundred thirty two
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1506{
	public static void main(String[] args){
		new Problem();
}}


class Problem
{
  	int  code;
  	String num; 

  	public Problem()
  	{
  		input();
  		process();
  		output();
  	}

	public void input()
	{
		Scanner scan = new Scanner(in);
      	out.print("Please enter the code number => ");
      	code = Integer.valueOf(scan.nextLine());
      	
      
	}

	public void process()
	{
		
		
		switch(code)
		{
			case 1 :  ;break;
			case 2 :  ;break;
			case 3 :  ;break;
			case 4 :  ;break;
			case 5 :  ;break;
		}

	}

	public void output()
	{
		out.println("" );
	}
}
