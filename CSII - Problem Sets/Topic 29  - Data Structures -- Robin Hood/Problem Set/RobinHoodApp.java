//
//	Application Program  				STUDENT NAME: DAVID BERNAL
//											  PERIOD: 6
//	** ArrayList ~ Robin Hood **
//		total words = 110868
//   Place an X in the completed column as you work on the assignment.
//
//==============================================================================
//             PT       
// COMPLETED  VALUE      THE FOLLOWING ARE REQUIRED FOR A 70
// ---------  -----     ------------------------------------------------------
//		X	  ( 10 )	Fill in student name and period.
//		X	  ( 15 )	Read the file and print to the screen one word at a time.
//		X	  ( 10 )	Store the words in an ArrayList.
//	  	X	  ( 10 )	Count the number of words in the data file.				
//		X	  ( 10 )	How many times does "Men-At-Arms" appear in the file?
//		X	  ( 15 )	Write ALL the results to a data file.  (solution.dat)
//==============================================================================
//                       AFTER 70, CHOOSE FROM THE FOLLOWING FOR UP TO A 105
//                     --------------------------------------------------------
//		X	  (  5 )	What is the longest word in the file?
//		X	  ( 10 )	User input (GUI) # of times the word appears in the file
//			  (  5 )	How many vowels appear in the file?  (a,e,i,o,u)
//			  (  5 )	What is the average word length?
//			  (  5 )	What is the most occurring Word?
//			  (  5 )	Display solution in an appropriate GUI interface.
//			  (  5 )	Find the longest sentence in the file.
//			  (  5 )	Find the average sentence length in the file.
//==============================================================================
//  TOTAL POINTS COMPLETED: 
//==============================================================================
/*
 *		My Selfie: 
 *			 Robin Hood was not that hard for me well i didn't feel it was, everything except the word count and the most accouring word sounded 
 *			 pretty hard, some of this things i could see the logic in my head but i couldn't think about the code correctly, i quit on a few, but
 *			 maybe if i would have spent more time on it and with patients i could finished it all but i just got really busy through out the break 
 *			 so i could really do until like Sunday night of last night and i started the sentence one because i thought it was easy but it was more 
 *			 complicated than i thought. If this was my job and i would of worked on this all week like a real job, i would have finishde in the first
 *			 four days or so i believe, also through out this project i did used google, i learned about patters for useDelimiter() which i didn't 
 *			 understand at first but i did some research and i figured it out, also i had some problems with the voules because this story was very long
 *			 but if had like 1 more day i could defenetly get it right now, i relized i could of use the same code as men-at-arms but i was trying to use 
 *			 chars which was not the best idea because yes it was counting and getting the exact number but it was checking all 1 millions letters which 
 *			 took way to long. I think i deserver an 85, i could of done better but i didn't because i was busy also was kind of lazy took it as a joke 
 *			 at first but by ethe end of the week when i had time it was too late and it wasn't enough time to finish. IT WAS REALLY FUN!! p.s. i say we
 *			 do a lot more of this ones just because it is preppeing us for the future and it makes our minds think of every possible way! :D 
 *
 */

import static java.lang.System.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RobinHoodApp{
	public static void main(String[] args)	{
		new RobinHood();
	}
}

class RobinHood extends JFrame
{
	ArrayList<String> hood = new ArrayList<String>();
	String words, longest, longestWord, inputedWord;
	int count1=0, totalWords, high=0, longestINT, count2=0;
	int countA, countE, countI, countO, countU;
	
	
	public RobinHood()
	{
		populate();
			
		output();
				out.println();
		countMenAtArms();
				out.println();
		scrubber();
				out.println();
		run();				
				out.println();
		longestWord();
				out.println();
		numberOfTimesWordAppears();
				out.println();
	//	numberOfVowels();
	//			out.println();
	//	mostUsedWord(); 
	//			out.println();
	//	longestSentence();
	//			out.println();

	}

	void populate()
	{
		try 
			{
			Scanner scan = new Scanner(new File("RobinHood.txt"));
		//	scan.useDelimiter(".\"");
			while (scan.hasNext())
			{
			words = scan.next();
			hood.add(words);
			}
		//	out.println(hood.size());
			
		//	out.println(hood.get(12) );
						
			}catch (Exception ex) {}
	}

	void output()
	{
		
			
			
	}

	void countMenAtArms()
	{
		for (int i = 0; i < hood.size(); i++) 
			{
				String maa = hood.get(i);
				if(maa.contains("men-at-arms"))
					count1++;				
		    }
			out.println("The word Men-At-Arms is found " + count1 + " times in this story! :D");
	}

