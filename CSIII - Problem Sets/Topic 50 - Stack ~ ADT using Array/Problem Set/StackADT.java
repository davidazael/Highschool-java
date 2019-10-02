///////////////////////////////////////////////////////////////////////////
//
// StackADT
//			This file contains the beginning Stack ADT for the problem set.
//
//			Compile this file so that the classes are available.
//
//
///////////////////////////////////////////////////////////////////////////


package solution;

class StackADT
{
	protected Object[] stack;
	protected int      top;
	protected int      capacity;

	public StackADT()
	{
		top      = -1;
		capacity = 11;
		stack    = new Object[capacity];
	}

	public void push(Object data)
	{
		if(stack == null ||
		   top+1 >= capacity-1 )
			 stack = resize(stack);

		top++;
		stack[top] = data;
	}

	public Object pop()
	{
		if(empty())
			return null;

		Object temp = stack[top];
		stack[top]  = null;
		top--;
		return temp;
	}

	private Object[] resize(Object[] origin)
	{
		if(stack == null || capacity==0)
		{
			capacity = 1;
			return new Object[capacity];
		}
		else
		{
			capacity *= 2;
			Object[] temp = new Object[capacity];
			for(int x=0; x<stack.length; x++)
				temp[x] = origin[x];
			return temp;
		}
	}

	public boolean empty()
	{
		return top < 0;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public int getSize()
	{
		return top + 1;
	}

	public String toString()
	{
		String temp = "";
		temp += "[\n";

		if(stack != null)
		 	for(int x=top; x>=0; x--)
		 		temp += "stack[" + x + "] is " + stack[x] + "\n";

		return temp + "]\n";
	}
}

