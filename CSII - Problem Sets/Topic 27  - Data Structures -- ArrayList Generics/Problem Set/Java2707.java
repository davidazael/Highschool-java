///////////////////////////////////////////////////////////////////////////
//
// Java2707 Write a program that creates a parameterized list of an unknown
//          amount of Fonts. Here is an example of the data:
//
//           Arial,0,12,Elephant,1,48,Impact,3,24,Algerian,0,24,
//
//			All data will be on one line, so set your fileScan delimiter to
//          use a comma. Each time you read in the 3 arguments needed for a
//          Font, use the arguments to create a new Font and add the Font
//          to your ArrayList.
//
//          The user should enter any word or phrase. On a graphics window,
//          use a for loop to display the input in each Font in the ArrayList
//          using a random color. No Font size will be larger than 48.
//
//		 REQUIREMENT:
//			Your program must use a parameterized ArrayList of Font.
//
//        DATA FILE: "FontNames.dat"
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class Java2707{
	public static void main(String[] args){
		new Solution();
}}

class Solution extends JFrame
{
	
	public Solution()
	{
		input();
		populate();

		setSize(1024,768);
		setLocationRelativeTo(null);
		setBackground(Color.BLACK);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new PaintingPanel() );
		setVisible(true);

	}

	void input()
	{
	
	}

	void populate()
	{
		
	}

	class PaintingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			
		}
	}

}




