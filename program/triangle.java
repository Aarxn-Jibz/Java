/**
 *W.A.P that takes 3 angles and states whether these angles form an 
 * acute angle or an obtuse angle or a right angled triangle
 */
 import java.util.Scanner;
 class triangle
 {   
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         double a,b,c;
         System.out.println("Enter First Angle");
         a=sc.nextDouble();
         System.out.println("Enter Second Angle");
         b=sc.nextDouble();
         System.out.println("Enter Third Angle");
         c=sc.nextDouble();
         if (a+b+c==180)
         {
             if (a<90 && b<90 && c<90)
             System.out.println("Acute angled triangle");
             else if (a==90 || b==90 || c==90)
             System.out.println("Right angled triangle");
             else
             System.out.println("Obtuse angled triangle");
         }
         else
         System.out.println("Not a triangle");
        }
    }