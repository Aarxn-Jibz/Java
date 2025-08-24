/**
 * Accept 2 numbers A & B and merge them to form AB.E.g. ((a=20;b=457;AB=20457)
 */
 import java.util.Scanner;
 class question11                             //opening class
 {
     public static void main()                //opening void main
     {
         Scanner sc=new Scanner(System.in);
         int a,b,c=0,x,y,z,r;
         System.out.println("Enter first number");
         a=sc.nextInt();
         System.out.println("Enter second number");
         b=sc.nextInt();
         x=b;
         while (b>0)
         {
             r=b%10;
             b=b/10;
             c++;
         }
         y=a*(int)(Math.pow(10,c));
         z=y+x;
         System.out.println("The merged number is "+z);
     }                                            //closing void main
}                                                 //closing class
         
     
