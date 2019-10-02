///////////////////////////////////////////////////////////////////////////
//
//	Application Program 42				STUDENT NAME:  <David Bernal>
//											  PERIOD:  <5th period>
//	** Class Design ~ Medical Diagnosis **
//
//      Write a program using HashSets to simulate a medical diagnosis.
//		Assume the following symptoms are coded as indicated.
//
//		Symptom	           Code
//		================== ====
//		headache			 1
//		fever				 2
//		sore throat			 3
//		cough				 4
//		sneeze				 5
//		stomach ache		 6
//		heart pain			 7
//		muscle pain			 8
//		nausea				 9
//		back pain			10
//		exhaustion			11
//		jaundice			12
//		high blood pressure	13
//
//
//		Each of the following diseases is characterized by the symptoms as
//		indicated in the chart below.
//
//		Disease				Symptoms
//		=================	==========
//		cold				1,2,3,4,5	4 5
//		flu					1,2,6,8,9	8 9
//		migraine			1,9			1 9
//		mononucleosis		2,3,11,12	11 12
//		ulcer				6,9			6 9 
//		arteriosclerosis	7,10,11,13	7 10
//		appendicitis		2,6			2 6
//
//
//		Your program should accept as input a person's name and symptoms(coded)
//		from a data file.  Your task is to provide a preliminary diagnosis.
//		Be sure to check for bad input data.
//
//		If there is more than one possible diagnosis for the input set of
//		symptoms, output all that are possible.  If there are 2 or more
//		possibilities, also output a message about needing further tests to
//		make a definitive diagnosis.
//
//		If there is no possible diagnosis, output a message to that effect.
//
//
//		SAMPLE DATA FILE INPUT:
//			Charlie Angel
//			1 2 3 4 5 6
//
//		VIEW:
//
//       +---------------------------------------------------------+
//       |     +-----------+ +-------------------------------+     |
//       |     | Get Data  | | Patient01.dat                 |     |
//       |     +-----------+ +-------------------------------+     |
//       |   Patient Name                                          |
//       | +-----------------------------------------------------+ |
//       | | Charlie Angel                                       | |
//       | +-----------------------------------------------------+ |
//       |   Symptoms                                              |
//       | +-----------------------------------------------------+ |
//       | | headache                                            | |
//       | | fever                                               | |
//       | | sore throat                                         | |
//       | | cough                                               | |
//       | | sneeze                                              | |
//       | | stomach ache                                        | |
//       | |                                                     | |
//       | |                                                     | |
//       | +-----------------------------------------------------+ |
//       |     +---------------------------------------------+     |
//       |     |                  Diagnose                   |     |
//       |     +---------------------------------------------+     |
//       |   Possible Illness                                      |
//       | +-----------------------------------------------------+ |
//       | | cold                                                | |
//       | | appendicitis                                        | |
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

package app;

import static java.lang.System.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class App42{
	public static void main(String[] args) {
		new MedicalDiagnosis();
}}

class MedicalDiagnosis extends JFrame
{
	JButton buttonOne, buttonTwo;
	JTextArea textArea2, textArea, textArea3, textArea4;
	String name;	
	JLabel patName, sym, poss;	
	
	ArrayList<Integer> symptoms = new ArrayList<Integer>();
	ArrayList<String> symptomsName = new ArrayList<String>();
	
	public MedicalDiagnosis()
	{
		
		setSize(500,700);
		setLocationRelativeTo(null);
	   	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  		setContentPane( new MyPanel() );
		setVisible(true);                            
	}                                   
	                               
	class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setLayout( null );
			setBackground(new Color(0,150,200));
			setFont(new Font(null,3,10));			
			
			patName  = new JLabel("Patient Name -->");
				patName.setSize( 100, 30 );
				patName.setLocation( 5, 75 );
			add( patName );
			
			sym  = new JLabel("Symptoms -->");
				sym.setSize( 100, 30 );
				sym.setLocation( 5, 125 );
			add( sym );
			
			poss  = new JLabel("Possible Illness-->");
				poss.setSize( 105, 25 );
				poss.setLocation( 5, 400 );
			add( poss );
			

			buttonOne = new JButton("");
				buttonOne.addActionListener( new ButtonOneAction() );
				buttonOne.setText( new String("Get Data") );				
				buttonOne.setFont( new Font(null,3,10) );				
				buttonOne.setForeground( new Color(0,0,255) );		
				buttonOne.setSize( 100, 25 );						
				buttonOne.setLocation( 5, 15 );
			add( buttonOne );
			
