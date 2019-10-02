///////////////////////////////////////////////////////////////////////////
//
// Java5006	Write a program that implements a stack.
//
//			Create a new class called BrownStack that inherits from
//			our StackADT class.
//
//			Add a method Item[] multiPop(int k) to BrownStack that
//			pops k elements from the BrownStack and returns them as
//			an array of objects.
//
//
//		public Object[] multiPop(int k)
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
//			Java5006a.dat
//			Java5006b.dat
//			Java5006c.dat
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
multiPop 2
push 6
push 4
reverse
multiPop 3

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java5006{
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


