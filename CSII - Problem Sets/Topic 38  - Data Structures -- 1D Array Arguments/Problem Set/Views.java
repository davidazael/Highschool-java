//
//	CS2 - View                                       © 2010 - Cypress Creek H.S.
//
// 	   Thread:	Standard Algorithms -- array duplication
//	Criterion:	The View and Test Environment
//	========================================================================
//
//
//

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Views {
	public static void main(String[] args) {
		new Thread(new TestEnvironment()).run();
}}



class TestEnvironment implements Runnable
{
	public void run()
	{
		new BeforeAfterView();
		new BeforeInsideAfterView();
	}
}


class BeforeInsideAfterView extends JFrame
{
	protected JTextField beforeOrigRef;
	protected JTextArea  beforeOutput;

	protected JTextField insideOrigRef;
	protected JTextField insideCopyRef;
	protected JTextArea  insideOutput;

	protected JTextField afterOrigRef;
	protected JTextArea  afterOutput;


	private JPanel leftTop;
	private JPanel centerTop;
	private JPanel rightTop;

	public BeforeInsideAfterView()
	{
		JPanel mainPanel = new JPanel();
   			mainPanel.setLayout( new GridLayout(1,3,10,10));
   			mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
   		setContentPane( mainPanel );

		JPanel leftPanel = new JPanel( new BorderLayout() );
				leftPanel.setBorder(
					BorderFactory.createCompoundBorder(
						BorderFactory.createTitledBorder(
							BorderFactory.createBevelBorder(BevelBorder.LOWERED),
							"Before:",
							TitledBorder.LEFT,TitledBorder.BELOW_TOP,new Font(null,1,18)),
		                BorderFactory.createBevelBorder(BevelBorder.RAISED)
				));
			leftTop = new JPanel( new GridLayout(2,2,5,2));
				leftTop.setBorder(BorderFactory.createRaisedBevelBorder());
				JLabel leftOriginalLabel = new JLabel("Original Addr:");
					leftOriginalLabel.setHorizontalAlignment(JLabel.RIGHT);
					leftTop.add(leftOriginalLabel);
				beforeOrigRef = new JTextField();
			   		beforeOrigRef.setFocusable(false);
					leftTop.add(beforeOrigRef);
				JLabel leftCopyLabel = new JLabel("");
					leftCopyLabel.setHorizontalAlignment(JLabel.RIGHT);
					leftTop.add(leftCopyLabel);
			leftPanel.add(leftTop,BorderLayout.NORTH);
			JPanel leftBottom = new JPanel(new GridLayout(1,1));
			   		beforeOutput = new JTextArea(8,15);
		   				JScrollPane leftOutputPane = new JScrollPane(
		   					beforeOutput,
		   					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		   					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		   				);
			   				beforeOutput.setEditable(false);
			   				beforeOutput.setFocusable(false);
						leftOutputPane.setBorder(
							BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder(
									BorderFactory.createLineBorder(Color.BLACK,2),
									" Output "),
								BorderFactory.createEtchedBorder()
							));
			   		leftBottom.add(leftOutputPane);
			leftPanel.add(leftOutputPane,BorderLayout.CENTER);
		add(leftPanel);