			buttonTwo = new JButton("");
				buttonTwo.addActionListener( new ButtonTwoAction() );
				buttonTwo.setText( new String("Diagnose") );				
				buttonTwo.setFont( new Font(null,3,14) );				
				buttonTwo.setForeground( new Color(0,0,255) );		
				buttonTwo.setSize( 350, 25 );						
				buttonTwo.setLocation( 110, 360 );
			add( buttonTwo );
			
			textArea  = new JTextArea();
				textArea.setText("Patient0");
				textArea.setSize( 350, 25 );
				textArea.setLocation( 110, 15 );
			add( textArea );
			
			textArea2  = new JTextArea();
				textArea2.setEditable(false);
				textArea2.setSize( 250, 25 );
				textArea2.setLocation( 110, 75 );
			add( textArea2 );
			
			textArea3  = new JTextArea();
				textArea3.setEditable(false);
				textArea3.setSize( 350, 225 );
				textArea3.setLocation( 110, 125 );
			add( textArea3 );
			
			textArea4  = new JTextArea();
				textArea4.setEditable(false);
				textArea4.setSize( 350, 200 );
				textArea4.setLocation( 110, 400 );
			add( textArea4 );
			
		}
	}
	
	public void process()
	{
		for(int x=0;x<symptoms.size();x++)
		{
			switch(symptoms.get(x)) 
			{
				case   1: symptomsName.add("headache");					break;
				case   2: symptomsName.add("fever"); 					break;
				case   3: symptomsName.add("sore throat"); 				break;
				case   4: symptomsName.add("cough"); 					break;
				case   5: symptomsName.add("sneeze"); 					break;
				case   6: symptomsName.add("stomach ache");				break;
				case   7: symptomsName.add("heart pain"); 				break;
				case   8: symptomsName.add("muscle pain"); 				break;
				case   9: symptomsName.add("nausea"); 					break;
				case  10: symptomsName.add("back pain"); 				break;
				case  11: symptomsName.add("exhaustion"); 				break;
				case  12: symptomsName.add("jaundice"); 				break;
				case  13: symptomsName.add("high blood pressure"); 		break; 
			}
		}
	}
	
	class ButtonOneAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			
			String let = textArea.getText();
			symptoms.clear();
			try
			{
				Scanner scan = new Scanner(new File( let + ".dat" ));
				
				name = scan.nextLine();
				while(scan.hasNext())
				{
					if(scan.hasNextInt())
					{
						symptoms.add(scan.nextInt());
					}
				}
			}
			catch(Exception e) 
			{
				out.println(e.getMessage());	
			}
			
			textArea2.setText(name);
			symptomsName.clear();
			process();
			String text = "";
			textArea3.setText(text);
			textArea4.setText(text);
			for(int x=0;x<symptomsName.size();x++)
			{
				text += symptomsName.get(x) + "\n";
			}	
			textArea3.setText(text );				
		}	
	}
	class ButtonTwoAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			textArea4.setText("");
			TreeSet<String> diagnostic = new TreeSet<String>();
			diagnostic.clear();
			
			if(symptoms.contains(1)  && symptoms.contains(2) && symptoms.contains(3)  && symptoms.contains(4) && symptoms.contains(5))
			{
				diagnostic.add("cold");
			}
			
			if( symptoms.contains(1) && symptoms.contains(2) && symptoms.contains(6) && symptoms.contains(8) && symptoms.contains(9)   )
			{
				diagnostic.add("flu");
			}
			if( symptoms.contains(1) && symptoms.contains(9)    )
			{
				diagnostic.add("migrane");
			}
			if( symptoms.contains(2) && symptoms.contains(3) && symptoms.contains(11) && symptoms.contains(12)   )
			{
				diagnostic.add("mononucleosis");
			}
			if( symptoms.contains(6) && symptoms.contains(9)    )
			{
				diagnostic.add("migrane");
			}
			if( symptoms.contains(7) && symptoms.contains(10) && symptoms.contains(11) && symptoms.contains(13)   )
			{
				diagnostic.add("arteriosclerosis");
			}
			if( symptoms.contains(2) && symptoms.contains(6)    )
			{
				diagnostic.add("appendicitis");
			}
			
			for(int x=0;x<diagnostic.toArray().length;x++)
			{
				textArea4.append(diagnostic.toArray()[x].toString());
				textArea4.append("\n");
			}
		}	
	}
	
	
	
	
}