	void scrubber()			// counts I. inside the paragraphs, must fix.
	{
			int roma=0;
		for (int x = 0; x < hood.size(); x++)
			{ 
			
				String romanNums = hood.get(x);
				
				if( romanNums.equals("I.") 			||
					romanNums.equals("II.")			||
					romanNums.equals("III.")		||
					romanNums.equals("IV.")	        ||
					romanNums.equals("V.")			||	
					romanNums.equals("VI.")	        ||
					romanNums.equals("VII.")		||
					romanNums.equals("VIII.")	    ||
					romanNums.equals("IX.")			||
					romanNums.equals("X.")	        ||
					romanNums.equals("Xl.")	        ||
					romanNums.equals("XII.")	    ||
					romanNums.equals("XIII.")	    ||
					romanNums.equals("XIV.")	    ||
					romanNums.equals("XV.")	        ||
					romanNums.equals("XVI.")	    ||
					romanNums.equals("XVII.")		||
					romanNums.equals("XVIII.")	    ||
					romanNums.equals("XIX.")	    ||
					romanNums.equals("XX.")	        ||
					romanNums.equals("XXI.")		
				 )
				{
					roma++;
					hood.remove(x);
				}
			}
			out.println("Their is this many words in the story! -->" + hood.size());
	}	



	// many more methods will be needed!
	
	
	void run()
	{
		PrintStream outFile = null;
		try
			{
			 outFile = new PrintStream("solution.dat");		 
			}
			catch(Exception e){}
			outFile.println(hood.size());
			outFile.println(count1);
	}
	
	void longestWord()
	{
		
		for (int z = 0; z < hood.size()  ; z++) 
			{
			
				longest = hood.get(z);
				longestINT = longest.length();
					if( longest.length() > high )
						{
							high = longest.length();
							longestWord = longest;
							if( longestWord.endsWith(".\"") || longestWord.endsWith("!\"") || longestWord.endsWith("?\"") )
							{
								high = high - 2;
								longestWord = longestWord.substring(0, high-2);
								
							}
							else
								if(longestWord.endsWith(".") || longestWord.endsWith("\"") || longestWord.endsWith("!") || longestWord.endsWith("?") || longestWord.endsWith(";") || longestWord.endsWith(","))
								{
									high = high - 1;
									longestWord = longestWord.substring(0, high-1);
								}
						}		
				
	 		}
	 		out.println( longestWord + " Has a length of " + high );
	}
	
	void numberOfTimesWordAppears()
	{
		
		Scanner scan = new Scanner(in);
		out.print("Please Enter a word that you will like to find in this story: ");
		inputedWord = scan.nextLine();
		
		for (int v = 0; v < hood.size(); v++) 
			{
				String wordOfChoice = hood.get(v);
				if(wordOfChoice.contains(inputedWord))
					count2++;
															
			}
			if(count2 == 0)
			{
				out.println(inputedWord + " this word is not found in the story at all.");
			}
			else
				out.println(inputedWord + " is found this many times " + count2 + " in the story");
	}
	
	void numberOfVowels()
	{
		try
		{
			out.println();
			int z=0;
			Scanner scan = new Scanner(new File("RobinHood.txt"));
			char vowel = scan.next().charAt(z);
			while(scan.hasNextLine())
			{
				if( vowel == 'A' || vowel == 'a' )
					countA++;	
			}
			out.println("This many A's are found in the story-> " + countA);
		
			
			
			
		}catch(Exception e){out.println(e);}
		
		
		
		
	/*	
		
		for (int l = 0; l < hood.size(); l++) 
			{
				String vowels = hood.get(l);
				
				for( int a = 0; a < vowels.length(); a++ )
				{
					String subVowels = vowels.substring(a,a+1);
					if(vowels.equalsIgnoreCase("A"))
						countA++;
					if(vowels.equalsIgnoreCase("E"))
						countE++;
					if(vowels.equalsIgnoreCase("I"))
						countI++;
					if(vowels.equalsIgnoreCase("O"))
						countO++;
					if(vowels.equalsIgnoreCase("U"))
						countU++;
				}
						
			}
			int sum = countA + countE + countI + countO + countU;
			out.println("The total number of vowels in this story is " + sum);
			out.println("Their is this man A's >" + countA);
			out.println("Their is this man E's >" + countE);
			out.println("Their is this man I's >" + countI);
			out.println("Their is this man O's >" + countO);
			out.println("Their is this man U's >" + countU);
			
	*/
		
	}
	
	void mostUsedWord()
	{
		for (int i = 0; i < hood.size(); i++) 
			{
				for (int x = 0; x < hood.get(i).length(); x++) 
					{
						
					}
			}
		
	}
	
	void longestSentence()
	{
		try 
		{
			String longestSentance = "";
			String sentance = "";
			ArrayList<String> sentenceAL = new ArrayList<String>();
			Scanner scan = new Scanner(new File("RobinHood.txt")).useDelimiter("\\.|\\n|\\!|\\?");
			Scanner s = new Scanner(in);
			while (scan.hasNext())
			{
				sentance = scan.next();
				out.print(sentance);
				//sentenceAL.add(sentance);
				
			}
			
			for (int i = 0; i< sentenceAL.size(); i++) 
			{
				sentenceAL.get(i);
			}			
		}
		catch (Exception ex) 
		{
			
		}			
	}

}



