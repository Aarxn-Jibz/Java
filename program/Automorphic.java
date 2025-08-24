/**W.A.P to check whether number inputted is automorphic number.(Automorphic number is 
 *a number in which  the number is present in its square(E.g. 76 is present in its
 *square 1776 & 25 is present in its square 625)
 */ 
 import java.util.Scanner;
 class Automorphic
 {
     public static void main()
     {
         int n,cpy,sq,p,r,c=0;
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter a number"); 
         n=sc.nextInt();
         cpy=n;
         sq=n*n;
         while (n>0)
         {
             r=n%10;
             n=n/10;
             c++;
         }
         p=(int)Math.pow(10,c);
         if (sq%p==cpy)
         {
             System.out.println("It is an Automorphic Number");
         }
         else
         {
             System.out.println("It is not an Automorphic Number");
         }
     }
 }
         
         