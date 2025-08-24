/**Accept 2 numbers and check whether they are amicable or not.(if sum of factors of first number is equal to 
 * the second number and vice versa
 * E.g. 200           &             284
 *     x=284                          y=200 
 *     200 &284 are amicable
 */
 import java.util.Scanner;
 class amicable
 {
     void main()
     {
         int a,b,x,y;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 2 numbers");
         a=sc.nextInt();
         b=sc.nextInt();
         x=getsum(a);
         y=getsum(b);
         if (x==b && y==a)
         {
             System.out.println("They are amicable");
         }
         else
         {
             System.out.println("They are not amicable");
         }
     }
     int getsum(int n)
     {
         int i,sum=0;
         for (i=1;i<=n;i++)
         {
             if (n%i==0)
             sum=sum+i;
         }
         return sum;
     }
 }