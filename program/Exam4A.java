/**Write a program in Java to input three numbers and display the greatest and the 
 * smallest of them.
 */
 import java.util.Scanner;
 class Exam4A
 {
     public static void main()
     {
         int a,b,c,d,e;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first number");
         a=sc.nextInt();
         System.out.println("Enter second number");
         b=sc.nextInt();
         System.out.println("Enter third number");
         c=sc.nextInt();
         d=Math.max(Math.max(a,b),c);
         e=Math.min(Math.min(a,b),c);
         System.out.println("The greatest number is "+d);
         System.out.println("The smallest number is "+e);
        }
    }
         