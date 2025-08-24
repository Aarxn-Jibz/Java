/**Display every digit of a number after increasing by 2, if the digit is 8, then the
 * result will be 0 and if it is 9 the result will be 1.
 */
 import java.util.Scanner;
 class tution
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int n,r;
         System.out.println("Enter Number");
         n=sc.nextInt();
         while (n>0)
         {
             r=n%10;
             n=n/10;
             r=r+2;
             r=r%10;
             System.out.println(r);
         }
     }
 }
 