/**Write a program to input the value for a, b and c using Scanner class and calculate
 * : a2 + b2 + c2 / abc
*/ 
 import java.util.Scanner;
 class Exam3B
 {
     public static void main()
     {
         int a,b,c,x;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter value of a");
         a=sc.nextInt();
         System.out.println("Enter value of b");
         b=sc.nextInt();
         System.out.println("Enter value of c");
         c=sc.nextInt();
         x=(a*a + b*b + c*c)/a*b*c;
         System.out.println(x);
        }
    }
    
    
    
    
   
    
    
    
     

