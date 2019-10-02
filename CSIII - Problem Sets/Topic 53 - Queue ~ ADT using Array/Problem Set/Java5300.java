///////////////////////////////////////////////////////////////////////////
//
// Java5300	This file contains the GUI interface for the problem set
//
//			Compile this file so that the classes are available.
//
//
///////////////////////////////////////////////////////////////////////////


package solution;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Java5300{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	public void ButtonOneAction()
	{
		output.append("public void ButtonOneAction()\n");
		output.append("{\n");
		output.append("}\n");
		output.append("\n");
	}
}


class MyFrame extends JFrame
{
	JTextArea output;
	JButton   buttonOne, buttonTwo, buttonThree;
	JTextField input;

	public MyFrame()
	{
 		setSize(450,220);
		setLocationRelativeTo(null);
  		setDefaultCloseOperation(3);
		setContentPane( new MyPanel() );
		setVisible(true);
	}

	class MyPanel extends JPanel
	{
		MyPanel()
		{
   			setBackground(new Color(150,0,0));

			output = new JTextArea();
				output.setRows(8);
				output.setColumns(58);
				output.setEditable(false);
				output.setFocusable(false);
				output.setLineWrap(true);
				output.setFont( new java.awt.Font("DialogInput", 0, 12));
			JScrollPane scroll = new JScrollPane(output);
				scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			add(scroll);

			buttonOne = new JButton("Process");
				buttonOne.setPreferredSize(new Dimension(120,25));
			add(buttonOne);

			JLabel rawLabel = new JLabel("Input:");
				rawLabel.setPreferredSize(new Dimension(80,25));
				rawLabel.setHorizontalAlignment(4);
				rawLabel.setForeground(Color.white);
				rawLabel.setFont(new Font(null,1,16));
			add(rawLabel);

			input = new JTextField();
				input.setPreferredSize(new Dimension(120,25));
				input.setHorizontalAlignment(JTextField.CENTER);
			add(input);
		}
	}

	class ActionOneListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ButtonOneAction();
	}}

	public void ButtonOneAction()
	{}
}


