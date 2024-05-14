
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
        int og = 10;
        for (int i = 1; i <=og; i++)
        {
            summe = summe +1;
        }
        
        int mul = 1;
        for (int i = 2; i <= og; i++)
        {
            mul *= i;
        }
        
        System.out.println("Summe: "+ summe + "Multiplikation: " + mul);
    }
}
