// enter a number and print its factoriallllll    
import java.util.*;
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i , f;
        f=1;
        System.out.println("enter num : ");
        n = sc.nextInt();
        
        for(i=n ; i>=1 ; i--)
        {
            f = f*i;
        }
        
        System.out.println(f);
    }
}
