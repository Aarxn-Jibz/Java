 import java.util.Scanner;
 class nest

 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int u=0,c=0,n,r;
         System.out.println("Enter the number");
         n=sc.nextInt();
         while (n>0)
         {
             r=n%10;
             n=n/10;
             if (r==0)
             {
               c++;
             }
             else
             {
                 u++;
             }
         }
         if (c>0)
         {
             System.out.println("The number is a nest number");
         }
         else
         {
             System.out.println("The number is not a nest number");
         }
     } 
 }