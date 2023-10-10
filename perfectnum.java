// enter a number and find if perfect number( factor of  6 are 1,2,3 . 1+2+3 = 6) 
import java.util.*;
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,s;
        s=0;
        System.out.println("enter a number");
        n= sc.nextInt();
        for(i=1; i<n; i++)
        {
            if(n%i == 0)
            {
                s = s+i;
            }
        }
        
        
        if(s==n)
        {
            System.out.println("it is a perfect number");
        }
        else
        {
            System.out.println("it is not a perfect number");
        }
        
        
        
    }
}
