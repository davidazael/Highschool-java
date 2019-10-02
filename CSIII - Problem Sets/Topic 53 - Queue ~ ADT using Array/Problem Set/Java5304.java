///////////////////////////////////////////////////////////////////////////
//
// Java5304 Write a program that implements a QueueADT.  Write a method
//			that will replace all the target items with an update item.
//
//
//		public QueueADT replaceAll()
//		{
//
//			return ?
//		}
//
//
//	VIEW:
//       +----------------------------------------------------------+
//       | +----------------------------------------------------+-+ |
//       | | [x,x,x]                                            |A| |
//       | |                                                    |:| |
//       | |                                                    |:| |
//       | |                                                    |:| |
//       | |                                                    |:| |
//       | |                                                    |:| |
//       | |                                                    |V| |
//       | +---------------------- -----------------------------+-+ |
//       |     +-----------------+          +-----------------+     |
//       |     |   Replace All   |  Target: | 77              |     |
//       |     +-----------------+          +-----------------+     |
//       |                                  +-----------------+     |
//       |                          Update: | 5               |     |
//       |                                  +-----------------+     |
//       +----------------------------------------------------------+
//
//
//	REQUIREMENT:
//		Your program must use a Stack data structure.
//
//		Test your program using the following files:
//			Queue07.dat
//			Queue08.dat
//			Queue09.dat
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

public class Java5304{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	MultiQueue myQueue;

	public Model()
	{
		buttonOne.setText("Replace All");
	}

	public void ButtonOneAction()
	{
		// Code Here


	}
}


class MultiQueue extends QueueADT
{
	public QueueADT replaceAll()
	{
		
		return ;
	}
}


