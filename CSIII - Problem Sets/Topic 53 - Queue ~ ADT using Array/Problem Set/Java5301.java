///////////////////////////////////////////////////////////////////////////
//
// Java5301	Write a program that implements a queue.  Read data from a
//			file and display
//				a)	the items remaining in the stack
//
//  Modify implementation of a QueueADT.
//
//	Use the included GUI user-interface for interaction with the Queue data 
//	structure.  You program must complete action methods in the provided GUI
//	interface.
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
///////////////////////////////////////////////////////////////////////////
//
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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Java5301{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	QueueADT myQueue;

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
			}
		}
		out.println(myQueue.toString());
		output.append(myQueue.toString());
		}
		catch (Exception ex){ out.println(ex); }	
	}
}

