///////////////////////////////////////////////////////////////////////////
//
// Java0905 Write a graphics program that allows the user to enter the
//          following values using the proper data types. Do something
//          clever (and logical) with the input and display in graphics.
//
//      * DO NOT USE THE nextInt() or nextDouble() METHODS! *
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT: ENTER your name > Sandy
//				  ENTER your age > 15
//				  ENTER your gpa > 6.1
//				  ENTER the letter grade you want in this class > A
//
//  OUTPUT:
//    +---------------------------------------------------------------------+
//    |                                                                     |
//    |                                                                     |
//    |                                                                     |
//    |           Something clever and logical (not in the default font)    |
//    |           with the input data in graphics using good labels.        |
//    |                                                                     |
//    |                                                                     |
//    |                                                                     |
//    |                                                                     |
//    +---------------------------------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////

import static java.lang.System.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

class Java0905
{
	public static void main(String[] args)
	{
		new NeedInput();
	}
}


class NeedInput extends JFrame
{	
	String name;
	int age;
	double gpa;
	String letterGrade;
	

	public NeedInput()
	{
		setSize(800,600);

		setBackground(new Color(150,30,150));
		setLocationRelativeTo(null);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );

		input();
		
		setVisible(true);
	}

	public void input()
	{	
		Scanner scan = new Scanner(in);
		
		out.println("What is your name? ---------->");
		name = scan.nextLine();
		out.println("What is your age? ----------->");
		age = Integer.valueOf(scan.nextLine() );
		out.println("What is your GPA? ----------->");
		gpa = Double.valueOf(scan.nextLine() );
		out.println("What is your LetterGrade? --->");
		letterGrade = scan.nextLine();
		
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setFont( new Font(null,1, 25 ) );
			
			g.drawString(" " + name + " is an excelent student, " ,20,75);
			g.drawString("he is only " + age + " and his gpa throughout",20,100);
			g.drawString("of his college level classes is a "+ gpa + "",20,125);
			g.drawString("he gets all " +letterGrade +"'s.",20,150);
			

		}
	}
}

