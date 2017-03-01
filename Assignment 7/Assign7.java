/*
 * File:		Assign7.java
 * Author:		Anderson, Christopher
 * Description:	String Functions
 */

public class Assign7
{

	public static void main(String args[])
	{

		// Declare Strings

		String s1 = "George";
		String s2 = "Meghabghab";

		// Concatenate s1 and s2 and put the result in a String s3. Print s3.

		String s3 = new String(s1 + " " + s2);
		System.out.println(s3);

		// Get the substring ghab from s2 and put it in a String s4. Print s4.

		String s4 = s2.substring(2,6);
		System.out.println(s4);

		// Get the substring Me from s2 and put it in a String s5. Print s5.

		String s5 = s2.substring(0,2);
		System.out.println(s5);

		// Recreate the String s2 by concatenating 1 time the String s5 and 2 times the String s4.
		// Make sure that 1 time s5 is before 2 times s4. Put the result in a String s6. Print s6.

		String s6 = new String(s5 + s4 + s4);
		System.out.println(s6);

		// Test and print whether the String s2 and String s6 are equal. Use a boolean variable called bool1 to do exactly that.

		boolean bool1 = s2.equals(s6);
		System.out.println(bool1);

		// Create a String s7 which is made out of the first letter of s1 and s2. Print s7.

		String s7 = s1.substring(0,1) + s2.substring(0,1);
		System.out.println(s7);

	}

}