///////////////////////////////////////////////////////////////////////////
//   NOTE: 50 pts - all
// Java4004 Write a program to read information on a baseball team from
//			a data file into a data structure.  Display the information
//			in a friendly GUI window
//
//					+----------------------------+
//					| Game                       |
//					+============================+
//					| String visitingTeam        |
//					| String visitingCity        |
//					| int[] visitorRunsPerInning |
//					| String homeTeam            |
//					| String homeCity            |
//					| int[] homeRunsPerInning    |
//					+----------------------------+
//					|                            |
//					| int getVisitorScore()      |
//					| int getHomeScore()         |
//					| String getWinningTeam()    |
//					| String getWinningScore()   |
//					| String getLosingTeam()     |
//					| String getLosingScore()    |
//					|                            |
//					+----------------------------+
//
//			In the game class the constructor is completed for you.
//			All accessor methods are provided.  This program requires
//			the algorithms for the methods that are listed.
//
//
//					+----------------------------+
//					| Season                     |
//					+============================+
//					| Game[] schedule            |
//					| int current                |
//					+----------------------------+
//					|                            |
//					| Game getCurrent()          |
//					| void previous()            |
//					| void next()                |
//					| double averageRuns())      |
//					| String[] allWinners()      |
//					| int topTeamScore()         |
//					| int getBestSingleInning    |
//					|                            |
//					+----------------------------+
//
//			Program the accessor method getCurrent() and the
//			modifier methods previous() and next().
//
//			The run method should produce a report using the
//			remaining methods.
//
//		1.	the average number of runs per team, per game.
//		2.  an array of all the winning team names.
//		3.  the highest winning score of any game.
//		4.  the team with the most runs scored in a single inning.
//
///////////////////////////////////////////////////////////////////////////
//
//	 DATA FILES:
//		First test file -> 	Java4004a.dat
//
//
//   SAMPLE DATA FILE:
//	 	Colorado
//	 	Rockies
//	 	0 1 0 1 1 1 0 0 0
//	 	Houston
//	 	Astros
//	 	0 0 2 4 0 1 0 1 3
//
//	 VIEW:
//          +----------------------------------------------+
//          |               MLB Game Report                |
//          +----------------------------------------------+
//          |                Visiting Team                 |
//          | +-------------------+  +-------------------+ |
//          | | Colorado          |  | Rockies           | |
//          | +-------------------+  +-------------------+ |
//          | +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ |
//          | | 0| | 1| | 0| | 1| | 1| | 1| | 0| | 0| | 0| |
//          | +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ |
//          |   1    2    3    4    5    6    7    8    9  |
//          |                              +---------+     |
//          |                        Score |    4    |     |
//          |                              +---------+     |
//          +----------------------------------------------+
//          |                  Home Team                   |
//          | +-------------------+  +-------------------+ |
//          | | Houston           |  | Astros            | |
//          | +-------------------+  +-------------------+ |
//          | +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ |
//          | | 0| | 0| | 2| | 4| | 0| | 1| | 0| | 1| | 3| |
//          | +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ +--+ |
//          |   1    2    3    4    5    6    7    8    9  |
//          |                              +---------+     |
//          |                        Score |   11    |     |
//          |                              +---------+     |
//          +----------------------------------------------+
//          |           +-------------------+ +---------+  |
//          |   Winner  | Astros            | |   11    |  |
//          |           +-------------------+ +---------+  |
//          |           +-------------------+ +---------+  |
//          |   Loser   | Rockies           | |    4    |  |
//          |           +-------------------+ +---------+  |
//          +----------------------------------------------+
//          |    +---------------+    +---------------+    |
//          |    |   Previous    |    |     Next      |    |
//          |    +---------------+    +---------------+    |
//          +----------------------------------------------+
//
//	 SAMPLE OUTPUT:
//
//		The average number of runs is 5.56
//
//		The list of the winning teams is
//		[Astros, Baves, Yankees, Blue Jays, Rays, Astros, Giants, Athletics, Rockies]
//
//		The highest winning team score is
//		16
//
//		The team with the most runs scored in a single inning is
//		9
//
//		Press any key to continue...
//
///////////////////////////////////////////////////////////////////////////


