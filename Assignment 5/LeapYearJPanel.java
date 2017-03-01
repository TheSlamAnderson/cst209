/*
 * File:	LeapYearJPanel.java
 * Author:	Anderson, Christopher
 * Description:	Year Data Applet
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LeapYearJPanel extends JPanel implements ActionListener
{
	private JTextField inField = new JTextField(15); // GUI Components
	private JTextField resultField = new JTextField(15);
	private JLabel prompt1 = new JLabel("Input A Year >>");
	private JLabel prompt2 = new JLabel("Conversion Result:");
	private JButton LeapYear = new JButton("Is the input year a leap year?");
	private JPanel panelN = new JPanel();
	private JPanel panelC = new JPanel();
	private JPanel panelS = new JPanel();
	private LeapYear LYear = new LeapYear();

	public LeapYearJPanel()
	{
		setLayout(new BorderLayout());
		panelN.setLayout(new BorderLayout());
		panelC.setLayout(new BorderLayout());
		panelS.setLayout(new BorderLayout());
		panelN.add("North", prompt1);
		panelN.add("South", inField);
		panelC.add("West", LeapYear);
		panelS.add("North", prompt2);
		panelS.add("South", resultField);
		add("North", panelN);
		add("Center", panelC);
		add("South", panelS);
		LeapYear.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
    {
		int year = Integer.parseInt(inField.getText());

		if (e.getSource() == LeapYear)
		{
			boolean result = LYear.isLeapYear(year);
			if (result)
				resultField.setText("True");
			else
				resultField.setText("False");
        }
    }
}