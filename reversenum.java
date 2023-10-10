// enter a number and print the digits in seperate lines    
import java.util.*;
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, a;
        System.out.println("enter a number");
        n= sc.nextInt();
        while(n>0)
        {
            a = n%10;
            System.out.println(a);
            n = n/10;
        }
    }
       
}
    
        
