///////////////////////////////////////////////////////////////////////////
//
// Java5402	Write a program that implements a Queue data structure.
//			Given an initial myqueue, create two new queues, 
//			oddQueue and evenQueue, so that oddQueue contains the odd
//			elements of myqueue and evenQueue contains the even elements.
//
//	e.g.
//		as in dealing a deck of cards
//
//	e.g.
//		myqueue   -->	43 92 41 39 10 32 62 17 29 51 35 44 24 15 73 66
//
//		oddQueue  -->	43 41 39 17 29 51 35 15 
//		evenQueue -->	92 10 32 62 44 24 66
//		
//
///////////////////////////////////////////////////////////////////////////
import java.util.*;	
import static java.lang.System.*;							
												
public class Java5402{
	public static void main(String[] args) {
		new Model();
}}


class Model 
{
	Queue<Integer> myQueue;							
	Queue<Integer> oddQueue;							
	Queue<Integer> evenQueue;							
													
	public Model()							
	{   
		myQueue = new LinkedList<Integer>();
		oddQueue = new LinkedList<Integer>();
		evenQueue = new LinkedList<Integer>();
			myQueue.add(43);
			myQueue.add(92);
			myQueue.add(41);
			myQueue.add(39);
			myQueue.add(10);
			myQueue.add(32);
			myQueue.add(62);
			myQueue.add(17);
			myQueue.add(29);
			myQueue.add(51);
			myQueue.add(35);
			myQueue.add(44);
			myQueue.add(24);
			myQueue.add(15);
			myQueue.add(72);
			myQueue.add(66);
		out.println("My Queue -->" + myQueue);
		for (int i = 0; i < 16; i++)
		{
		if(myQueue.peek() % 2 == 0)
			evenQueue.offer( myQueue.peek() );
		
		if(myQueue.peek() % 2 != 0 )
			oddQueue.offer( myQueue.peek() );
		
		myQueue.poll();
			
		}
		
		
		
		out.println("Odd Queue -->" + oddQueue);
		out.println("Even Queue -->" + evenQueue);
				
	}
}