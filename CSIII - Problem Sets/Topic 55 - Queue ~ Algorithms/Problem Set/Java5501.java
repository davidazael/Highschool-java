///////////////////////////////////////////////////////////////////////////
//
// Java5501	Write a method stutter that accepts a queue of integers 
//			as a parameter and returns a queue that replaces every 
//			element of the queue with two copies of that element.
//
//
//		public queue stutter( queue orig )
//		{
//		}
//
//
//	e.g.
//
//		original --> [1, 2, 3]
//		stutter  --> [1, 1, 2, 2, 3, 3]
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
	private Queue<Integer> origQueue = new LinkedList<Integer>();;
	private Queue<Integer> newQueue;
	
	public Model()
	{	
		
		origQueue.offer( new Integer(1) );
		origQueue.offer( new Integer(2) );
		origQueue.offer( new Integer(3) );
		
		out.print("Original --> ");
		out.println(origQueue.toString());
		out.print("Stutter --> ");
		out.println( newQueue.toString() );
	}
	public Queue stutter(Queue<Integer> origQueue)
	{
		Queue<Integer> temp = new LinkedList<Integer>();
	
		
		for(int temp:origQueue)
		{
			newQueue.offer(temp);
			newQueue.offer(temp);
		}
		
		return newQueue;
	}
	
}




