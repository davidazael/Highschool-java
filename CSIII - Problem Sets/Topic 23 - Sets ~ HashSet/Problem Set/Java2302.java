///////////////////////////////////////////////////////////////////////////
//
// Java2302 A survey of people was taken to see which of the following
//			toppings each person likes on their hamburgers.  Each person
//			picked 3 favorite toppings.  Use the following code list:
//
//						cheese     1
//						ketchup    2
//						mustard    3
//						onions     4
//						pickles    5
//						tomatoes   6
//						lettuce    7
//
//		You will need an ArrayList for the customers.
//
//		Each customer will have a String name and a Hashset for their
//		favorite toppings.
//
//		Create the following set comparisions and report the names of
//		the people who fit each category:
//
//			DID NOT CHOOSE KETCHUP:
//			LIKE BOTH ONIONS AND TOMATOES:
//			LIKE CHEESE:
//			LIKE PICKLES OR MUSTARD:
//			CHOOSE LETTUCE:
//
//
//		SAMPLE DATA FILE INPUT:
//			Charlie Chaplin
//			cheese
//			ketchup
//			mustard
//			Marvin K. Mooney
//			lettuce
//			tomatoes
//			pickles
//			Mickey Mantle
//			ketchup
//			onions
//			tomatoes
//			George Foreman
//			onions
//			pickles
//			tomatoes
//			Forrest Gump
//			mustard
//			pickles
//			lettuce
//
//		SAMPLE OUTPUT:
//
//		THE FOLLOWING DID NOT CHOOSE KETCHUP:
//			Marvin K. Mooney
//			George Foreman
//			Forrest Gump
//
//		THE FOLLOWING LIKE BOTH ONIONS AND TOMATOES:
//			Mickey Mantle
//			George Foreman
//
//		THE FOLLOWING LIKE CHEESE:
//			Charlie Chaplin
//
//		THE FOLLOWING LIKE PICKLES OR MUSTARD:
//			Charlie Chaplin
//			Marvin K. Mooney
//			George Foreman
//			Forrest Gump
//
//		THE FOLLOWING CHOOSE LETTUCE:
//			Marvin K. Mooney
//			Forrest Gump
//
//
//		 REQUIREMENT: Your program must use a Hashset data structure.
//
//
//			    VIEW:
//
//       +---------------------------------------------------------+
//       | +-----------+ +------------------------------+          |
//       | | Get Data  | | Pro2302a.dat                 |          |
//       | +-----------+ +------------------------------+          |
//       |     +---------------------------------------------+     |
//       |     |           Did not choose ketchup            |     |
//       |     +---------------------------------------------+     |
//       |     +---------------------------------------------+     |
//       |     |        Like both onions and tomatoes        |     |
//       |     +---------------------------------------------+     |
//       |     +---------------------------------------------+     |
//       |     |                 Like cheese                 |     |
//       |     +---------------------------------------------+     |
//       |     +---------------------------------------------+     |
//       |     |           Like pickles or mustard           |     |
//       |     +---------------------------------------------+     |
//       |     +---------------------------------------------+     |
//       |     |               Choose lettuce                |     |
//       |     +---------------------------------------------+     |
//       |   Report                                                |
//       | +-----------------------------------------------------+ |
//       | | THE FOLLOWING DID NOT CHOOSE KETCHUP:               | |
//       | | Marvin K. Mooney                                    | |
//       | | George Foreman                                      | |
//       | | Forrest Gump                                        | |
//       | |                                                     | |
//       | |                                                     | |
//       | |                                                     | |
//       | +-----------------------------------------------------+ |
//       +---------------------------------------------------------+
//
//
///////////////////////////////////////////////////////////////////////////
//
//
//

import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Java2302 
{
	public static void main(String[] args)
	{
		new Model();
	}
}
class Model  extends JFrame
{
	TextArea  textArea;
	JButton   buttonOne,buttonTwo,buttonThree,buttonFour, buttonFive;
	
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<String> toppings = new ArrayList<String>();
	
	public Model()
	{
		
		setSize(500,700);
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new MyPanel() );
		setVisible(true);

		 try
		 {
		 	Scanner scan = new Scanner ( new File("Pro2302a.dat"));
		 	
		 	while(scan.hasNext())
		 	{
		 			String	temp = scan.nextLine();
		 			String	top1 = scan.nextLine();
		 			String	top2 = scan.nextLine();
		 			String	top3 = scan.nextLine();
		 			
		 			out.println( temp );
		 			out.println( top1 );
		 			out.println( top2 );
		 			out.println( top3 + "\n");
		 	}
		 }
		 catch(Exception e ){}
	}
		
		
