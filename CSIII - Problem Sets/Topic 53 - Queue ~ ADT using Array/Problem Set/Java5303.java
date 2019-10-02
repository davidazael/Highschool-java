///////////////////////////////////////////////////////////////////////////
//
// Java5303	Write a program that implements a QueueADT.  Write a method
//			that will delete the ith element, where the deletion operation 
//			deletes and returns the ith least recently added object 
//			on the QueueADT.
//
//
//		public Object delete(int ith)
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
//       |     |     Delete      |  Input: | 4               |     |
//       |     +-----------------+         +-----------------+     |
//       +---------------------------------------------------------+
//
//
//	REQUIREMENT:
//		Your program must use a Stack data structure.
//
//		Test your program using the following files:
//			Queue04.dat
//			Queue05.dat
//			Queue06.dat
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE SAMPLE:
/*

push 4
push 9
push 5
push 8
push 6
push 4

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;

public class Java5303{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	BigQueue myQueue;

	public Model()
	{
		buttonOne.setText("Delete");
		input.setText("4");
	}

	public void ButtonOneAction()
	{
		// Code Here


	}
}


class BigQueue extends QueueADT
{
	public Object delete(int ith)
	{
		
		return ;
	}
}


