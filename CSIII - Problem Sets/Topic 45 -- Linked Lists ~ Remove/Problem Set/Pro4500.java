

package solution;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pro4500{
	public static void main(String[] args) {
		new Model();
}}


class Model extends MyFrame
{
	//	JTextArea output;

	public Model()
	{
		buttonOne.setText("Button One");
		buttonTwo.setText("Button Two");
	}

	public void ButtonOneAction()
	{
		output.append("public void ButtonOneAction()\n");
		output.append("{\n");
		output.append("}\n");
		output.append("\n");
	}

	public void ButtonTwoAction()
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
	JButton   buttonOne;
	JButton   buttonTwo;

	public MyFrame()
	{
		setSize(460,420);
		setLocationRelativeTo(null);
  		setDefaultCloseOperation(3);
		setContentPane( new MyPanel() );
		setVisible(true);
	}

	class MyPanel extends JPanel
	{
		MyPanel()
		{
   			setBackground(new Color(195,180,165));

			output = new JTextArea();
				output.setRows(20);
				output.setColumns(60);
				output.setEditable(false);
				output.setFocusable(false);
				output.setLineWrap(true);
				output.setFont( new java.awt.Font("DialogInput", 0, 12));
			JScrollPane scroll = new JScrollPane(output);
				scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			add(scroll);

			buttonOne = new JButton();
				buttonOne.setPreferredSize(new Dimension(150,25));
				buttonOne.addActionListener( new ActionOneListener() );
			add(buttonOne);

			buttonTwo = new JButton();
				buttonTwo.setPreferredSize(new Dimension(150,25));
				buttonTwo.addActionListener( new ButtonTwoAction() );
			add(buttonTwo);
		}
	}

	class ActionOneListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ButtonOneAction();
	}}

	public void ButtonOneAction()
	{}

	class ButtonTwoAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ButtonTwoAction();
	}}

	public void ButtonTwoAction()
	{}
}


