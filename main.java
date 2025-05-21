
public class main
{
    public static void main ()
    {
        int obere_grenze = 100;
        double mult = 1;
        
        for(int i = 1; i <= obere_grenze; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Mult = " + mult);
    }
}
