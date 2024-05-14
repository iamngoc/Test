import java.math.*;

/**
 * Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Main
{
    public static void main (String args[])
    {
        int obereGrenze = 75;
        int summe = 0;

        for (int i = 1; i <=obereGrenze; i++)
 
        {
            summe = summe + i;
        }

        //Klausur relevant
        BigInteger mult = new BigInteger("1");

        for (int i = 2; i <= obereGrenze; i++)

        {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Summe: "+ summe + " Multiplikation: " + mult);
        
        //Feature Update 1
    }
}
