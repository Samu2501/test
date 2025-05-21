import java.math.*;

public class main
{
    public static void main ()
    {
        int obere_grenze = 100;

        BigInteger mult = new BigInteger("1");

        
        for(int i = 1; i <= obere_grenze; ++i)
        {
            String param = String.valueOf(i);
            mult = mult.multiply(new BigInteger(param));
        }
        
        System.out.println("Mult = " + mult);
        

        // Master/Feature Update 1
        // Master/Feature Update 2
    }
}
