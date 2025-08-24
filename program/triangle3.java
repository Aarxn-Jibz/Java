/**
 *W.A.P to input the 3 sides of a triangle and find out whether the triangle is a right
 *angled triangle
 */
 import java.util.Scanner;
 class triangle3
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,b,c;
         System.out.println("Enter first side");
         a=sc.nextInt();
         System.out.println("Enter second number");
         b=sc.nextInt();
         System.out.println("Enter third number");
         c=sc.nextInt();
         if (a<b+c || b<a+c || c<a+b)
         {
             if((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) || (c*c)==(b*b)+(a*a))
             System.out.println("The triangle is a Right Angled Triangle");
             else 
             System.out.println("The triangle is not a right angled triangle");
            }
            else
            System.out.println("The three sides cannot form a triangle");
        }
    }