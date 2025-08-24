
/**
 * Write a description of class fibonacci_series here.
 * 
 * 
 *       
 */
import java.util.Scanner;
 class fibonacci
{
  public static void main()
  {
      Scanner sc=new Scanner(System.in);
      int a=0,b=1,c,i,n;
      System.out.println("Enter number of terms");
      n=sc.nextInt();
        for(i=1;i<=n;i++)
      {
        System.out.print(a+",");
        c=a+b;
        a=b;
        b=c;
      } 
    }
}
