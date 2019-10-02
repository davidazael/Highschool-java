///////////////////////////////////////////////////////////////////////////
//
// Java3905	In the cattle industry ranchers are always trying to grow the
//			size of their herd.  In the spring the cow gives birth to
//			its offspring.  The calf is classified as a heifer or a bull.
//			However every cattleman knows you can only have one bull in
//			a herd.  So any calf classified as a bull gets neutered and
//			becomes a steer.  This process is also done to help fatten
//			and keep the meat tender.  A smart rancher will keep the
//			heifers and allow them to mature into cows and thus have
//			more cattle that can have offspring.  The steers on the other
//			hand are only good for eating.  So a smart rancher fattens
//			them over the summer and sells them in the fall.
//
//			Write a program that reads a file of a rancher's spring herd.
//			The number of head of cattle in the herd is unknown.  Complete
//			the steerCount method that is used to count the number of
//			steers in the herd.  Complete the cutting method which is
//			used to cut the steers from the herd.
//
//			Display the herd in the Spring.
//			Cut the herd.
//			Display the herd in the Fall.
//
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java3905a.dat
//		Also test with  ->	Java3905b.dat
//
//	SAMPLE OUTPUT:
//		Spring Herd:
//		[cow, cow, steer, heifer, cow, steer, heifer, cow, cow, steer, steer, bull, cow]
//
//		Fall Herd:
//		[cow, cow, heifer, cow, heifer, cow, cow, bull, cow]
//
//
///////////////////////////////////////////////////////////////////////////



import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java3905{
	public static void main (String[] args)	{
		new Environment();
}}


class Environment
{
	private String[] herd;
	ArrayList<String> bob = new ArrayList<String>();

	public Environment()
	{
		populate();
		run();
	}

	public void populate()
	{
		try
		{
			Scanner scanFile = new Scanner(new File("Java3905a.dat") );
			while( scanFile.hasNext() )
			{
				bob.add( scanFile.nextLine()  );
			}
			
			herd = new String[bob.size()];
			
			for (int i = 0; i < bob.size(); i++)
				{
					herd[i] = bob.get(i);
				}
		
		}catch(Exception e){}
	}

	public String[] cutting(String[] source)
	{
	//	herd = source;
		for (int i = 0; i < herd.length ; i++) 
			{
				if( !herd[i].equalsIgnoreCase("steer") )
					source[i] = herd[i];
	    	}
		
		return source;
	}

	public int steerCount(String[] source)
	{
	
		return 0;
	}

	public void run()
	{
		out.println();
		out.println("Spring Herd: ");
		out.println( Arrays.toString(herd));
		out.println();

		herd = cutting(herd);

		out.println();
		out.println("Fall Herd: ");
		out.println( Arrays.toString(herd));
		out.println();
		out.println();
	}
}


