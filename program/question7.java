/**Display all even factors of a number using nested if 
 */
import java.util.Scanner;
class question7
{
 public static void main()
 {
     int n,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number");
     n=sc.nextInt();
     for(i=1; i<=n; i++)
     {
         if (n%i==0)
         {
             if(i%2==0)
            System.out.println(i);
        }
    }
    }
}
       
