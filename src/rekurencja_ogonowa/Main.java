package rekurencja_ogonowa;

class Rekur_ogon{
    public static long silnia(int n)
    {
        return silnia(n, 1); //wywołanie metody pomocniczej
    }

    //pomocnicza rekurencja ogonowa metoda do obliczania silni

    public static long silnia(int n, long akum) //akum - akumulator
    {
        if (n == 0)
            return akum;
        else
            return silnia(n - 1, n * akum); //wywolanie rekurencyjne
    }
}
public class Main {
    public static void main( String[] args)
    {
        int i;

        for (i = 1; i <= 20; i++)
        {
            System.out.println(i + "! = " + Rekur_ogon.silnia(i));
        }
    }
}
