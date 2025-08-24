/**
 *Display all the digits of a number 
 */ 
 import java.util.Scanner;
 class digit

 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int n,r;
         System.out.println("Enter the number");
         n=sc.nextInt();
         while (n>0)
         {
             r=n%10;
             n=n/10;
             System.out.println(r);
            }
        }
    }