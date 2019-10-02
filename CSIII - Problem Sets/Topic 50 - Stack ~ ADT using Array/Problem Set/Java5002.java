///////////////////////////////////////////////////////////////////////////
//
// Java5002	Write a program that implements a stack.  Read data from a
//			file and display
//				a)	View last item popped
//
//  Modify implementation of a stack.
//
//			    VIEW:
//
//       +---------------------------------------------------------+
//       | +---------------------------------------------------+-+ |
//       | | View last item popped was xx.                     |A| |
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
//			Java5002a.dat
//			Java5002b.dat
//			Java5002c.dat
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
push 12
push 8
pop x
pop x
push 20

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Java5002{
	public static void main(String[] args) {
		new Model();
}}

class Model extends MyFrame
{
	StackADT myStack = new StackADT();
	String or;
	Object lastPopped = null;

	public Model()
	{
		input.setText("Java5002a.dat");
	}

	public void ButtonOneAction()
	{
		// Code Here
		try
		{
			Scanner scan = new Scanner(new File(input.getText()));
			
			while(scan.hasNext())
			{
				or = scan.next();
				if(or.equalsIgnoreCase("push"))
				{
					myStack.push(scan.next());
				}
				else
				{
					lastPopped = myStack.pop();
					scan.next();
				}
				
			}	
		}catch(Exception e){}
		
		output.append("View last item popped was " + lastPopped + "\n");
		output.append(myStack.toString());

	}
}

