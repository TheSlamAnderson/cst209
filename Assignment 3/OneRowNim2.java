/*
 * File:	OneRowNim2.java
 * Author:	Anderson, Christopher
 * Description:	Game Data
 */

public class OneRowNim2
{
	private int nSticks = 7;			// Start with 7 sticks.
	private int player = 1;				// Player 1 plays first.

	public OneRowNim2()
	{
	} // OneRowNim() constructor

	public OneRowNim2(int sticks)
	{
		nSticks = sticks;
	} // OneRowNim() constructor2

	public OneRowNim2(int sticks, int starter)
	{
		nSticks = sticks;
		player = starter;
	} // OneRowNim() constructor3

	public boolean takeSticks(int num)
	{
		if (num < 1) return false;			// Error
		else if (num > 4) return false;		// Error
		else								// This Is A Valid Move
		{
			nSticks = nSticks - num;
			player = 3 - player;
			return true;
		} // Else
	} // takeSticks()

	public int getSticks()
	{
		return nSticks;
	} // getSticks()

	public int getPlayer()
	{
		return player;
	} // getPlayer()

	public boolean gameOver()
	{
		return (nSticks <= 0);
	} // gameOver()

	public int getWinner()
	{
		if (nSticks < 1) return getPlayer();
		else return 0; // Game Is Not Over
	} // getWinner()

	public void report()
	{
		System.out.println("Number of sticks left: " + getSticks());
		System.out.println("Next turn by player " + getPlayer());
	} // report()


} // OneRowNim2 class