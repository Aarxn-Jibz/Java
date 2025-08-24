/**Write a program to take the radius of the circle as input and display the 
 *circumference and area of a circle as output. 
 */
 import java.util.Scanner;
 class practise
 {
     public static void main()
     {
         double r,cir,a,pi=3.1417;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter radius of the circle");
         r=sc.nextDouble();
         cir=2*pi*r;
         a=pi*r*r;
         System.out.println("The circumference of the circle="+cir);
         System.out.println("The area of the circle="+a);
        }
    }
 