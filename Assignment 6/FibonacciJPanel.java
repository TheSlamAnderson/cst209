/*
 * File:		FibonacciJPanel.java
 * Author:		Anderson, Christopher
 * Description:	Fibonacci Data Applet
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FibonacciJPanel extends JPanel implements ActionListener
{

	private JTextField inField = new JTextField(15); // GUI Components
	private JTextField resultField = new JTextField(15);
	private JLabel prompt1 = new JLabel("Input Fibonacci >>");
	private JLabel prompt2 = new JLabel("Conversion Result:");
	private JButton FibBtn = new JButton("Fibonacci Of The Input");
	private JPanel panelN = new JPanel();
	private JPanel panelC = new JPanel();
	private JPanel panelS = new JPanel();
	private Fibonacci FibNum = new Fibonacci();

	public FibonacciJPanel()
	{

		setLayout(new BorderLayout());
		panelN.setLayout(new BorderLayout());
		panelC.setLayout(new BorderLayout());
		panelS.setLayout(new BorderLayout());
		panelN.add("North", prompt1);
		panelN.add("South", inField);
		panelC.add("West", FibBtn);
		panelS.add("North", prompt2);
		panelS.add("South", resultField);
		add("North", panelN);
		add("Center", panelC);
		add("South", panelS);
		FibBtn.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
    {

		int FibInput = Integer.parseInt(inField.getText());
		int FibResult = FibNum.Fib(FibInput);

		if(e.getSource() == FibBtn)
		{

			resultField.setText(String.valueOf(FibResult));

		}

    }

}