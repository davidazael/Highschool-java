///////////////////////////////////////////////////////////////////////////
//
// Pro41401	While it is very possible to complete this problem using other 
//			data structures, the only data structures that you are allowed
//			to consider is HashMap.  For passing over the elements of the
//			data structure, consider only Iterator and for loop.
//
//			For this assignment, create an ADT that maintains a map of
//			state -> capital city pairing.  Create the map of 50 states 
//			in the constructor.  Write a program that display's the map
//			in two variation.  First us toString() to display the default
//			display.  Create a second, more user friendly display.
//					(eg, "MI" with capital "Lansing").
//
//			DATA:
//				"TX" -> "Austin"
//				"LA" -> "Baton Rouge"
//				"CA" -> "Sacramento"
//				"FA" -> "Talahasee"
//				"KY" -> "Louisville"
//				"AL" -> "Birmingham"
//				"OK" -> "Oklahoma City" 
//				"OH" -> "Columbus"
//				"ID" -> "Boise"
//				"NV" -> "Carson City"
//				"MI" -> "Jackson"
//				"WA" -> "Olympia"
//
//			The other capitals can be found at "http://www.50states.com"
//
//
//		 REQUIREMENT: Your program must use a HashMap data structure.
//
//			    VIEW:
//                                                                
//       +---------------------------------------------------------+ 
//       | +---------------------------------------------------+-+ | 
//       | | "MI" with capital "Lansing"                       |A| |
//       | | "TX" with capital "Austin"                        |:| |
//       | | "LA" with capital "Baton Rouge"                   |:| |
//       | | "CA" with capital "Sacramento"                    |:| |
//       | | "FA" with capital "Talahasee"                     |:| |
//       | | "KY" with capital "Louisville"                    |:| |
//       | | "AL" with capital "Birmingham"                    |:| |
//       | | "OK" with capital "Oklahoma City"                 |V| |
//       | +---------------------------------------------------+-+ |
//       |       +-----------------+     +-----------------+       | 
//       |       |     Default     |     |  User Friendly  |       | 
//       |       +-----------------+     +-----------------+       | 
//       +---------------------------------------------------------+ 
//                                                                
//
///////////////////////////////////////////////////////////////////////////
//
//
//

package problem01;

import static java.lang.System.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.util.ArrayList;

public class Pro41401
{
	public static void main(String[] args) 
		{
		new Model();
		}
}
class Model extends JFrame 
{
	HashMap capitals;
	String states, cities;
	int num = 0;
	TextArea rawOutput;
	JButton defaultButton, friendlyButton;

	
	public Model()	
	{
		setSize(450,225);
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new MyPanel() );
		setVisible(true);
		
		try
			{
			Scanner scan = new Scanner(new File("States"));
			
			capitals = new HashMap<String,String>();
				while(scan.hasNextLine())
				{
					states = scan.nextLine();
					cities = scan.nextLine();
					
					capitals.put(states,cities );
				}
			}
			catch(Exception e){}
	}
	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setLayout( new FlowLayout() );
			setBackground(new Color(150,0,0));

			rawOutput = new TextArea("",8,58,1);
				rawOutput.setEditable(false);
				rawOutput.setFocusable(false);
				add(rawOutput);
				
			defaultButton = new JButton("Default");
				defaultButton.addActionListener( new defaultButton() );
				defaultButton.setPreferredSize(new Dimension(200,25));
				add(defaultButton);

			friendlyButton = new JButton("User Friendly");
				friendlyButton.addActionListener( new friendlyButton() );
				friendlyButton.setPreferredSize(new Dimension(200,25));
				add(friendlyButton);	
			
		}
	}
	class defaultButton implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Iterator states1 = capitals.keySet().iterator();
			Iterator cities1 = capitals.values().iterator();
			
			while(states1.hasNext() && cities1.hasNext() )
			{
				rawOutput.append("\"" + states1.next() + "\" --> \"" + cities1.next() + "\" \n");
			}
									
		}	
	
	}	
	class friendlyButton implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Iterator states1 = capitals.keySet().iterator();
			Iterator cities1 = capitals.values().iterator();
			
			while(states1.hasNext() && cities1.hasNext() )
			{
				rawOutput.append("\"" + states1.next() + "\" with the capital of \"" + cities1.next()+ "\" \n" );
			}		
		}	
	
	}
			
		
}
	
	


