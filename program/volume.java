
/**
 *Write a clas with the name volume using function overloading that computes the volume 
 *of a cube, a sphere and a cuboid
 */
   import java.util.Scanner;
   class volume
   {
       void cube()
       {
           Scanner sc=new Scanner(System.in);
           int a=1,vol=1;
           System.out.println("Enter side measurement");
           a=sc.nextInt();
           vol=a*a*a;
           System.out.println(vol);
       }
       void sphere()
       {
           Scanner sc=new Scanner(System.in);
           double r,pi,vol=1;
           System.out.println("Enter radius measurement");
           r=sc.nextDouble();
           vol=4/3*3.14*r*r*r;
           System.out.println(vol);
       }
       void cuboid()
       {
           Scanner sc=new Scanner(System.in);
           double l,b,h,vol=1;
           System.out.println("Enter length");
           l=sc.nextInt();
           System.out.println("Enter breadth");
           b=sc.nextInt();
           System.out.println("Enter height");
           h=sc.nextInt();
           vol=l*b*h;
           System.out.println(vol);
       }
       public static void main()
       {
           volume ob=new volume();
           ob.cube();
           ob.sphere();
           ob.cuboid();
       }
   }