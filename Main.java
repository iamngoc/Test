
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
        int summe = 0;
        for (int i = 1; i <=10; i++)
        {
            summe = summe +1;
        }
        
        int mul = 1;
        for (int i = 2; i <= 10; i++)
        {
            mul = mul * i;
        }
        
        System.out.println("Summe: "+ summe + "Multiplikation: " + mul);
    }
}
