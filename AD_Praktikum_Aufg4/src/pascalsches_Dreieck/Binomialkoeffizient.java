/**
 * PM2 Praktikum
 * @author Johannes Kruber
 * @author Luis Nickel 
 */
package pascalsches_Dreieck;

public class Binomialkoeffizient
{

	public static int[] pascalReihe(int n)
	{
		int[] pascalzahlen = new int[n + 1];

		for (int k = 0; k <= (n)/2; k++)
		{
			pascalzahlen[k] = (int)(fakultät(n) / (fakultät(k) * fakultät(n - k)));
			pascalzahlen[n - k] = pascalzahlen[k];
		}

		return pascalzahlen;
	}

	private static long fakultät(long n)
	{
		if (n <= 1)
			return 1;
		return n * fakultät(n - 1);
	}

	public static void main(String[] args)
	{
		int[] pascal = pascalReihe(20);
		for (int i = 0; i < pascal.length; i++)
		{
			System.out.println(pascal[i]);
		}
	}

}
