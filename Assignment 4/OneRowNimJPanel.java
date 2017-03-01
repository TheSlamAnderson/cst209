/*
 * File:	OneRowNimJPanel.java
 * Author:	Anderson, Christopher
 * Description:	Game Data Applet
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OneRowNimJPanel extends JPanel implements ActionListener
{
	private JTextField inField = new JTextField(15); // GUI Components
	private JTextField resultField = new JTextField(15);
	private JLabel prompt1 = new JLabel("Input Number Of Sticks >>");
	private JLabel prompt2 = new JLabel("Result Of The Game:");
	private JButton OneRowNim2 = new JButton("OneRowNim2");
	private JPanel panelN = new JPanel();
	private JPanel panelC = new JPanel();
	private JPanel panelS = new JPanel();
	private OneRowNim2 game = new OneRowNim2(21);

	public OneRowNimJPanel()
	{
		setLayout(new BorderLayout());
		panelN.setLayout(new BorderLayout());
		panelC.setLayout(new BorderLayout());
		panelS.setLayout(new BorderLayout());
		panelN.add("North", prompt1);
		panelN.add("South", inField);
		panelC.add("Center", OneRowNim2);
		panelS.add("North", prompt2);
		panelS.add("South", resultField);
		add("North", panelN);
		add("Center", panelC);
		add("South", panelS);
		OneRowNim2.addActionListener(this);
		setSize(175,200);
	}

	private void userMove()
	{
		int userTakes = Integer.parseInt(inField.getText());
		if (game.takeSticks(userTakes))
		resultField.setText("You take " + userTakes + ".\n");
		else resultField.setText("I take one stick. ");
	}

	private void computerMove()
	{
		if (game.gameOver()) return;
		if (game.getPlayer() == 2)
		{
			game.takeSticks(1);
			resultField.setText("I take one stick. ");
		}
	}

	private void endGame()
	{
		OneRowNim2.setEnabled(false);
		inField.setEnabled(false);
		if (game.getWinner() == 1)
		resultField.setText("Game over. You win. Nice game.\n");
		else resultField.setText("Game over. I win. Nice game.\n");
	}

	public void actionPerformed(ActionEvent e)
    {
		if (e.getSource() == OneRowNim2)
		{
			userMove();
            computerMove();
            int sticksLeft = game.getSticks();
            resultField.setText("There are " + sticksLeft + " sticks left.\n");
            if (game.gameOver()) endGame();
        }
    }
}