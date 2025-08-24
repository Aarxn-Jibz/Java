/**
 *Spy number-A number which is the sum and product of the factors of a number except 
 * itself is equal to the number.(e.g.6 sum(1+2+3=6) product(1*2*3=6)
 */
 import java.util.Scanner;
 class spynumber
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,r,s=0,m=1,i;
         System.out.println("Enter number");
         n=sc.nextInt();
         for (i=1;i<n;i++)
         {
             if (n%i==0)
             {
                 s=s+i;
                 m=m*i;
             }
         }
         if (n==s && n==m)
         {
             System.out.println("The number is a spy number");
         }
         else
         {
             System.out.println("The number is not a spy number");
         }
     }  
}
