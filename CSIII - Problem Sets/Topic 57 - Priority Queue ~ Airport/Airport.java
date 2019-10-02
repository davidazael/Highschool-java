
import static java.lang.System.*;
import java.util.*;
import java.awt.*;
import java.io.*;

class Airport
{
	public static void main(String args[]) {
    	new Model();
    }
}
class Model
{
	int maxSizeOfQueue = 5;
	int totalTime = 44;
	PriorityQueue<String> flyingPlanes = new PriorityQueue<String>();
	PriorityQueue<String> groundPlanes = new PriorityQueue<String>();
	ArrayList<String> list = new ArrayList<String>();
	String check;
	
	
	public Model()
	{
		populate();
		sendSignalLand();
		checking();
	}
	public void populate()
	{
		try {
				Scanner scan = new Scanner(new File("AIRPORT.DAT"));
				while(scan.hasNext())
					{
					String random = scan.next();
					list.add(random);
					}
			}
			catch (Exception ex) {}
	}
	public void checking()
	{
		try {
			Scanner scan = new Scanner(new File("AIRPORT.DAT"));
			
				while(scan.hasNextLine())
				{
					String time = scan.nextLine();
					if( time.equals("N000") )
					{
						sendSignalLand();
					}
					while (scan.hasNext())
					{
						String check = scan.next();
						out.println(check);
						if( check.startsWith("T") )
						{
							check = check.substring(1);
							overSizedQueue();
							groundPlanes.offer(check);
							
						}
						if( check.startsWith("L") )
						{
							check = check.substring(1);
							overSizedQueue();
							flyingPlanes.offer(check);
						}
					}
					
										
				}
			}catch (Exception ex) { out.println(ex); }	
	}
	public void sendSignalLand()
	{
		out.println("Flight " + flyingPlanes.peek() + " you are cleared to Land on runway one.");		
	}
	public void overSizedQueue()
	{
		if(flyingPlanes.size() == maxSizeOfQueue)
		{
			out.println("Flight " + flyingPlanes.peek() + " take a holding pattern and wait for landing instructions. ");
		}
		if(groundPlanes.size() == maxSizeOfQueue)
		{
			out.println("Flight "  + groundPlanes.peek() + " taxi to runway one and wait for further instruction. ");
		}
		
	}
}