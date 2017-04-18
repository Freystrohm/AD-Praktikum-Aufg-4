package adp4;

public class PascalschesDreieck
{
    int[][] _dreiecksArray;
    int counterFuerRekusive;

    public PascalschesDreieck(int size)
    {
        _dreiecksArray = new int[size][size];
    }

    //Wrapper methode damit nach aussen nur ein Parameter gefordert wird
    public void gibZeileRekursiv(int N)
    {
//        if (N == 0)
//        {
//            return;
//        }
//        else 
//        {
//            gibZeileRekursiv(N, N-1);
//        }
        for (int i=0; i <= N; ++i)
        {
            int result = gibZeileRekursiv(N, N-i);
            System.out.println(result);
            ++counterFuerRekusive;
        }
        System.out.println("Rekursiver Aufwand für " + N +"-te Zeile : "+counterFuerRekusive);
    }

    private int gibZeileRekursiv(int N, int k)
    {
        int result = 0;
        if (N == k || k == 0)
        {
            result = 1;
        }
        else
        {
            result = gibZeileRekursiv(N - 1, k - 1) + gibZeileRekursiv(N - 1, k);
        }
        ++counterFuerRekusive;
        return result;
    }

    public void gibZeileForSchleife(int N)
    {
        int counter = 0;//Aufwand analyse
        for (int n = 0; n <= N; ++n)
        {
            for (int k = 0; k <= n; ++k)
            {
                if (k == 0 || n == 0 || k == n)
                {
                    _dreiecksArray[n][k] = 1;
                }
                else
                {
                    _dreiecksArray[n][k] = _dreiecksArray[n - 1][k - 1] + _dreiecksArray[n - 1][k];
                }
                ++counter;
            }
            ++counter;
        }
        for (int i = 0; i <= N; ++i)
        {
            System.out.println(_dreiecksArray[N][i]);
            ++counter;
        }
        System.out.println("Schleifen Aufwand für " + N +"-te Zeile : "+counter);
    }
}