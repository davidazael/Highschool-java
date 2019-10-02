///////////////////////////////////////////////////////////////////////////
//
// StackADT
//			This file contains the beginning Queue ADT for the problem set.
//
//			Compile this file so that the classes are available.
//
//
///////////////////////////////////////////////////////////////////////////


package solution;

class QueueADT
{
	private Object[] queue;
	private int      back;
	private int      capacity;

	QueueADT()
	{
		back     = -1;
		capacity = 0;
		queue    = null;
	}

	public void clear()
	{
		back     = -1;
		capacity = 0;

		queue = new Object[capacity];
	}

	public Object deQueue()
	{
		if(isEmpty())
			return null;

		Object temp = queue[0];
		for(int x=0; x<back; x++)
			queue[x] = queue[x+1];

		queue[back] = null;	

		back--;
		return temp;
	}

	public void enQueue(Object data)
	{
		if(queue == null ||
		   back+1 >= capacity-1 )
			 resize();

		back++;
		queue[back] = data;
	}

	private void resize()
	{
		if(queue == null || capacity==0)
		{
			capacity = 1;
			queue = new Object[capacity];
		}
		else
		{
			capacity *= 2;
			Object[] temp = new Object[capacity];
			for(int x=0; x<queue.length; x++)
				temp[x] = queue[x];
			queue = temp;
		}
	}

	public int getCapacity()
	{
		return capacity;
	}

	public Object peekFront()
	{
		return queue[0];
	}

	public boolean isEmpty()
	{
		return back < 0;
	}

	public int getSize()
	{
		return back + 1;
	}

	public String toString()
	{
		String temp = "";
			temp += "back = " + back + "\n";
			temp += "capacity = " + capacity + "\n";
			temp += "[\n";

		if(queue != null)
		 	for(int x=back; x>=0; x--)
		 		temp += "queue[" + x + "] is " + queue[x] + "\n";

		return temp + "]\n";
	}
}