		JPanel centerPanel = new JPanel( new BorderLayout() );
				centerPanel.setBorder(
					BorderFactory.createCompoundBorder(
						BorderFactory.createTitledBorder(
							BorderFactory.createBevelBorder(BevelBorder.LOWERED),
							"Inside Method:",
							TitledBorder.LEFT,TitledBorder.BELOW_TOP,new Font(null,1,18)),
		                BorderFactory.createBevelBorder(BevelBorder.RAISED)
				));
			centerTop = new JPanel( new GridLayout(2,2,5,2));
				centerTop.setBorder(BorderFactory.createRaisedBevelBorder());
				JLabel sourceLabel = new JLabel("Original Addr:");
					sourceLabel.setHorizontalAlignment(JLabel.RIGHT);
					centerTop.add(sourceLabel);
				insideOrigRef = new JTextField();
			   		insideOrigRef.setFocusable(false);
					centerTop.add(insideOrigRef);
				JLabel destinationLabel = new JLabel("Copy Addr:");
					destinationLabel.setHorizontalAlignment(JLabel.RIGHT);
					centerTop.add(destinationLabel);
				insideCopyRef = new JTextField();
			   		insideCopyRef.setFocusable(false);
					centerTop.add(insideCopyRef);
			centerPanel.add(centerTop,BorderLayout.NORTH);
			JPanel centerBottom = new JPanel(new GridLayout(1,1));
			   		insideOutput = new JTextArea(8,15);
		   				JScrollPane insideOutputPane = new JScrollPane(
		   					insideOutput,
		   					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		   					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		   				);
			   				insideOutput.setEditable(false);
			   				insideOutput.setFocusable(false);
						insideOutputPane.setBorder(
							BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder(
									BorderFactory.createLineBorder(Color.BLACK,2),
									" Output "),
								BorderFactory.createEtchedBorder()
							));
			   		centerBottom.add(insideOutputPane);
			centerPanel.add(centerBottom,BorderLayout.CENTER);
		add(centerPanel);

		JPanel rightPanel = new JPanel(new BorderLayout());
				rightPanel.setBorder(
					BorderFactory.createCompoundBorder(
						BorderFactory.createTitledBorder(
							BorderFactory.createBevelBorder(BevelBorder.LOWERED),
							"After:",
							TitledBorder.LEFT,TitledBorder.BELOW_TOP,new Font(null,1,18)),
		                BorderFactory.createBevelBorder(BevelBorder.RAISED)
				));
			rightTop = new JPanel( new GridLayout(2,2,5,2));
				rightTop.setBorder(BorderFactory.createRaisedBevelBorder());
				JLabel rightOriginalLabel = new JLabel("Original Addr:");
					rightOriginalLabel.setHorizontalAlignment(JLabel.RIGHT);
					rightTop.add(rightOriginalLabel);
				afterOrigRef = new JTextField();
			   		afterOrigRef.setFocusable(false);
					rightTop.add(afterOrigRef);
				JLabel rightCopyLabel = new JLabel("");
					rightCopyLabel.setHorizontalAlignment(JLabel.RIGHT);
					rightTop.add(rightCopyLabel);
			rightPanel.add(rightTop,BorderLayout.NORTH);
			JPanel rightBottom = new JPanel(new GridLayout(1,1));
			   		afterOutput = new JTextArea(8,15);
		   				JScrollPane rightOutputPane = new JScrollPane(
		   					afterOutput,
		   					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		   					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		   				);
			   				afterOutput.setEditable(false);
			   				afterOutput.setFocusable(false);
						rightOutputPane.setBorder(
							BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder(
									BorderFactory.createLineBorder(Color.BLACK,2),
									" Output "),
								BorderFactory.createEtchedBorder()
							));
			   		leftBottom.add(rightBottom);
			rightPanel.add(rightOutputPane,BorderLayout.CENTER);
		add(rightPanel);

		pack();
		setLocationRelativeTo(null);
  		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		showReferences(false);
	}

	public void showReferences(boolean s)
	{
		leftTop.setVisible(s);
		centerTop.setVisible(s);
		rightTop.setVisible(s);

		repaint();
	}
}


class BeforeAfterView extends JFrame
{
	protected JTextField beforeOrigRef;
	protected JTextField beforeCopyRef;
	protected JTextArea  beforeOrigOutput;
	protected JTextArea  beforeCopyOutput;

	protected JTextField afterOrigRef;
	protected JTextField afterCopyRef;
	protected JTextArea  afterOrigOutput;
	protected JTextArea  afterCopyOutput;

