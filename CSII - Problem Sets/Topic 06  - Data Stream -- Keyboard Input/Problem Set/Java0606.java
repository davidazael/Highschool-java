///////////////////////////////////////////////////////////////////////////
//
// Java0606 Mrs. Waterman is tired of making up problem sets for keyboard
//          input. Make up something clever using keyboard input and maybe
//          she will use it next year and quote you as the author. No, it
//          can't be a Goofy Bob.
//
//
//
//				
//
//
//
//
//
//
//

import static java.lang.System.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

class Java0606
{
	public static void main(String[] args)
	{
		new Baluga();
	}
}
class Baluga extends JFrame
{
	char baluga;
	char baluga1;
	char baluga2;
	char baluga3;
	char baluga4;
	char baluga5;
	String allBalugas;
	int numBaluga;
	
	
	public Baluga()
	{
		input();
		process();
		output();
	
	}
	
	public void input()
	{
		Scanner scan = new Scanner(in);
		
		out.println("Enter any character --->");
		baluga = scan.nextLine().charAt(0);
		
		out.println("Enter any character --->");
		baluga1 = scan.nextLine().charAt(0);
		
		out.println("Enter any character --->");
		baluga2 = scan.nextLine().charAt(0);
		
		out.println("Enter any character --->");
		baluga3 = scan.nextLine().charAt(0);
		
		out.println("Enter any character --->");
		baluga4 = scan.nextLine().charAt(0);
		
		out.println("Enter any character --->");
		baluga5 = scan.nextLine().charAt(0);

		
	}
	public void process()
	{
		allBalugas = "" + baluga + baluga1 + baluga2 + baluga3 + baluga4 + baluga5 ; 
			
		numBaluga = (int)baluga + (int)baluga1 + (int)baluga2 + (int)baluga3 + (int)baluga4 + (int)baluga5 ;
	}
	
	public void output()
	{
		
		out.println(allBalugas);
		out.println(numBaluga);

	}


}