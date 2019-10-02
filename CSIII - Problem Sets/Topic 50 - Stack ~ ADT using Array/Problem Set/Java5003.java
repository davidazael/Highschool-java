///////////////////////////////////////////////////////////////////////////
//
// Java5003	Write a program that implements a stack.
//
//			Create a new class called RedStack that inherits from
//			our StackADT class.
//
//			Add a method dup to RedStack that creates a second copy
//			of the topmost element and pushes it onto the stack.
//
//
//		public void dup()
//		{
//		}
//
//
//	VIEW:
//       +---------------------------------------------------------+
//       | +---------------------------------------------------+-+ |
//       | | [x,x,x]                                           |A| |
//       | |                                                   |:| |
//       | |                                                   |:| |
//       | |                                                   |:| |
//       | |                                                   |:| |
//       | |                                                   |:| |
//       | |                                                   |V| |
//       | +---------------------------------------------------+-+ |
//       |     +-----------------+         +-----------------+     |
//       |     |    Get File     |  Input: | Java5001a.dat   |     |
//       |     +-----------------+         +-----------------+     |
//       +---------------------------------------------------------+
//
//
//	REQUIREMENT:
//		Your program must use a Stack data structure.
//
//		Test your program using the following files:
//			Java5003a.dat
//			Java5003b.dat
//			Java5003c.dat
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE SAMPLE:
/*

push 4
push 9
pop x
push 5
dup
push 8
dup
dup
dup
push 6
pop x
push 4
dup

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

import static java.lang.System.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java5003{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	RedStack myStack;
	String word, dup;

	public Model()
	{
		input.setText("Java5003a.dat");
	}

	public void ButtonOneAction()
	{
		// Code Here
		myStack = new RedStack();
		
		try
		{
			Scanner scan = new Scanner(new File(input.getText()));
			while(scan.hasNext())
			{
				word = scan.next();
	
				
				if( word.equalsIgnoreCase("push") )
				{
					myStack.push(scan.next());
				}
				else
				if( word.equalsIgnoreCase("dup") )
				{
					myStack.dup();
				}					
				else					
				if(word.equalsIgnoreCase("pop"))
				{
					myStack.pop();
					scan.next();
				}	
				
			}
		}catch(Exception e){}
		
		
		output.setText("" + myStack );
	


	}
}


class RedStack extends StackADT
{
	public RedStack()
	{
		super();
	}
	public void dup()
	{
		push(stack[top]);
	}
		
}

