/*
 * File:	Assign3.java
 * Author:	Anderson, Christopher
 */

 import java.util.Scanner;

 public class Assign3
 {
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 OneRowNim2 game1 = new OneRowNim2(9, 1);
		 int counter=0;
		 while(game1.gameOver()== false)
		 {
			 game1.report();								// Prompt the user
			 System.out.print("Input 5, 8, 2, 4, 2, 3, 2, 6, or 4: ");
			 int sticks = sc.nextInt();					// Get move
			 game1.takeSticks(sticks);					// Do move
			 System.out.println();
			 if (sticks <= 4) counter=counter+1;
		 } // while
		 game1.report();									// The game is now over
		 System.out.print("Game won by player ");
		 System.out.println(game1.getWinner());
		 System.out.print("Counter ");
		 System.out.println(counter);
	 } // main()
 } // Assign3 class