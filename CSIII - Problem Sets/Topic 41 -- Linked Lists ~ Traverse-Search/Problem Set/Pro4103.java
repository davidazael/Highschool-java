///////////////////////////////////////////////////////////////////////////
//
// Pro4103
//
//      Write a program that manually creates a linked list of
//		ip addresses.
//
//		Complete the count method.  The count method counts the
//		number of ip addresses in the list.
//
//
//			public int count()
//			{
//
//				return ??;
//			}
//
//
//		data: 192.168.0.1
//			  10.10.10.5
//			  172.68.15.101
//			  23.187.93.245
//			  10.0.5.8
//			  111.15.17.194
//			  67.153.193.251
//
//
///////////////////////////////////////////////////////////////////////////


package solution;


public class Pro4103{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node theList;
	int num;

	public Model()
	{
		populate();
		display();
	}
	
	private void populate()
	{
		theList = new Node("192.168.0.1",
				  new Node("10.10.10.5",
				  new Node("172.68.15.101",
				  new Node("23.187.93.245",
				  new Node("10.0.5.8",
				  new Node("111.15.17.194",
				  new Node("67.153.193.251",
				  null
		)))))));
		
	}
	
	public int count()
	{
	//	System.out.println ("Now counting " + num);
	//	System.out.println( theList.getNext().getValue() );
		num = 0;
		Node its = theList;
		while( its != null )
		{
			num++;
			its = its.getNext();
		}			
		System.out.println ("Now counting " + num);
		return num;
		
	}

	public void display()
	{
		output.setText("Data: \n");
		
		Node it = theList;
		while( it != null )
		{
			output.append( "" + it.getValue() + "\n" );
			it = it.getNext();
		}
		output.append( "\n\n" );
		
		output.append("The List contains " );
		output.append( count() + " IP's" );
	}
}

