package com.example.kuzyn.pirat;

/**
 * Created by Kuzyn on 2015-06-09.
 */
public class Pirat
{
    // Zadanie 3
    private double a;

    Pirat()
    {
        a = 0.0;
    }

    public void ustawAktualnaPredkosc(double nowaPredkosc)
    {
        a = nowaPredkosc;
    }

    public double ileKilometrowNaGodzine()
    {
        System.out.println("Predkosc wiatru wynosi " + a + " km/h");
        return a;
    }

    public double ileMilMorskichNaGodzine()
    {
        double m = a / 1.852;
        System.out.println("Predkosc wiatru wynosi " + m + " mph");
        return m;
    }
    public boolean czyJestCiszaNaMorzu()
    {
        if(a<=2 && a>=0)
        {
            System.out.println("Cisza na morzu, Predkosc wiatru wynosi jedynie " + a + " km/h");
            return true;
        }
        else
        {
            System.out.println("Nie ma ciszy na morzu, Predkosc wiatru wynosi " + a + " km/h");
            return false;
        }
    }
    public boolean czyJestSztorm()
    {
        if(a>120)
        {
            System.out.println("Jest sztorm na morzu, Predkosc wiatru wynosi " + a + " km/h");
            return true;
        }
        else
        {
            System.out.println("Nie ma sztormu na morzu, Predkosc wiatru wynosi " + a + " km/h");
            return false;
        }
    }
    public double ileWSkaliBeauforta()
    {
        double B;
        B = Math.round(Math.pow((a/3.01), .666666666));
        if(B>12)
        {
            B=12;
        }
        System.out.println("W Skali Beauforta = " +B);
        return B;
    }
}
