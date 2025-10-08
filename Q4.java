public class Q4
{
    public static void main(String[] args) 
    {
        if (args.length != 1) 
        {
            System.out.println("Le programme attend un argument : N.");
            return;
        }

        int N;
        try 
        {
            N = Integer.parseInt(args[0]);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("N doit être un entier.");
            return;
        }
        
        for (int i = 1; i <= N; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}