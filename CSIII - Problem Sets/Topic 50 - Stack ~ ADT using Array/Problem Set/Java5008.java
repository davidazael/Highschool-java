///////////////////////////////////////////////////////////////////////////
//
// Java5008	Write a program that implements a dynamic shrinking stack.
//
//			With the array implementations of stack, we doubled the
//			size of the array when it wasn't big enough to store the
//			next element.  If we perform a number of doubling operations,
//			and then delete a lot of elements, we might end up with
//			an array that is much bigger than necessary.
//
//			Implement the following strategy: whenever the array
//			is 1/4 full or less, shrink it to half the size.
//
//			Explain why we don't shrink it to half the size when
//			it is 1/2 full or less.
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

public class Java5008{
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