	public BeforeAfterView()
	{
		JPanel mainPanel = new JPanel();
   			mainPanel.setLayout( new GridLayout(1,2,10,10));
   			mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
   		setContentPane( mainPanel );

		JPanel leftPanel = new JPanel( new BorderLayout() );
				leftPanel.setBorder(
					BorderFactory.createCompoundBorder(
						BorderFactory.createTitledBorder(
							BorderFactory.createBevelBorder(BevelBorder.LOWERED),
							"Before:",
							TitledBorder.LEFT,TitledBorder.BELOW_TOP,new Font(null,1,18)),
		                BorderFactory.createBevelBorder(BevelBorder.RAISED)
				));
			JPanel leftTop = new JPanel( new GridLayout(2,2,5,2));
				leftTop.setBorder(BorderFactory.createRaisedBevelBorder());
				JLabel sourceLabel = new JLabel("Original Address:");
					sourceLabel.setHorizontalAlignment(JLabel.RIGHT);
					leftTop.add(sourceLabel);
				beforeOrigRef = new JTextField();
					leftTop.add(beforeOrigRef);
				JLabel destinationLabel = new JLabel("Copy Address:");
					destinationLabel.setHorizontalAlignment(JLabel.RIGHT);
					leftTop.add(destinationLabel);
				beforeCopyRef = new JTextField();
					leftTop.add(beforeCopyRef);
			leftPanel.add(leftTop,BorderLayout.NORTH);
			JPanel leftBottom = new JPanel(new GridLayout(2,1));
			   		beforeOrigOutput = new JTextArea(8,25);
		   				JScrollPane sourceOutputPane = new JScrollPane(
		   					beforeOrigOutput,
		   					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		   					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		   				);
			   				beforeOrigOutput.setEditable(false);
			   				beforeOrigOutput.setFocusable(false);
						sourceOutputPane.setBorder(
							BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder(
									BorderFactory.createLineBorder(Color.BLACK,2),
									" Original Output "),
								BorderFactory.createEtchedBorder()
							));
			   		leftBottom.add(sourceOutputPane);
			   		beforeCopyOutput = new JTextArea(8,25);
		   				JScrollPane destinationOutputPane = new JScrollPane(
		   					beforeCopyOutput,
		   					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		   					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		   				);
			   				beforeCopyOutput.setEditable(false);
			   				beforeCopyOutput.setFocusable(false);
						destinationOutputPane.setBorder(
							BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder(
									BorderFactory.createLineBorder(Color.BLACK,2),
									" Copy Output "),
								BorderFactory.createEtchedBorder()
							));
			   		leftBottom.add(destinationOutputPane);
			leftPanel.add(leftBottom,BorderLayout.CENTER);
		add(leftPanel);

		JPanel rightPanel = new JPanel(new BorderLayout());
				rightPanel.setBorder(
					BorderFactory.createCompoundBorder(
						BorderFactory.createTitledBorder(
							BorderFactory.createBevelBorder(BevelBorder.LOWERED),
							"After:",
							TitledBorder.LEFT,TitledBorder.BELOW_TOP,new Font(null,1,18)),
		                BorderFactory.createBevelBorder(BevelBorder.RAISED)
				));
			JPanel rightTop = new JPanel( new GridLayout(2,2,5,2));
				rightTop.setBorder(BorderFactory.createRaisedBevelBorder());
				JLabel afterOriginalLabel = new JLabel("Original Address:");
					afterOriginalLabel.setHorizontalAlignment(JLabel.RIGHT);
					rightTop.add(afterOriginalLabel);
				afterOrigRef = new JTextField();
					rightTop.add(afterOrigRef);
				JLabel afterCopyLabel = new JLabel("Copy Address:");
					afterCopyLabel.setHorizontalAlignment(JLabel.RIGHT);
					rightTop.add(afterCopyLabel);
				afterCopyRef = new JTextField();
					rightTop.add(afterCopyRef);
			rightPanel.add(rightTop,BorderLayout.NORTH);
			JPanel rightBottom = new JPanel(new GridLayout(2,1));
			   		afterOrigOutput = new JTextArea(8,25);
		   				JScrollPane afterOrigOutputPane = new JScrollPane(
		   					afterOrigOutput,
		   					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		   					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		   				);
			   				afterOrigOutput.setEditable(false);
			   				afterOrigOutput.setFocusable(false);
						afterOrigOutputPane.setBorder(
							BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder(
									BorderFactory.createLineBorder(Color.BLACK,2),
									" Original Output "),
								BorderFactory.createEtchedBorder()
							));
			   		rightBottom.add(afterOrigOutputPane);
			   		afterCopyOutput = new JTextArea(8,25);
		   				JScrollPane afterCopyOutputPane = new JScrollPane(
		   					afterCopyOutput,
		   					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		   					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		   				);
			   				afterCopyOutput.setEditable(false);
			   				afterCopyOutput.setFocusable(false);
						afterCopyOutputPane.setBorder(
							BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder(
									BorderFactory.createLineBorder(Color.BLACK,2),
									" Copy Output "),
								BorderFactory.createEtchedBorder()
							));
			   		rightBottom.add(afterCopyOutputPane);
			rightPanel.add(rightBottom,BorderLayout.CENTER);
		add(rightPanel);

		pack();
		setLocationRelativeTo(null);
  		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}


class View
{
	public static String toString(double[] ray)
	{
		String temp = "";
			for(int i=0; i<ray.length; i++)
				temp += "["+i+"] = " + ray[i] + "\n";
		return temp;
	}

	public static String toString(int[] ray)
	{
		String temp = "";
			for(int i=0; i<ray.length; i++)
				temp += "["+i+"] = " + ray[i] + "\n";
		return temp;
	}

	public static String toString(String[] ray)
	{
		String temp = "";
			for(int i=0; i<ray.length; i++)
				temp += "["+i+"] = " + ray[i] + "\n";
		return temp;
	}
}
