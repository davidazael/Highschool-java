///////////////////////////////////////////////////////////////////////////
//
// Java3301	Create a class that represents a sheep.  This class should
//			contain a DNA strand, weight and age field.
//
//			String dna;
//			Double weight;
//			Integer age;
//
//			This program will be used in research as scientists study
//			animal growth.  Make the sheep class cloneable by
//			overriding the clone method.  This way we can clone our
//			sheep.  Do NOT override the toString method.  Create
//			a display method that reports the data.
//
//			Write an environment class that creates an original sheep
//			and then clones 4 more sheep from the first.  They will
//			have the exact dna strand, weight and age as the parent.
//
//			Simulate the growth of the 5 sheep by modifying the weight
//			field of each sheep.  Display a nice text report on the
//			growth and development of your sheep.
//
///////////////////////////////////////////////////////////////////////////
//
//	SAMPLE WEIGHT CHANGES:  42 48 41 53 46
//
//	SAMPLE OUTPUT:
//			Sheep 1
//			sheep@14ef7fb
//			[TACGCGGTAACGGTATGTTCGACC, 42, 1]
//
//			Sheep 2
//			sheep@3c29b6a
//			[TACGCGGTAACGGTATGTTCGACC, 48, 1]
//
//			Sheep 3
//			sheep@2cba6d3
//			[TACGCGGTAACGGTATGTTCGACC, 41, 1]
//
//			Sheep 4
//			sheep@81acf32
//			[TACGCGGTAACGGTATGTTCGACC, 53, 1]
//
//			Sheep 5
//			sheep@a137cc8
//			[TACGCGGTAACGGTATGTTCGACC, 46, 1]
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;

public class Java3301{
	public static void main(String args[]){
		new Solution();
}}


class Solution
{
	Solution()
	{
		run();
	}

	public void run()
	{
	  Sheep sheepOne   = new Sheep("TACGCGGTAACGGTATGTTCGACC",42,1);
	  Sheep sheepTwo   = (Sheep)sheepOne.clone();
	  Sheep sheepThree = (Sheep)sheepOne.clone();
	  Sheep sheepFour  = (Sheep)sheepOne.clone();
	  Sheep sheepFive  = (Sheep)sheepOne.clone();

	  out.println("Sheep 1");
	  out.println(sheepOne);
	  out.println(sheepOne.showData());
	  out.println();

	  // activate modifier method here to change weight of cloned sheep
	  out.println("Sheep 2");
	  out.println(sheepTwo);
	  sheepTwo.setWeight(48);
	  out.println(sheepTwo.showData());
	  out.println();

	  // continue with each cloned sheep, modifying weights
	  out.println("Sheep 3");
	  out.println(sheepThree);
	  sheepThree.setWeight(41);
	  out.println(sheepThree.showData());
	  out.println();
	  
	  out.println("Sheep 4");
	  out.println(sheepFour);
	  sheepFour.setWeight(53);
	  out.println(sheepFour.showData());
	  out.println();
	  
	  out.println("Sheep 5");
	  out.println(sheepFive);
	  sheepFive.setWeight(53);
	  out.println(sheepFive.showData());
	  out.println();
	}
}


class Sheep
{
	String dna;
	Integer weight;
	Integer age;

	//  overloaded constructor
	public Sheep(String a,Integer b, Integer c)
	{
	dna 	= a;
	weight 	= b;
	age 	= c;
	}

	//	Override clone() method
	public Object clone()
	{
		Sheep copy = new Sheep(dna,weight,age);
		return copy;
	}

	//	setWeight modifier method
	public void setWeight(Integer w)
	{
		weight = w;
	}

	//	showData accessor method (NOT toString())
	public String showData()
	{
		return "{" + dna + ", " + weight + ", " + age + "]";
	}
}



