/*
 * File:		Assign9.java
 * Author:		Anderson, Christopher
 * Description:	Two-Dimensional Arrays
 */

public class Assign9
{

	public static void main(String args[])
	{

		// Declare Array
		int intar [][] = {{1, 2, 3, 4}, {5,6,7,8}, {9,10,11,12}};

		// Use a loop for columns (i)
		for (int i = 0; i < intar.length + 1; i++)

			// Use a loop for rows (j)
			for (int j = 0; j < intar.length; j++)


				// Print the elements of intar column wise as follows:
				// 1 5 9 2 6 10 3 7 11 4 8 12
				System.out.print(intar[j][i] + " ");

		// Print blank line for asthetics
		System.out.println(" ");

	}

}