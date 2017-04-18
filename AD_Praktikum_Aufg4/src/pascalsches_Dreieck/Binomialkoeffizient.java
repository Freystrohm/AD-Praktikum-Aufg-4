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

		for (int k = 0; k <= (n) / 2; k++)
		{
			pascalzahlen[k] = (int) (fakultät(n)
					/ (fakultät(k) * fakultät(n - k)));
			pascalzahlen[n - k] = pascalzahlen[k];
		}

		return pascalzahlen;
	}

	public static long[] pascalReiheEff(int n)
	{
		long[] pascalzahlen = new long[n + 1];
		pascalzahlen[0] = 1;
		pascalzahlen[n] = 1;

		for (int k = 1; k <= n/2; k++)
		{
			pascalzahlen[k] = 1;
			for(int i = 1; i <= k  ; i++)
			{
				pascalzahlen[k] *= ((double)(n-k+i))/i;
				zaehler++;
			}
			pascalzahlen[n - k] = pascalzahlen[k];
			//pascalzahlen[k] = binomialkoeff(n, i);
		}
		
		return pascalzahlen;
	}

	private static int binomialkoeff(int n, int k)
	{
		if(k==0)
		{
			return 1;
		}
		if(2*k > n)
		{
			return binomialkoeff(n, n - k);
		}
		return(int) ((double)(n+1-k)) * (binomialkoeff(n, k - 1)/k);		
	}

	private static long fakultät(long n)
	{
		zaehler++;
		if (n <= 1)
			return 1;
		return n * fakultät(n - 1);
	}

	public static void main(String[] args)
	{
	long[] pascal = pascalReiheEff(9);
		for (int i = 0; i < pascal.length; i++)
		{
			System.out.println(pascal[i]);
		}

		System.out.println("\n\n\n" + zaehler);
	}

}
