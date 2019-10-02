///////////////////////////////////////////////////////////////////////////
//
// Pro4105
//
//  Write a program to place the data below into a linked list of user
//	created class.
//
//
//		data: Rockets 95
//            Jazz 112
//            Lakers 110
//            Trailblazers 115
//            Spurs 96
//            Timberwolves 88
//            Celtics 91
//            Nicks 99
//
//
///////////////////////////////////////////////////////////////////////////

package solution;

public class Pro4105{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	Node theList;

	public Model()
	{
		populate();
		display();
	}

	private void populate()
	{


	}

	public void display()
	{


	}
}


class Team
{
	String name;
	int score;

	public Team(String name, int score)
	{
		this.name = name;
		this.score = score;
	}

	public String toString()
	{
		return name + " " + score + "\n";
	}
}

