///////////////////////////////////////////////////////////////////////////
//
// Java5007	Write a program that implements a stack.
//
//			Create a new class called BoundedStack that inherits from
//			our StackADT class.
//
//			A bounded stack is a stack that has a capacity of at most N.
//			(Applications: undo or history with finite buffer.)
//
//		CONSTRUCTOR
//			BoundedStack(int k)
//
//			When pushing onto a loaded BoundedStack the bottom item
//			on the stack is removed.  Remember that you can only
//			use regular stack operations.
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
//			Java5007a.dat
//			Java5007b.dat
//			Java5007c.dat
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE SAMPLE:
/*

5
push 4
push 9
push 5
pop x
push 8
push 6
push 4
pop x
push 6
push 9
push 2
push 1
pop x

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java5007{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	BlueStack myStack;

	public Model()
	{
		input.setText("Java5003a.dat");
	}

	public void ButtonOneAction()
	{
		// Code Here


	}
}


class BlueStack extends StackADT
{
}



