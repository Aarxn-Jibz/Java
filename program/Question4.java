/**
 * Display all numbers from x to y those that are divisible by 2 and 3 but not by 5
 */
import java.util.Scanner;
class Question4
{
 public static void main()
 {
     int x,y,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 2 numbers");
     x=sc.nextInt();
     y=sc.nextInt();
     for(i=x;i<=y;i++)
     {
         if(i%2==0)
         {
             if(i%3==0)
             {
                 if (i%5!=0)
                   {
                      System.out.println(i);
                    }
                }
            }
        }
    }
}
            
               