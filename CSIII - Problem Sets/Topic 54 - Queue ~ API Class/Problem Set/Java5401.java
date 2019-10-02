///////////////////////////////////////////////////////////////////////////
//
// Java5401	Write a program that implements a Queue data structure.
//			Complete the <remove(int i)> method so that it removes
//			the parameter number, but leaves the remaining queue intact.
//
//	eg.
//		43 92 41 39 10 32 62 17 29 51 35 44 24 15 72 66
//
//		remove(6);
//
//		62 17 29 51 35 44 24 15 72 66
//
//
///////////////////////////////////////////////////////////////////////////
import java.util.*;	
import static java.lang.System.*;							
												
public class Java5401{
	public static void main(String[] args) {
		new Model();
}}


class Model 
{
	Queue<Integer> myQueue;							
													
	public Model()							
	{   
		myQueue = new LinkedList<Integer>();
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
		out.println(myQueue);
		
		for (int i = 0; i < 7; i++)	
		{
			myQueue.poll();
		}
		out.println(myQueue);
		
		
		
	}
}




