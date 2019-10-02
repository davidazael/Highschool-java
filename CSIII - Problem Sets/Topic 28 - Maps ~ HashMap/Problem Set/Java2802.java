///////////////////////////////////////////////////////////////////////////
//
// Java2802	Morse code converter
//
//

package lesson;

import static java.lang.System.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Java2802
{
	public static void main(String[]args)
	{
		new Morse();
	}
}

class Morse
{
	Map<Character, String>myMap = new HashMap<Character,String>();
	char phrase;
	
	
	public Morse()
	{
		myMap.put('a',"	. _");
		myMap.put('b',"	_ . . .");
		myMap.put('c',"	_ . _ .");
		myMap.put('d',"	_ . .");
		myMap.put('e',"	.");
		myMap.put('f',"	. . _ .");
		myMap.put('g',"	_ _ .");
		myMap.put('h',"	. . . .");
		myMap.put('i',"	. .");
		myMap.put('j',"	. _ _ _");
		myMap.put('k',"	_ . _");
		myMap.put('l',"	. _ . .");
		myMap.put('m',"	_ _");
		myMap.put('n',"	_ .");
		myMap.put('o',"	_ _ _");
		myMap.put('p',"	. _ _ .");
		myMap.put('q',"	_ _ . _");
		myMap.put('r',"	. _ .");
		myMap.put('s',"	. . .");
		myMap.put('t',"	_");
		myMap.put('u',"	. . _");
		myMap.put('v',"	. . . _");
		myMap.put('w',"	. _ _");
		myMap.put('x',"	_ . . _");
		myMap.put('y',"	_ . _ _");
		myMap.put('z',"	_ _ . .");
		
		while(!myMap.isEmpty())
		{
			Scanner scan = new Scanner(in);
			out.print("Enter a phrase");
			phrase = Character.valueOf(scan.nextLine().charAt(0));
			
		}
	}
	
	public String output()
	{
		for(char x = 'a'; x <= myMap.size() ; x++)
		{
			if( phrase = myMap.get(x) )
			{
				out.println(x + x);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}