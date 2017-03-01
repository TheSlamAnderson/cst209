/*
 * File:	LeapYear.java
 * Author:	Anderson, Christopher
 * Description:	Year Data Applet
 */

public class LeapYear
{
	public boolean isLeapYear(int year)
	{
		if (year % 400 == 0) return true;
		else if ((year % 4 ==0) && (year % 100 == 0)) return false;
		else if (year % 4 ==0) return true;
		else return false;
	}
}