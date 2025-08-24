/**Write a program to display all factors of a number
 */
 import java.util.Scanner;
 class Factors
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,i;
         System.out.println("Enter number");
         n=sc.nextInt();
         for(i=1;i<=n;i++)
         {
             if(n%i==0)
             System.out.println("the factor(s) is(are)"+i);
            }
        }
    }
         