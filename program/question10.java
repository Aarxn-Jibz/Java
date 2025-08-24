/**Display place value of a number (e.g.place value of 981 is100). 
 */
 import java.util.Scanner;
 class question10
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,n,r,c=0,b;
         System.out.println("Enter Number");
         n=sc.nextInt();
         while (n>0)
         {
             r=n%10;
             n=n/10;
             c++;
         }
         b=c;
         a=(int)Math.pow(10,b-1);
         System.out.println("The place value is "+a);
     }
 }