import static java.lang.System.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Java4004{
	public static void main(String[] args){
		new Environment();
}}


class Environment extends View
{
	private Season league;

	public Environment()
	{
		league = new Season();

		displayElement( league.getCurrent() );

		run();
	}

	public void previousAction()
	{
		league.previous();

		displayElement( league.getCurrent() );
	}

	public void nextAction()
	{
		league.next();

		displayElement( league.getCurrent() );
	}

	private void displayElement(Game data)
	{
		visitorCityOutput.setText  	    ( "" + data.getVisitingTeamCity()        );
		visitorNameOutput.setText  	    ( "" + data.getVisitingTeamName()        );
		for(int x=0;x<data.getVisitorRunsPerInning().length;x++)
			visitorRunsOutput[x].setText( "" + data.getVisitorRunsPerInning()[x] );
		visitorScoreOutput.setText      ( "" + data.getVisitorScore()            );

		homeCityOutput.setText  	    ( "" + data.getHomeTeamCity()            );
		homeNameOutput.setText   	    ( "" + data.getHomeTeamName()            );
		for(int x=0;x<data.getHomeRunsPerInning().length;x++)
			homeRunsOutput[x].setText   ( "" + data.getHomeRunsPerInning()[x] );
		homeScoreOutput.setText         ( "" + data.getHomeScore()               );

		winningTeamOutput.setText       ( "" + data.getWinningTeam()             );
		winningTeamScoreOutput.setText  ( "" + data.getWinningScore()            );
		losingTeamOutput.setText        ( "" + data.getLosingTeam()              );
		losingTeamScoreOutput.setText   ( "" + data.getLosingScore()             );
	}

	public void run()
	{
//		out.println( league );			//	Uncomment for testing purposes

		out.println();
		out.printf( "The average number of runs is %.2f \n", league.averageRuns() );
		out.println();
		out.println( "The list of the winning teams is ");
		out.println( Arrays.toString(league.allWinners()) );
		out.println();
		out.println( "The highest winning team score is ");
		out.println( league.topTeamScore() );
		out.println();
		out.println( "The team with the most runs scored in a single inning is");
		out.println( "" + league.getBestSingleInning() );
		out.println();
		out.println();
	}
}


class Season
{
	Game[] schedule;
	int current;

	public Season()
	{
		current = 0;
		populate();
	}

	private void populate()
	{
		try
		{
			Scanner fileScan = new Scanner( new File("Java4004a.dat") );
			int size = Integer.valueOf( fileScan.nextLine() );

			schedule    = new Game[size];
			for(int x=0; x<size;x++)
			{
				String 	visitCity	 = fileScan.nextLine();
				String 	visitTeam	 = fileScan.nextLine();
				String	visitResults = fileScan.nextLine();
				String	homeCity	 = fileScan.nextLine();
				String	homeTeam	 = fileScan.nextLine();
				String	homeResults	 = fileScan.nextLine();

				schedule[x] = new Game(visitCity,visitTeam,visitResults,
				                       homeCity,homeTeam,homeResults);
			}
		}
		catch(IOException e){}
	}

	public double averageRuns()
	{
		// Complete this method

		return 0;
	}

	public String[] allWinners()
	{
		// Complete this method

		return null;
	}

	public int topTeamScore()
	{
		// Complete this method

		return 0;
	}

	public int getBestSingleInning()
	{
		// Complete this method

		return 0;
	}

	public Game getCurrent()
	{
		// Complete this method

		return null;
	}

	public void previous()
	{
		// Complete this method
	}

	public void next()
	{
		// Complete this method
	}

	public String toString()
	{
		String temp = "";
			for(Game item: schedule)
				temp += item.toString() + "\n";
		return temp;
	}
}


class Game
{
	private String visitingTeam;
	private String visitingCity;
	private int[]  visitorRunsPerInning;
	private String homeTeam;
	private String homeCity;
	private int[]  homeRunsPerInning;

