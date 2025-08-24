/**
 * display all the common factors of two numbers
 * fun(int,int,int): using recursive it wl display all the common factors of two numbers
 */
import java.util.Scanner;
class recursion2
{
   public void main()
   {
       Scanner sc=new Scanner(System.in);
       int m,n,i=1,o;
       System.out.println("Input 2 numbers");
       m=sc.nextInt();
       n=sc.nextInt();
       fun(m,n,i);
   }
   void fun(int x,int y,int i)
   {
       if(i>x || i>y)
       {
           return;
       }
       if((x%i==0) && (y%i==0))
       {
           System.out.println(i);
           i++;
           fun(x,y,i);
       }
       else
       {
           i++;
           fun(x,y,i);
       }
   }
}