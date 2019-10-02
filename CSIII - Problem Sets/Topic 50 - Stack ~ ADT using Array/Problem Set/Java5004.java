///////////////////////////////////////////////////////////////////////////
//
// Java5004	Write a program that implements a stack.
//
//			Create a new class called BlueStack that inherits from
//			our StackADT class.
//
//			Add a method exch to BlueStack that exchanges the top two
//			elements on the stack
//
//
//		public void exch()
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
//			Java5004a.dat
//			Java5004b.dat
//			Java5004c.dat
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE SAMPLE:
/*

push 4
push 9
exch
push 5
exch
pop x
push 8
push 6
exch
push 4
exch
pop x

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java5004{
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


