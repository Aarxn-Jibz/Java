 import java.util.Scanner;
 class LCM
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int a,b,i,l=0;
         System.out.println("Enter 2 numbers");
         a=sc.nextInt();
         b=sc.nextInt();
         for (i=a*b;i>=((a>b)?a:b);i--)
         {
             if (i%a==0 && i%b==0)
             l=i;
         }
         System.out.println(l);
     }
        
 }
         
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             