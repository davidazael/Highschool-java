///////////////////////////////////////////////////////////////////////////
//
// Java5202 Write a program that implements dueling stacks.
//
//			With dueling stacks the pop and push commands require an
//			argument that identifies which stack to modify.  For this
//			program the stacks are identified as blue and silver.
//
//			There will be times where both stacks will need to pop
//			and/or push simultaneously.  Implement the deepop
//			(double pop) and the deepush (double push) commands.
//
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE DATA
//
/*

push silver Mississippi
push blue Sabine
deepush Potomac
push silver Kootenai
deepush Delaware
push silver Roanoke
pop silver
push blue Missouri
push silver Old Man
deepop
push blue Columbia
push blue Kuskokwim
deepush Arkansas
push blue Red
push silver Rio Grande
pop silver
deepop
deepop
push silver Chattahoochee
push blue Snake
deepush North Platte
push blue Wabash
push silver Cumberland
deepop
push silver Milka
pop blue
push silver Pecos
deepush Hudson
push silver Ohio
push blue Neches
pop silver
push silver Brazos
deepop
pop blue
push blue San Juan
deepush St. Lawrence
push blue Allegheny
push blue Allegheny
pop blue

*/
//
/////////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.io.*;
import java.awt.*;
import java.util.*;

public class Java5202
{
	public static void main(String args[]) {
		new Model();   	
    }
}
class Model
{
	Stack<String> silver = new Stack<String>();
	Stack<String> blue = new Stack<String>();
	String both, word, word2, word3;
	
		public Model()
		{
			try
			{
				Scanner scan = new Scanner(new File("statess.dat"));
				
				while(scan.hasNext())
				{
					word = scan.next();
			//		out.println(word);
					if( word.equalsIgnoreCase("deepush") )
					{
						word2 = scan.nextLine();
						silver.push( word2 );
						blue.push( word2 );
						out.println(word2);
					}
					if(word.equalsIgnoreCase("deepop"))
					{
						silver.pop();
						blue.pop();
					}
					if(word.equalsIgnoreCase("push")  )
					{
						word2 = scan.next();
						if(word2.equalsIgnoreCase("silver"))
						{
							word3 = scan.nextLine();
							silver.push(word3);	
						}
						if(word2.equalsIgnoreCase("blue"))
						{
							word3 = scan.nextLine();
							blue.push(word3);	
						}
										
					}
					if(word.equalsIgnoreCase("pop")  )
					{
						word2 = scan.next();
						if(word2.equalsIgnoreCase("silver"))
						{
							silver.pop();	
						}
						if(word2.equalsIgnoreCase("blue"))
						{
							blue.pop();	
						}
										
					}
				
					
				}
			}catch(Exception e){ out.println(e); }
			
			
			out.println(silver);
			out.println(blue);
			
		}
		
}