	public Game(String vc, String vt, String vr, String hc, String ht, String hr)
	{
		visitingCity         = vc;
		visitingTeam         = vt;

		String[] vrStr = vr.split(" ");
		visitorRunsPerInning = new int[vrStr.length];
		for(int x=0; x<vrStr.length; x++)
			visitorRunsPerInning[x] = Integer.parseInt( vrStr[x] );

		homeCity             = hc;
		homeTeam             = ht;

		String[] hrStr = hr.split(" ");
		homeRunsPerInning = new int[hrStr.length];
		for(int x=0; x<hrStr.length; x++)
			homeRunsPerInning[x] = Integer.parseInt( hrStr[x] );
	}

	public String getVisitingTeamCity()		{ return visitingCity;         }
	public String getVisitingTeamName()		{ return visitingTeam;         }
	public int[]  getVisitorRunsPerInning()	{ return visitorRunsPerInning; }
	public String getHomeTeamCity()			{ return homeCity;             }
	public String getHomeTeamName()			{ return homeTeam;             }
	public int[]  getHomeRunsPerInning()	{ return homeRunsPerInning;    }

	public int getVisitorScore()
	{
		// Complete this method

		return 0;
	}

	public int getHomeScore()
	{
		// Complete this method

		return 0;
	}

	public String getWinningTeam()
	{
		// Complete this method

		return null;
	}

	public int getWinningScore()
	{
		// Complete this method

		return 0;
	}

	public String getLosingTeam()
	{
		// Complete this method

		return null;
	}

	public int getLosingScore()
	{
		// Complete this method

		return 0;
	}

	public String toString()
	{
		return
			"(\n"+visitingCity+
			","+visitingTeam+
			",\n"+Arrays.toString(visitorRunsPerInning)+
			",\n"+homeCity+
			","+homeTeam+
			",\n"+Arrays.toString(homeRunsPerInning)+
			"\n)";
	}
}


abstract class View extends JFrame
{
	protected JTextField visitorNameOutput;
	protected JTextField visitorCityOutput;
	protected JTextField visitorScoreOutput;
	protected JTextField homeNameOutput;
	protected JTextField homeCityOutput;
	protected JTextField homeScoreOutput;

	protected JTextField[] homeRunsOutput;
	protected JTextField[] visitorRunsOutput;

	protected JTextField winningTeamOutput;
	protected JTextField losingTeamOutput;
	protected JTextField winningTeamScoreOutput;
	protected JTextField losingTeamScoreOutput;

