/*
 * File:	Assign2.java
 * Author:	Anderson, Christopher
 * Description:	Print Game Information
 */

public class Assign2
{
	public static void main(String args[])
	{
		OneRowNim game1 = new OneRowNim();
		System.out.println("Game 1:");	// Print Game One
		game1.report();
		game1.takeThree();
		game1.report();
		game1.takeTwo();
		game1.report();
		game1.takeOne();
		game1.report();

		System.out.println("");	// Print Blank Line For Asthetics

		OneRowNim game2 = new OneRowNim();
		System.out.println("Game 2:"); // Print Game Two
		game2.report();
		game2.takeOne();
		game2.report();
		game2.takeTwo();
		game2.report();
		game2.takeThree();
		game2.report();

		System.out.println("");	// Print Blank Line For Asthetics

	} // main()


} // OneRowNimTester class
