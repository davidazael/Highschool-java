///////////////////////////////////////////////////////////////////////////
//
// Java5005	Write a program that implements a stack.
//
//			Create a new class called GreenStack that inherits from
//			our StackADT class.
//
//			Add a method reverse() to GreenStack that modifies a stack
//			such that the original elements are returned in reverse order.
//
//
//		public GreenStack reverse(GreenStack orig)
//		{
//
//			return ?
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
//			Java5005a.dat
//			Java5005b.dat
//			Java5005c.dat
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE SAMPLE:
/*

push 4
push 9
reverse
push 5
reverse
pop x
push 8
push 6
reverse
push 4
reverse
pop x

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java5005{
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


