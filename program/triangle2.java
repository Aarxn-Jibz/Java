/** 
 *W.A.P to check whether given 3 sides will make a triangle or not
 */
 import java.util.Scanner;
 class triangle2
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         double a,b,c;
         System.out.println("Enter the first side");
         a=sc.nextDouble();
         System.out.println("Enter the second side");
         b=sc.nextDouble();
         System.out.println("Enter the third side");
         c=sc.nextDouble();
         if (a<b+c && b<a+c && c<a+b)
         System.out.println("The given 3 sides can form a triangle");
         else
         System.out.println("The given 3 sides cannot form a triangle");
        }
    }