	public View()
	{
		setSize(410,600);
		setLayout( null );

		JLabel titleLabel = new JLabel("MLB Game Report");
			titleLabel.setFont(new Font(null,Font.BOLD,30));
			titleLabel.setSize(390,30);
			titleLabel.setHorizontalAlignment(JLabel.CENTER);
			titleLabel.setLocation(10,10);
		add(titleLabel);

		JPanel topPanel = new JPanel( new BorderLayout() );
			topPanel.setBorder(
				BorderFactory.createCompoundBorder(
					BorderFactory.createTitledBorder(
						BorderFactory.createBevelBorder(BevelBorder.RAISED),
						"Visiting Team",
						TitledBorder.CENTER,TitledBorder.BELOW_TOP,new Font(null,1,18)),
	                BorderFactory.createBevelBorder(BevelBorder.RAISED)
			));
			topPanel.setSize(385,190);
			topPanel.setLocation(10,50);

	   		JPanel visitorPanel = new JPanel();
				visitorPanel.setLayout(null);
	   			visitorPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

				visitorCityOutput = new JTextField();
					visitorCityOutput.setFont(new Font("Courier",Font.PLAIN,14));
					visitorCityOutput.setHorizontalAlignment(JTextField.CENTER);
					visitorCityOutput.setFocusable(false);
					visitorCityOutput.setSize(150,30);
					visitorCityOutput.setLocation(30,10);
				visitorPanel.add(visitorCityOutput);

				visitorNameOutput = new JTextField();
					visitorNameOutput.setFont(new Font("Courier",Font.PLAIN,14));
					visitorNameOutput.setHorizontalAlignment(JTextField.CENTER);
					visitorNameOutput.setFocusable(false);
					visitorNameOutput.setSize(150,30);
					visitorNameOutput.setLocation(190,10);
				visitorPanel.add(visitorNameOutput);

				visitorRunsOutput = new JTextField[9];
				for(int x=0; x<visitorRunsOutput.length; x++)
				{
					visitorRunsOutput[x] = new JTextField();
						visitorRunsOutput[x].setFont(new Font("Courier",Font.PLAIN,14));
						visitorRunsOutput[x].setHorizontalAlignment(JTextField.CENTER);
						visitorRunsOutput[x].setFocusable(false);
						visitorRunsOutput[x].setSize(30,30);
						visitorRunsOutput[x].setLocation(10+(x*40),50);
					visitorPanel.add(visitorRunsOutput[x]);

					JLabel numLabel = new JLabel( ""+(x+1) );
						numLabel.setFont(new Font(null,Font.BOLD,20));
						numLabel.setSize(20,30);
						numLabel.setLocation(19+(x*40),80);
					visitorPanel.add(numLabel);
				}

				JLabel vsLabel = new JLabel("Score:");
					vsLabel.setFont(new Font(null,Font.BOLD,20));
					vsLabel.setSize(200,30);
					vsLabel.setLocation(175,110);
				visitorPanel.add(vsLabel);

				visitorScoreOutput = new JTextField();
					visitorScoreOutput.setFont(new Font("Courier",Font.PLAIN,14));
					visitorScoreOutput.setHorizontalAlignment(JTextField.CENTER);
					visitorScoreOutput.setFocusable(false);
					visitorScoreOutput.setSize(60,30);
					visitorScoreOutput.setLocation(250,110);
				visitorPanel.add(visitorScoreOutput);

			topPanel.add(visitorPanel);
		add(topPanel);

		JPanel bottomPanel = new JPanel( new BorderLayout() );
			bottomPanel.setBorder(
				BorderFactory.createCompoundBorder(
					BorderFactory.createTitledBorder(
						BorderFactory.createBevelBorder(BevelBorder.RAISED),
						"Home Team",
						TitledBorder.CENTER,TitledBorder.BELOW_TOP,new Font(null,1,18)),
	                BorderFactory.createBevelBorder(BevelBorder.RAISED)
			));
			bottomPanel.setSize(385,190);
			bottomPanel.setLocation(10,240);

	   		JPanel homePanel = new JPanel();
				homePanel.setLayout(null);
	   			homePanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

				homeCityOutput = new JTextField();
					homeCityOutput.setFont(new Font("Courier",Font.PLAIN,14));
					homeCityOutput.setHorizontalAlignment(JTextField.CENTER);
					homeCityOutput.setFocusable(false);
					homeCityOutput.setSize(150,30);
					homeCityOutput.setLocation(30,10);
				homePanel.add(homeCityOutput);

				homeNameOutput = new JTextField();
					homeNameOutput.setFont(new Font("Courier",Font.PLAIN,14));
					homeNameOutput.setHorizontalAlignment(JTextField.CENTER);
					homeNameOutput.setFocusable(false);
					homeNameOutput.setSize(150,30);
					homeNameOutput.setLocation(190,10);
				homePanel.add(homeNameOutput);

				homeRunsOutput = new JTextField[9];
				for(int x=0; x<homeRunsOutput.length; x++)
				{
					homeRunsOutput[x] = new JTextField();
						homeRunsOutput[x].setFont(new Font("Courier",Font.PLAIN,14));
						homeRunsOutput[x].setHorizontalAlignment(JTextField.CENTER);
						homeRunsOutput[x].setFocusable(false);
						homeRunsOutput[x].setSize(30,30);
						homeRunsOutput[x].setLocation(10+(x*40),50);
					homePanel.add(homeRunsOutput[x]);

					JLabel numLabel = new JLabel( ""+(x+1) );
						numLabel.setFont(new Font(null,Font.BOLD,20));
						numLabel.setSize(20,30);
						numLabel.setLocation(19+(x*40),80);
					homePanel.add(numLabel);
				}

				JLabel hsLabel = new JLabel("Score:");
					hsLabel.setFont(new Font(null,Font.BOLD,20));
					hsLabel.setSize(200,30);
					hsLabel.setLocation(175,110);
				homePanel.add(hsLabel);

				homeScoreOutput = new JTextField();
					homeScoreOutput.setFont(new Font("Courier",Font.PLAIN,14));
					homeScoreOutput.setHorizontalAlignment(JTextField.CENTER);
					homeScoreOutput.setFocusable(false);
					homeScoreOutput.setSize(60,30);
					homeScoreOutput.setLocation(250,110);
				homePanel.add(homeScoreOutput);

			bottomPanel.add(homePanel);

		add(bottomPanel);

   		JPanel resultsPanel = new JPanel();
			resultsPanel.setLayout(null);
   			resultsPanel.setBorder(BorderFactory.createEtchedBorder());
			resultsPanel.setSize(375,85);
			resultsPanel.setLocation(15,440);

			JLabel winLabel = new JLabel("Winner");
				winLabel.setFont(new Font(null,Font.BOLD,20));
				winLabel.setSize(200,30);
				winLabel.setLocation(40,10);
			resultsPanel.add(winLabel);

			winningTeamOutput = new JTextField();
				winningTeamOutput.setFont(new Font("Courier",Font.PLAIN,14));
				winningTeamOutput.setHorizontalAlignment(JTextField.CENTER);
				winningTeamOutput.setFocusable(false);
				winningTeamOutput.setSize(150,30);
				winningTeamOutput.setLocation(120,10);
			resultsPanel.add(winningTeamOutput);

			winningTeamScoreOutput = new JTextField();
				winningTeamScoreOutput.setFont(new Font("Courier",Font.PLAIN,14));
				winningTeamScoreOutput.setHorizontalAlignment(JTextField.CENTER);
				winningTeamScoreOutput.setFocusable(false);
				winningTeamScoreOutput.setSize(60,30);
				winningTeamScoreOutput.setLocation(275,10);
			resultsPanel.add(winningTeamScoreOutput);

			JLabel loseLabel = new JLabel("Loser");
				loseLabel.setFont(new Font(null,Font.BOLD,20));
				loseLabel.setSize(220,30);
				loseLabel.setLocation(40,45);
			resultsPanel.add(loseLabel);

			losingTeamOutput = new JTextField();
				losingTeamOutput.setFont(new Font("Courier",Font.PLAIN,14));
				losingTeamOutput.setHorizontalAlignment(JTextField.CENTER);
				losingTeamOutput.setFocusable(false);
				losingTeamOutput.setSize(150,30);
				losingTeamOutput.setLocation(120,45);
			resultsPanel.add(losingTeamOutput);

			losingTeamScoreOutput = new JTextField();
				losingTeamScoreOutput.setFont(new Font("Courier",Font.PLAIN,14));
				losingTeamScoreOutput.setHorizontalAlignment(JTextField.CENTER);
				losingTeamScoreOutput.setFocusable(false);
				losingTeamScoreOutput.setSize(60,30);
				losingTeamScoreOutput.setLocation(275,45);
			resultsPanel.add(losingTeamScoreOutput);

			JButton previousButton = new JButton("Previous");
				previousButton.setSize(160,30);
				previousButton.setLocation(30,535);
				previousButton.addActionListener(new PreviousDisplayController());
			add(previousButton);

			JButton nextButton = new JButton("Next");
				nextButton.setSize(160,30);
				nextButton.setLocation(210,535);
				nextButton.addActionListener(new NextDisplayController());
			add(nextButton);

		add(resultsPanel);

		setLocationRelativeTo(null);
 		setDefaultCloseOperation(EXIT_ON_CLOSE);
 		setResizable(false);
		setVisible(true);
	}

	class PreviousDisplayController implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			previousAction();
		}
	}

	abstract public void previousAction();

	class NextDisplayController implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			nextAction();
		}
	}

	abstract public void nextAction();
}






