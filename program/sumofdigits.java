/**Write a program to take a number as input and print the sum of digits of the number
 * as output
 */ 
 import java.util.Scanner;
 class sumofdigits
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int n,r,s=0;
         System.out.println("Enter number");
         n=sc.nextInt();
         while (n>0)
         {
             r=n%10;
             n=n/10;
             s=s+r;
         }
         System.out.println("Sum of digits is "+s);
     }
 }
           
             
          
         