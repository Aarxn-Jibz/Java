/**
 * W.A.P to display menu for areas of different shapes and then calculate area of selected shape by asking for
 * required informaton
 */
 import java.util.Scanner;
 class area
 {
     int n;double r,s,b,l,h,br,a;
     void input()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1 to find the area of a circle");
         System.out.println("Enter 2 to find the area of a square");
         System.out.println("Enter 3 to find the area of a triangle");
         System.out.println("Enter 4 to find the area of a rectangle");
         System.out.println("Enter 5 to find the area of a parallelogram");
         n=sc.nextInt();
     }
     void calculate()
     {
         Scanner sc=new Scanner(System.in);
         switch(n)
         {
             case 1:
             System.out.println("Enter radius");
             r=sc.nextDouble();
             a=3.14*r*r;
             break;
             case 2:
             System.out.println("Enter side");
             s=sc.nextDouble();
             a=s*s;
             break;
             case 3:
             System.out.println("Enter base");
             b=sc.nextDouble();
             System.out.println("Enter height");
             h=sc.nextDouble();
             a=1/2*b*h;
             break;
             case 4:
             System.out.println("Enter length");
             l=sc.nextDouble();
             System.out.println("Enter breadth");
             br=sc.nextDouble();
             a=l*br;
             break;
             case 5:
             System.out.println("Enter base");
             b=sc.nextDouble();
             System.out.println("Enter height");
             h=sc.nextDouble();
             a=b*h;
             break;
             default:
             System.out.println("Enter number from 1 to 5");
            }
        }
        void display()
        {
            System.out.println(a);
        }
        public static void main()
        {
            area ob=new area();
            ob.input();
            ob.calculate();
            ob.display();
        }
    }