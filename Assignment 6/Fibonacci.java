/*
 * File:		Fibonacci.java
 * Author:		Anderson, Christopher
 * Description:	Fibonacci Data Applet
 */

public class Fibonacci
{

	public Fibonacci() {}

	public static int Fib (int n)
	{

		int in1=1,in2=1; int sum=0;
		int index=1;

		while (index < n)
		{
			sum=in1+in2;
			in1=in2;
			in2=sum;
			index++;
		}

		return sum;

	}
}