///////////////////////////////////////////////////////////////////////////
//
// Java5302	Write a program that implements a QueueADT.  Read data from a
//			file and display
//				a)	View last item deQueued
//
//  Modify implementation of a QueueADT.
//
//			    VIEW:
//
//       +--------------------------------------------------------+
//       | +--------------------------------------------------+-+ |
//       | | View last item deQueued was xx.                  |A| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |:| |
//       | |                                                  |V| |
//       | +--------------------------------------------------+-+ |
//       |     +----------------+         +-----------------+     |
//       |     |    Process     |  Input: | Queue01.dat     |     |
//       |     +----------------+         +-----------------+     |
//       +--------------------------------------------------------+
//
//
//	REQUIREMENT:
//		Your program must use a QueueADT data structure.
//
//		Test your program using the following files:
//			Queue01.dat
//			Queue02.dat
//			Queue03.dat
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE SAMPLE:
/*

enqueue 4
enqueue 9
dequeue
enqueue 5
enqueue 12
enqueue 8
dequeue
dequeue
enqueue 20

*/
//
///////////////////////////////////////////////////////////////////////////


package solution;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Java5302{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	QueueADT myQueue;
	String last = "";
	public Model()
	{
		input.setText("Queue01.dat");
		ButtonOneAction();
	}
	public void ButtonOneAction()
	{
		// Code Here
		myQueue = new QueueADT();	
		try 
		{
		Scanner scan = new Scanner(new File("Queue01.dat"));
		while(scan.hasNext())
		{
			String line = scan.next();
			
			
			if( line.equals("enqueue") )
			{
				myQueue.enQueue(scan.nextInt());
			}
			if( line.equals("dequeue") )
			{
				myQueue.deQueue();
				last = line;
			}
		}
		out.println(myQueue.toString());
		out.println(last);
		output.append(myQueue.toString());
		}
		catch (Exception ex){ out.println(ex); }	


	}
}

