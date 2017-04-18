package adp4;

public class Startup
{
    // size fur array zur hilfe der aussgabe bei der for Schleife der
    // letzten Zeile desDreiecks
    private static final int SIZE = 1000;
    
    private static final int ZEILE = 5;

    public static void main(String[] args)
    {
        PascalschesDreieck a = new PascalschesDreieck(SIZE);

        System.out.println("For Schleife :");
        a.gibZeileForSchleife(ZEILE);

        System.out.println("\nRekursive :");
        a.gibZeileRekursiv(ZEILE);
    }
}
