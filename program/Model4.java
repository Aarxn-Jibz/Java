 import java.util.Scanner;
 class Model4
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int p;double a;
         System.out.println("Enter Amount of Purchase");
         p=sc.nextInt();         
         if (p<1100)
         {
             a=p-0.05*p;
             System.out.println("Amount payable="+a);
             System.out.println("Gift received is a wallet");
         }
         else if (p>=1100 & p<5100)
          {
             a=p-0.1*p;
             System.out.println("Amount payable="+a);
             System.out.println("Gift received is a wrist watch");
          }
         else if (p>=5100 & p<10100)
         {
             a=p-0.15*p;
             System.out.println("Amount payable="+a);
             System.out.println("Gift received is a wall clock");
         }
         else if (p>=10100)
         {
             a=p-0.2*p;
             System.out.println("Amount payable="+a);
             System.out.println("Gift received is a travel kit");
         } 
   }
 }