//
//	CS2 - Node                                   © 2012 - Tom Halbert
//
// 	   Thread:	Inserting a Node at the Front of a Linked List
//	Criterion:	Node Class
//	========================================================================
//
//

package solution;

public class Node											//	Node
{															//	Structure
	private Object value;									//		|
	private Node next;										//		|
															//		|
	public Node(){}											//		|
															//		|
	public Node(Object v, Node n)							//		|
	{														//		|
		value = v;											//		|
		next  = n;											//		|
	}														//		|
															//		|
	void setValue(Object v) { value = v;    }				//		|
	void setNext(Node n)    { next  = n;    }				//		|
															//		|
	Object getValue()       { return value; }				//		|
	Node   getNext()        { return next;  }				//		|
}															//		V
