/*
 * File:	LeapYearJApplet.java
 * Author:	Anderson, Christopher
 */

import javax.swing.*;

public class LeapYearJApplet extends JApplet
{
	public void init()
    {
		getContentPane().add(new LeapYearJPanel());
    }
}