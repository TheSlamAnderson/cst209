/*
 * File:	OneRowNimJApplet.java
 * Author:	Anderson, Christopher
 */

import javax.swing.*;

public class OneRowNimJApplet extends JApplet
{
	public void init()
    {
		getContentPane().add(new OneRowNimJPanel());
    }
}