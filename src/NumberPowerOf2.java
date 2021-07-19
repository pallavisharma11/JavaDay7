import java.util.Scanner;
public class NumberPowerOf2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        boolean a  = number(n);
        System.out.println(a);
        
        
    }
    static boolean number(int m )
    {
        if(m == 0)
        {
            return false;
        }
        while(m !=  1)
        {
            if(m % 2 != 0)
            {
                return false;
            }
            m = m/2;
        }
        return true;
    }
    
}
