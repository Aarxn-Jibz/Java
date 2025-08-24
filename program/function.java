/**
 * Write a description of class function here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 import java.util.Scanner;
 class function
 {
     double x,n,p,sum=0;
     void series(double x,double n) 
     {
         int i,sum1=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
         x=sc.nextDouble();
         System.out.println("Enter exponent");
         n=sc.nextDouble();
         for(i=1;i<=n;i++)
         {
             sum=sum+(Math.pow(x,n));
         }
         System.out.println(sum1);
     }
     void series2(int p)
     {
         int i,sum2=0;
         for(i=1;i<=p;i++)
         {
             sum2=sum2+(i*i*i-1);
         }
         System.out.println(sum2);
     }
     void series3()
     {
         double sum3=0.0;int i;
         for (i=2;i<=10;i++)
         {
             sum3=sum3+1/i;
         }
         System.out.println(sum3);
     }
     void main()
     {
         function ob=new function();
         ob.series();
         ob.series2();
         ob.series3();
     }
 }