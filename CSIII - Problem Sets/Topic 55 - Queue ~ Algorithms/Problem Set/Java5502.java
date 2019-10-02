///////////////////////////////////////////////////////////////////////////
//
// Java5502	Write a method mirror that accepts a queue of strings as a 
//			parameter and appends the queue's contents to itself in 
//			reverse order.
//
//
//		public queue mirror( queue orig )
//		{
//		}
//
//
//	e.g.
//
//		original --> [a, b, c]
//		stutter  --> [a, b, c, c, b, a]
//
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.awt.*;

class Java5501
{
	public static void main(String[] args)
	{
		new Model();
	}
}
class Model 
{ 
	private Queue<String> origQueue = new LinkedList<String>();;
	private Queue<String> newQueue;
	
	public Model()
	{	
		
		origQueue.offer( new String("a") );
		origQueue.offer( new String("b") );
		origQueue.offer( new String("c") );
		
		out.print("Original --> ");
		out.println(origQueue.toString());
		out.print("Stutter --> ");
		out.println( newQueue.toString() );
	}
	public Queue stutter(Queue<String> origQueue)
	{
				
		for(String temp:origQueue)
		{
			newQueue.offer(temp);
			newQueue.offer(temp);
		}
		
		return newQueue;
	}
	
}


