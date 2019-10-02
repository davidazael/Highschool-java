///////////////////////////////////////////////////////////////////////////
//
// Java1609 When given two points on the cartesian plane, use the
//          distance formula to find the distance between the two
//          points.
//                                      _________________________
// PYTHAGOREAN THEOREM:   distance =  \/  (x2-x1)^2 + (y2-y1)^2
//
//
///////////////////////////////////////////////////////////////////////////
//
//      SAMPLE INPUT: Enter x1 => 3
//					  Enter y1 => -2
//					  Enter x2 => 7
//					  Enter y2 => 8
//
//     SAMPLE OUTPUT:  The distance between (3,-2) and (7,8)
//					   is 10.770329614269007 or about 11
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;

public class Java1609{
	public static void main(String[] args){
		new Problem();
}}

class Problem
{
	int x1,x2,y1,y2;
	double dis;

	Problem()
	{
		input();
		process();
		output();
	}

	void input()
	{
		Scanner scan = new Scanner(in);
		out.print("Enter x1 --> ");
		x1 = Integer.valueOf(scan.nextLine());

		out.print("Enter y1--> ");
		y1 = Integer.valueOf(scan.nextLine());

		out.print("Enter x2--> ");
		x2 = Integer.valueOf(scan.nextLine());

		out.print("Enter y2--> ");
		y2 = Integer.valueOf(scan.nextLine());
	}

	void process()
	{
		// PYTHAGOREAN THEOREM:   distance =  \/  (x2-x1)^2 + (y2-y1)^2
		
		dis = 	Math.sqrt( Math.pow((x2-x1),2) +  Math.pow((y2-y1),2) );
		
		

	}

	void output()
	{
		out.println("The distance between (" + x1 + ","+y1+") and (" +x2 + "," + y2 + ") \nis " + dis + " or about " + Math.round(dis)  + "."  );

	}
}
