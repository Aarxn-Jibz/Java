 import java.util.Scanner;
 class HCF
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int a,b,i,h=0;
         System.out.println("Enter 2 numbers");
         a=sc.nextInt();
         b=sc.nextInt();
         for(i=1;i<=((a<b)?a:b);i++)
         {
             if(a%i==0 && b%i==0)
             h=i;
         }
         System.out.println(h);
     }
 }
            
   
    
     
 
