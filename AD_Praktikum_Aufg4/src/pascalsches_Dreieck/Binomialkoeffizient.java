/**
 * PM2 Praktikum
 * @author Johannes Kruber 
 */
package pascalsches_Dreieck;

public class Binomialkoeffizient
{
	static int zaehler = 0;

	public static int[] pascalReihe(int n)
	{
		int[] pascalzahlen = new int[n + 1];

		for (int k = 0; k <= (n)/2; k++)
		{
			pascalzahlen[k] = (int)(fakult�t(n) / (fakult�t(k) * fakult�t(n - k)));
			pascalzahlen[n - k] = pascalzahlen[k];
		}

		return pascalzahlen;
	}

	private static long fakult�t(long n)
	{
		zaehler++;
		if (n <= 1)
			return 1;
		return n * fakult�t(n - 1);
	}

	public static void main(String[] args)
	{
		int[] pascal = pascalReihe(10);
		for (int i = 0; i < pascal.length; i++)
		{
			System.out.println(pascal[i]);
		}
		
		System.out.println("\n\n\n"+ zaehler);
	}

}
