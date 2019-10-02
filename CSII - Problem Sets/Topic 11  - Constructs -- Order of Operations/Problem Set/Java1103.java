///////////////////////////////////////////////////////////////////////////
//
// Java1103 Write a program to solve the following formula.  Allow the user
//			to enter the value for x.
//  
//			Here is the original problem:
//		        (8 - x2) (4 * 2 - 1)
//    		? = ----------------------
//          		(x - 9) 3x	
//
//			Calculate and display these answers:
//			 *real (formatted to 3 decimal places) String.format("%,.3f",)
//			 *quotient (integer division)
//			 *remainder (modulus)
//
///////////////////////////////////////////////////////////////////////////
//
// SAMPLE INPUT:
//		Enter value for x ==> 5
//
// SAMPLE OUTPUT (ON GRAPHICS SCREEN):
//
//		+----------------------------------------+
//		|                                        |
//  	|         Original Problem:			     |
//		|        (8 - 2x) (4 * 2 - 1)            |
//		|        --------------------            |
//		|             (x - 9) 3x                 |
//		|                                        |
//		|           Real answer ==> 0.233        |
//		|              Quotient ==> 0            |     
//		|            Remainder ==> -14           |
//		|                                        |
//		+----------------------------------------+      
//
//
///////////////////////////////////////////////////////////////////////////	 

import static java.lang.System.*; 
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Java1103
{
	public static void main(String[] args)
	{
		new Problem04();
   	}
}

class Problem04 extends JFrame 
{
	int     	   x;	
	double	 realNum;
 	int     quotient;
 	int    remainder;
	
	Problem04()
	{
		setSize(500,500);
		setBackground(Color.white);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new PaintingPanel());
		
		input();
		process();		
				
	}
	
	void input()
	{
		// Scanner and input here
		Scanner scan = new Scanner(in);
		
		out.print("Enter value for x --> ");
		x = Integer.valueOf(scan.nextLine());
		
		setVisible(true);
				
	}

	void process()
	{
		realNum   = ((8 - 2*(double)x)*(4 * 2 - 1))/(((double)x - 9)* 3*(double)x);
  		quotient  = ((8 - 2*x)*(4 * 2 - 1))/((x - 9)* 3*x);
  		remainder = ((8 - 2*x)*(4 * 2 - 1))%((x - 9)* 3*x);
  		
  	
	}
	

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			Font monoFont = new Font("Courier",Font.BOLD,20);
			g.setFont(monoFont);
  			g.drawString("   Original Problem:",100,75);
  			g.drawString("(8 - 2x) (4 * 2 - 1)",100,110);
		
			// use drawLine() method for line between numerator and denominator
			g.drawLine(95,140,350,140);
		
			g.drawString("     (x - 9) 3x",100,175);
			
			g.drawString("Real answer ==> " + String.format("%,.3f",realNum) + "",100,200);
			g.drawString("Quotient ==> " + quotient + "",100,250 );
			g.drawString("Remainder ==>" + remainder + "",100,300 );
		
			
		}

	}
	
	
	
}



