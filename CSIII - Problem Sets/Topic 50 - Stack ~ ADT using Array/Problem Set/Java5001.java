///////////////////////////////////////////////////////////////////////////
//
// Java5001	Write a program that implements a stack.  Read data from a
//			file and display
//				a)	the items remaining in the stack
//
//  Modify implementation of a stack.
//
//			    VIEW:
//
//       +--------------------------------------------------------+
//       | +--------------------------------------------------+-+ |
//       | | [x,x,x]                                          |A| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |V| |
//       | +--------------------------------------------------+-+ |
//       |     +----------------+         +-----------------+     |
//       |     |    Process     |  Input: | Java5001a.dat   |     |
//       |     +----------------+         +-----------------+     |
//       +--------------------------------------------------------+
//
//
//	REQUIREMENT:
//		Your program must use a Stack data structure.
//
//		Test your program using the following files:
//			Java5001a.dat
//			Java5001b.dat
//			Java5001c.dat
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE SAMPLE:
/*

push 	4
push 	9
pop 	x
push 	5
push 	12
push 	8
pop 	x
pop 	x
push 	20

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java5001{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	StackADT myStack = new StackADT();
	String pushOrPop;
	int num;
	File file;
	
	public Model()
	{
		input.setText("Java5001a.dat");
	
	
	}

	public void ButtonOneAction()
	{
		// Code Here
		file = new File(input.getText());

		try
		{
		Scanner scan = new Scanner(file);
			while(scan.hasNext())
			{
				pushOrPop = scan.next();
	
				
				if( pushOrPop.equalsIgnoreCase("push") )
				{
					myStack.push(scan.next());
				}
				else
				{
					myStack.pop();
					scan.next();
				}	
			}
		}catch(Exception e){}
		
		output.append( myStack.toString() );

	}
}

