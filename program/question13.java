/**
 *calcualte addition,subtraction,multiplication and division of two numbers using different functions
 */
 import java.util.Scanner;
 class question13
 {
     public void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,b;
         System.out.println("Enter 2 numbers");
         a=sc.nextInt();
         b=sc.nextInt();
         fnsum(a,b);
         fnsub(a,b);
         fnmulti(a,b);
         fndiv(a,b);
     }
     void fnsum(int x,int y)
     {
         int z;
         z=x+y;
         System.out.println(z);
     }
     void fnsub(int x,int y)
     {
         int z;
         z=x-y;
         System.out.println(z);
     }
     void fnmulti(int x,int y)
     {
         int z;
         z=x*y;
         System.out.println(z);
     }
     void fndiv(int x,int y)
     {
         int z;
         z=x/y;
         System.out.println(z);
     }
 }