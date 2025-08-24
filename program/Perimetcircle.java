/**
 *W.A.P to take the radius of the circle and print the perimeter as its output
 */
 import java.util.Scanner;
 class Perimetcircle
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         double r,p,pi=0;
         pi=3.14285714;
         System.out.println("Enter radius");
         r=sc.nextInt();
         p=2*pi*r;
         System.out.println("Perimeter="+p);
     }
 }