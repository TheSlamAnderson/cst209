/*
 * File:		FibonacciJApplet.java
 * Author:		Anderson, Christopher
 * Description:	Fibonacci Data Applet
 */

import javax.swing.*;

public class FibonacciJApplet extends JApplet
{

	public void init()
    {

		getContentPane().add(new FibonacciJPanel());

    }

}