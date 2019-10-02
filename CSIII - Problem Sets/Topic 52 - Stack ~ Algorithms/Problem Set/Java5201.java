///////////////////////////////////////////////////////////////////////////
//
// Java5201	Sometimes a program requires two stacks containing the
//			same type of items.
//
//			Write a program that implements a double stack.  We will call
//			the stacks upper and lower stack.
//
//		Solution Requirements
//			1)	Display the last items popped from both stacks.
//			2)	Display the the remaining contents of both stacks.
//
//			The data will be read from a file and consists of a
//			letter (U, L) that indicates the upper or the lower
//			stack.  If there is a number on the line (other than 0 or -1),
//			that value is to be pushed onto the appropriate stack.
//			If the number after the letter is a 0 then transfer the top
//			value from that stack to the other stack.  If the number
//			after the letter is -1, pop a value from that stack.
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA FILE -> Java5201.dat
/*
U 23
L -1
U 45
U -1
L 11
L 13
L 0
U 34
U 67
L 14
U 0
L 16
U 68
U 55
U -1
L -1
L 22
U 0
L 37
U 78
U 39
L -1
U 88
L 33
L -1
U -1
L -1
U 98
L -1
L -1
L -1
U 75
L 10
L 7
L -1
L 0
U -1
U -1
U -1
L 2
U -1
U -1
U -1
L 4
U -1
U -1
U 77
L 8
U 0
U 95

*/
//
///////////////////////////////////////////////////////////////////////////
import static java.lang.System.*;
import java.util.*;
import java.awt.*;
import java.io.*;
public class Java5201
{
	public static void main(String args[]) {
	new Model();
}}

class Model
{
	Stack<Integer> upper = new Stack<Integer>();
	Stack<Integer> lower = new Stack<Integer>();
	String check;
	int num, lastPoped,lastPoped1;
	public Model()
	{
		populate();	
	}
	public void populate()
	{
		try
		{
			Scanner scan = new Scanner(new File("Java5201.dat"));
				while(scan.hasNext())
				{
					check = scan.next();
					num = Integer.valueOf(scan.next());
					
					
					if(check.equalsIgnoreCase("U"))
					{
						//int num = Integer.valueOf(scan.next());
						
						if( num == 0 )	
						{
							lower.push(upper.peek());
						}	
							else
								if( num == -1 && !upper.isEmpty() )
								{
									lastPoped = upper.pop();
									
								}
								else
									if(num != -1 && num != 0)
									upper.push(num);
											
					}
					if(check.equalsIgnoreCase("L"))
					{
					//	int num = Integer.valueOf(scan.next());
						
						if( num == 0 )	
						{
							upper.push(lower.peek());
						}	
							else
								if( num == -1 && !lower.isEmpty() )
								{
									lastPoped1 = lower.pop();
									
								}
								else
									if(num != -1 && num != 0)
									lower.push(num);
					}
					
				}
				out.println(upper);
				out.println(lastPoped);
				out.println();
				out.println();
				out.println(lower);
				out.println(lastPoped1);
				out.println();
				out.println();
				
				
			
		}catch(Exception e){out.println(e);}
	}
}

