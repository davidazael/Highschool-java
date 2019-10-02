//
//	CS3 - Node                                   © 2005 - Tom Halbert
//
// 	   Thread:	Inserting a Node at the Front of a Linked List
//	Criterion:	Node Class
//	========================================================================
//
//

package solution;


public class Node<T>
{														//	Node as
	private T value;									//	 an Object
	private Node next;									//	  Data Type
														//		|
	public Node(){}										//		|
														//		|
	public Node(T v, Node n)							//		|
	{													//		|
		value = v;										//		|
		next  = n;										//		|
	}													//		|
														//		|
	public void setValue(T v)      { value = v;    }	//		|
	public void setNext(Node n)    { next  = n;    }	//		|
														//		|
	public T       getValue()      { return value; }	//		|
	public Node<T> getNext()       { return next;  }	//		|
}														//		V

