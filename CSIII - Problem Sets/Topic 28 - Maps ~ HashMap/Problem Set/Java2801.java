///////////////////////////////////////////////////////////////////////////
//
// Java2801	Roman numeral converter
//
//


package lesson;

import static java.lang.System.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Java2801
{
	public static void main(String[] args) 
		{
		new Roman();
		}
}

class Roman 
{
	Map<Integer,String>myMap = new HashMap<Integer,String>();
	int romanNums;
	String result;
	
	public Roman()
	{
		
		myMap.put(1,"I");
		myMap.put(4,"IV");
		myMap.put(5,"V");
		myMap.put(9,"IX");
		myMap.put(10,"X");
		myMap.put(40,"XL");
		myMap.put(50,"L");
		myMap.put(90,"XC");
		myMap.put(100,"C");
		myMap.put(400,"CD");
		myMap.put(500,"D");
		myMap.put(900,"CM");
		myMap.put(1000,"M");
		while(!myMap.isEmpty())
		{
			romanNums = 0;
			result = "";
			Scanner scan = new Scanner(in);
			out.print("Please enter a number under 4,000 ====>");
			romanNums = Integer.valueOf(scan.nextLine());
			out.println(output(romanNums));
		}
		
	}
	
	public String output(int num)
	{	
		while(num > 0)
		{
			if(num >= 1000)
			{
				result += myMap.get(1000);
				num = num - 1000;
				output(num);
				break;
			}
			if(num >= 900)
			{
				result += myMap.get(900);
				num = num - 900;
				output(num);
				break;
			}
			if(num >= 500)
			{
				result += myMap.get(500);
				num = num - 500;
				output(num);
				break;
			}
			if(num >= 400)
			{
				result += myMap.get(400);
				num = num - 400;
				output(num);
				break;
			}
			if(num >= 100)
			{
				result += myMap.get(100);
				num = num - 100;
				output(num);
				break;
			}
			if(num >= 90)
			{
				result += myMap.get(90);
				num = num - 90;
				output(num);
				break;
			}
			if(num >= 50)
			{
				result += myMap.get(50);
				num = num - 50;
				output(num);
				break;
			}
			if(num >= 40)
			{
				result += myMap.get(40);
				num = num - 40;
				output(num);
				break;
			}
			if(num >= 10)
			{
				result += myMap.get(10);
				num = num - 10;
				output(num);
				break;
			}
			if(num >= 9)
			{
				result += myMap.get(9);
				num = num - 9;
				output(num);
				break;
			}
			if(num >= 5)
			{
				result += myMap.get(5);
				num = num - 5;
				output(num);
				break;
			}
			if(num >= 4)
			{
				result += myMap.get(4);
				num = num - 4;
				output(num);
				break;
			}
			if(num >= 1)
			{
				result += myMap.get(1);
				num = num - 1;
			}			
		}
		return result;
	}
	
	
	
}

















