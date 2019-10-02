///////////////////////////////////////////////////////////////////////////
//
// Java1701 The pirate speaks, "Write a program t' determine your pirate 
//          name based on the length o' your first name. You may use t'
//          names in t' chart below o' make up yer own. Arrrrgh!"
//
//              Length of 1st name           Pirate Name
//              ------------------           ------------------------
//                 1-3                       Captain Yellow O'Fish
//                 4-6						 Sharkbait Barnacle Legs
//                 7-9 	                     Scallywag O'Hornswaggle
//                 > 10						 Two Toes Chumbucket
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE INPUT:  
//		What be yer first name? --> Bob
//
//  SAMPLE OUTPUT:
//		Well, Bob, yer pirate name be Captain Yellow O'Fish!
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import java.util.*;

public class Java1701{
	public static void main(String[] args){
		new Pirate();
}}

class Pirate
{
	String name;
	String pirateName;

	public Pirate()
	{
		input();
		process();
		output();
	}
	
	public void input()
	{
		Scanner scan = new Scanner(in);
		out.print("What be yer first name? --> ");
		name = scan.nextLine();
	}
	
	public void process()
	{
		if(name.length()-1 <= 3)
		{
			pirateName = "Captain Yellow O'Fish";
		}	
		if(name.length()-1 <= 6)
		{
			pirateName = "Sharkbait Barnacle Legs";
		}	
		if(name.length()-1 <= 9)
		{
			pirateName = "Scallywag O'Hornswaggle";
		}		
		if(name.length()-1 > 10)
		{
			pirateName = "Two Toes Chumbucket";
		}	
			
	
				
	}

	public void output()
	{
		out.println();
		out.println("Well, " + name + ", yer pirate name be " + pirateName + "!");
		out.println();
	}
}
