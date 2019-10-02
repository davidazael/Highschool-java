///////////////////////////////////////////////////////////////////////////
//   NOTE: 50 pts - all
// Java4001	Write a program to that defines a Contact class containing the
//          name, address, telephone number, and birthday.  Create a static
//          array by populating a list from the data file.
//
//			Print the contents of the array.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILE:
//		Test file -> 	Java4001a.dat   (Note: No 'b' data file this time)
//
//   SAMPLE DATA FILE:
//	 	15
//	 	Adam Baum
//	 	384 Frying Pan Alley
//	 	(281)-537-3325
//	 	5/24/1982
//	 	B.A. Ware
//	 	1945 Rotten Row
//	 	(713)-453-4345
//	 	3/3/1992
//	 	Bill Board
//	 	59 Nutter Street
//	 	(832)-972-4656
//	 	4/12/1973
//		  	<etc. for a total of 15 PersonalContacts>
//
//	 SAMPLE OUTPUT:
//		Adam Baum,384 Frying Pan Alley,(281)-537-3325,5/24/1982
//		B.A. Ware,1945 Rotten Row,(713)-453-4345,3/3/1992
//		Bill Board,59 Nutter Street,(832)-972-4656,4/12/1973
//          <etc for remaining contacts in array>
//
//	 	Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////





import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Java4001{
	public static void main(String[] args){
		new Environment();
}}


class Environment
{
	private AddressBook elements;

	public Environment()
	{
		elements = new AddressBook();

		run();
	}

	public void run()
	{
		out.println();
		out.println( elements );
		out.println();
	}
}


class AddressBook
{
	Contact[] book;

	public AddressBook()
	{
		populate();
	}

	private void populate()
	{
		try
		{
			Scanner scanFile = new Scanner(new File("Java4001a.dat") );
			int size = Integer.valueOf( scanFile.nextLine() );
		//	size = size * 4;
			book = new Contact[ size ];				
			
			for (int i = 0; i < size; i++) 
			{	
				String name = scanFile.nextLine();	
				String address = scanFile.nextLine();	
				String phone = scanFile.nextLine();	
				String birthday = scanFile.nextLine();		
				
				book[i] = new Contact(name,address,phone,birthday);
			}
			

		}
		catch(IOException e){}
	}

	public String toString()
	{
		// insert loop here
		String temp = "";
		
		for(Contact item: book)
			temp += item.toString() + "\n";			
	
		return temp;
	}
}


class Contact
{
	private String name;
	private String address;
	private String phoneNumber;
	private String birthday;

	public Contact(String n, String a, String p, String b)
	{
		name = n;
		address = a;
		phoneNumber = p;
		birthday = b;
		// complete this method		
	}

	public String toString()
	{
		// complete this method
		return name + " ," + address + " ," + phoneNumber + " ," + birthday ;
	}
}