class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setLayout( null );
			//setBackground(new Color(0,75,250));

			buttonOne = new JButton("");
				buttonOne.addActionListener( new ButtonOneAction() );
				buttonOne.setText( new String("Did not choose ketchup") );				
				buttonOne.setFont( new Font(null,3,18) );				
				buttonOne.setForeground( new Color(0,0,255) );		
				buttonOne.setSize( 300, 25 );						
				buttonOne.setLocation( 50, 50 );
			add( buttonOne );
			
			buttonTwo = new JButton("");
				buttonTwo.addActionListener( new ButtonTwoAction() );
				buttonTwo.setText( new String("Like both onions and tomatoes") );				
				buttonTwo.setFont( new Font(null,3,18) );				
				buttonTwo.setForeground( new Color(0,0,255) );		
				buttonTwo.setSize( 300, 25 );						
				buttonTwo.setLocation( 50, 100 );
			add( buttonTwo );
			
			buttonThree = new JButton("");
				buttonThree.addActionListener( new ButtonThreeAction() );
				buttonThree.setText( new String("Like cheese") );				
				buttonThree.setFont( new Font(null,3,18) );				
				buttonThree.setForeground( new Color(0,0,255) );		
				buttonThree.setSize( 300, 25 );						
				buttonThree.setLocation( 50, 150 );
			add( buttonThree );
			
			buttonFour = new JButton("");
				buttonFour.addActionListener( new ButtonFourAction() );
				buttonFour.setText( new String("Like pickles or mustard") );				
				buttonFour.setFont( new Font(null,3,18) );				
				buttonFour.setForeground( new Color(0,0,255) );		
				buttonFour.setSize( 300, 25 );						
				buttonFour.setLocation( 50, 200 );
			add( buttonFour );
			
			
			
			buttonFive = new JButton("");
				buttonFive.addActionListener( new ButtonFiveAction() );
				buttonFive.setText( new String("Choose lettuce") );				
				buttonFive.setFont( new Font(null,3,18) );				
				buttonFive.setForeground( new Color(0,0,255) );		
				buttonFive.setSize( 300, 25 );						
				buttonFive.setLocation( 50, 250 );
			add( buttonFive );

			textArea  = new TextArea();
				textArea.setFocusable(false);
				textArea.setSize( 425, 275 );
				textArea.setLocation( 25, 350 );
			add( textArea );
			
		}
	}
	
class ButtonOneAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			textArea.setText("");
				textArea.append("The following did not choose ketchup as a topping: \n");
			try
			{
		 	 Scanner scan = new Scanner ( new File("Pro2302a.dat"));
		 	
			 while(scan.hasNext())
			 	{
				 	String	temp = scan.nextLine();
				 	String	top1 = scan.nextLine();
				 	String	top2 = scan.nextLine();
				 	String	top3 = scan.nextLine();
									
					if( !(top1.contains("ketchup") || top2.contains("ketchup") || top3.contains("ketchup") ) )
			 			{
			 			
			 				textArea.append( temp + " \n" );
			 			}
				}
			
			 } 
			 catch(Exception e){} 
			 	
			 
		}	
		
	}

class ButtonTwoAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			textArea.setText("");
			textArea.append("The following like both onions and tomatoes as toppings: \n");
			try
			{
		 	 Scanner scan = new Scanner ( new File("Pro2302a.dat"));
		 	
			 while(scan.hasNext())
			 	{
				 	String	temp = scan.nextLine();
				 	String	top1 = scan.nextLine();
				 	String	top2 = scan.nextLine();
				 	String	top3 = scan.nextLine();
									
					if( top1.contains("onions") || top1.contains("tomatoes") && top2.contains("onions") || top2.contains("tomatoes") && top3.contains("onions") || top3.contains("tomatoes") )
			 			{
			 				
			 				textArea.append( temp + " \n" );
			 				
			 			}
				}
			
			 } 
			 catch(Exception e){} 
		}
	}
	
class ButtonThreeAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			textArea.setText("");
			textArea.setText("The following like cheese as a topping: \n");
						
			try
			{
		 	 Scanner scan = new Scanner ( new File("Pro2302a.dat"));
		 	
			 while(scan.hasNext())
			 	{
				 	String	temp = scan.nextLine();
				 	String	top1 = scan.nextLine();
				 	String	top2 = scan.nextLine();
				 	String	top3 = scan.nextLine();
									
					if( top1.contains("cheese") || top2.contains("cheese") || top3.contains("cheese") )
		 			{
		 				textArea.append(temp + " \n");
		 			}
				}
			
			 } 
			 catch(Exception e){} 
		}
	}

class ButtonFourAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			textArea.setText("");
			textArea.setText("The following like pickles and mustard as a toppings: \n");
	
			try
			{
		 	 Scanner scan = new Scanner ( new File("Pro2302a.dat"));
		 	
			 while(scan.hasNext())
			 	{
				 	String	temp = scan.nextLine();
				 	String	top1 = scan.nextLine();
				 	String	top2 = scan.nextLine();
				 	String	top3 = scan.nextLine();
									
					if( top1.contains("pickles") || top1.contains("mustard") || top2.contains("pickles") || top2.contains("mustard") || top3.contains("pickles") || top3.contains("mustard") )
		 			{
		 				textArea.append(temp + " \n");
		 			}
				}
			
			 } 
			 catch(Exception e){} 
			
		}
	}
	
class ButtonFiveAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			textArea.setText("");
			textArea.setText("The following choosed lettuce as a topping: \n");
	
			try
			{
		 	 Scanner scan = new Scanner ( new File("Pro2302a.dat"));
		 	
			 while(scan.hasNext())
			 	{
				 	String	temp = scan.nextLine();
				 	String	top1 = scan.nextLine();
				 	String	top2 = scan.nextLine();
				 	String	top3 = scan.nextLine();
									
					if( top1.contains("lettuce") || top2.contains("lettuce") || top3.contains("lettuce") )
		 			{
		 				textArea.append(temp + " \n");
		 			}
				}
			
			 } 
			 catch(Exception e){} 
		}
	}
	
	
	













}