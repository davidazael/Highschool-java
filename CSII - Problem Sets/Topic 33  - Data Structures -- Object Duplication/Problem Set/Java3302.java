///////////////////////////////////////////////////////////////////////////
//
// Java3302	Simulate a computer manufacturing assembly line.
//			Create a computer prototype class.  This class defines
//			the fundamental components that go into all computers.
//
//			String  cpu;
//			Integer memory;		// in gigabytes
//			Double  storage;  	// in gigabytes
//			Double  speed;		// in megahurtz
//			String  options;
//
//			On an assembly line the same computer setup is ceated
//			over and over and over.  Once the basic unit is built
//			special option and features can be added.  Create a
//			copy constructor that facilitates replicating the prototype
//			computer on the assembly line. DO NOT OVERRIDE THE CLONE
//          METHOD.
//
//			Write an environment class that instantiates a protoptype
//			object and then creates five basic computers using the
//			copy constructor of the prototype.  Once the five base
//			computers have been manufactured, add the options desired
//			by the individual customers.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:   Blue Ray Burner
//					none
//					Wireless NIC
//					Advanced Graphics Card
//					OS Upgrade
//
//	SAMPLE OUTPUT:
//			Generic Prototype
//			computer@14ef7fb
//			[Intel i5, 8, 452.8, 1.22, null]
//
//			Clone 1
//			computer@273fa31
//			[Intel i5, 8, 452.8, 1.22, Blue Ray Burner]
//
//			Clone 2
//			computer@9a162b2
//			[Intel i5, 8, 452.8, 1.22, none]
//
//			Clone 3
//			computer@31953fa
//			[Intel i5, 8, 452.8, 1.22, Wireless NIC]
//
//			Clone 4
//			computer@eba314c
//			[Intel i5, 8, 452.8, 1.22, Advanced Graphics Card]
//
//			Clone 5
//			computer@152b3cf
//			[Intel i5, 8, 452.8, 1.22, OS Upgrade]
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;


public class Java3302{
	public static void main(String args[]){
		new Solution();
}}


class Solution
{
	Solution()
	{
		run();
	}

	public void run()
	{
		// instantiate original object using overloaded constructor
		Computer proto = new Computer("Intel i5", 8, 452.8, 1.22, null);
		Computer clone1 = new Computer(proto);
		Computer clone2 = new Computer(proto);
		Computer clone3 = new Computer(proto);
		Computer clone4 = new Computer(proto);
		Computer clone5 = new Computer(proto);
		

		// make 5 clones of the original
		
		out.println("Generic Prototype");
	    out.println( proto /* original object */);
	    out.println( proto.showData() /* activate showData */);
	    out.println();

	    // modify options for each clone and display
	    
	    out.println("Clone1");
	    out.println( clone1 );
	    clone1.setOptions("Blue Ray Burner");
	    out.println( clone1.showData() );
	    out.println();
	    
	    out.println("Clone2");
	    out.println( clone2 );
	    clone2.setOptions("none");
	    out.println( clone2.showData() );
	    out.println();
	    
	    out.println("Clone3");
	    out.println( clone3 );
	    clone3.setOptions("Wireless NIC");
	    out.println( clone3.showData() );
	    out.println();
	    
	    out.println("Clone4");
	    out.println( clone4 );
	    clone4.setOptions("Advanced Graphics Card");
	    out.println( clone4.showData() );
	    out.println();
	    
	    out.println("Clone5");
	    out.println( clone5 );
	    clone5.setOptions("OS Upgrade");
	    out.println( clone5.showData() );
	    out.println();


	}
}

class Computer
{
	String  cpu;
	Integer memory;		// in gigabytes
	Double  storage;  	// in gigabytes
	Double  speed;		// in megahurtz
	String  options;

	public Computer(Computer proto)				// Copy Constructor
	{
		this.cpu		= proto.cpu;
		this.memory		= proto.memory;
		this.storage	= proto.storage;
		this.speed		= proto.speed;
		this.options	= proto.options;
		
	}

	//  overloaded constructor
	public Computer(String c, Integer m, Double st, Double sp, String o)
	{
		cpu			=	c;
		memory		=	m;
		storage		=	st;
		speed		=	sp;
	    options		=	o;
	}

	//	setOptions modifier method
	public void setOptions(String o)
	{
		options		=	o;
	}

	//	showData accessor method
	public String showData()
	{
		return "{" + cpu + ", " + memory + ", " + storage + ", " + speed + ", " + options + "]";
		
	}
}
